package cn.a52going.sxsrvm.common;

import cn.a52going.common.PrivDataBean;
import cn.a52going.common.ReturnDataBean;
import com.huateng.client.bean.Bean;
import com.huateng.config.ParamHeadBean;
import com.huateng.socket.keepalive.client.ASocketClient;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommMain {
	private Log log = LogFactory.getLog(this.getClass());
	/**
	 *
	 * @param tranNo 交易码
	 * @param iCurrPage 当前第几页
	 * @param serverNo 服务码
	 * @param comb 报文主体,不含私有报文
	 * @param objSend 发送私有报文对象
	 * @param objRet 返回私有报文对象
	 * @return
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws ArrayIndexOutOfBoundsException
	 *
	 */
	public <T extends ReturnDataBean> List<T> excute(String tranNo,
													 String iCurrPage,
													 String serverNo,
													 String mac,
													 CommBody comb,
													 Object objSend,
													 Class<T> objRet) throws Exception  {
		try {
			return excuteForIRecNum(tranNo, iCurrPage, "15", serverNo, mac, comb, objSend, objRet);
		} catch (InstantiationException e) {
			////LOG.ADMININFO("失败信息:" + e);
			throw new InstantiationException(e.getMessage());
		} catch (IllegalAccessException e) {
			////LOG.ADMININFO("失败信息:" + e);
			throw new IllegalAccessException(e.getMessage());
		}
//		catch (Exception e) {
//			////LOG.ADMININFO("失败信息:" + e);
//			throw new Exception(e.getMessage());
//		}

	}

	/**
	 * 每页多少条的可变方法
	 * @param tranNo:交易码
	 * @param iCurrPage:当前页
	 * @param iRecNum :每页多少条
	 * @param serverNo:系统服务码
	 * @param mac:标识
	 * @param comb
	 * @param objSend:发送
	 * @param objRet:返回
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public <T extends ReturnDataBean> List<T> excuteForIRecNum(String tranNo,
															   String iCurrPage,
															   String iRecNum,
															   String serverNo,
															   String mac,
															   CommBody comb,
															   Object objSend,
															   Class<T> objRet) throws  Exception{
		//if("1".equals(BussFunction.getParDefFromMem("GPSTeam_Trans_Flag", "00000000000000"))){
		return excuteJYGLForIRecNum(tranNo, iCurrPage, iRecNum, serverNo, mac, comb, objSend, objRet);
		//}
		//return null;
	}

	/**
	 * 每页多少条的可变方法
	 * @param tranNo:交易码
	 * @param iCurrPage:当前页
	 * @param iRecNum :每页多少条
	 * @param serverNo:系统服务码
	 * @param mac:标识
	 * @param comb
	 * @param objSend:发送
	 * @param objRet:返回
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public <T extends ReturnDataBean> List<T> excuteJYGLForIRecNum(String tranNo,
																   String iCurrPage,
																   String iRecNum,
																   String serverNo,
																   String mac,
																   CommBody comb,
																   Object objSend,
																   Class<T> objRet) throws InstantiationException, IllegalAccessException,Exception{
		List<T> list = new ArrayList<T>();
		PrivData pd;
		if(null == objRet) {
			pd = new PrivData(objSend,null);
		} else {
			pd = new PrivData(objSend,objRet.newInstance());
		}
		comb.setsTransNo(tranNo);// 交易码
		comb.setsMac(mac);// 申请
		comb.setiCurrPage(iCurrPage);
		comb.setiRecNum(iRecNum);
		//System.out.printf("=========="+pd.getsPricData());
		comb.Pack(pd.getsPricData());		//组装私有报文

		//获取发送报文，用于ParamHeadBean
		String sendMsg = comb.getsSendBuf();

		ParamHeadBean head = new ParamHeadBean();
		head.setServiceName(tranNo);					// 交易接口号
		head.setReqIdentification(TxncodeConst.Req_Id);	// 请求方编号（交易管理系统提供）团险GPS
		head.setServiceIdentification(serverNo);		// 服务方编号（交易管理系统提供）健康险管理
		// 以上三个参数为必须设置项，以下参数根据具体情况设置
		head.setReqOrganizationNo("");	// 机构号
		head.setReqTellerNo("");		// 操作员号
		head.setVersionNum("");			// 版本号
		head.setOutBusCode(""); 		// 外部交易唯一码（最大长度100个字节）
		//调用交易，返回一个bean对象，关于bean对象下面会有详细的介绍
		long a=new Date().getTime();
		//System.out.println("aaa");
		Bean bean = new ASocketClient().sendMessage(sendMsg, head);//参数msg为请求方报文
		log.debug("返回的bean为："+bean);
		long b=new Date().getTime();
		long c=b-a;
		log.info("本次交易消耗时间为：" + c + "ms;-----发送报文是：" + comb.getsSendBuf() + "|--|返回报文是：" + bean.getRetStr());
		//System.out.println("bbb");
		if(bean == null || StringUtils.isEmpty(bean.getRetStr())) {
			//System.out.println("cccc");
			////LOG.ADMININFO("交易发送失败：sRetNo_2" + comb.getsRetNo() + "|" + comb.getsSendBuf());
			CommPersistMethod.persistFailTaskInfo(comb);
			if(serverNo.equals(TxncodeConst.Serv_FF)) {
				////LOG.ADMININFO("*************FF系统交易失败:交易码" +tranNo+ "***********");
			} else if(serverNo.equals(TxncodeConst.Serv_CAGS)) {
				////LOG.ADMININFO("*************综意险系统交易失败:交易码" +tranNo+ "***********");
			} else if(serverNo.equals(TxncodeConst.Serv_PRINT)) {
				////LOG.ADMININFO("*************打印平台交易失败:交易码" +tranNo+ "***********");
			}
			if (null != bean) {
				if (!StringUtils.isEmpty(bean.getErrormsg())) {
					throw new Exception(bean.getErrormsg());
				} else {
					throw new Exception("交易失败!");
				}
			}
			
			
		}
		//System.out.println("ddd");
		log.info("返回报文：[" + bean.getRetStr() + "]");
		comb.setsRcvBuf(bean.getRetStr());

		if (TxncodeConst.SUCC_CODE.equals(bean.getStatus())) {
			//解析，返回108公共报文之外的部分
			String getResult = comb.UnPackComm();
			try {
				if(null == objRet || null == getResult || 0 == getResult.trim().length()) {
					return null;
				} else {
					//系统标识
					String sysFlag = "";
					if(serverNo.equals(TxncodeConst.Serv_FF)) {
						sysFlag = TxncodeConst.FF_SYSFLAG;
					} else if(serverNo.equals(TxncodeConst.Serv_CAGS)) {
						sysFlag = TxncodeConst.CAGS_SYSFLAG;
					}
					//解析返回实体Bean
					list = pd.getReruenDataForList(sysFlag, getResult, objRet);
				}
			} catch (SecurityException e) {
				log.error("失败信息:" + e);
			} catch (IllegalArgumentException e) {
				log.error("失败信息:" + e);
			} catch (NoSuchFieldException e) {
				log.error("失败信息:" + e);
			} catch (IllegalAccessException e) {
				log.error("失败信息:" + e);
			} catch (InstantiationException e) {
				log.error("失败信息:" + e);
			} catch (ClassNotFoundException e) {
				log.error("失败信息:" + e);
			} catch (ArrayIndexOutOfBoundsException e) {
				log.error("失败信息:" + e);
			}
		}else{
			//保存申请交易失败的报文信息
			log.info("交易调用出错：Status:" + bean.getStatus() + "|Errormsg:" + bean.getErrormsg());
			return null;
		}
		return list;
	}


	/**
	 * 多个发送bean或者发送bean内部有循环的拼接的请求报文
	 * 具体使用方法可以参照接口开发文档v2
	 * @param tranNo:交易码
	 * @param iCurrPage:当前页
	 * @param iRecNum:一页多少条
	 * @param serverNo:服务码
	 * @param mac:mac
	 * @param comb
	 * @param sdList:发送bean集合
	 * @param objRet:返回bean
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws Exception
	 * @throws InvocationTargetException
	 * @throws NoSuchMethodException
	 * @throws NoSuchFieldException
	 * @throws IllegalArgumentException
	 * @throws SecurityException
	 * @throws ArrayIndexOutOfBoundsException
	 */
	public <T extends ReturnDataBean> List<T> excute(String tranNo,
													 String iCurrPage,
													 String iRecNum,
													 String serverNo,
													 String mac,
													 CommBody comb,
													 List<? extends PrivDataBean> sdList,
													 Class<T> objRet) throws InstantiationException, IllegalAccessException, Exception, ArrayIndexOutOfBoundsException, SecurityException, IllegalArgumentException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException  {
		//if("1".equals(BussFunction.getParDef("GPSTeam_Trans_Flag", "00000000000000"))){
		return excuteJYGL(tranNo, iCurrPage, iRecNum, serverNo, mac, comb, sdList, objRet);
		//}else{

//			if("2010010000".equals(serverNo) || "2011200000".equals(serverNo))
//				//FF
//				serverNo = "Y0100000";
//			else if("2010120000".equals(serverNo) || "2011210000".equals(serverNo))
//				//ZYX
//				serverNo = "Y1200000";
//			else if("2020100000".equals(serverNo))
//				serverNo = "Y1000000";
//			else if("2011240000".equals(serverNo))
//				serverNo = "Y1600000";
//
//			return excuteEAI(tranNo, iCurrPage, iRecNum, serverNo, mac, comb, sdList, objRet);
		//	return null;
		//}
	}

	/**
	 * 多个发送bean或者发送bean内部有循环的拼接的请求报文
	 * 具体使用方法可以参照接口开发文档v2
	 * @param tranNo:交易码
	 * @param iCurrPage:当前页
	 * @param iRecNum:一页多少条
	 * @param serverNo:服务码
	 * @param mac:mac
	 * @param comb
	 * @param sdList:发送bean集合
	 * @param objRet:返回bean
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws Exception
	 * @throws InvocationTargetException
	 * @throws NoSuchMethodException
	 * @throws NoSuchFieldException
	 * @throws IllegalArgumentException
	 * @throws SecurityException
	 * @throws ArrayIndexOutOfBoundsException
	 */
	public <T extends ReturnDataBean> List<T> excuteJYGL(String tranNo,
														 String iCurrPage,
														 String iRecNum,
														 String serverNo,
														 String mac,
														 CommBody comb,
														 List<? extends PrivDataBean> sdList,
														 Class<T> objRet) throws InstantiationException, IllegalAccessException, Exception, ArrayIndexOutOfBoundsException, SecurityException, IllegalArgumentException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException  {
		List<T> list = new ArrayList<T>();
		PrivData pd;
		if(null == objRet) {
			pd = new PrivData(sdList,null,"");
		} else {
			pd = new PrivData(sdList,objRet.newInstance(),"");
		}
		comb.setsTransNo(tranNo);// 交易码
		comb.setsMac(mac);// 申请
		comb.setiCurrPage(iCurrPage);
		comb.setiRecNum(iRecNum);
		comb.Pack(pd.getsPricData());//组装私有报文

		//获取发送报文，用于ParamHeadBean
		String sendMsg = comb.getsSendBuf();
		ParamHeadBean head = new ParamHeadBean();
		head.setServiceName(tranNo);					// 交易接口号
		head.setReqIdentification(TxncodeConst.Req_Id);	// 请求方编号（交易管理系统提供）团险GPS
		head.setServiceIdentification(serverNo);		// 服务方编号（交易管理系统提供）健康险管理
		// 以上三个参数为必须设置项，以下参数根据具体情况设置
		head.setReqOrganizationNo("");	// 机构号
		head.setReqTellerNo("");		// 操作员号
		head.setVersionNum("");			// 版本号
		head.setOutBusCode(""); 		// 外部交易唯一码（最大长度100个字节）
		//调用交易，返回一个bean对象，关于bean对象下面会有详细的介绍
		long a=new Date().getTime();
		Bean bean = new ASocketClient().sendMessage(sendMsg, head);//参数msg为请求方报文
		log.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<返回的BEAN为："+bean);
		long b=new Date().getTime();
		long c=b-a;
		log.info("本次交易消耗时间为：" + c + "ms;-----发送报文是：" + comb.getsSendBuf() + "|--|返回报文是：" + bean.getRetStr());

		if(bean == null || StringUtils.isEmpty(bean.getRetStr())) {
			//保存申请交易失败的报文信息
			//LOG.ADMININFO("交易发送失败：sRetNo_2" + comb.getsRetNo() + "|" + comb.getsSendBuf());
			CommPersistMethod.persistFailTaskInfo(comb);
			if(serverNo.equals(TxncodeConst.Serv_FF)) {
				//LOG.ADMININFO("*************FF系统交易失败:交易码" +tranNo+ "***********");
			} else if(serverNo.equals(TxncodeConst.Serv_CAGS)) {
				//LOG.ADMININFO("*************综意险系统交易失败:交易码" +tranNo+ "***********");
			} else if(serverNo.equals(TxncodeConst.Serv_PRINT)) {
				//LOG.ADMININFO("*************打印平台交易失败:交易码" +tranNo+ "***********");
			}
			if(null!=bean&&! StringUtils.isEmpty(bean.getRetStr())) {
				throw new Exception("交易失败!"+bean.getErrormsg());
			}else {throw new Exception("交易失败!");}
			
		}
		comb.setsRcvBuf(bean.getRetStr());

		if (TxncodeConst.SUCC_CODE.equals(bean.getStatus())) {
			//解析，返回108公共报文之外的部分
			String getResult = comb.UnPackComm();
			try {
				if(null == objRet || null == getResult || 0 == getResult.trim().length()) {
					return null;
				} else {
					//系统标识
					String sysFlag = "";
					if(serverNo.equals(TxncodeConst.Serv_FF)) {
						sysFlag = TxncodeConst.FF_SYSFLAG;
					} else if(serverNo.equals(TxncodeConst.Serv_CAGS)) {
						sysFlag = TxncodeConst.CAGS_SYSFLAG;
					}
					list = pd.getReruenDataForList(sysFlag, getResult, objRet);
				}
			} catch (SecurityException e) {
				log.info("失败信息:" + e);
			} catch (IllegalArgumentException e) {
				log.info("失败信息:" + e);
			} catch (NoSuchFieldException e) {
				log.info("失败信息:" + e);
			} catch (IllegalAccessException e) {
				log.info("失败信息:" + e);
			} catch (InstantiationException e) {
				log.info("失败信息:" + e);
			} catch (ClassNotFoundException e) {
				log.info("失败信息:" + e);
			} catch (ArrayIndexOutOfBoundsException e) {
				log.info("失败信息:" + e);
			}
		} else {
			//保存申请交易失败的报文信息
			log.info("交易调用出错：Status:" + bean.getStatus() + "|Errormsg:" + bean.getErrormsg());
			//CommPersistMethod.persistFailTaskInfo(comb);
			return null;
		}
		return list;
	}

//	/**
//	 * zhangweiming 2011-08-16 add
//	 * 多个发送bean或者发送bean内部有循环的拼接的请求报文
//	 * 具体使用方法可以参照接口开发文档v2
//	 * @param tranNo:交易码
//	 * @param iCurrPage:当前页
//	 * @param iRecNum:一页多少条
//	 * @param serverNo:服务码
//	 * @param mac:mac
//	 * @param comb
//	 * @param sdList:发送bean集合
//	 * @param objRet:返回bean
//	 * @return
//	 * @throws InstantiationException
//	 * @throws IllegalAccessException
//	 * @throws Exception
//	 * @throws InvocationTargetException
//	 * @throws NoSuchMethodException
//	 * @throws NoSuchFieldException
//	 * @throws IllegalArgumentException
//	 * @throws SecurityException
//	 * @throws ArrayIndexOutOfBoundsException
//	 */
//	public <T extends ReturnDataBean> List<T> excuteEAI(String tranNo,
//			String iCurrPage,
//			String iRecNum,
//			String serverNo,
//			String mac,
//			CommBody comb,
//			List<? extends PrivDataBean> sdList,
//			Class<T> objRet) throws InstantiationException, IllegalAccessException, Exception, ArrayIndexOutOfBoundsException, SecurityException, IllegalArgumentException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException  {
//		List<T> list = new ArrayList<T>();
//		PrivData pd;
//		if(null == objRet) {
//			pd = new PrivData(sdList,null,"");
//		} else {
//			pd = new PrivData(sdList,objRet.newInstance(),"");
//		}
//		comb.setsTransNo(tranNo);// 交易码
//		comb.setsMac(mac);// 申请
//		comb.setiCurrPage(iCurrPage);
//		comb.setiRecNum(iRecNum);
//		comb.Pack(pd.getsPricData());//组装私有报文
//		//只读权限人员不允许发送申请交易
//		String bqtype_Modno = BqtypeTransNo.getSysParam(tranNo);//获取各个交易号对应的保全类、审核人、批单号
//		if(bqtype_Modno!=null && !bqtype_Modno.equals("") && !"9209001".equals(tranNo)){
//			String[] bqtype_ModnoArray=bqtype_Modno.split("\\_");
//			int oprLeft=Integer.parseInt(bqtype_ModnoArray[1]);
//			int oprRight=Integer.parseInt(bqtype_ModnoArray[2]);
//			String oprNo=comb.getsSendBuf().substring(oprLeft, oprRight);//操作员
//			TblOprInfoDAO oprdao = (TblOprInfoDAO) ContextUtil.getBean("TblOprInfoDAOTarget");
//			TblOprInfo oprInfo = oprdao.get(oprNo);
//			String roleId = oprInfo.getOprRoleId();
//			String readonlyrole = SysParam.getSysParam("readonly_role");
//			List<String> readonlyroleList = new ArrayList<String>();
//			if(readonlyrole != null && readonlyrole.trim().length() > 0){
//				for(String role : readonlyrole.split(",")){
//					readonlyroleList.add(role);
//				}
//			}
//			if(readonlyroleList.contains(roleId)){
//				//LOG.ADMININFO("*************只读用户不允许发送申请交易***********");
//				throw new Exception("只读用户不允许发送申请交易");
//			}
//		}
//
//		comb.execute(serverNo);
//		//2011-10-14日zhangweiming add对tuxdo连接时无返回时的情况 start
//		if(null == comb.getsRcvBuf() || "".equals(comb.getsRcvBuf().trim())) {
//			//保存申请交易失败的报文信息
//			//LOG.ADMININFO("交易发送失败：sRetNo_2"+comb.getsRetNo()+"|"+comb.getsSendBuf());
//			comb.setsRetNo(comb.getsRcvBuf()==null ?"":comb.getsRcvBuf());
//			CommPersistMethod.persistFailTaskInfo(comb);
//			if(serverNo.equals(TxncodeConst.Serv_FF)) {
//				//LOG.ADMININFO("*************FF系统交易失败:交易码" +tranNo+ "***********");
////				throw new Exception("调用FF系统返回异常!");
//			} else if(serverNo.equals(TxncodeConst.Serv_CAGS)) {
//				//LOG.ADMININFO("*************综意险系统交易失败:交易码" +tranNo+ "***********");
////				throw new Exception("调用综意险系统返回异常!");
//			} else if(serverNo.equals(TxncodeConst.Serv_PRINT)) {
//				//LOG.ADMININFO("*************打印平台交易失败:交易码" +tranNo+ "***********");
////				throw new Exception("调用打印平台返回异常!");
//			}
//			throw new Exception("交易失败!");
//		}
//		//2011-10-14日zhangweiming add对tuxdo连接时无返回时的情况 end
//		String getResult = comb.UnPackComm();//返回结果
//		String retNo = comb.getsRetNo();// 返回码
//		if ("0000000".equals(retNo)) {//通信成功后，拆分报文
//			try {
//				if(null == objRet || null == getResult || 0 == getResult.trim().length()) {
//					return null;
//				} else {
//					//系统标识
//					String sysFlag = "";
//					if(serverNo.equals(TxncodeConst.Serv_FF)) {
//						sysFlag = TxncodeConst.FF_SYSFLAG;
//					} else if(serverNo.equals(TxncodeConst.Serv_CAGS)) {
//						sysFlag = TxncodeConst.CAGS_SYSFLAG;
//					}
//					list = pd.getReruenDataForList(sysFlag,getResult, objRet);
//				}
//
//			} catch (SecurityException e) {
//				//LOG.ADMININFO("失败信息:" + e);
//			} catch (IllegalArgumentException e) {
//				//LOG.ADMININFO("失败信息:" + e);
//			} catch (NoSuchFieldException e) {
//				//LOG.ADMININFO("失败信息:" + e);
//			} catch (IllegalAccessException e) {
//				//LOG.ADMININFO("失败信息:" + e);
//			} catch (InstantiationException e) {
//				//LOG.ADMININFO("失败信息:" + e);
//			} catch (ClassNotFoundException e) {
//				//LOG.ADMININFO("失败信息:" + e);
//			} catch (ArrayIndexOutOfBoundsException e) {
//				//LOG.ADMININFO("失败信息:" + e);
//			}
//		} else {
//			//保存申请交易失败的报文信息
//			//LOG.ADMININFO("交易发送失败：sRetNo_2s"+comb.getsRetNo()+"|"+comb.getsSendBuf());
//			//CommPersistMethod.persistFailTaskInfo(comb);
//			return null;
//		}
//		return list;
//	}

	/**
	 *
	 * @param TransNo 交易码
	 * @param iCurrPage 当前第几页
	 * @param serverNo 服务码
	 * @param comb 报文主体,不含私有报文
	 * @param objSend 发送私有报文对象
	 * @param objRet 返回私有报文对象
	 * @return
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws Exception
	 * @throws ArrayIndexOutOfBoundsException
	 * @throws AdminException
	 *
	 */
//	public <T extends ReturnDataBean> List<T> excuteTmp(String tranNo,
//			String iCurrPage,
//			String serverNo,
//			String mac,
//			CommBody comb,
//			Object objSend,
//			Class<T> objRet) throws Exception, InstantiationException, IllegalAccessException  {
//		try {
//			return excuteJYGLForIRecNumTmp(tranNo, iCurrPage, "15", serverNo, mac, comb, objSend, objRet);
//		} catch (Exception e) {
//			//LOG.ADMININFO("失败信息:" + e);
//			throw new Exception(e.getMessage());
//		} catch (InstantiationException e) {
//			//LOG.ADMININFO("失败信息:" + e);
//			throw new InstantiationException(e.getMessage());
//		} catch (IllegalAccessException e) {
//			//LOG.ADMININFO("失败信息:" + e);
//			throw new IllegalAccessException(e.getMessage());
//		}
//	}

	/**
	 * 每页多少条的可变方法
	 * @param tranNo:交易码
	 * @param iCurrPage:当前页
	 * @param iRecNum :每页多少条
	 * @param serverNo:系统服务码
	 * @param mac:标识
	 * @param comb
	 * @param objSend:发送
	 * @param objRet:返回
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws Exception
	 */
//	public <T extends ReturnDataBean> List<T> excuteJYGLForIRecNumTmp(String tranNo,
////			String iCurrPage,
////			String iRecNum,
////			String serverNo,
////			String mac,
////			CommBody comb,
////			Object objSend,
////			Class<T> objRet) throws InstantiationException, IllegalAccessException, Exception{
////		List<T> list = new ArrayList<T>();
////		PrivData pd = new PrivData(objSend,null ,(XzcjInfoSend) objSend) ;
////		comb.setsTransNo(tranNo);// 交易码
////		comb.setsMac(mac);// 申请
////		comb.setiCurrPage(iCurrPage);
////		comb.setiRecNum(iRecNum);
////		comb.Pack(pd.getsPricData());		//组装私有报文
////
////		//获取发送报文，用于ParamHeadBean
////		String sendMsg = comb.getsSendBuf();
////
////		ParamHeadBean head = new ParamHeadBean();
////		head.setServiceName(tranNo);					// 交易接口号
////		head.setReqIdentification(TxncodeConst.Req_Id);	// 请求方编号（交易管理系统提供）团险GPS
////		head.setServiceIdentification(serverNo);		// 服务方编号（交易管理系统提供）健康险管理
////		// 以上三个参数为必须设置项，以下参数根据具体情况设置
////		head.setReqOrganizationNo("");	// 机构号
////		head.setReqTellerNo("");		// 操作员号
////		head.setVersionNum("");			// 版本号
////		head.setOutBusCode(""); 		// 外部交易唯一码（最大长度100个字节）
////		//调用交易，返回一个bean对象，关于bean对象下面会有详细的介绍
////		long a=new Date().getTime();
////		Bean bean = new ASocketClient().sendMessage(sendMsg, head);//参数msg为请求方报文
////		long b=new Date().getTime();
////		long c=b-a;
////		//LOG.ADMININFO("本次交易消耗时间为：" + c + "ms;-----发送报文是：" + comb.getsSendBuf() + "|--|返回报文是：" + bean.getRetStr());
////
////		if(bean == null || StringUtils.isBlank(bean.getRetStr())) {
////			//保存申请交易失败的报文信息
////			//LOG.ADMININFO("交易发送失败：sRetNo_2" + comb.getsRetNo() + "|" + comb.getsSendBuf());
////			CommPersistMethod.persistFailTaskInfo(comb);
////			if(serverNo.equals(TxncodeConst.Serv_FF)) {
////				//LOG.ADMININFO("*************FF系统交易失败:交易码" +tranNo+ "***********");
////			} else if(serverNo.equals(TxncodeConst.Serv_CAGS)) {
////				//LOG.ADMININFO("*************综意险系统交易失败:交易码" +tranNo+ "***********");
////			} else if(serverNo.equals(TxncodeConst.Serv_PRINT)) {
////				//LOG.ADMININFO("*************打印平台交易失败:交易码" +tranNo+ "***********");
////			}
////			throw new Exception("交易失败!");
////		}
////
////		//LOG.info("返回报文：[" + bean.getRetStr() + "]");
////		comb.setsRcvBuf(bean.getRetStr());
////
////		if (!TxncodeConst.SUCC_CODE.equals(bean.getStatus())) {
////			//保存申请交易失败的报文信息
////			//LOG.ADMININFO("交易调用出错：Status:" + bean.getStatus() + "|Errormsg:" + bean.getErrormsg());
////			return null;
////		}
////		return list;
////	}
}

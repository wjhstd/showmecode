package cn.a52going.sxsrvm.common;



import cn.a52going.inter0100125.GCustInfoRet;
import cn.a52going.inter0100125.GCustInfoSend;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Title:
 * <p>
 * Description:
 * <p>
 * Copyright: Copyright (c) 2009
 * <p>
 * Company: Shanghai Huateng Software Systems Co., Ltd.
 *
 * @author King.Johnson
 * @version 1.0
 */
/*REQLCS-161118-2554 团险事中监控转第三方账户 __ modified by c_weidaoqiang
 *修改时间 ：2016-11-22
 *修改点：增加方法getLocalDate10H2(..)"
*/

/**
 * REQLCS-161124-2618 团险GPS加人校验规则修改  c_weidaoqiang 2016/12/13
 * getAgeByBirth(..) 为birthDate 添加空值校验
 * @author c_yangjianlei
 *
 */
public class CommonFunction {

	public static Map<String, String> map = new HashMap<String, String>();
	// 把GPS的受理渠道转换成综意险的受理渠道
	static {
		map.put("1", "GPS");
		map.put("c", "002");
		map.put("d", "003");
		map.put("e", "001");
		map.put("f", "006");
		map.put("g", "008");
		map.put("h", "009");
		map.put("i", "004");
	}

	private static SimpleDateFormat fullfmt = new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss' 'SSSZ");

	private static SimpleDateFormat fullfmt3 = new SimpleDateFormat("yyyy/MM/dd' 'HH:mm:ss");

	private static SimpleDateFormat fullfmt2 = new SimpleDateFormat("yyyyMMddHHmmssSS");

	private static SimpleDateFormat fullfmt4 = new SimpleDateFormat("yyyyMMddHH:mm:ss");

	private static SimpleDateFormat datefmt = new SimpleDateFormat("yyyyMMdd");

	private static SimpleDateFormat datefmt10H = new SimpleDateFormat("yyyy-MM-dd");

	private static SimpleDateFormat datefmt10O = new SimpleDateFormat("yyyy/MM/dd");

	private static SimpleDateFormat time6fmt = new SimpleDateFormat("HHmmss");

	private static SimpleDateFormat time8fmt = new SimpleDateFormat("HH:mm:ss");

	private static SimpleDateFormat time14fmt = new SimpleDateFormat("yyyyMMddHHmmss");

	private static SimpleDateFormat time14fmt1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	private static SimpleDateFormat datefmtChinese = new SimpleDateFormat("yyyy'年'MM'月'dd'日'");

	private static SimpleDateFormat timefmtChinese = new SimpleDateFormat("HH'时'mm'分'ss'秒'");

	private static SimpleDateFormat time10fmt = new SimpleDateFormat("yyyy-MM-dd");
	private static SimpleDateFormat time10fmt2 = new SimpleDateFormat("yyyy/MM/dd");

	public static SimpleDateFormat getTime10fmt2() {
		return time10fmt2;
	}

	public static SimpleDateFormat getDatefmt10O() {
		return datefmt10O;
	}

	/**
	 * 查询FF团体客户信息
	 *
	 * @param grpcode 团体客户代码
	 * @return
	 */
	public static GCustInfoRet getGCustInfo(String grpcode) throws Exception {
		GCustInfoSend tempSendBean = new GCustInfoSend();
		// 根据身份证号查询客户号
		tempSendBean.setGrpcode(grpcode);
		// 综意险来的客户去FF取客户号
		CommBody commBody = new CommBody();
		List<GCustInfoRet> list_tmp = new CommMain().excute("0100125", "1", TxncodeConst.Serv_FF, "2", commBody,
				tempSendBean, GCustInfoRet.class);
		if (TxncodeConst.SUCC_CODE.equals(commBody.getsRetNo())) {
			if (list_tmp != null && list_tmp.size() > 0)
				return list_tmp.get(0);
		} else {
			throw new Exception("获取FF团体客户信息出错！！！" + commBody.getsRetMsg());
		}
		return null;
	}


	/**
	 * 保单复核接口
	 * @param insInfoSend
	 * @return
	 * @throws Exception
	 */
//	public static InsInfoRet insInfoSave(InsInfoSend insInfoSend) throws Exception {
//		// InsInfoSend infoSend=insInfoSend;
//		List<InsInfoSend> list1 = new ArrayList<>();
//		list1.add(insInfoSend);
//		// List<? extends PrivDataBean> list=new ArrayList<>();
//		// list.add(insInfoSend);
//		// 综意险来的客户去FF取客户号
//		CommBody commBody = new CommBody();
//		List<InsInfoRet> list_tmp = new CommMain().excute("2306002", "1", "15", TxncodeConst.Serv_CB, "2", commBody,
//				list1, InsInfoRet.class);
//		if (TxncodeConst.SUCC_CODE.equals(commBody.getsRetNo())) {
//			if (list_tmp != null && list_tmp.size() > 0)
//				return list_tmp.get(0);
//		} else {
//			throw new Exception("险种信息录入出错！！！" + commBody.getsRetMsg());
//		}
//		return null;
//	}

	// public static InsInfoRet testCircle(InsInfoSend insInfoSend) throws Exception
	// {
	// List<FBQ025010Send> sendCAGS = new ArrayList<FBQ025010Send>();
	// FBQ025010Send sendSCAGS = new FBQ025010Send();
	// sendSCAGS.setOPRNO("200020");
	// try {
	// sendSCAGS.setBRACHID("2");
	// } catch (Exception e) {
	// //log("分公司不存在或用户名为空",e);
	// }
	// sendSCAGS.setRedList(send1CAGS);
	// sendCAGS.add(sendSCAGS);
	// CommMain cm = new CommMain();
	// List<FBQ025010Ret> CAGSpolicy = new ArrayList<FBQ025010Ret>();
	// List<FBQ025010Ret> CAGSpolicyTemp = new ArrayList<FBQ025010Ret>();
	// FBQ025010Send sendTemp = new FBQ025010Send();
	// if(send!=null && send.size()>0){
	// sendTemp.setBRACHID(send.get(0).getBRACHID());
	// sendTemp.setOPRNO(send.get(0).getOPRNO());
	// }
	// List<FBQ025010Send1> tmp = new ArrayList<FBQ025010Send1>();
	// for(FBQ025010Send single:send){
	// List<FBQ025010Send1> allList = single.getRedList();
	// if(allList!=null && allList.size()>0){
	// for(int i=0;i<allList.size()/15+1;i++){
	// if(i==allList.size()/15){
	// if( allList.size()%15>0){
	// tmp = allList.subList(15*i, allList.size());
	// }else{
	// return CAGSpolicy;
	// }
	// }
	// else tmp = allList.subList(15*i, 15*(i+1));
	// sendTemp.setRedList(tmp);
	// List<FBQ025010Send> sendBeanList = new ArrayList<FBQ025010Send>();
	// sendBeanList.add(sendTemp);
	// CommBody body = new CommBody();
	// try{
	// CAGSpolicyTemp= cm.excute("1290270", "1", "15", TxncodeConst.Serv_CAGS,
	// TxncodeConst.MAC_REQ, body, sendBeanList, FBQ025010Ret.class);
	//
	// String retNo = body.getsRetNo();
	// if (!"0000000".equals(retNo)) {
	// throw new Exception("CAGS交易失败" + body.getsRetMsg());
	// }
	// CAGSpolicy.addAll(CAGSpolicyTemp);
	// }catch(Exception e){
	// //log("CAGS交易失败", e);
	// }
	// }
	// }
	// }
	// return CAGSpolicy;
	// }
//	public static PayInfoRet getPayInfo(PayInfoSend payInfoSend) throws Exception {
//		PayInfoSend payInfo = payInfoSend;
//
//		// 综意险来的客户去FF取客户号
//		CommBody commBody = new CommBody();
//
//		List<PayInfoRet> list_tmp = new CommMain().excute("1208002", "1", TxncodeConst.Serv_CAGS, "2", commBody,
//				payInfo, PayInfoRet.class);
//
//		if (TxncodeConst.SUCC_CODE.equals(commBody.getsRetNo())) {
//			if (list_tmp != null && list_tmp.size() > 0)
//				return list_tmp.get(0);
//		} else {
//			throw new Exception("缴费通知录入出错！！！" + commBody.getsRetMsg());
//		}
//
//		return null;
//	}

//	public static InsuranceUnitRet createInsuranceUnit(InsuranceUnitSend send) throws Exception {
//		InsuranceUnitRet ret = new InsuranceUnitRet();
//		CommBody commBody = new CommBody();
//		List<InsuranceUnitRet> list_tmp = new CommMain().excute("0100224", "1", TxncodeConst.Serv_FF, "2", commBody,
//				send, InsuranceUnitRet.class);
//		if (TxncodeConst.SUCC_CODE.equals(commBody.getsRetNo())) {
//			if (list_tmp != null && list_tmp.size() > 0)
//				return list_tmp.get(0);
//		} else {
//			throw new Exception("创建团体投保单位失败！！！" + commBody.getsRetMsg());
//		}
//		return null;
//	}

	/**
	 * 查询客户基本信息（FF有，综意险没有）
	 * @param custInfo
	 * @return
	 * @throws Exception
	 */
//	public static int  getCustVerifyInfo(CustInfoVerifySend custInfo) {
//		CommBody commBody = new CommBody();
//		try {
//			List<CustInfoVerifyRet> list_tmp = new CommMain().excute("0100105", "1", TxncodeConst.Serv_FF, "2", commBody,
//					custInfo, CustInfoVerifyRet.class);
//			if (TxncodeConst.SUCC_CODE.equals(commBody.getsRetNo())) {
//				if (list_tmp != null && list_tmp.size() > 0) {
//					return 0;
//				}
//			}else{
//				return  1;
//			}
//		}catch(Exception e)
//		{
//              return -1;
//		}
//		return -1;
//		if (TxncodeConst.SUCC_CODE.equals(commBody.getsRetNo())) {
//			if (list_tmp != null && list_tmp.size() > 0)
//				return list_tmp.get(0);
//		}else {
//			throw new Exception("查询客户基本信息出错！！！" + commBody.getsRetMsg());
//		}
//	}
	
	/**
	 * 核心创建账户信息接口0100234
	 */
//	public static boolean zyx0100234(E0100234Send sendInfo) throws Exception {
//
//		CommBody commBody = new CommBody();
//		List<E0100234Ret> list_tmp = new CommMain().excute("0100234", "1",
//				TxncodeConst.Serv_FF, "2", commBody, sendInfo,
//				E0100234Ret.class);
//		if (!TxncodeConst.SUCC_CODE.equals(commBody.getsRetNo())) {
//			return false;
//		}
//		return true;
//	}
	
	/**
	 * 综意险查询账户信息接口0100153
	 */
//	public static List<E0100153Ret> zyx0100153(E0100153Send sendInfo) throws Exception {
//
//		CommBody commBody = new CommBody();
//		List<E0100153Ret> list_tmp = new CommMain().excute("0100153", "1",
//				TxncodeConst.Serv_FF, "2", commBody, sendInfo,
//				E0100153Ret.class);
//		if (TxncodeConst.SUCC_CODE.equals(commBody.getsRetNo())) {
//			if (list_tmp != null && list_tmp.size() > 0)
//				return list_tmp;
//		} else {
//			throw new Exception("调用核心接口E0100153Ret出现异常！！！"+commBody.getsRetMsg());
//		}
//		return null;
//	}
//
	/**
	 * 综意险结案接口1221009
	 */

//	public static E1221009Ret zyx1221009(E1221009Send sendInfo) throws Exception {
//		CommBody commBody = new CommBody();
//		List<E1221009Ret> list_tmp = new CommMain().excute("1221009", "1",
//				TxncodeConst.Serv_CAGS, "2", commBody, sendInfo,
//				E1221009Ret.class);
//		if (TxncodeConst.SUCC_CODE.equals(commBody.getsRetNo())) {
//			if (list_tmp != null && list_tmp.size() > 0)
//				return list_tmp.get(0);
//		} else {
//			throw new Exception("调用综意险接口1221009出现异常！！！"+commBody.getsRetMsg());
//		}
//		return null;
//	}

	/**
	 * 综意险结案接口1222018
	 */

//	public static E7002005Ret zyx1222018(E7002005Send sendInfo) throws Exception {
//		CommBody commBody = new CommBody();
//
//		List<E7002005Send> list1=new ArrayList<>();
//		list1.add(sendInfo);
//		List<E7002005Ret> list_tmp = new CommMain().excute("1222018", "1","15",
//				TxncodeConst.Serv_CAGS, "2", commBody, list1,
//				E7002005Ret.class);
//
//		if (TxncodeConst.SUCC_CODE.equals(commBody.getsRetNo())) {
//			if (list_tmp != null && list_tmp.size() > 0)
//				return list_tmp.get(0);
//		} else {
//			throw new Exception("调用综意险接口1222018出现异常！！！" + commBody.getsRetMsg());
//		}
//		return null;
//	}

	/**
	 * 综意险结案接口1222005
	 */

//	public static E9002005Ret zyx1222005(E9002005Send sendInfo) throws Exception {
//		CommBody commBody = new CommBody();
//
//		List<E9002005Send> list1 =new ArrayList<E9002005Send>();
//		list1.add(sendInfo);
//		List<E9002005Ret> list_tmp = new CommMain().excute("1222005", "1","15",
//				TxncodeConst.Serv_CAGS, "2", commBody, list1,
//				E9002005Ret.class);
//
//		if (TxncodeConst.SUCC_CODE.equals(commBody.getsRetNo())) {
//			if (list_tmp != null && list_tmp.size() > 0)
//				return list_tmp.get(0);
//		} else {
//			throw new Exception("调用综意险接口1222005出现异常！！！" + commBody.getsRetMsg());
//		}
//		return null;
//	}

	/**
	 * 
	* @Title: getPerformanceBondInfo  
	* @Description: 综意险接口  1222033
	* @param @param performanceBondDataSend
	* @param @return
	* @param @throws Exception    参数  
	* @return PerformanceBondDataRet    返回类型  
	* @throws
	 */
//	public static PerformanceBondDataRet getPerformanceBondInfo(PerformanceBondDataSend performanceBondDataSend)
//			throws Exception {
//		PerformanceBondDataSend pb = performanceBondDataSend;
//
//		// 综意险来的客户去FF取客户号
//		CommBody commBody = new CommBody();
//
//		List<PerformanceBondDataRet> list_tmp = new CommMain().excute("1222033", "1", TxncodeConst.Serv_CAGS, "2",
//				commBody, pb, PerformanceBondDataRet.class);
//
//		if (TxncodeConst.SUCC_CODE.equals(commBody.getsRetNo())) {
//			if (list_tmp != null && list_tmp.size() > 0)
//				return list_tmp.get(0);
//		} else {
//			throw new Exception("履约保证金出错！！！" + commBody.getsRetMsg());
//		}
//
//		return null;
//	}

	/**
	 * 
	* @Title: getRiskAdjustFundInfo  
	* @Description: 综意险接口 1222034  
	* @param @param riskAdjustFundDataSend
	* @param @return
	* @param @throws Exception    参数  
	* @return RiskAdjustFundDataRet    返回类型  
	* @throws
	 */
//	public static RiskAdjustFundDataRet getRiskAdjustFundInfo(RiskAdjustFundDataSend riskAdjustFundDataSend)
//			throws Exception {
//		RiskAdjustFundDataSend pb = riskAdjustFundDataSend;
//
//		// 综意险来的客户去FF取客户号
//		CommBody commBody = new CommBody();
//
//		List<RiskAdjustFundDataRet> list_tmp = new CommMain().excute("1222034", "1", TxncodeConst.Serv_CAGS, "2",
//				commBody, pb, RiskAdjustFundDataRet.class);
//
//		if (TxncodeConst.SUCC_CODE.equals(commBody.getsRetNo())) {
//			if (list_tmp != null && list_tmp.size() > 0)
//				return list_tmp.get(0);
//		} else {
//			throw new Exception("风险调节基金和期末盘点金额供给综意险出错！！！" + commBody.getsRetMsg());
//		}
//
//		return null;
//	}

	/**
	 * 获取电话区号和剩余的号码的组合 规则：遇到第一个“－”，并且该字符串“－”之前的长度不能超过5位时进行截取作为区号
	 *
	 * @param phoneNum
	 * @return
	 */
	public static Map<String, Object> separatePhone(String phoneNum) {
		Map<String, Object> map = new HashMap<String, Object>();
		// 区号
		String areaCode = "";
		// 截取掉区号剩余的号码
		String remainCode = phoneNum;
		if (null != phoneNum && phoneNum.indexOf("-") > 0
				&& phoneNum.substring(0, phoneNum.indexOf("-")).length() < 5) {
			areaCode = phoneNum.substring(0, phoneNum.indexOf("-"));
			remainCode = phoneNum.substring(phoneNum.indexOf("-") + 1);
		}

		map.put("areaCode", areaCode);
		map.put("remainCode", remainCode);
		return map;
	}

	/**
	 * 计算传入的数字的List的数据之和
	 *
	 * @param primaryMoney
	 *            一个放置String类型的数据之和（允许有非数字内容）
	 * @return 计算后的结果
	 */
	public static String sumMoney(List<String> primaryMoney) {
		String result = "0.00";

		if (primaryMoney == null || primaryMoney.size() == 0) {
			return result;
		}
		double dResult = 0;
		for (String pri1 : primaryMoney) {
			pri1 = pri1.replaceAll("[^\\.\\d]", "");
			if (pri1.length() == 0) {
				continue;
			}
			if (pri1.charAt(0) == '.') {
				pri1 = "0" + pri1;
			}
			double dPri = Double.parseDouble(pri1);
			dResult += dPri;
		}

		result = String.valueOf(dResult);

		return result;
	}

	/**
	 * 字符串填充函数
	 *
	 * @param string
	 * @param filler
	 * @param totalLength
	 * @param atEnd
	 * @return
	 */
	public static String fillString(String string, char filler, int totalLength, boolean atEnd) {
		string = pretreatAllString(string);
		byte[] tempbyte = (string == null ? "" : string).getBytes();
		int currentLength = tempbyte.length;
		int delta = totalLength - currentLength;
		for (int i = 0; i < delta; i++) {
			if (atEnd) {
				string += filler;
			} else {
				string = filler + string;
			}
		}
		return string;
	}

	/**
	 * 转 gbk格式
	 * @param sourceStr
	 * @param targetLen
	 * @return
	 */
	public static String fillStr(String sourceStr, int targetLen) {
		StringBuffer targetBuf = new StringBuffer();
		if (sourceStr == null) {
			sourceStr = "";
		}

		int len = 0;
		char[] tempChars = sourceStr.toCharArray();
		for (char c : tempChars) {
			len = len + (c > 128 ? 2 : 1);
			if (len <= targetLen) {
				targetBuf.append(c);
				continue;
			}
			len = len - (c > 128 ? 2 : 1);
			break;
		}

		for (int i = 0; i < targetLen - len; i++) {
			targetBuf.append(" ");
		}
		return targetBuf.toString();
	}

	/**
	 * 去所有空格
	 *
	 * @param primary
	 *            原始字符
	 * @return 处理所有空格后的字符
	 */
	public static String pretreatAllString(String primary) {
		String tmp = pretreatString(primary);
		return tmp.replaceAll("\\s", "");
	}

	/**
	 * 处理String，去两边空格；如果是null，返回空字符串
	 *
	 * @param primary
	 * @return
	 */
	public static String pretreatString(String primary) {
		String tmp = primary;
		tmp = tmp == null ? "" : tmp.trim();
		return tmp;
	}

	public static SimpleDateFormat getTime10fmt() {
		return time10fmt;
	}

	public static void setTime10fmt(SimpleDateFormat time10fmt) {
		CommonFunction.time10fmt = time10fmt;
	}

	public static SimpleDateFormat getTime8fmt() {
		return time8fmt;
	}
}

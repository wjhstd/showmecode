package cn.a52going.sxsrvm.common;


import cn.a52going.common.PrivDataBean;
import cn.a52going.common.ReturnDataBean;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;


public class PrivData {
	private Log log= LogFactory.getLog(this.getClass());
	private String[] priNameList;
	private int[] priLenList;
	private String[] priFormatList;

	public String[] retNameList;
	public int[] retLenList;
	public String[] getRetNameList() {
		return retNameList;
	}
	public void setRetNameList(String[] retNameList) {
		this.retNameList = retNameList;
	}
	public int[] getRetLenList() {
		return retLenList;
	}
	public void setRetLenList(int[] retLenList) {
		this.retLenList = retLenList;
	}


	private String sPricData;
	public String getsPricData() {
		return sPricData;
	}
	public void setsPricData(String sPricData) {
		this.sPricData = sPricData;
	}

	public String[] getPriNameList() {
		return priNameList;
	}
	public void setPriNameList(String[] priNameList) {
		this.priNameList = priNameList;
	}
	public int[] getPriLenList() {
		return priLenList;
	}
	public void setPriLenList(int[] priLenList) {
		this.priLenList = priLenList;
	}

	public PrivData(Object objSent,Object objBack) throws Exception{
		//初始化发送报文配置信息
		BeanWrapper bw1 = new BeanWrapperImpl(objSent);
		priNameList =(String[])bw1.getPropertyValue("priNameList");
		priLenList =(int[])bw1.getPropertyValue("priLenList");
		priFormatList =(String[])bw1.getPropertyValue("priFormatList");
		if(null != objBack) {
			//初始化返回结果报文配置信息
			BeanWrapper bw2 = new BeanWrapperImpl(objBack);
			retNameList =(String[])bw2.getPropertyValue("retNameList");
			retLenList =(int[])bw2.getPropertyValue("retLenList");
		}
		//生成发送报文的私有报文
		//System.out.printf("objSent:"+objSent.toString());
		this.sPricData=doPrivData(objSent,bw1);

		//System.out.printf("sPricData:"+sPricData);
	}

	/**
	 * 2011-8-15 zhangweiming add
	 * 组装多条请求报文
	 * @param objBack:返回bean
	 * @throws InvocationTargetException
	 * @throws IllegalAccessException
	 * @throws NoSuchMethodException
	 * @throws NoSuchFieldException
	 * @throws IllegalArgumentException
	 * @throws SecurityException
	 * @throws ArrayIndexOutOfBoundsException
	 */
	public PrivData(List<? extends PrivDataBean> tpdList, Object objBack, String type) throws ArrayIndexOutOfBoundsException, SecurityException, IllegalArgumentException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, Exception{
		if(null != objBack) {
			//初始化返回结果报文配置信息
			BeanWrapper bw2 = new BeanWrapperImpl(objBack);
			retNameList =(String[])bw2.getPropertyValue("retNameList");
			retLenList =(int[])bw2.getPropertyValue("retLenList");
		}
		//生成发送报文的私有报文
		StringBuffer strbf=new StringBuffer();
		for(Object obj:tpdList){
			//初始化发送报文配置信息
			BeanWrapper bw1 = new BeanWrapperImpl(obj);
			System.out.println("================="+bw1.getWrappedInstance().getClass().getName()+"=========");
			priNameList =(String[])bw1.getPropertyValue("priNameList");
			priLenList =(int[])bw1.getPropertyValue("priLenList");
			priFormatList =(String[])bw1.getPropertyValue("priFormatList");
			strbf.append(doPrivData(bw1));
		}
		log.debug("拼接的报文为："+strbf.toString());
		this.sPricData=strbf.toString();
	}

	public String doPrivData(Object obj,BeanWrapper bw){
		//按报文接口配置拼装报文
		StringBuffer strBuf = new StringBuffer();
		for(int i=0;i<priNameList.length;i++){
			if(null != bw.getPropertyValue(priNameList[i])) {
				if(false) {
					strBuf.append(
							CommonFunction.fillStr(
									bw.getPropertyValue(priNameList[i]).toString(), priLenList[i]));
				}else {
					strBuf.append(CommonFunction.fillString((String)bw.getPropertyValue(priNameList[i]), ' ', priLenList[i], true));
					//bw.getPropertyValue(priNameList[i]).toString(), ' ', priLenList[i], true));
				}



//				strBuf.append(CommonFunction.fillString((String)bw.getPropertyValue(priNameList[i]), ' ', priLenList[i], true));
			} else {
				if(false) {
					strBuf.append(
							CommonFunction.fillStr(
									" ", priLenList[i]));
				}else {
					strBuf.append(CommonFunction.fillString(" ", ' ', priLenList[i], true));
					//bw.getPropertyValue(priNameList[i]).toString(), ' ', priLenList[i], true));
				}
				//strBuf.append(CommonFunction.fillString(" ", ' ', priLenList[i], true));
			}
		}
		log.debug("strBuf:"+strBuf.toString());
		return strBuf.toString() ;
	}
	/**
	 * 2011-08-15 zhangweiming add
	 * 此段代码可以进行重构,时间较紧没有进行重构..
	 * @param bw
	 * @return
	 * @throws Exception
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws InvocationTargetException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 */
	public String doPrivData(BeanWrapper bw) throws Exception,ArrayIndexOutOfBoundsException, SecurityException, NoSuchFieldException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException{//按报文接口配置拼装报文
		StringBuffer strBuf=new StringBuffer();
		for(int i=0;i<priNameList.length;i++){
			//发送报文需要循环
			if(priNameList[i].equals("maxCircleNum")) {
				//最大循环次数,用于判断开发人员传入的聚合list大小是否超过了最大循环次数
				int maxCircleNum = this.priLenList[i];
				//聚合的LIst
				List<?> list = null;
				//循环的列数
				int colNum;
				i++; //获取下一个字段
				if(!priNameList[i].equals("colNum")) {
					throw new Exception("发送报文数组定义有误,未按照约定!");
				} else {
					//循环的列数
					colNum = this.priLenList[i];
					i++;
					//获取list值
					list = (List<?>)bw.getPropertyValue(priNameList[i]);
					log.debug("获取的list为："+list);
					if(null == list) {
						throw new Exception("发送报文空,无效数据!");
					}
					if ("formatNumber".equals(priFormatList[i])){
						strBuf.append(
								CommonFunction.fillString(
										String.valueOf(maxCircleNum), ' ', 3, true));
					} else{
						if(false) {

							strBuf.append(
									CommonFunction.fillStr(
											String.valueOf(maxCircleNum),2));
							System.out.println("=============================使用GBK格式发送报文=========================");
						}
						else{
							strBuf.append(
									CommonFunction.fillString(
											String.valueOf(maxCircleNum), ' ', 2, true));
							System.out.println("=============================使用UTF-8格式发送报文=========================");
						}
							
					}
					log.debug("strBuf:"+strBuf.toString());
					//发送的聚合list大小超过最大循环次数,抛出异常
					if(list.size() > maxCircleNum) {
						throw new Exception("发送报文超过了长度,未按照约定!");
					}
					int tmp = i;//将i存于一个临时变量中
					for(Object obj : list) {
						Class<?> clazz = obj.getClass(); //获取集合中的对象类型
						if(!clazz.getName().equals("java.lang.String")) {
							//约定为javabean
							for(int k=0;k<colNum;k++) {
								tmp ++ ;
								String fieldName = this.priNameList[tmp];
								//通过get方法来拿取
								System.out.println("通过get方法来拿取:"+"get"+fieldName.substring(0,1).toUpperCase()+fieldName.substring(1));
								Method md = clazz.getMethod("get"+fieldName);
								//Method md = clazz.getMethod("get"+fieldName.substring(0,1).toUpperCase()+fieldName.substring(1));

								if(md != null) {
									//执行get方法
									Object value = md.invoke(obj);
									if(value == null) {
										strBuf.append(
												CommonFunction.fillString(
														" ", ' ', priLenList[tmp], true));
									} else {
										strBuf.append(
												CommonFunction.fillString(
														value.toString(), ' ', priLenList[tmp], true));
									}

								}
							}
							tmp = i;
						} else {
							//字符串
							tmp ++;
//							if(null == obj) {
//								strBuf.append(
//										CommonFunction.fillString(
//												" ", ' ', priLenList[tmp], true));
//							} else
//							{
							strBuf.append(
									CommonFunction.fillString(
											obj.toString(), ' ', priLenList[tmp], true));
//							}

							tmp = i;
						}
					}

				}
				//为了FF 在最大记录数后面补齐空格
				if(maxCircleNum > list.size()) {
					for(int n=0;n<maxCircleNum-list.size();n++) {
						int temp = i;
						for(int m=0;m < colNum; m++) {
							temp++;
							strBuf.append(
									CommonFunction.fillString(
											" ", ' ', priLenList[temp], true));
						}
						temp = i;
					}
				}
				i = i + colNum;
			} else {
				//加入处理空值是发送的是null的问题
				if(null != bw.getPropertyValue(priNameList[i])) {
					if(false) {
						strBuf.append(
								CommonFunction.fillStr(
										bw.getPropertyValue(priNameList[i]).toString(), priLenList[i]));
						}else {
							strBuf.append(
							CommonFunction.fillString(
									bw.getPropertyValue(priNameList[i]).toString(), ' ', priLenList[i], true));
							//bw.getPropertyValue(priNameList[i]).toString(), ' ', priLenList[i], true));
						}
				} else {
					strBuf.append(
							CommonFunction.fillString(
									" ", ' ', priLenList[i], true));
				}
			}
		}
		return strBuf.toString();
	}
	public <T extends ReturnDataBean> List<T> getReruenDataForList(String sysFlag, String sPrivData, Class<T> objBack) throws SecurityException, NoSuchFieldException,
			IllegalArgumentException, IllegalAccessException,
			InstantiationException, ClassNotFoundException, Exception, ArrayIndexOutOfBoundsException {
		List<T> list=new ArrayList<T>();
//		int singlen=objBack.newInstance().getSingleLenth();
		String remain = this.getReruenData(sysFlag,sPrivData, objBack,list);
		//防止死循环，大于500次强制退出
		int index = 0;
		while(remain != null && remain.trim().length() > 0 && index < 500) {
			remain = this.getReruenData(sysFlag,remain, objBack, list);
			index ++;
		}
		return list;
	}

	public <T> String getReruenData(String sysFlag,String sPrivData,Class<T> objBack,List<T> list) throws SecurityException, NoSuchFieldException,
			IllegalArgumentException, IllegalAccessException,
			InstantiationException, ClassNotFoundException,ArrayIndexOutOfBoundsException, Exception {

		//需要在循环之前增加标志位true；
		//标志位下一个元素就是list的Name，长度统一为0。
		//目前先支持一个循环体，且在报文尾端
		String flag="maxCircleNum"; //最大的循环次数
		String colFlag = "colNum";//列的标识

		MyUnPackage t2 = new MyUnPackage();
		String sTempRecv[] = new String[2];
		sTempRecv[1]=sPrivData;
		T obj = objBack.newInstance();
		//设置系统标识
		Field superField = objBack.getSuperclass().getDeclaredField("sysFlag");
		superField.setAccessible(true);
		superField.set(obj,sysFlag);

		for(int i=0;i<retNameList.length;i++){
			if(!retNameList[i].equals(flag)){
				//不是循环
				sTempRecv = t2.explainBodyItem(sTempRecv[1], retLenList[i]);
				//普通参数赋值
				Field f1=objBack.getDeclaredField(retNameList[i]);
				f1.setAccessible(true);
				f1.set(obj, sTempRecv[0].trim());
				continue;
			} else {
				//读到循环标志位
				//业务数据存储集合
				List<Object> res = new ArrayList<Object>();
				//获取要循环的次数
				int cirCulNum = retLenList[i];
				//干掉返回结果字符串的"循环标志"数据
				sTempRecv = t2.explainBodyItem(sTempRecv[1], 2);
				//field数组下标移位:循环列数
				i++;
				//循环的次数下一个必须紧跟colNum标志,如果不是,抛出异常
				if(!retNameList[i].trim().equals(colFlag)) {
					throw new Exception("交易数组定义有误,未按照约定");
				}
				//获取聚合进来的javabean或string的字段数目,即循环的列数
				int colNum = retLenList[i];

				//field数组下表移位:主javabean的各个(listJavaBean或string)的成员变量名称
				//个人建议:单个用String 来存储,两个以及两个以上用javabean来存储
				i++;
				//list成员变量名称
				String listFieldName = retNameList[i];
				//这个只能访问公有的属性,不能访问私有的属性
//
//				String classPath = ((ParameterizedType)objBack.getField(listFieldName).getGenericType())
//					.getActualTypeArguments()[0].toString().substring(6);
				String classPath = ((ParameterizedType)objBack.getDeclaredField(listFieldName).getGenericType())
						.getActualTypeArguments()[0].toString().substring(6);
				if(classPath.equals("java.lang.String")) {
					//String类型
					//forString(t2,res,colNum,i,cirCulNum,sTempRecv);
					if(colNum != 1) {
						throw new Exception("交易数组定义与约定有误,字符串类型的集合必须为1列");
					}
					//循环几次
					//将I存入临时变量中
					int count = i;
					for(int m=0;m<cirCulNum;m++) {
						count++;
						sTempRecv = t2.explainBodyItem(sTempRecv[1],retLenList[count]);
						if(null != sTempRecv[0].trim() && !sTempRecv[0].trim().equals("")) {
							res.add(sTempRecv[0].trim());
						}
						count = i;
					}
				} else {
					//javabean
					//forPojo(t2,sTempRecv,res,classPath,i,cirCulNum,colNum);
					for(int m=0;m<cirCulNum;m++) {
						//实例化对象
						Object itemObj = Class.forName(classPath).newInstance();
						//将I存入临时变量中
						int count = i;
						//用来标识聚合的bean的有数据的列数
						int hasData = 0;
						//根据循环的列数进行循环取数
						for(int k=0;k<colNum;k++) {
							//field数组移位,获取下一个列名称
							count++;
							//列名称
							String colName = retNameList[count];
							//改列返回的报文长度
							int colLength = retLenList[count];
							sTempRecv = t2.explainBodyItem(sTempRecv[1],colLength);
							if(sTempRecv[0] != null
									&& sTempRecv[0].trim().length() != 0
									&& !sTempRecv[0].trim().equals("") ) {
								//计数器累加
								hasData++;
								//通过反射机制获取存储的javabean名称
								Field fd2 = itemObj.getClass().getDeclaredField(colName);
								fd2.setAccessible(true);
								fd2.set(itemObj, sTempRecv[0].trim());
							}
						}
						//至少有一列有数据时才加入集合
						if(hasData > 0) {
							res.add(itemObj);
						}

					}
				}
				Field fd3 = objBack.getDeclaredField(listFieldName);
				fd3.setAccessible(true);
				fd3.set(obj, res);
				i =  i + colNum;
			}
		}
		list.add(obj);
		return sTempRecv[1];
	}
}

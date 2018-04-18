package cn.a52going.sxsrvm.common;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class ZYXUtil {

	/**
	 * 追加空格进行补位操作
	 * 
	 * @param 	str 需要追加空格的字符串/数字
	 * 			len 制造补位空格的数量
	 * 
	 * @return result 完成补位操作的字符串
	 * 
	 * @author 袁沁
	 */
	public static StringBuffer addSpace(String str, int len) {
		// System.out.println(str + "|||" + len);
		if (str == null)
			str = "";
		StringBuffer result = new StringBuffer();
		try {
			if (len < str.getBytes("UTF-8").length)
				System.err.println("填充报文时出现错误，字段数据溢出。重新确认字段长度和验证程序的正确性");

			result.append(str + createSpace(len - str.getBytes("UTF-8").length));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public static StringBuffer addSpace(int str1, int len) {
		// System.out.println(str1 + "|||" + len);
		String str = String.valueOf(str1);
		StringBuffer result = new StringBuffer();
		if (len < str.getBytes().length)
			System.err.println("填充报文时出现错误，字段数据溢出。重新确认字段长度和验证程序的正确性");
		result.append(str + createSpace(len - str.getBytes().length));
		return result;
	}

	public static StringBuffer addSpace(long str1, int len) {
		// System.out.println(str1 + "|||" + len);
		String str = (new Long(str1)).toString();
		StringBuffer result = new StringBuffer();
		if (len < str.getBytes().length)
			System.err.println("填充报文时出现错误，字段数据溢出。重新确认字段长度和验证程序的正确性");
		result.append(str + createSpace(len - str.getBytes().length));
		return result;
	}

	public static StringBuffer addSpace(double str1, int len) {
		// System.out.println(str1 + "|||" + len);
		String str = String.valueOf(str1);
		StringBuffer result = new StringBuffer();
		if (len < str.getBytes().length)
			System.err.println("填充报文时出现错误，字段数据溢出。重新确认字段长度和验证程序的正确性");
		result.append(str + createSpace(len - str.getBytes().length));
		return result;
	}

	public static StringBuffer addSpace(BigDecimal str1, int len) {
		// System.out.println(str1 + "|||" + len);
		String str;
		if (str1 == null)
			str = "";
		else
			str = String.valueOf(str1);
		StringBuffer result = new StringBuffer();
		if (len < str.getBytes().length)
			System.err.println("填充报文时出现错误，字段数据溢出。重新确认字段长度和验证程序的正确性");
		result.append(str + createSpace(len - str.getBytes().length));
		return result;
	}

	/**
	 * 制造补位空格
	 * @param len 制造补位空格的数量
	 * 
	 * @return result.toString() 空格字符串
	 * 
	 * @author 袁沁
	 */
	public static String createSpace(int len) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < len; i++) {
			result.append(Const.DBYB_INTERFACE_SPACE);
		}
		return result.toString();
	}

	/**
	 * 制造补位空格
	 * @param filed 需要验证的内容
	 * 
	 * @param cond 需要验证的条件
	 * 
	 * @return singleErrorMsg 包含错误信息的list
	 * 
	 * @author 袁沁
	 */
	public static ArrayList<String> validate(String filed, String value, HashMap<String, String> cond) {
		ArrayList<String> singleErrorMsg = new ArrayList<String>();
		// 字段长度校验
		// System.out.println("进入字符长度校验");
		// System.out.println(cond.get(Const.DBYB_INTERFACE_STR_LENGTH));
		// System.out.println(Double.parseDouble(value));
		if (value == null) {
			if (Const.DBYB_INTERFACE_ISNULL_TRUE.equals(cond.get(Const.DBYB_INTERFACE_STR_ISNULL))) {
				singleErrorMsg.add("OK");
				return singleErrorMsg;
			} else {
				singleErrorMsg.add(filed + ErrorMsg.INTER_MSG_0001);
				return singleErrorMsg;
			}

		}
		if (value.trim().length() == 0
				&& Const.DBYB_INTERFACE_ISNULL_TRUE.equals(cond.get(Const.DBYB_INTERFACE_STR_ISNULL))) {
			singleErrorMsg.add("OK");
			return singleErrorMsg;
		}

		try {
			if (value != null
					&& value.getBytes("UTF-8").length > Integer.parseInt(cond.get(Const.DBYB_INTERFACE_STR_LENGTH))) {
				singleErrorMsg.add(filed + ErrorMsg.INTER_MSG_0002 + cond.get(Const.DBYB_INTERFACE_STR_LENGTH));
			}
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// 字段非空检验
		// System.out.println(Const.DBYB_INTERFACE_ISNULL_TRUE);
		// System.out.println(cond.get(Const.DBYB_INTERFACE_STR_ISNULL));
		if (Const.DBYB_INTERFACE_ISNULL_FALSE.equals(cond.get(Const.DBYB_INTERFACE_STR_ISNULL))) {
			// System.out.println("进入非空校验");
			// System.out.println(Const.DBYB_INTERFACE_ISNULL_FALSE + "||" +
			// cond.get(Const.DBYB_INTERFACE_STR_ISNULL));
			if (value == null) {
				singleErrorMsg.add(filed + ErrorMsg.INTER_MSG_0001);
				return singleErrorMsg;
			}
			if (value != null) {
				String tempValue = value.trim();
				if (tempValue.length() == 0) {
					singleErrorMsg.add(filed + ErrorMsg.INTER_MSG_0001);
					return singleErrorMsg;
				}
			}

		}
		// 最大值校验
		if (cond.get(Const.DBYB_INTERFACE_STR_MAX) != null && cond.get(Const.DBYB_INTERFACE_STR_MAX).length() != 0) {
			// System.out.println("进入数字是否超过最大值校验");
			try {
				if (Double.parseDouble(value) > Double.parseDouble(cond.get(Const.DBYB_INTERFACE_STR_MAX))) {
					singleErrorMsg.add(filed + ErrorMsg.INTER_MSG_0007 + ":" + cond.get(Const.DBYB_INTERFACE_STR_MAX));
				}
			} catch (Exception e) {
				singleErrorMsg.add(filed + ErrorMsg.INTER_MSG_0003);
			}
		}
		// 最小值校验
		if (cond.get(Const.DBYB_INTERFACE_STR_MIN) != null && cond.get(Const.DBYB_INTERFACE_STR_MIN).length() != 0) {
			// System.out.println("进入数字是否超过最小值校验");
			try {
				if (Double.parseDouble(value) < Double.parseDouble(cond.get(Const.DBYB_INTERFACE_STR_MIN))) {
					singleErrorMsg.add(filed + ErrorMsg.INTER_MSG_0008 + ":" + cond.get(Const.DBYB_INTERFACE_STR_MIN));
				}
			} catch (Exception e) {
				singleErrorMsg.add(filed + ErrorMsg.INTER_MSG_0003);
			}
		}
		// 小数点后位数校验
		if (cond.get(Const.DBYB_INTERFACE_STR_POINTMAX) != null
				&& cond.get(Const.DBYB_INTERFACE_STR_POINTMAX).length() != 0) {
			// System.out.println("进入小数点判定：" +filed + "|" + value + "|" +
			// cond.get(Const.DBYB_INTERFACE_STR_POINTMAX));
			/*
			 * try { int WeiShu =
			 * Integer.parseInt(cond.get(Const.DBYB_INTERFACE_STR_POINTMAX)); String b =
			 * value.substring(value.indexOf(".")+1,value.length()); if(b.length() > WeiShu)
			 * { singleErrorMsg.add(filed+ErrorMsg.INTER_MSG_0003 + ":" +
			 * cond.get(Const.DBYB_INTERFACE_STR_POINTMAX)); } } catch(Exception e) {
			 * singleErrorMsg.add(filed+ErrorMsg.INTER_MSG_0003); }
			 */
		}
		// 日期类型校验
		// System.out.println(cond.get(Const.DBYB_INTERFACE_STR_TYPE));
		// System.out.println(Const.DBYB_INTERFACE_STR_DATE);
		// System.out.println(cond.get(Const.DBYB_INTERFACE_STR_TYPE));
		if (cond.get(Const.DBYB_INTERFACE_STR_TYPE) != null && cond.get(Const.DBYB_INTERFACE_STR_TYPE).length() != 0
				&& Const.DBYB_INTERFACE_STR_DATE.equals(cond.get(Const.DBYB_INTERFACE_STR_TYPE))) {
			// System.out.println("进入格式校验");
			if (value != null) {
				String tempValue = value.trim();
				if (tempValue != "") {
					SimpleDateFormat sdf = new SimpleDateFormat(Const.DBYB_INTERFACE_STR_DATE_FORMAT);
					try {
						sdf.parse(tempValue);
						String[] tempArr = tempValue.split("/");
						if (tempArr[0].length() != 4) {
							singleErrorMsg.add(filed + ErrorMsg.INTER_MSG_0003);
							return singleErrorMsg;
						}
						if (tempArr[1].length() != 2 || Integer.parseInt(tempArr[1]) < 1
								|| Integer.parseInt(tempArr[1]) > 12) {
							singleErrorMsg.add(filed + ErrorMsg.INTER_MSG_0003);
							return singleErrorMsg;
						}
						if (tempArr[2].length() != 2 || Integer.parseInt(tempArr[2]) < 1
								|| Integer.parseInt(tempArr[2]) > 31) {
							singleErrorMsg.add(filed + ErrorMsg.INTER_MSG_0003);
							return singleErrorMsg;
						}
					} catch (ParseException e) {
						singleErrorMsg.add(filed + ErrorMsg.INTER_MSG_0003);
					}
				}
			}
		}
		// 时间类型校验
		// TODO

		if (singleErrorMsg.size() == 0) {
			singleErrorMsg.add("OK");
		}
		return singleErrorMsg;
	}

	// 从日期的字符串种获取类似于20100202这样的数字以期比较日期大小
	public static double getNumberFromString(String str) {
		double result = 0;
		StringBuilder resultStr = new StringBuilder("");
		for (int i = 0; i < str.length(); i++) {
			try {
				Integer.parseInt(str.substring(i, i + 1));
				resultStr.append(str.substring(i, i + 1));
			} catch (Exception e) {

			}
		}
		// System.out.println(resultStr);
		if (resultStr.toString().length() > 0)
			result = Double.parseDouble(resultStr.toString());

		return result;
	}

}

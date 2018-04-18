package cn.a52going.sxsrvm.common;
/*REQLDT-161102-882    BQGPS-1664502合作伙伴平台团对接惠泽保全接口调整__ modified by c_zhouchuang
 *修改时间 ：2016-11-15 
 *修改点：	增加常量—— B2Bi_ONLY_VALIDATE="000001"
*/
public class TxncodeConst{
		/** 请求方编号 (团险GPS)*/
		//public static final String Req_Id = "1011120000";
		/** 请求方编号 (行销)*/
		//public static final String Req_Id = "1011500000";
		/** zhangzhang*/
		//public static final String Req_Id = "1011600000";
		/**请求方编号（长保系统）*/
		public static final String Req_Id = "1011118000";
		/** 承保服务方编码*/
		public static String Serv_CB = "2021630000";
		/** FF 216*/
		public static String Serv_FF = "2010010000";
		/** 综意险 */
		public static String Serv_CAGS = "2010120000";

	/** 正确交易码 */
		public static final String SUCC_CODE = "0000000";
		/** 审核过程供第一个交易失败返回的code */
		public static final String FAIL_CODE_1ST = "FFFFFF";
		/** 打印平台 */
		public static final String Serv_PRINT = "2020100000";

	/** FF系统标识常量 */
		public static final String FF_SYSFLAG = "0";
		/** 综意险系统标识常量 */
		public static final String CAGS_SYSFLAG = "1";
		/** 声调系统标识常量 */
		public static final String SD_SYSFLAG = "";
		/** 打印平台系统标识常量 */
		public static final String PRT_SYSFLAG = "2";
	}

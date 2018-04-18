package cn.a52going.sxsrvm.common;

import java.util.ArrayList;
import java.util.Map;

public class Const {
	// 空格
	public final static String DBYB_INTERFACE_SPACE = " ";
	// 长度
	public final static String DBYB_INTERFACE_STR_LENGTH = "length";
	// 是否允许为空
	public final static String DBYB_INTERFACE_STR_ISNULL = "isNull";
	// 是否输入
	public final static String DBYB_INTERFACE_ISNULL_TRUE = "Y";
	public final static String DBYB_INTERFACE_ISNULL_FALSE = "N";
	// 最大值
	public final static String DBYB_INTERFACE_STR_MAX = "max";
	public final static String DBYB_INTERFACE_STR_MIN = "min";
	// 小数点后位数最大值
	public final static String DBYB_INTERFACE_STR_POINTMAX = "pointmax";
	// 类型
	public final static String DBYB_INTERFACE_STR_TYPE = "type";
	public final static String DBYB_INTERFACE_STR_STRING = "String";
	public final static String DBYB_INTERFACE_STR_NUMBER = "Number";
	public final static String DBYB_INTERFACE_STR_DATE = "DATE";
	public final static String DBYB_INTERFACE_STR_TIME = "Time";
	public final static String DBYB_INTERFACE_STR_DOUBLE = "Double";

	// 字符集格式
	public final static String DBYB_INTERFACE_STR_GBK = "GBK";

	// 日期格式
	public final static String DBYB_INTERFACE_STR_DATE_FORMAT = "yyyy/mm/dd";
	public final static String DBYB_INTERFACE_STR_TIME_FORMAT = "hh:MM:ss";

	// 调用接口后返回值
	public final static String DBYB_INTERFACE_KEY_RETURNMSG = "returnMsg";

	/*
	 * 投保单位的团体客户号部分常量定义 BEGIN
	 */
	// 交易码
	public final static String DBYB_INTERFACE_0100000_NAME_TRANSNO = "交易码";
	public final static String DBYB_INTERFACE_0100000_STR_TRANSNO = "transno";
	public final static String DBYB_INTERFACE_0100000_TRANSNO_LENGTH = "7";
	public final static String DBYB_INTERFACE_0100000_TRANSNO_ISNULL = "Y";
	public final static String DBYB_INTERFACE_0100000_TRANSNO_TYPE = "String";
	// 交易来源
	public final static String DBYB_INTERFACE_0100000_NAME_TRANSSOURCE = "交易来源";
	public final static String DBYB_INTERFACE_0100000_STR_TRANSSOURCE = "transsource";
	public final static String DBYB_INTERFACE_0100000_TRANSSOURCE_LENGTH = "2";
	public final static String DBYB_INTERFACE_0100000_TRANSSOURCE_ISNULL = "N";
	public final static String DBYB_INTERFACE_0100000_TRANSSOURCE_TYPE = "String";
	// 交易日期
	public final static String DBYB_INTERFACE_0100000_NAME_DATE = "交易日期";
	public final static String DBYB_INTERFACE_0100000_STR_DATE = "date";
	public final static String DBYB_INTERFACE_0100000_DATE_LENGTH = "10";
	public final static String DBYB_INTERFACE_0100000_DATE_ISNULL = "Y";
	public final static String DBYB_INTERFACE_0100000_DATE_TYPE = "Date";
	// 交易时间
	public final static String DBYB_INTERFACE_0100000_NAME_TIME = "交易时间";
	public final static String DBYB_INTERFACE_0100000_STR_TIME = "time";
	public final static String DBYB_INTERFACE_0100000_TIME_LENGTH = "8";
	public final static String DBYB_INTERFACE_0100000_TIME_ISNULL = "Y";
	public final static String DBYB_INTERFACE_0100000_TIME_TYPE = "Time";
	// 应答码
	public final static String DBYB_INTERFACE_0100000_NAME_RETNO = "应答码";
	public final static String DBYB_INTERFACE_0100000_STR_RETNO = "retno";
	public final static String DBYB_INTERFACE_0100000_RETNO_LENGTH = "7";
	public final static String DBYB_INTERFACE_0100000_RETNO_ISNULL = "Y";
	public final static String DBYB_INTERFACE_0100000_RETNO_TYPE = "String";
	// 应答信息
	public final static String DBYB_INTERFACE_0100000_NAME_RETMESG = "应答信息";
	public final static String DBYB_INTERFACE_0100000_STR_RETMESG = "retmesg";
	public final static String DBYB_INTERFACE_0100000_RETMESG_LENGTH = "57";
	public final static String DBYB_INTERFACE_0100000_RETMESG_ISNULL = "N";
	public final static String DBYB_INTERFACE_0100000_RETMESG_TYPE = "String";
	// 鉴定码
	public final static String DBYB_INTERFACE_0100000_NAME_MAC = "鉴定码";
	public final static String DBYB_INTERFACE_0100000_STR_MAC = "mac";
	public final static String DBYB_INTERFACE_0100000_MAC_LENGTH = "8";
	public final static String DBYB_INTERFACE_0100000_MAC_ISNULL = "N";
	public final static String DBYB_INTERFACE_0100000_MAC_TYPE = "String";
	// 当前页数
	public final static String DBYB_INTERFACE_0100000_NAME_CURRPAGE = "当前页数";
	public final static String DBYB_INTERFACE_0100000_STR_CURRPAGE = "currpage";
	public final static String DBYB_INTERFACE_0100000_CURRPAGE_LENGTH = "3";
	public final static String DBYB_INTERFACE_0100000_CURRPAGE_ISNULL = "N";
	public final static String DBYB_INTERFACE_0100000_CURRPAGE_TYPE = "Number";
	// 总页数
	public final static String DBYB_INTERFACE_0100000_NAME_ALLPAGE = "总页数";
	public final static String DBYB_INTERFACE_0100000_STR_ALLPAGE = "allpage";
	public final static String DBYB_INTERFACE_0100000_ALLPAGE_LENGTH = "3";
	public final static String DBYB_INTERFACE_0100000_ALLPAGE_ISNULL = "N";
	public final static String DBYB_INTERFACE_0100000_ALLPAGE_TYPE = "Number";
	// 每页记录数
	public final static String DBYB_INTERFACE_0100000_NAME_RECNUM = "每页记录数";
	public final static String DBYB_INTERFACE_0100000_STR_RECNUM = "recnum";
	public final static String DBYB_INTERFACE_0100000_RECNUM_LENGTH = "3";
	public final static String DBYB_INTERFACE_0100000_RECNUM_ISNULL = "N";
	public final static String DBYB_INTERFACE_0100000_RECNUM_TYPE = "Number";
	// 单位名称
	public final static String DBYB_INTERFACE_0100000_NAME_NAME = "单位名称";
	public final static String DBYB_INTERFACE_0100000_STR_NAME = "name";
	public final static String DBYB_INTERFACE_0100000_NAME_LENGTH = "60";
	public final static String DBYB_INTERFACE_0100000_NAME_ISNULL = "Y";
	public final static String DBYB_INTERFACE_0100000_NAME_TYPE = "String";
	// 单位地址
	public final static String DBYB_INTERFACE_0100000_NAME_ADDRESS = "单位地址";
	public final static String DBYB_INTERFACE_0100000_STR_ADDRESS = "address";
	public final static String DBYB_INTERFACE_0100000_ADDRESS_LENGTH = "60";
	public final static String DBYB_INTERFACE_0100000_ADDRESS_ISNULL = "N";
	public final static String DBYB_INTERFACE_0100000_ADDRESS_TYPE = "String";
	// 电话号码
	public final static String DBYB_INTERFACE_0100000_NAME_PHONE = "电话号码";
	public final static String DBYB_INTERFACE_0100000_STR_PHONE = "phone";
	public final static String DBYB_INTERFACE_0100000_PHONE_LENGTH = "14";
	public final static String DBYB_INTERFACE_0100000_PHONE_ISNULL = "N";
	public final static String DBYB_INTERFACE_0100000_PHONE_TYPE = "String";
	// 划账行代码
	public final static String DBYB_INTERFACE_0100000_NAME_BANK_CODE = "划账行代码";
	public final static String DBYB_INTERFACE_0100000_STR_BANK_CODE = "bank_code";
	public final static String DBYB_INTERFACE_0100000_BANK_CODE_LENGTH = "12";
	public final static String DBYB_INTERFACE_0100000_BANK_CODE_ISNULL = "N";
	public final static String DBYB_INTERFACE_0100000_BANK_CODE_TYPE = "String";
	// 开户账号
	public final static String DBYB_INTERFACE_0100000_NAME_ACCNT_NMBR = "开户账号";
	public final static String DBYB_INTERFACE_0100000_STR_ACCNT_NMBR = "accnt_nmbr";
	public final static String DBYB_INTERFACE_0100000_ACCNT_NMBR_LENGTH = "30";
	public final static String DBYB_INTERFACE_0100000_ACCNT_NMBR_ISNULL = "N";
	public final static String DBYB_INTERFACE_0100000_ACCNT_NMBR_TYPE = "String";
	// 收费地址
	public final static String DBYB_INTERFACE_0100000_NAME_COMP_ADDR = "收费地址";
	public final static String DBYB_INTERFACE_0100000_STR_COMP_ADDR = "comp_addr";
	public final static String DBYB_INTERFACE_0100000_COMP_ADDR_LENGTH = "60";
	public final static String DBYB_INTERFACE_0100000_COMP_ADDR_ISNULL = "N";
	public final static String DBYB_INTERFACE_0100000_COMP_ADDR_TYPE = "String";
	// 邮政编码
	public final static String DBYB_INTERFACE_0100000_NAME_ZIPCODE = "邮政编码";
	public final static String DBYB_INTERFACE_0100000_STR_ZIPCODE = "zipcode";
	public final static String DBYB_INTERFACE_0100000_ZIPCODE_LENGTH = "6";
	public final static String DBYB_INTERFACE_0100000_ZIPCODE_ISNULL = "N";
	public final static String DBYB_INTERFACE_0100000_ZIPCODE_TYPE = "String";
	// 单位类型
	public final static String DBYB_INTERFACE_0100000_NAME_COMP_TYPE = "单位类型";
	public final static String DBYB_INTERFACE_0100000_STR_COMP_TYPE = "comp_type";
	public final static String DBYB_INTERFACE_0100000_COMP_TYPE_LENGTH = "2";
	public final static String DBYB_INTERFACE_0100000_COMP_TYPE_ISNULL = "N";
	public final static String DBYB_INTERFACE_0100000_COMP_TYPE_TYPE = "String";
	// 经营范围
	public final static String DBYB_INTERFACE_0100000_NAME_RANGE = "经营范围";
	public final static String DBYB_INTERFACE_0100000_STR_RANGE = "range";
	public final static String DBYB_INTERFACE_0100000_RANGE_LENGTH = "100";
	public final static String DBYB_INTERFACE_0100000_RANGE_ISNULL = "Y";
	public final static String DBYB_INTERFACE_0100000_RANGE_TYPE = "String";
	// 税务登记证号
	public final static String DBYB_INTERFACE_0100000_NAME_TAXREGID = "税务登记证号";
	public final static String DBYB_INTERFACE_0100000_STR_TAXREGID = "taxregid";
	public final static String DBYB_INTERFACE_0100000_TAXREGID_LENGTH = "20";
	public final static String DBYB_INTERFACE_0100000_TAXREGID_ISNULL = "N";
	public final static String DBYB_INTERFACE_0100000_TAXREGID_TYPE = "String";
	// 经办人证件类型
	public final static String DBYB_INTERFACE_0100000_NAME_CREDENTIALTYPE = "经办人证件类型";
	public final static String DBYB_INTERFACE_0100000_STR_CREDENTIALTYPE = "credentialtype";
	public final static String DBYB_INTERFACE_0100000_CREDENTIALTYPE_LENGTH = "2";
	public final static String DBYB_INTERFACE_0100000_CREDENTIALTYPE_ISNULL = "N";
	public final static String DBYB_INTERFACE_0100000_CREDENTIALTYPE_TYPE = "String";
	// 经办人证件号码
	public final static String DBYB_INTERFACE_0100000_NAME_CREDENTIALID = "经办人证件号码";
	public final static String DBYB_INTERFACE_0100000_STR_CREDENTIALID = "credentialid";
	public final static String DBYB_INTERFACE_0100000_CREDENTIALID_LENGTH = "50";
	public final static String DBYB_INTERFACE_0100000_CREDENTIALID_ISNULL = "N";
	public final static String DBYB_INTERFACE_0100000_CREDENTIALID_TYPE = "String";
	// 所属分公司
	public final static String DBYB_INTERFACE_0100000_NAME_REGION_CODE = "所属分公司";
	public final static String DBYB_INTERFACE_0100000_STR_REGION_CODE = "region_code";
	public final static String DBYB_INTERFACE_0100000_REGION_CODE_LENGTH = "14";
	public final static String DBYB_INTERFACE_0100000_REGION_CODE_ISNULL = "N";
	public final static String DBYB_INTERFACE_0100000_REGION_CODE_TYPE = "String";
	// 所属中支
	public final static String DBYB_INTERFACE_0100000_NAME_BRANCH_CODE = "所属中支";
	public final static String DBYB_INTERFACE_0100000_STR_BRANCH_CODE = "branch_code";
	public final static String DBYB_INTERFACE_0100000_BRANCH_CODE_LENGTH = "14";
	public final static String DBYB_INTERFACE_0100000_BRANCH_CODE_ISNULL = "N";
	public final static String DBYB_INTERFACE_0100000_BRANCH_CODE_TYPE = "String";
	// 组织机构代码
	public final static String DBYB_INTERFACE_0100000_NAME_CORP_TAX_ID = "组织机构代码";
	public final static String DBYB_INTERFACE_0100000_STR_CORP_TAX_ID = "corp_tax_id";
	public final static String DBYB_INTERFACE_0100000_CORP_TAX_ID_LENGTH = "20";
	public final static String DBYB_INTERFACE_0100000_CORP_TAX_ID_ISNULL = "N";
	public final static String DBYB_INTERFACE_0100000_CORP_TAX_ID_TYPE = "String";

	// 纳税人类型
	public final static String DBYB_INTERFACE_0100000_NAME_TAXPTYPE = "纳税人类型";
	public final static String DBYB_INTERFACE_0100000_STR_TAXPTYPE = "taxptype";
	public final static String DBYB_INTERFACE_0100000_TAXPTYPE_LENGTH = "2";
	public final static String DBYB_INTERFACE_0100000_TAXPTYPE_ISNULL = "N";
	public final static String DBYB_INTERFACE_0100000_TAXPTYPE_TYPE = "String";

	// 税务登记地址
	public final static String DBYB_INTERFACE_0100000_NAME_TAXREG_ADDR = "税务登记地址";
	public final static String DBYB_INTERFACE_0100000_STR_TAXREG_ADDR = "taxreg_addr";
	public final static String DBYB_INTERFACE_0100000_TAXREG_ADDR_LENGTH = "120";
	public final static String DBYB_INTERFACE_0100000_TAXREG_ADDR_ISNULL = "N";
	public final static String DBYB_INTERFACE_0100000_TAXREG_ADDR_TYPE = "String";

	// 社会信用代码
	public final static String DBYB_INTERFACE_0100000_NAME_SOCCREDIT = "社会信用代码";
	public final static String DBYB_INTERFACE_0100000_STR_SOCCREDIT = "soccredit";
	public final static String DBYB_INTERFACE_0100000_SOCCREDIT_LENGTH = "18";
	public final static String DBYB_INTERFACE_0100000_SOCCREDIT_ISNULL = "N";
	public final static String DBYB_INTERFACE_0100000_SOCCREDIT_TYPE = "String";

	// 团体代码
	public final static String DBYB_INTERFACE_0100000_NAME_GRP_CODE = "团体代码";
	public final static String DBYB_INTERFACE_0100000_STR_GRP_CODE = "grp_code";
	public final static String DBYB_INTERFACE_0100000_GRP_CODE_LENGTH = "12";
	public final static String DBYB_INTERFACE_0100000_GRP_CODE_ISNULL = "Y";
	public final static String DBYB_INTERFACE_0100000_GRP_CODE_TYPE = "String";

	/*
	 * 投保单位的团体客户号部分常量定义 END
	 */

	/*
	 * 发起调查部分常量定义 BEGIN
	 */
	// 交易码
	public final static String DBYB_INTERFACE_350000_NAME_TRANSNO = "交易码";
	public final static String DBYB_INTERFACE_350000_STR_TRANSNO = "transno";
	public final static String DBYB_INTERFACE_350000_TRANSNO_LENGTH = "7";
	public final static String DBYB_INTERFACE_350000_TRANSNO_ISNULL = "Y";
	public final static String DBYB_INTERFACE_350000_TRANSNO_TYPE = "String";
	// 交易来源
	public final static String DBYB_INTERFACE_350000_NAME_TRANSSOURCE = "交易来源";
	public final static String DBYB_INTERFACE_350000_STR_TRANSSOURCE = "transsource";
	public final static String DBYB_INTERFACE_350000_TRANSSOURCE_LENGTH = "2";
	public final static String DBYB_INTERFACE_350000_TRANSSOURCE_ISNULL = "Y";
	public final static String DBYB_INTERFACE_350000_TRANSSOURCE_TYPE = "String";
	// 交易日期
	public final static String DBYB_INTERFACE_350000_NAME_DATE = "交易日期";
	public final static String DBYB_INTERFACE_350000_STR_DATE = "date";
	public final static String DBYB_INTERFACE_350000_DATE_LENGTH = "10";
	public final static String DBYB_INTERFACE_350000_DATE_ISNULL = "Y";
	public final static String DBYB_INTERFACE_350000_DATE_TYPE = "Date";
	// 交易时间
	public final static String DBYB_INTERFACE_350000_NAME_TIME = "交易时间";
	public final static String DBYB_INTERFACE_350000_STR_TIME = "time";
	public final static String DBYB_INTERFACE_350000_TIME_LENGTH = "8";
	public final static String DBYB_INTERFACE_350000_TIME_ISNULL = "Y";
	public final static String DBYB_INTERFACE_350000_TIME_TYPE = "Time";
	// 应答码
	public final static String DBYB_INTERFACE_350000_NAME_RETNO = "应答码";
	public final static String DBYB_INTERFACE_350000_STR_RETNO = "retno";
	public final static String DBYB_INTERFACE_350000_RETNO_LENGTH = "7";
	public final static String DBYB_INTERFACE_350000_RETNO_ISNULL = "Y";
	public final static String DBYB_INTERFACE_350000_RETNO_TYPE = "String";
	// 应答信息
	public final static String DBYB_INTERFACE_350000_NAME_RETMESG = "应答信息";
	public final static String DBYB_INTERFACE_350000_STR_RETMESG = "retmesg";
	public final static String DBYB_INTERFACE_350000_RETMESG_LENGTH = "57";
	public final static String DBYB_INTERFACE_350000_RETMESG_ISNULL = "N";
	public final static String DBYB_INTERFACE_350000_RETMESG_TYPE = "String";
	// 鉴定码
	public final static String DBYB_INTERFACE_350000_NAME_MAC = "鉴定码";
	public final static String DBYB_INTERFACE_350000_STR_MAC = "mac";
	public final static String DBYB_INTERFACE_350000_MAC_LENGTH = "8";
	public final static String DBYB_INTERFACE_350000_MAC_ISNULL = "N";
	public final static String DBYB_INTERFACE_350000_MAC_TYPE = "String";
	// 当前页数
	public final static String DBYB_INTERFACE_350000_NAME_CURRPAGE = "当前页数";
	public final static String DBYB_INTERFACE_350000_STR_CURRPAGE = "currpage";
	public final static String DBYB_INTERFACE_350000_CURRPAGE_LENGTH = "3";
	public final static String DBYB_INTERFACE_350000_CURRPAGE_ISNULL = "N";
	public final static String DBYB_INTERFACE_350000_CURRPAGE_TYPE = "Number";
	// 总页数
	public final static String DBYB_INTERFACE_350000_NAME_ALLPAGE = "总页数";
	public final static String DBYB_INTERFACE_350000_STR_ALLPAGE = "allpage";
	public final static String DBYB_INTERFACE_350000_ALLPAGE_LENGTH = "3";
	public final static String DBYB_INTERFACE_350000_ALLPAGE_ISNULL = "N";
	public final static String DBYB_INTERFACE_350000_ALLPAGE_TYPE = "Number";
	// 每页记录数
	public final static String DBYB_INTERFACE_350000_NAME_RECNUM = "每页记录数";
	public final static String DBYB_INTERFACE_350000_STR_RECNUM = "recnum";
	public final static String DBYB_INTERFACE_350000_RECNUM_LENGTH = "3";
	public final static String DBYB_INTERFACE_350000_RECNUM_ISNULL = "N";
	public final static String DBYB_INTERFACE_350000_RECNUM_TYPE = "Number";
	// 机构代码
	public final static String DBYB_INTERFACE_350000_NAME_BMDM = "机构代码";
	public final static String DBYB_INTERFACE_350000_STR_BMDM = "bmdm";
	public final static String DBYB_INTERFACE_350000_BMDM_LENGTH = "14";
	public final static String DBYB_INTERFACE_350000_BMDM_ISNULL = "Y";
	public final static String DBYB_INTERFACE_350000_BMDM_TYPE = "String";
	// 任务申请人工号
	public final static String DBYB_INTERFACE_350000_NAME_SUBOPER = "任务申请人工号";
	public final static String DBYB_INTERFACE_350000_STR_SUBOPER = "suboper";
	public final static String DBYB_INTERFACE_350000_SUBOPER_LENGTH = "8";
	public final static String DBYB_INTERFACE_350000_SUBOPER_ISNULL = "Y";
	public final static String DBYB_INTERFACE_350000_SUBOPER_TYPE = "String";
	// 任务类型
	public final static String DBYB_INTERFACE_350000_STR_NAME_TYPE = "任务类型";
	public final static String DBYB_INTERFACE_350000_STR_TYPE = "type";
	public final static String DBYB_INTERFACE_350000_TYPE_LENGTH = "1";
	public final static String DBYB_INTERFACE_350000_TYPE_ISNULL = "Y";
	public final static String DBYB_INTERFACE_350000_TYPE_TYPE = "String";
	// 任务子类型
	public final static String DBYB_INTERFACE_350000_NAME_SUBTYPE = "任务子类型";
	public final static String DBYB_INTERFACE_350000_STR_SUBTYPE = "subtype";
	public final static String DBYB_INTERFACE_350000_SUBTYPE_LENGTH = "2";
	public final static String DBYB_INTERFACE_350000_SUBTYPE_ISNULL = "Y";
	public final static String DBYB_INTERFACE_350000_SUBTYPE_TYPE = "String";
	// 调查方式
	public final static String DBYB_INTERFACE_350000_NAME_SUBWAY = "调查方式";
	public final static String DBYB_INTERFACE_350000_STR_SUBWAY = "subway";
	public final static String DBYB_INTERFACE_350000_SUBWAY_LENGTH = "2";
	public final static String DBYB_INTERFACE_350000_SUBWAY_ISNULL = "Y";
	public final static String DBYB_INTERFACE_350000_SUBWAY_TYPE = "String";
	// 任务性质
	public final static String DBYB_INTERFACE_350000_NAME_KIND = "任务性质";
	public final static String DBYB_INTERFACE_350000_STR_KIND = "kind";
	public final static String DBYB_INTERFACE_350000_KIND_LENGTH = "1";
	public final static String DBYB_INTERFACE_350000_KIND_ISNULL = "Y";
	public final static String DBYB_INTERFACE_350000_KIND_TYPE = "String";
	// 调查目的、内容描述
	public final static String DBYB_INTERFACE_350000_NAME_INVDEST = "调查目的、内容描述";
	public final static String DBYB_INTERFACE_350000_STR_INVDEST = "invdest";
	public final static String DBYB_INTERFACE_350000_INVDEST_LENGTH = "600";
	public final static String DBYB_INTERFACE_350000_INVDEST_ISNULL = "Y";
	public final static String DBYB_INTERFACE_350000_INVDEST_TYPE = "String";
	// 报案号
	public final static String DBYB_INTERFACE_350000_NAME_CAPPNO = "报案号";
	public final static String DBYB_INTERFACE_350000_STR_CAPPNO = "cappno";
	public final static String DBYB_INTERFACE_350000_CAPPNO_LENGTH = "15";
	public final static String DBYB_INTERFACE_350000_CAPPNO_ISNULL = "Y";
	public final static String DBYB_INTERFACE_350000_CAPPNO_TYPE = "String";
	// 赔案号
	public final static String DBYB_INTERFACE_350000_NAME_CLAIMNO = "赔案号";
	public final static String DBYB_INTERFACE_350000_STR_CLAIMNO = "claimno";
	public final static String DBYB_INTERFACE_350000_CLAIMNO_LENGTH = "15";
	public final static String DBYB_INTERFACE_350000_CLAIMNO_ISNULL = "N";
	public final static String DBYB_INTERFACE_350000_CLAIMNO_TYPE = "String";
	// 被保险人身份证号
	public final static String DBYB_INTERFACE_350000_NAME_PID = "被保险人身份证号";
	public final static String DBYB_INTERFACE_350000_STR_PID = "pid";
	public final static String DBYB_INTERFACE_350000_PID_LENGTH = "23";
	public final static String DBYB_INTERFACE_350000_PID_ISNULL = "N";
	public final static String DBYB_INTERFACE_350000_PID_TYPE = "String";
	// 被保险人姓名
	public final static String DBYB_INTERFACE_350000_NAME_NAME = "被保险人姓名";
	public final static String DBYB_INTERFACE_350000_STR_NAME = "name";
	public final static String DBYB_INTERFACE_350000_NAME_LENGTH = "60";
	public final static String DBYB_INTERFACE_350000_NAME_ISNULL = "N";
	public final static String DBYB_INTERFACE_350000_NAME_TYPE = "String";
	// 调查对象身份证号
	public final static String DBYB_INTERFACE_350000_NAME_INVPID = "调查对象身份证号";
	public final static String DBYB_INTERFACE_350000_STR_INVPID = "invpid";
	public final static String DBYB_INTERFACE_350000_INVPID_LENGTH = "23";
	public final static String DBYB_INTERFACE_350000_INVPID_ISNULL = "N";
	public final static String DBYB_INTERFACE_350000_INVPID_TYPE = "String";
	// 调查对象姓名
	public final static String DBYB_INTERFACE_350000_NAME_INVNAME = "调查对象姓名";
	public final static String DBYB_INTERFACE_350000_STR_INVNAME = "invname";
	public final static String DBYB_INTERFACE_350000_INVNAME_LENGTH = "60";
	public final static String DBYB_INTERFACE_350000_INVNAME_ISNULL = "N";
	public final static String DBYB_INTERFACE_350000_INVNAME_TYPE = "String";
	// 调查对象当前联系地址
	public final static String DBYB_INTERFACE_350000_NAME_INVADDRESS = "调查对象当前联系地址";
	public final static String DBYB_INTERFACE_350000_STR_INVADDRESS = "invaddress";
	public final static String DBYB_INTERFACE_350000_INVADDRESS_LENGTH = "200";
	public final static String DBYB_INTERFACE_350000_INVADDRESS_ISNULL = "N";
	public final static String DBYB_INTERFACE_350000_INVADDRESS_TYPE = "String";
	// 调查对象当前联系电话
	public final static String DBYB_INTERFACE_350000_NAME_INVPHONE = "调查对象当前联系电话";
	public final static String DBYB_INTERFACE_350000_STR_INVPHONE = "invphone";
	public final static String DBYB_INTERFACE_350000_INVPHONE_LENGTH = "20";
	public final static String DBYB_INTERFACE_350000_INVPHONE_ISNULL = "N";
	public final static String DBYB_INTERFACE_350000_INVPHONE_TYPE = "String";
	// 调查对象类型
	public final static String DBYB_INTERFACE_350000_NAME_INVOBJTYPE = "调查对象类型";
	public final static String DBYB_INTERFACE_350000_STR_INVOBJTYPE = "invobjtype";
	public final static String DBYB_INTERFACE_350000_INVOBJTYPE_LENGTH = "1";
	public final static String DBYB_INTERFACE_350000_INVOBJTYPE_ISNULL = "N";
	public final static String DBYB_INTERFACE_350000_INVOBJTYPE_TYPE = "String";
	// 保单号
	public final static String DBYB_INTERFACE_350000_NAME_POLICYNO = "保单号";
	public final static String DBYB_INTERFACE_350000_STR_POLICYNO = "policyno";
	public final static String DBYB_INTERFACE_350000_POLICYNO_LENGTH = "15";
	public final static String DBYB_INTERFACE_350000_POLICYNO_ISNULL = "N";
	public final static String DBYB_INTERFACE_350000_POLICYNO_TYPE = "String";
	// 长险和短险
	public final static String DBYB_INTERFACE_350000_NAME_TIMESTR = "长险和短险";
	public final static String DBYB_INTERFACE_350000_STR_TIMESTR = "timestr";
	public final static String DBYB_INTERFACE_350000_TIMESTR_LENGTH = "1";
	public final static String DBYB_INTERFACE_350000_TIMESTR_ISNULL = "N";
	public final static String DBYB_INTERFACE_350000_TIMESTR_TYPE = "String";
	// 分公司代码（保单）
	public final static String DBYB_INTERFACE_350000_NAME_BRANCHCODE = "分公司代码（保单）";
	public final static String DBYB_INTERFACE_350000_STR_BRANCHCODE = "branchcode";
	public final static String DBYB_INTERFACE_350000_BRANCHCODE_LENGTH = "14";
	public final static String DBYB_INTERFACE_350000_BRANCHCODE_ISNULL = "Y";
	public final static String DBYB_INTERFACE_350000_BRANCHCODE_TYPE = "String";
	// 调查风险指标描述
	public final static String DBYB_INTERFACE_350000_NAME_INVRISK = "调查风险指标描述";
	public final static String DBYB_INTERFACE_350000_STR_INVRISK = "invrisk";
	public final static String DBYB_INTERFACE_350000_INVRISK_LENGTH = "1000";
	public final static String DBYB_INTERFACE_350000_INVRISK_ISNULL = "N";
	public final static String DBYB_INTERFACE_350000_INVRISK_TYPE = "String";
	// 调查类型
	public final static String DBYB_INTERFACE_350000_NAME_INVTYPE = "调查类型";
	public final static String DBYB_INTERFACE_350000_STR_INVTYPE = "invtype";
	public final static String DBYB_INTERFACE_350000_INVTYPE_LENGTH = "1";
	public final static String DBYB_INTERFACE_350000_INVTYPE_ISNULL = "N";
	public final static String DBYB_INTERFACE_350000_INVTYPE_TYPE = "String";
	// 调查次数
	public final static String DBYB_INTERFACE_350000_NAME_INVCOUNT = "调查次数";
	public final static String DBYB_INTERFACE_350000_STR_INVCOUNT = "invcount";
	public final static String DBYB_INTERFACE_350000_INVCOUNT_LENGTH = "1";
	public final static String DBYB_INTERFACE_350000_INVCOUNT_ISNULL = "Y";
	public final static String DBYB_INTERFACE_350000_INVCOUNT_TYPE = "Number";
	/*
	 * 发起调查部分常量定义 END
	 */

	/*
	 * 综意险入单部分常量定义 开始
	 */

	/*
	 * 字段定义
	 */
	// 1分公司号（已有枚举）AN14 T_POLICY_INFO/FILIALE_CODE
	public final static String DBYB_INTERFACE_230000_STR_BRANCHID = "BRANCHID";
	public final static String DBYB_INTERFACE_230000_BRANCHID_LENGTH = "14";
	public final static String DBYB_INTERFACE_230000_BRANCHID_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_BRANCHID_TYPE = "String";
	// 2上一年度团体保单号 AN15 T_POLICY_INFO/LAST_POLICY_NUMBER
	public final static String DBYB_INTERFACE_230000_STR_MGPOlICYNO = "MGPOlICYNO";
	public final static String DBYB_INTERFACE_230000_MGPOlICYNO_LENGTH = "15";
	public final static String DBYB_INTERFACE_230000_MGPOlICYNO_ISNULL = "Y";
	public final static String DBYB_INTERFACE_230000_MGPOlICYNO_TYPE = "String";
	// 3投保单号 AN15 T_POLICY_INFO/INSURANCE_NUMBER
	public final static String DBYB_INTERFACE_230000_STR_GAPPNO = "GAPPNO";
	public final static String DBYB_INTERFACE_230000_GAPPNO_LENGTH = "15";
	public final static String DBYB_INTERFACE_230000_GAPPNO_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_GAPPNO_TYPE = "String";
	// 4保单号 AN15 T_POLICY_INFO/POLICY_NUMBER
	public final static String DBYB_INTERFACE_230000_STR_GPOLICYNO = "GPOLICYNO";
	public final static String DBYB_INTERFACE_230000_GPOLICYNO_LENGTH = "15";
	public final static String DBYB_INTERFACE_230000_GPOLICYNO_ISNULL = "Y";
	public final static String DBYB_INTERFACE_230000_GPOLICYNO_TYPE = "String";
	// 5投保日期 AN10 T_POLICY_INFO/HOLD_DATE
	public final static String DBYB_INTERFACE_230000_STR_APPDATE = "APPDATE";
	public final static String DBYB_INTERFACE_230000_APPDATE_LENGTH = "10";
	public final static String DBYB_INTERFACE_230000_APPDATE_ISNULL = "Y";
	public final static String DBYB_INTERFACE_230000_APPDATE_TYPE = "DATE";
	// 6投保类型（已有枚举） AN1 T_POLICY_INFO/POLICY_TYPE
	// 0 新保 1 续保 2 内部转保 3 单独附加险 4 单独附加险续 7 共保 8 外部转保
	public final static String DBYB_INTERFACE_230000_STR_APPFLAG = "APPFLAG";
	public final static String DBYB_INTERFACE_230000_APPFLAG_LENGTH = "1";
	public final static String DBYB_INTERFACE_230000_APPFLAG_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_APPFLAG_TYPE = "String";
	// 7是否协议主单 AN1 无录入为空
	public final static String DBYB_INTERFACE_230000_STR_AGREEMENT = "AGREEMENT";
	public final static String DBYB_INTERFACE_230000_AGREEMENT_LENGTH = "1";
	public final static String DBYB_INTERFACE_230000_AGREEMENT_ISNULL = "Y";
	public final static String DBYB_INTERFACE_230000_AGREEMENT_TYPE = "String";
	// 8是否打印主单 AN1 无录入为空
	public final static String DBYB_INTERFACE_230000_STR_PRINTGFLAG = "PRINTGFLAG";
	public final static String DBYB_INTERFACE_230000_PRINTGFLAG_LENGTH = "1";
	public final static String DBYB_INTERFACE_230000_PRINTGFLAG_ISNULL = "Y";
	public final static String DBYB_INTERFACE_230000_PRINTGFLAG_TYPE = "String";
	// 9是否打印凭证 AN1 无录入为空
	public final static String DBYB_INTERFACE_230000_STR_PRINTFLAG = "PRINTFLAG";
	public final static String DBYB_INTERFACE_230000_PRINTFLAG_LENGTH = "1";
	public final static String DBYB_INTERFACE_230000_PRINTFLAG_ISNULL = "Y";
	public final static String DBYB_INTERFACE_230000_PRINTFLAG_TYPE = "String";
	// 10业务员工号 AN8 模型待更改
	public final static String DBYB_INTERFACE_230000_STR_EMPNO = "EMPNO";
	public final static String DBYB_INTERFACE_230000_EMPNO_LENGTH = "8";
	public final static String DBYB_INTERFACE_230000_EMPNO_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_EMPNO_TYPE = "String";
	// 11投保单位 AN12 T_POLICY_INFO/ORGANIZATION_CODE
	public final static String DBYB_INTERFACE_230000_STR_GRPCODE = "GRPCODE";
	public final static String DBYB_INTERFACE_230000_GRPCODE_LENGTH = "12";
	public final static String DBYB_INTERFACE_230000_GRPCODE_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_GRPCODE_TYPE = "String";
	// 12总保费 AN13 T_POLICY_INFO/TOTAL_COST
	public final static String DBYB_INTERFACE_230000_STR_TOTALAMT = "TOTALAMT";
	public final static String DBYB_INTERFACE_230000_TOTALAMT_LENGTH = "13";
	public final static String DBYB_INTERFACE_230000_TOTALAMT_ISNULL = "Y";
	public final static String DBYB_INTERFACE_230000_TOTALAMT_MIN = "0";
	public final static String DBYB_INTERFACE_230000_TOTALAMT_TYPE = "BigDecimal";
	// 13总人数 AN12 T_POLICY_INFO/INSURANCE_TOTAL
	public final static String DBYB_INTERFACE_230000_STR_TOTALNUM = "TOTALNUM";
	public final static String DBYB_INTERFACE_230000_TOTALNUM_LENGTH = "12";
	public final static String DBYB_INTERFACE_230000_TOTALNUM_ISNULL = "Y";
	public final static String DBYB_INTERFACE_230000_TOTALNUM_MIN = "0";
	public final static String DBYB_INTERFACE_230000_TOTALNUM_TYPE = "long";
	// 14系统标识 AN2 恒定为：00 大病医保系统
	public final static String DBYB_INTERFACE_230000_STR_FROMSYS = "FROMSYS";
	public final static String DBYB_INTERFACE_230000_FROMSYS_LENGTH = "2";
	public final static String DBYB_INTERFACE_230000_FROMSYS_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_FROMSYS_TYPE = "String";
	// 37是否分保（已有枚举） AN1 T_POLICY_INFO/ISSHARE
	public final static String DBYB_INTERFACE_230000_STR_sIsReinsure = "sIsReinsure";
	public final static String DBYB_INTERFACE_230000_sIsReinsure_LENGTH = "1";
	public final static String DBYB_INTERFACE_230000_sIsReinsure_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_sIsReinsure_TYPE = "String";
	// 38缴费方式 （已有枚举） AN2 T_POLICY_INFO/FEE_TYPE
	// 01趸交 02不定期 10月交 11季交 12半年交 13年交
	public final static String DBYB_INTERFACE_230000_STR_sPayCode = "sPayCode";
	public final static String DBYB_INTERFACE_230000_sPayCode_LENGTH = "4";
	public final static String DBYB_INTERFACE_230000_sPayCode_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_sPayCode_TYPE = "String";
	// 39缴费年限 AN2 T_POLICY_INFO/SERVE_STAGE
	public final static String DBYB_INTERFACE_230000_STR_sYearNum = "sYearNum";
	public final static String DBYB_INTERFACE_230000_sYearNum_LENGTH = "2";
	public final static String DBYB_INTERFACE_230000_sYearNum_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_sYearNum_MIN = "0";
	public final static String DBYB_INTERFACE_230000_sYearNum_TYPE = "long";
	// 40缴费率,实收费与应收费之比 AN12 收费率 T_POLICY_COST_INFO/REALITY_COST/SHOULD_COST
	public final static String DBYB_INTERFACE_230000_STR_sPayRate = "sPayRate";
	public final static String DBYB_INTERFACE_230000_sPayRate_LENGTH = "12";
	public final static String DBYB_INTERFACE_230000_sPayRate_ISNULL = "Y";
	public final static String DBYB_INTERFACE_230000_sPayRate_MIN = "0";
	// public final static String DBYB_INTERFACE_230000_sPayRate_MAX = "100";
	public final static String DBYB_INTERFACE_230000_sPayRate_TYPE = "BigDecimal";
	// 41付款方式（已有枚举） AN1 T_POLICY_INFO/PAYMENT_TYPE
	// 1现金 2支票 3转账 7POS 9保费赠送
	public final static String DBYB_INTERFACE_230000_STR_sSetCode = "sSetCode";
	public final static String DBYB_INTERFACE_230000_sSetCode_LENGTH = "4";
	public final static String DBYB_INTERFACE_230000_sSetCode_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_sSetCode_TYPE = "String";
	// 42业务员代码 AN8 涉及修改模型
	public final static String DBYB_INTERFACE_230000_STR_sMempno = "sMempno";
	public final static String DBYB_INTERFACE_230000_sMempno_LENGTH = "8";
	public final static String DBYB_INTERFACE_230000_sMempno_ISNULL = "Y";
	public final static String DBYB_INTERFACE_230000_sMempno_TYPE = "String";
	// 43业务员姓名 AN60 涉及修改模型
	public final static String DBYB_INTERFACE_230000_STR_sMname = "sMname";
	public final static String DBYB_INTERFACE_230000_sMname_LENGTH = "60";
	public final static String DBYB_INTERFACE_230000_sMname_ISNULL = "Y";
	public final static String DBYB_INTERFACE_230000_sMname_TYPE = "String";
	// 44业务员联系电话 AN15 涉及修改模型
	public final static String DBYB_INTERFACE_230000_STR_sMtel = "sMtel";
	public final static String DBYB_INTERFACE_230000_sMtel_LENGTH = "15";
	public final static String DBYB_INTERFACE_230000_sMtel_ISNULL = "Y";
	public final static String DBYB_INTERFACE_230000_sMtel_TYPE = "String";
	// 45外销人员资格证号 AN20 仅仅北京地区的保单需要，本系统暂时不支持北京地区。暂时为空
	public final static String DBYB_INTERFACE_230000_STR_sRegistno = "sRegistno";
	public final static String DBYB_INTERFACE_230000_sRegistno_LENGTH = "20";
	public final static String DBYB_INTERFACE_230000_sRegistno_ISNULL = "Y";
	public final static String DBYB_INTERFACE_230000_sRegistno_TYPE = "String";
	// 46红利领取方式 AN2 本系统无红利领取方式一律为空
	public final static String DBYB_INTERFACE_230000_STR_sShareType = "sShareType";
	public final static String DBYB_INTERFACE_230000_sShareType_LENGTH = "2";
	public final static String DBYB_INTERFACE_230000_sShareType_ISNULL = "Y";
	public final static String DBYB_INTERFACE_230000_sShareType_TYPE = "String";
	// 47合同争议处理方式 （已有枚举） AN1
	// 1仲裁 2诉讼
	public final static String DBYB_INTERFACE_230000_STR_sSolveType = "sSolveType";
	public final static String DBYB_INTERFACE_230000_sSolveType_LENGTH = "4";
	public final static String DBYB_INTERFACE_230000_sSolveType_ISNULL = "Y";
	public final static String DBYB_INTERFACE_230000_sSolveType_TYPE = "String";
	// 48销售属性 （已有枚举） AN2 T_POLICY_INFO/SALE_RESOUCE
	public final static String DBYB_INTERFACE_230000_STR_sXzSale = "sXzSale";
	public final static String DBYB_INTERFACE_230000_sXzSale_LENGTH = "4";
	public final static String DBYB_INTERFACE_230000_sXzSale_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_sXzSale_TYPE = "String";
	// 49备注 AN60
	public final static String DBYB_INTERFACE_230000_STR_sAppSay = "sAppSay";
	public final static String DBYB_INTERFACE_230000_sAppSay_LENGTH = "60";
	public final static String DBYB_INTERFACE_230000_sAppSay_ISNULL = "Y";
	public final static String DBYB_INTERFACE_230000_sAppSay_TYPE = "String";
	// 49中支公司 AN14
	public final static String DBYB_INTERFACE_230000_STR_compid = "compid";
	public final static String DBYB_INTERFACE_230000_compid_LENGTH = "14";
	public final static String DBYB_INTERFACE_230000_compid_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_compid_TYPE = "String";
	// 协议号
	public final static String DBYB_INTERFACE_230000_STR_protocolNo = "protocolNo";
	public final static String DBYB_INTERFACE_230000_protocolNo_LENGTH = "40";
	public final static String DBYB_INTERFACE_230000_protocolNo_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_protocolNo_TYPE = "String";
	// 审核时间
	public final static String DBYB_INTERFACE_230000_STR_VERIUSER = "VERIUSER";
	public final static String DBYB_INTERFACE_230000_VERIUSER_LENGTH = "20";
	public final static String DBYB_INTERFACE_230000_VERIUSER_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_VERIUSER_TYPE = "String";
	// 审核时间
	public final static String DBYB_INTERFACE_230000_STR_VERIDATE = "VERIDATE";
	public final static String DBYB_INTERFACE_230000_VERIDATE_LENGTH = "10";
	public final static String DBYB_INTERFACE_230000_VERIDATE_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_VERIDATE_TYPE = "DATE";
	// 风险等级
	public final static String DBYB_INTERFACE_230000_STR_RFLAG = "rflag";
	public final static String DBYB_INTERFACE_230000_RFLAG_LENGTH = "1";
	public final static String DBYB_INTERFACE_230000_RFLAG_ISNULL = "Y";
	public final static String DBYB_INTERFACE_230000_RFLAG_TYPE = "String";
	// 利润率
	public final static String DBYB_INTERFACE_230000_STR_MARGIN = "margin";
	public final static String DBYB_INTERFACE_230000_MARGIN_LENGTH = "12";
	public final static String DBYB_INTERFACE_230000_MARGIN_ISNULL = "Y";
	public final static String DBYB_INTERFACE_230000_MARGIN_TYPE = "BigDecimal";
	// 特约
	public final static String DBYB_INTERFACE_230000_STR_SPECIAL = "special";
	public final static String DBYB_INTERFACE_230000_SPECIAL_LENGTH = "2048";
	public final static String DBYB_INTERFACE_230000_SPECIAL_ISNULL = "Y";
	public final static String DBYB_INTERFACE_230000_SPECIAL_TYPE = "String";
	// 管理服务费率 AN21(整数16，小数4位)
	public final static String DBYB_INTERFACE_230000_STR_SRVRATIO = "sRvratio";
	public final static String DBYB_INTERFACE_230000_SRVRATIO_LENGTH = "21";
	public final static String DBYB_INTERFACE_230000_SRVRATIO_ISNULL = "Y";
	public final static String DBYB_INTERFACE_230000_SRVRATIO_MIN = "0";
	public final static String DBYB_INTERFACE_230000_SRVRATIO_MAX = "100";
	public final static String DBYB_INTERFACE_230000_SRVRATIO_POINTMAX = "4";
	public final static String DBYB_INTERFACE_230000_SRVRATIO_TYPE = "double";

	/*
	 * //循环标志 AN2 代表listPIDC是否有值 public final static String
	 * DBYB_INTERFACE_230000_STR_CIRNUM1 = "CIRNUM1"; public final static String
	 * DBYB_INTERFACE_230000_CIRNUM1_LENGTH = "2"; public final static String
	 * DBYB_INTERFACE_230000_CIRNUM1_ISNULL = "N"; public final static String
	 * DBYB_INTERFACE_230000_CIRNUM1_TYPE = "String";
	 */
	// 15循环次数 20以内，并且要为正数,代表下面的listPIDC大小
	public final static String DBYB_INTERFACE_230000_STR_num1 = "num1";
	public final static String DBYB_INTERFACE_230000_num1_LENGTH = "2";
	public final static String DBYB_INTERFACE_230000_num1_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_num1_TYPE = "int";
	public final static String DBYB_INTERFACE_230000_num1_MIN = "0";
	public final static String DBYB_INTERFACE_230000_num1_MAX = "20";
	// ------------------------------------------------共保公司信息------------------------------------------------
	// 16共保险种 AN6 T_PRODUCT_INFO/PRODUCT_CODE
	public final static String DBYB_INTERFACE_230000_STR_sUdclasscode = "sUdclasscode";
	public final static String DBYB_INTERFACE_230000_sUdclasscode_LENGTH = "6";
	public final static String DBYB_INTERFACE_230000_sUdclasscode_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_sUdclasscode_TYPE = "String";
	// 17保险公司代码 AN6 T_POLICY_DIVIDE_INFO/COMPANY_CODE
	public final static String DBYB_INTERFACE_230000_STR_sInsrnc_code = "sInsrnc_code";
	public final static String DBYB_INTERFACE_230000_sInsrnc_code_LENGTH = "6";
	public final static String DBYB_INTERFACE_230000_sInsrnc_code_ISNULL = "Y";
	public final static String DBYB_INTERFACE_230000_sInsrnc_code_TYPE = "String";
	// 18是否主承保方（已有枚举） AN2 T_POLICY_INFO/INSURANCE_TYPE
	// 1- 副承保 2- 主承保
	public final static String DBYB_INTERFACE_230000_STR_sIs_insure_tgtr = "sIs_insure_tgtr";
	public final static String DBYB_INTERFACE_230000_sIs_insure_tgtr_LENGTH = "2";
	public final static String DBYB_INTERFACE_230000_sIs_insure_tgtr_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_sIs_insure_tgtr_TYPE = "String";
	// 19承保比例 AN6 NUMBER(7,3) T_POLICY_DIVIDE_INFO/DIVIDE_PERCENT
	public final static String DBYB_INTERFACE_230000_STR_sRate = "sRate";
	public final static String DBYB_INTERFACE_230000_sRate_LENGTH = "11";
	public final static String DBYB_INTERFACE_230000_sRate_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_sRate_MIN = "0";
	public final static String DBYB_INTERFACE_230000_sRate_MAX = "100";
	public final static String DBYB_INTERFACE_230000_sRate_POINTMAX = "2";
	public final static String DBYB_INTERFACE_230000_sRate_TYPE = "double";

	// ------------------------------------------------共保公司信息结束------------------------------------------------

	// 循环次数 10以内，并且要为正数,代表下面的listPIClassInfo大小
	public final static String DBYB_INTERFACE_230000_STR_num2 = "num2";
	public final static String DBYB_INTERFACE_230000_num2_LENGTH = "2";
	public final static String DBYB_INTERFACE_230000_num2_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_num2_TYPE = "int";
	public final static String DBYB_INTERFACE_230000_num2_MIN = "0";
	public final static String DBYB_INTERFACE_230000_num2_MAX = "10";

	// ------------------------------------------------层级信息开始------------------------------------------------
	// 层级名称
	public final static String DBYB_INTERFACE_230000_STR_className = "className";
	public final static String DBYB_INTERFACE_230000_className_LENGTH = "20";
	public final static String DBYB_INTERFACE_230000_className_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_className_TYPE = "String";

	// 层级险种
	public final static String DBYB_INTERFACE_230000_STR_classCode = "classCode";
	public final static String DBYB_INTERFACE_230000_classCode_LENGTH = "10";
	public final static String DBYB_INTERFACE_230000_classCode_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_classCodee_TYPE = "String";

	// ------------------------------------------------层级信息结束------------------------------------------------
	/*
	 * //循环标志 AN2 代表listPIPI是否有值 public final static String
	 * DBYB_INTERFACE_230000_STR_CIRNUM2 = "CIRNUM2"; public final static String
	 * DBYB_INTERFACE_230000_CIRNUM2_LENGTH = "2"; public final static String
	 * DBYB_INTERFACE_230000_CIRNUM2_ISNULL = "N"; public final static String
	 * DBYB_INTERFACE_230000_CIRNUM2_TYPE = "String";
	 */
	// 20循环次数 30以内，并且要为正数,代表下面的listPIPI大小
	public final static String DBYB_INTERFACE_230000_STR_num3 = "num3";
	public final static String DBYB_INTERFACE_230000_num3_LENGTH = "2";
	public final static String DBYB_INTERFACE_230000_num3_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_num3_TYPE = "int";
	public final static String DBYB_INTERFACE_230000_num3_MIN = "0";
	public final static String DBYB_INTERFACE_230000_num3_MAX = "30";
	// ------------------------------------------------险种信息------------------------------------------------
	// 层级组别
	// 代表该险种是对应ZYXPolicyInsertPolicyInfo.listPIClassInfo的第几个
	public final static String DBYB_INTERFACE_230000_STR_sClass = "sClass";
	public final static String DBYB_INTERFACE_230000_sClass_LENGTH = "2";
	public final static String DBYB_INTERFACE_230000_sClass_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_sClass_TYPE = "int";
	public final static String DBYB_INTERFACE_230000_sClass_MIN = "0";
	public final static String DBYB_INTERFACE_230000_sClass_MAX = "10";

	// 21险种 AN6 T_PRODUCT_INFO/PRODUCT_CODE
	public final static String DBYB_INTERFACE_230000_STR_sClassCode = "sClassCode";
	public final static String DBYB_INTERFACE_230000_sClassCode_LENGTH = "6";
	public final static String DBYB_INTERFACE_230000_sClassCode_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_sClassCode_TYPE = "String";
	// 22主附险标识 （已有枚举） AN1
	// 1 主险 2 附加险
	// 现阶段暂时全部为主险，如果要添加附险会涉及数据模型修改
	public final static String DBYB_INTERFACE_230000_STR_sAppf = "sAppf";
	public final static String DBYB_INTERFACE_230000_sAppf_LENGTH = "1";
	public final static String DBYB_INTERFACE_230000_sAppf_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_sAppf_TYPE = "String";
	// 23责任起期 AN10 T_POLICY_INFO/RESPONSE_START_DATE
	public final static String DBYB_INTERFACE_230000_STR_sBegDate = "sBegDate";
	public final static String DBYB_INTERFACE_230000_sBegDate_LENGTH = "10";
	public final static String DBYB_INTERFACE_230000_sBegDate_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_sBegDate_TYPE = "DATE";
	// 24责任终期 AN10 T_POLICY_INFO/RESPONSE_END_DATE
	public final static String DBYB_INTERFACE_230000_STR_sEndDate = "sEndDate";
	public final static String DBYB_INTERFACE_230000_sEndDate_LENGTH = "10";
	public final static String DBYB_INTERFACE_230000_sEndDate_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_sEndDate_TYPE = "DATE";
	// 25总保额 AN13 T_RESPONSIBILITY_INFO/RESPONSIBILITY_COST相加
	// 一个险种对应多个责任，所有的责任保额相加就是这里的总保额
	public final static String DBYB_INTERFACE_230000_STR_sSumPre = "sSumPre";
	public final static String DBYB_INTERFACE_230000_sSumPre_LENGTH = "13";
	public final static String DBYB_INTERFACE_230000_sSumPre_ISNULL = "Y";
	public final static String DBYB_INTERFACE_230000_sSumPre_MIN = "0";
	public final static String DBYB_INTERFACE_230000_sSumPre_TYPE = "BigDecimal";
	// 26总保费 AN13 T_POLICY_INFO/TOTAL_COST
	public final static String DBYB_INTERFACE_230000_STR_sSumAmt = "sSumAmt";
	public final static String DBYB_INTERFACE_230000_sSumAmt_LENGTH = "13";
	public final static String DBYB_INTERFACE_230000_sSumAmt_ISNULL = "Y";
	public final static String DBYB_INTERFACE_230000_sSumAmt_MIN = "0";
	public final static String DBYB_INTERFACE_230000_sSumAmt_TYPE = "BigDecimal";
	// 27总份数 AN16 暂时恒定为1
	public final static String DBYB_INTERFACE_230000_STR_sSumPieces = "sSumPieces";
	public final static String DBYB_INTERFACE_230000_sSumPieces_LENGTH = "16";
	public final static String DBYB_INTERFACE_230000_sSumPieces_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_sSumPieces_MIN = "0";
	public final static String DBYB_INTERFACE_230000_sSumPieces_TYPE = "long";
	// ------------------------------------------------险种信息结束------------------------------------------------
	/*
	 * //循环标志 AN2 代表listPIPI是listPIRI有值 public final static String
	 * DBYB_INTERFACE_230000_STR_CIRNUM3 = "CIRNUM3"; public final static String
	 * DBYB_INTERFACE_230000_CIRNUM3_LENGTH = "2"; public final static String
	 * DBYB_INTERFACE_230000_CIRNUM3_ISNULL = "N"; public final static String
	 * DBYB_INTERFACE_230000_CIRNUM3_TYPE = "String";
	 */
	// 28循环次数 50以内，并且要为正数,代表下面的listPIPI大小
	public final static String DBYB_INTERFACE_230000_STR_num4 = "num4";
	public final static String DBYB_INTERFACE_230000_num4_LENGTH = "2";
	public final static String DBYB_INTERFACE_230000_num4_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_num4_TYPE = "int";
	public final static String DBYB_INTERFACE_230000_num4_MIN = "0";
	public final static String DBYB_INTERFACE_230000_num4_MAX = "50";
	// ------------------------------------------------责任信息------------------------------------------------
	// 29组别 AN2
	// 代表该责任是对应ZYXPolicyInsertPolicyInfo.listPIPI的第几个
	public final static String DBYB_INTERFACE_230000_STR_sGroup = "sGroup";
	public final static String DBYB_INTERFACE_230000_sGroup_LENGTH = "2";
	public final static String DBYB_INTERFACE_230000_sGroup_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_sGroup_TYPE = "int";
	public final static String DBYB_INTERFACE_230000_sGroup_MIN = "0";
	public final static String DBYB_INTERFACE_230000_sGroup_MAX = "30";
	// 责任代码 AN5 T_RESPONSIBILITY_INFO/RESPONSIBILITY_CODE
	public final static String DBYB_INTERFACE_230000_STR_sResCode = "sResCode";
	public final static String DBYB_INTERFACE_230000_sResCode_LENGTH = "5";
	public final static String DBYB_INTERFACE_230000_sResCode_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_sResCode_TYPE = "String";
	// 30责任代码 AN3 T_RESPONSIBILITY_INFO/RESPONSIBILITY_CODE.5位中的前三位
	public final static String DBYB_INTERFACE_230000_STR_sPrecode = "sPrecode";
	public final static String DBYB_INTERFACE_230000_sPrecode_LENGTH = "3";
	public final static String DBYB_INTERFACE_230000_sPrecode_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_sPrecode_TYPE = "String";
	// 31责任子码 AN2 T_RESPONSIBILITY_INFO/RESPONSIBILITY_CODE.5位中的后二位
	public final static String DBYB_INTERFACE_230000_STR_sPreno = "sPreno";
	public final static String DBYB_INTERFACE_230000_sPreno_LENGTH = "2";
	public final static String DBYB_INTERFACE_230000_sPreno_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_sPreno_TYPE = "String";
	// 32保额 AN13 T_RESPONSIBILITY_INFO/RESPONSIBILITY_COST
	public final static String DBYB_INTERFACE_230000_STR_sAddpre = "sAddpre";
	public final static String DBYB_INTERFACE_230000_sAddpre_LENGTH = "13";
	public final static String DBYB_INTERFACE_230000_sAddpre_ISNULL = "Y";
	public final static String DBYB_INTERFACE_230000_sAddpre_MIN = "0";
	public final static String DBYB_INTERFACE_230000_sAddpre_TYPE = "BigDecimal";
	// ------------------------------------------------责任信息结束------------------------------------------------
	// 循环标志 AN2 代表listPIPI是listPICI有值
	/*
	 * public final static String DBYB_INTERFACE_230000_STR_CIRNUM4 = "CIRNUM4";
	 * public final static String DBYB_INTERFACE_230000_CIRNUM4_LENGTH = "2"; public
	 * final static String DBYB_INTERFACE_230000_CIRNUM4_ISNULL = "N"; public final
	 * static String DBYB_INTERFACE_230000_CIRNUM4_TYPE = "String";
	 */
	// 33循环次数 50以内，并且要为正数,代表下面的listPIPI大小
	public final static String DBYB_INTERFACE_230000_STR_num5 = "num5";
	public final static String DBYB_INTERFACE_230000_num5_LENGTH = "2";
	public final static String DBYB_INTERFACE_230000_num5_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_num5_TYPE = "String";
	public final static String DBYB_INTERFACE_230000_num5_MIN = "0";
	public final static String DBYB_INTERFACE_230000_num5_MAX = "50";
	// ------------------------------------------------可浮动项------------------------------------------------
	// 责任组别
	public final static String DBYB_INTERFACE_230000_STR_sResGroup = "sResGroup";
	public final static String DBYB_INTERFACE_230000_sResGroup_LENGTH = "6";
	public final static String DBYB_INTERFACE_230000_sResGroup_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_sResGroup_TYPE = "int";
	public final static String DBYB_INTERFACE_230000_sResGroup_MIN = "0";
	public final static String DBYB_INTERFACE_230000_sResGroup_MAX = "50";
	// 34项目代码 (枚举值） AN6
	// 如果项目代码=100001 则sChvalue代表 协议号
	// 如果项目代码=100002 则sChvalue代表 利润率
	public final static String DBYB_INTERFACE_230000_sCode = "sCode";
	public final static String DBYB_INTERFACE_230000_sCode_LENGTH = "6";
	public final static String DBYB_INTERFACE_230000_sCode_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_sCode_TYPE = "String";
	// 35字符约定值 AN30 内容参照项目代码。如果为协议号则T_POLICY_INFO/TREATY_NUMBER
	public final static String DBYB_INTERFACE_230000_STR_sChvalue = "sChvalue";
	public final static String DBYB_INTERFACE_230000_sChvalue_LENGTH = "30";
	public final static String DBYB_INTERFACE_230000_sChvalue_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_sChvalue_TYPE = "String";
	// 36数字约定值(赔付比例或者赔付额) AN12 T_POLICY_INFO/RULE_PAY_RATIO
	public final static String DBYB_INTERFACE_230000_STR_sDbvalue = "sDbvalue";
	public final static String DBYB_INTERFACE_230000_sDbvalue_LENGTH = "12";
	public final static String DBYB_INTERFACE_230000_sDbvalue_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_sDbvalue_MIN = "0";
	public final static String DBYB_INTERFACE_230000_sDbvalue_TYPE = "BigDecimal";

	// BTYPE 责任类型 AN20
	public final static String DBYB_INTERFACE_230000_STR_BTYPE = "BTYPE";
	public final static String DBYB_INTERFACE_230000_BTYPE_LENGTH = "20";
	public final static String DBYB_INTERFACE_230000_BTYPE_ISNULL = "N";
	public final static String DBYB_INTERFACE_230000_BTYPE_TYPE = "String";
	// ------------------------------------------------可浮动项结束------------------------------------------------
	/*
	 * 综意险入单部分常量定义 结束
	 */

	/*
	 * 1222005接口理赔结案常量定义 开始
	 */
	// 1 sClaimno 赔案号 Char 15 Y
	public final static String DBYB_INTERFACE_1222005_STR_sClaimNo = "sClaimNo";
	public final static String DBYB_INTERFACE_1222005_sClaimNo_LENGTH = "15";
	public final static String DBYB_INTERFACE_1222005_sClaimNo_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222005_sClaimNo_TYPE = "String";

	// 2 sRegdate 立案日期 Char 10 Y
	public final static String DBYB_INTERFACE_1222005_STR_sRegdate = "sRegdate";
	public final static String DBYB_INTERFACE_1222005_sRegdate_LENGTH = "10";
	public final static String DBYB_INTERFACE_1222005_sRegdate_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222005_sRegdate_TYPE = "DATE";

	// 3 sWho 查勘费承担类别 Char 1 Y
	public final static String DBYB_INTERFACE_1222005_STR_sWho = "sWho";
	public final static String DBYB_INTERFACE_1222005_sWho_LENGTH = "1";
	public final static String DBYB_INTERFACE_1222005_sWho_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222005_sWho_TYPE = "String";

	// 4 sIdtype 证件类型 Char 1 Y
	public final static String DBYB_INTERFACE_1222005_STR_sIdtype = "sIdtype";
	public final static String DBYB_INTERFACE_1222005_sIdtype_LENGTH = "1";
	public final static String DBYB_INTERFACE_1222005_sIdtype_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222005_sIdtype_TYPE = "String";

	// 5 sPid 被保人号 Char 18 Y
	public final static String DBYB_INTERFACE_1222005_STR_sPid = "sPid";
	public final static String DBYB_INTERFACE_1222005_sPid_LENGTH = "18";
	public final static String DBYB_INTERFACE_1222005_sPid_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222005_sPid_TYPE = "String";

	// 7 Setcode 支付方式 Char 1 Y
	public final static String DBYB_INTERFACE_1222005_STR_Setcode = "Setcode";
	public final static String DBYB_INTERFACE_1222005_Setcode_LENGTH = "1";
	public final static String DBYB_INTERFACE_1222005_Setcode_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222005_Setcode_TYPE = "String";

	// 8 Bcode 银行编号 Char 6 Y
	public final static String DBYB_INTERFACE_1222005_STR_Bcode = "Bcode";
	public final static String DBYB_INTERFACE_1222005_Bcode_LENGTH = "6";
	public final static String DBYB_INTERFACE_1222005_Bcode_ISNULL = "Y";
	public final static String DBYB_INTERFACE_1222005_Bcode_TYPE = "String";

	// 9 delbkno 客户银行账户 Char 50 Y
	public final static String DBYB_INTERFACE_1222005_STR_delbkno = "delbkno";
	public final static String DBYB_INTERFACE_1222005_delbkno_LENGTH = "50";
	public final static String DBYB_INTERFACE_1222005_delbkno_ISNULL = "Y";
	public final static String DBYB_INTERFACE_1222005_delbkno_TYPE = "String";

	// directPay 直付标示 Char 1 N
	public final static String DBYB_INTERFACE_1222005_STR_directPay = "directPay";
	public final static String DBYB_INTERFACE_1222005_directPay_LENGTH = "1";
	public final static String DBYB_INTERFACE_1222005_directPay_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222005_directPay_TYPE = "String";

	// Binding 贴牌标示 Char 1 N
	public final static String DBYB_INTERFACE_1222005_STR_Binding = "Binding";
	public final static String DBYB_INTERFACE_1222005_Binding_LENGTH = "1";
	public final static String DBYB_INTERFACE_1222005_Binding_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222005_Binding_TYPE = "String";

	// batchNo 批次号 Char 1 N
	public final static String DBYB_INTERFACE_1222005_STR_batchNo = "batchNo";
	public final static String DBYB_INTERFACE_1222005_batchNo_LENGTH = "15";
	public final static String DBYB_INTERFACE_1222005_batchNo_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222005_batchNo_TYPE = "String";

	// privateSign 对公对私标志 Char 1 N
	public final static String DBYB_INTERFACE_1222005_STR_privateSign = "privateSign";
	public final static String DBYB_INTERFACE_1222005_privateSign_LENGTH = "1";
	public final static String DBYB_INTERFACE_1222005_privateSign_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222005_privateSign_TYPE = "String";

	// 10 sPolicyno 保单号 Char 15 Y
	public final static String DBYB_INTERFACE_1222005_STR_sPolicyno = "sPolicyno";
	public final static String DBYB_INTERFACE_1222005_sPolicyno_LENGTH = "15";
	public final static String DBYB_INTERFACE_1222005_sPolicyno_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222005_sPolicyno_TYPE = "String";

	// 11 sClasscode 险种代码 Char 8 Y
	public final static String DBYB_INTERFACE_1222005_STR_sClasscode = "sClasscode";
	public final static String DBYB_INTERFACE_1222005_sClasscode_LENGTH = "8";
	public final static String DBYB_INTERFACE_1222005_sClasscode_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222005_sClasscode_TYPE = "String";

	// 12 sPrecode 理赔责任代码 Char 3 Y
	public final static String DBYB_INTERFACE_1222005_STR_sPrecode = "sPrecode";
	public final static String DBYB_INTERFACE_1222005_sPrecode_LENGTH = "3";
	public final static String DBYB_INTERFACE_1222005_sPrecode_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222005_sPrecode_TYPE = "String";

	// 13 sPreno 理赔责任子码 Char 2 Y
	public final static String DBYB_INTERFACE_1222005_STR_sPreno = "sPreno";
	public final static String DBYB_INTERFACE_1222005_sPreno_LENGTH = "2";
	public final static String DBYB_INTERFACE_1222005_sPreno_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222005_sPreno_TYPE = "String";

	// 14 dAmount 理赔金额 Number 13.2 Y
	public final static String DBYB_INTERFACE_1222005_STR_dAmount = "dAmount";
	public final static String DBYB_INTERFACE_1222005_dAmount_LENGTH = "13";
	public final static String DBYB_INTERFACE_1222005_dAmount_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222005_dAmount_MIN = "0";
	public final static String DBYB_INTERFACE_1222005_dAmount_POINTMAX = "2";
	public final static String DBYB_INTERFACE_1222005_dAmount_TYPE = "BigDecimal";

	// 15 dDelrate 理赔给付比例 Number 13.2 Y
	public final static String DBYB_INTERFACE_1222005_STR_dDelrate = "dDelrate";
	public final static String DBYB_INTERFACE_1222005_dDelrate_LENGTH = "13";
	public final static String DBYB_INTERFACE_1222005_dDelrate_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222005_dDelrate_MAX = "100";
	public final static String DBYB_INTERFACE_1222005_dDelrate_MIN = "0";
	public final static String DBYB_INTERFACE_1222005_dDelrate_POINTMAX = "2";
	public final static String DBYB_INTERFACE_1222005_dDelrate_TYPE = "BigDecimal";

	// 16 sRescode 理赔结论代码 Char 2 Y
	public final static String DBYB_INTERFACE_1222005_STR_sRescode = "sRescode";
	public final static String DBYB_INTERFACE_1222005_sRescode_LENGTH = "2";
	public final static String DBYB_INTERFACE_1222005_sRescode_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222005_sRescode_TYPE = "String";

	// 17 sSubrescode 理赔结论子码 Char 2 Y
	public final static String DBYB_INTERFACE_1222005_STR_sSubrescode = "sSubrescode";
	public final static String DBYB_INTERFACE_1222005_sSubrescode_LENGTH = "2";
	public final static String DBYB_INTERFACE_1222005_sSubrescode_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222005_sSubrescode_TYPE = "String";

	// 18 sAccdate 出险日期 Char 10 Y
	public final static String DBYB_INTERFACE_1222005_STR_sAccdate = "sAccdate";
	public final static String DBYB_INTERFACE_1222005_sAccdate_LENGTH = "10";
	public final static String DBYB_INTERFACE_1222005_sAccdate_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222005_sAccdate_TYPE = "DATE";

	// 19 sClmnext 理赔后对保单的处理方式 Char 2 Y
	public final static String DBYB_INTERFACE_1222005_STR_sClmnext = "sClmnext";
	public final static String DBYB_INTERFACE_1222005_sClmnext_LENGTH = "2";
	public final static String DBYB_INTERFACE_1222005_sClmnext_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222005_sClmnext_TYPE = "String";

	// 20 sRate 解约赔付比例 Number 13.2 Y
	public final static String DBYB_INTERFACE_1222005_STR_sRate = "sRate";
	public final static String DBYB_INTERFACE_1222005_sRate_LENGTH = "13";
	public final static String DBYB_INTERFACE_1222005_sRate_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222005_sRate_MAX = "100";
	public final static String DBYB_INTERFACE_1222005_sRate_MIN = "0";
	public final static String DBYB_INTERFACE_1222005_sRate_POINTMAX = "2";
	public final static String DBYB_INTERFACE_1222005_sRate_TYPE = "BigDecimal";

	// 21 sModino 理赔批单号 Char 13.2 Y
	public final static String DBYB_INTERFACE_1222005_STR_sModino = "sModino";
	public final static String DBYB_INTERFACE_1222005_sModino_LENGTH = "15";
	public final static String DBYB_INTERFACE_1222005_sModino_ISNULL = "Y";
	public final static String DBYB_INTERFACE_1222005_sModino_TYPE = "String";

	// 22 Surrend_who 费用承担方 Char 1 Y
	public final static String DBYB_INTERFACE_1222005_STR_Surrend_who = "Surrend_who";
	public final static String DBYB_INTERFACE_1222005_Surrend_who_LENGTH = "1";
	public final static String DBYB_INTERFACE_1222005_Surrend_who_ISNULL = "Y";
	public final static String DBYB_INTERFACE_1222005_Surrend_who_TYPE = "String";

	// 23 Sexempt 豁免标志位 char 1 Y
	public final static String DBYB_INTERFACE_1222005_STR_Sexempt = "Sexempt";
	public final static String DBYB_INTERFACE_1222005_Sexempt_LENGTH = "1";
	public final static String DBYB_INTERFACE_1222005_Sexempt_ISNULL = "Y";
	public final static String DBYB_INTERFACE_1222005_Sexempt_TYPE = "String";
	/*
	 * // 24 sPolicyno 保单号 Char 15 Y public final static String
	 * DBYB_INTERFACE_1222005_STR_sPolicyno = "sPolicyno"; public final static
	 * String DBYB_INTERFACE_1222005_sPolicyno_LENGTH = "15"; public final static
	 * String DBYB_INTERFACE_1222005_sPolicyno_ISNULL = "N"; public final static
	 * String DBYB_INTERFACE_1222005_sPolicyno_TYPE = "String";
	 * 
	 * // 25 sClasscode 险种代码 Char 8 Y public final static String
	 * DBYB_INTERFACE_1222005_STR_sClasscode = "sClasscode"; public final static
	 * String DBYB_INTERFACE_1222005_sClasscode_LENGTH = "8"; public final static
	 * String DBYB_INTERFACE_1222005_sClasscode_ISNULL = "N"; public final static
	 * String DBYB_INTERFACE_1222005_sClasscode_TYPE = "String";
	 */
	// 26 sFlag 永久拒绝续保标志 Char 1 Y
	public final static String DBYB_INTERFACE_1222005_STR_sFlag = "sFlag";
	public final static String DBYB_INTERFACE_1222005_sFlag_LENGTH = "1";
	public final static String DBYB_INTERFACE_1222005_sFlag_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222005_sFlag_TYPE = "String";
	/*
	 * 1222005接口理赔结案常量定义 结束
	 */

	/*
	 * 1222018接口理赔受益人常量定义 开始
	 */
	// 1 sClaimNo 赔案号 15 T_CLAIM_INFO/COMPENSATE_NO
	public final static String DBYB_INTERFACE_1222018_STR_sClaimNo = "sClaimNo";
	public final static String DBYB_INTERFACE_1222018_sClaimNo_LENGTH = "15";
	public final static String DBYB_INTERFACE_1222018_sClaimNo_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222018_sClaimNo_TYPE = "String";

	// 2 flag 操作类型 Char 1 Y
	public final static String DBYB_INTERFACE_1222018_STR_flag = "flag";
	public final static String DBYB_INTERFACE_1222018_flag_LENGTH = "1";
	public final static String DBYB_INTERFACE_1222018_flag_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222018_flag_TYPE = "String";

	// 3 sPolicyNo 保单号 Char 15 Y M*59 T_CLAIM_INFO/POLICY_NUMBER
	public final static String DBYB_INTERFACE_1222018_STR_sPolicyNo = "sPolicyNo";
	public final static String DBYB_INTERFACE_1222018_sPolicyNo_LENGTH = "15";
	public final static String DBYB_INTERFACE_1222018_sPolicyNo_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222018_sPolicyNo_TYPE = "String";

	// 4 sClassCode 险种代码 Char 8 Y M*59 T_CLAIM_PRODUCT_DETAIL/PRODUCT_CODE
	public final static String DBYB_INTERFACE_1222018_STR_sClassCode = "sClassCode";
	public final static String DBYB_INTERFACE_1222018_sClassCode_LENGTH = "8";
	public final static String DBYB_INTERFACE_1222018_sClassCode_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222018_sClassCode_TYPE = "String";

	// 5 sPreCode 责任代码 Char 3 Y M*59 T_CLAIM_PRODUCT_DETAIL/LIABILITY_CODE前3位
	public final static String DBYB_INTERFACE_1222018_STR_sPreCode = "sPreCode";
	public final static String DBYB_INTERFACE_1222018_sPreCode_LENGTH = "3";
	public final static String DBYB_INTERFACE_1222018_sPreCode_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222018_sPreCode_TYPE = "String";

	// 6 sPreNo 责任子码 Char 2 Y M*59 T_CLAIM_PRODUCT_DETAIL/LIABILITY_CODE后2位
	public final static String DBYB_INTERFACE_1222018_STR_sPreNo = "sPreNo";
	public final static String DBYB_INTERFACE_1222018_sPreNo_LENGTH = "2";
	public final static String DBYB_INTERFACE_1222018_sPreNo_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222018_sPreNo_TYPE = "String";

	// 7 benid 受益人身份证 Char 18 Y M*59 这个问题待确认
	// 我们这里都是：证件类型-证件号码。另外没有专门的受益人身份证。应该是被保人是谁钱就给谁
	public final static String DBYB_INTERFACE_1222018_STR_benid = "benid";
	public final static String DBYB_INTERFACE_1222018_benid_LENGTH = "18";
	public final static String DBYB_INTERFACE_1222018_benid_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222018_benid_TYPE = "String";

	// 8 sBcode 银行代码 Char 12 Y M*59 T_CLAIM_PAY_PATIENT_INFO/BANK
	// T_CLAIM_PAY_PATIENT_INFO/BANK
	public final static String DBYB_INTERFACE_1222018_STR_sBcode = "sBcode";
	public final static String DBYB_INTERFACE_1222018_sBcode_LENGTH = "12";
	public final static String DBYB_INTERFACE_1222018_sBcode_ISNULL = "Y";
	public final static String DBYB_INTERFACE_1222018_sBcode_TYPE = "String";

	// 9 Delbkno 银行账号 Char 50 Y M*59 T_CLAIM_PAY_PATIENT_INFO/BANK_ACCOUNT
	// T_CLAIM_PAY_PATIENT_INFO/BANK_ACCOUNT
	public final static String DBYB_INTERFACE_1222018_STR_Delbkno = "Delbkno";
	public final static String DBYB_INTERFACE_1222018_Delbkno_LENGTH = "50";
	public final static String DBYB_INTERFACE_1222018_Delbkno_ISNULL = "Y";
	public final static String DBYB_INTERFACE_1222018_Delbkno_TYPE = "String";

	// 10 BenAmt 赔付金额 Number 13.2lf Y M*59 T_CLAIM_INFO/DB_PAY_COST_AUTIO
	public final static String DBYB_INTERFACE_1222018_STR_BenAmt = "BenAmt";
	public final static String DBYB_INTERFACE_1222018_BenAmt_LENGTH = "13";
	public final static String DBYB_INTERFACE_1222018_BenAmt_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222018_BenAmt_POINTMAX = "2";
	public final static String DBYB_INTERFACE_1222018_BenAmt_MIN = "0";
	public final static String DBYB_INTERFACE_1222018_BenAmt_TYPE = "BigDecimal";

	// 11 BenRate 赔付比例 Number 13.2lf Y M*59
	// T_CLAIM_INFO/HOS_COST/DB_PAY_COST_AUTIO
	public final static String DBYB_INTERFACE_1222018_STR_BenRate = "BenRate";
	public final static String DBYB_INTERFACE_1222018_BenRate_LENGTH = "13";
	public final static String DBYB_INTERFACE_1222018_BenRate_ISNULL = "N";
	public final static String DBYB_INTERFACE_1222018_BenRate_MAX = "100";
	public final static String DBYB_INTERFACE_1222018_BenRate_POINTMAX = "2";
	public final static String DBYB_INTERFACE_1222018_BenRate_MIN = "0";
	public final static String DBYB_INTERFACE_1222018_BenRate_TYPE = "BigDecimal";
	/*
	 * 1222018接口理赔受益人常量定义 结束
	 */

	/*
	 * 补录被保人信息常量定义 BEGIN
	 */
	// 交易码
	public final static String DBYB_INSUREDINFO_NAME_TRANSNO = "交易码";
	public final static String DBYB_INSUREDINFO_STR_TRANSNO = "transno";
	public final static String DBYB_INSUREDINFO_TRANSNO_LENGTH = "7";
	public final static String DBYB_INSUREDINFO_TRANSNO_ISNULL = "Y";
	public final static String DBYB_INSUREDINFO_TRANSNO_TYPE = "String";
	// 交易来源
	public final static String DBYB_INSUREDINFO_NAME_TRANSSOURCE = "交易来源";
	public final static String DBYB_INSUREDINFO_STR_TRANSSOURCE = "transsource";
	public final static String DBYB_INSUREDINFO_TRANSSOURCE_LENGTH = "2";
	public final static String DBYB_INSUREDINFO_TRANSSOURCE_ISNULL = "Y";
	public final static String DBYB_INSUREDINFO_TRANSSOURCE_TYPE = "String";
	// 交易日期
	public final static String DBYB_INSUREDINFO_NAME_DATE = "交易日期";
	public final static String DBYB_INSUREDINFO_STR_DATE = "date";
	public final static String DBYB_INSUREDINFO_DATE_LENGTH = "10";
	public final static String DBYB_INSUREDINFO_DATE_ISNULL = "Y";
	public final static String DBYB_INSUREDINFO_DATE_TYPE = "Date";
	// 交易时间
	public final static String DBYB_INSUREDINFO_NAME_TIME = "交易时间";
	public final static String DBYB_INSUREDINFO_STR_TIME = "time";
	public final static String DBYB_INSUREDINFO_TIME_LENGTH = "8";
	public final static String DBYB_INSUREDINFO_TIME_ISNULL = "Y";
	public final static String DBYB_INSUREDINFO_TIME_TYPE = "Time";
	// 应答码
	public final static String DBYB_INSUREDINFO_NAME_RETNO = "应答码";
	public final static String DBYB_INSUREDINFO_STR_RETNO = "retno";
	public final static String DBYB_INSUREDINFO_RETNO_LENGTH = "7";
	public final static String DBYB_INSUREDINFO_RETNO_ISNULL = "Y";
	public final static String DBYB_INSUREDINFO_RETNO_TYPE = "String";
	// 应答信息
	public final static String DBYB_INSUREDINFO_NAME_RETMESG = "应答信息";
	public final static String DBYB_INSUREDINFO_STR_RETMESG = "retmesg";
	public final static String DBYB_INSUREDINFO_RETMESG_LENGTH = "57";
	public final static String DBYB_INSUREDINFO_RETMESG_ISNULL = "N";
	public final static String DBYB_INSUREDINFO_RETMESG_TYPE = "String";
	// 鉴定码
	public final static String DBYB_INSUREDINFO_NAME_MAC = "鉴定码";
	public final static String DBYB_INSUREDINFO_STR_MAC = "mac";
	public final static String DBYB_INSUREDINFO_MAC_LENGTH = "8";
	public final static String DBYB_INSUREDINFO_MAC_ISNULL = "N";
	public final static String DBYB_INSUREDINFO_MAC_TYPE = "String";
	// 当前页数
	public final static String DBYB_INSUREDINFO_NAME_CURRPAGE = "当前页数";
	public final static String DBYB_INSUREDINFO_STR_CURRPAGE = "currpage";
	public final static String DBYB_INSUREDINFO_CURRPAGE_LENGTH = "3";
	public final static String DBYB_INSUREDINFO_CURRPAGE_ISNULL = "N";
	public final static String DBYB_INSUREDINFO_CURRPAGE_TYPE = "Number";
	// 总页数
	public final static String DBYB_INSUREDINFO_NAME_ALLPAGE = "总页数";
	public final static String DBYB_INSUREDINFO_STR_ALLPAGE = "allpage";
	public final static String DBYB_INSUREDINFO_ALLPAGE_LENGTH = "3";
	public final static String DBYB_INSUREDINFO_ALLPAGE_ISNULL = "N";
	public final static String DBYB_INSUREDINFO_ALLPAGE_TYPE = "Number";
	// 每页记录数
	public final static String DBYB_INSUREDINFO_NAME_RECNUM = "每页记录数";
	public final static String DBYB_INSUREDINFO_STR_RECNUM = "recnum";
	public final static String DBYB_INSUREDINFO_RECNUM_LENGTH = "3";
	public final static String DBYB_INSUREDINFO_RECNUM_ISNULL = "N";
	public final static String DBYB_INSUREDINFO_RECNUM_TYPE = "Number";
	// 团体保单号
	public final static String DBYB_INSUREDINFO_NAME_GPOLICYNO = "团体保单号";
	public final static String DBYB_INSUREDINFO_STR_GPOLICYNO = "gpolicyno";
	public final static String DBYB_INSUREDINFO_GPOLICYNO_LENGTH = "15";
	public final static String DBYB_INSUREDINFO_GPOLICYNO_ISNULL = "Y";
	public final static String DBYB_INSUREDINFO_GPOLICYNO_TYPE = "String";
	// 证件类型
	public final static String DBYB_INSUREDINFO_NAME_PTYPE = "证件类型";
	public final static String DBYB_INSUREDINFO_STR_PTYPE = "ptype";
	public final static String DBYB_INSUREDINFO_PTYPE_LENGTH = "1";
	public final static String DBYB_INSUREDINFO_PTYPE_ISNULL = "Y";
	public final static String DBYB_INSUREDINFO_PTYPE_TYPE = "String";
	// 身份证
	public final static String DBYB_INSUREDINFO_NAME_PID = "身份证";
	public final static String DBYB_INSUREDINFO_STR_PID = "pid";
	public final static String DBYB_INSUREDINFO_PID_LENGTH = "18";
	public final static String DBYB_INSUREDINFO_PID_ISNULL = "Y";
	public final static String DBYB_INSUREDINFO_PID_TYPE = "String";
	// 投保单位码
	public final static String DBYB_INSUREDINFO_NAME_GRPCODE = "投保单位码";
	public final static String DBYB_INSUREDINFO_STR_GRPCODE = "grpcode";
	public final static String DBYB_INSUREDINFO_GRPCODE_LENGTH = "12";
	public final static String DBYB_INSUREDINFO_GRPCODE_ISNULL = "Y";
	public final static String DBYB_INSUREDINFO_GRPCODE_TYPE = "String";
	// 投保日期
	public final static String DBYB_INSUREDINFO_NAME_APPDATE = "投保日期";
	public final static String DBYB_INSUREDINFO_STR_APPDATE = "appdate";
	public final static String DBYB_INSUREDINFO_APPDATE_LENGTH = "10";
	public final static String DBYB_INSUREDINFO_APPDATE_ISNULL = "Y";
	public final static String DBYB_INSUREDINFO_APPDATE_TYPE = "Date";
	// 工号
	public final static String DBYB_INSUREDINFO_NAME_WORKNO = "工号";
	public final static String DBYB_INSUREDINFO_STR_WORKNO = "workno";
	public final static String DBYB_INSUREDINFO_WORKNO_LENGTH = "15";
	public final static String DBYB_INSUREDINFO_WORKNO_ISNULL = "N";
	public final static String DBYB_INSUREDINFO_WORKNO_TYPE = "String";
	// 医保类型
	public final static String DBYB_INSUREDINFO_NAME_ICARDTYPE = "医保类型";
	public final static String DBYB_INSUREDINFO_STR_ICARDTYPE = "icardtype";
	public final static String DBYB_INSUREDINFO_ICARDTYPE_LENGTH = "1";
	public final static String DBYB_INSUREDINFO_ICARDTYPE_ISNULL = "Y";
	public final static String DBYB_INSUREDINFO_ICARDTYPE_TYPE = "String";
	// 医保卡号/新农合号
	public final static String DBYB_INSUREDINFO_NAME_ICARDNO = "医保卡号/新农合号";
	public final static String DBYB_INSUREDINFO_STR_ICARDNO = "icardno";
	public final static String DBYB_INSUREDINFO_ICARDNO_LENGTH = "50";
	public final static String DBYB_INSUREDINFO_ICARDNO_ISNULL = "N";
	public final static String DBYB_INSUREDINFO_ICARDNO_TYPE = "String";
	// 社保编号
	public final static String DBYB_INSUREDINFO_NAME_MEDNO = "社保编号";
	public final static String DBYB_INSUREDINFO_STR_MEDNO = "medno";
	public final static String DBYB_INSUREDINFO_MEDNO_LENGTH = "36";
	public final static String DBYB_INSUREDINFO_MEDNO_ISNULL = "N";
	public final static String DBYB_INSUREDINFO_MEDNO_TYPE = "String";
	// 姓名
	public final static String DBYB_INSUREDINFO_NAME_NAME = "姓名";
	public final static String DBYB_INSUREDINFO_STR_NAME = "name";
	public final static String DBYB_INSUREDINFO_NAME_LENGTH = "60";
	public final static String DBYB_INSUREDINFO_NAME_ISNULL = "Y";
	public final static String DBYB_INSUREDINFO_NAME_TYPE = "String";
	// 职业代码
	public final static String DBYB_INSUREDINFO_NAME_JOB = "职业代码";
	public final static String DBYB_INSUREDINFO_STR_JOB = "job";
	public final static String DBYB_INSUREDINFO_JOB_LENGTH = "7";
	public final static String DBYB_INSUREDINFO_JOB_ISNULL = "Y";
	public final static String DBYB_INSUREDINFO_JOB_TYPE = "String";
	// 银行代码
	public final static String DBYB_INSUREDINFO_NAME_BANKNO = "银行代码";
	public final static String DBYB_INSUREDINFO_STR_BANKNO = "bankno";
	public final static String DBYB_INSUREDINFO_BANKNO_LENGTH = "12";
	public final static String DBYB_INSUREDINFO_BANKNO_ISNULL = "N";
	public final static String DBYB_INSUREDINFO_BANKNO_TYPE = "String";
	// 银行名称
	public final static String DBYB_INSUREDINFO_NAME_BANKNAME = "银行名称";
	public final static String DBYB_INSUREDINFO_STR_BANKNAME = "bankname";
	public final static String DBYB_INSUREDINFO_BANKNAME_LENGTH = "80";
	public final static String DBYB_INSUREDINFO_BANKNAME_ISNULL = "N";
	public final static String DBYB_INSUREDINFO_BANKNAME_TYPE = "String";
	// 银行账号
	public final static String DBYB_INSUREDINFO_NAME_ACCTNO = "银行账号";
	public final static String DBYB_INSUREDINFO_STR_ACCTNO = "acctno";
	public final static String DBYB_INSUREDINFO_ACCTNO_LENGTH = "30";
	public final static String DBYB_INSUREDINFO_ACCTNO_ISNULL = "N";
	public final static String DBYB_INSUREDINFO_ACCTNO_TYPE = "String";
	// 组别
	public final static String DBYB_INSUREDINFO_NAME_DCDM = "组别";
	public final static String DBYB_INSUREDINFO_STR_DCDM = "dcdm";
	public final static String DBYB_INSUREDINFO_DCDM_LENGTH = "2";
	public final static String DBYB_INSUREDINFO_DCDM_ISNULL = "N";
	public final static String DBYB_INSUREDINFO_DCDM_TYPE = "String";
	// 投保年龄
	public final static String DBYB_INSUREDINFO_NAME_DELAGE = "投保年龄";
	public final static String DBYB_INSUREDINFO_STR_DELAGE = "delage";
	public final static String DBYB_INSUREDINFO_DELAGE_LENGTH = "3";
	public final static String DBYB_INSUREDINFO_DELAGE_ISNULL = "N";
	public final static String DBYB_INSUREDINFO_DELAGE_TYPE = "Number";
	// 与投保人关系
	public final static String DBYB_INSUREDINFO_NAME_RELATION = "与投保人关系";
	public final static String DBYB_INSUREDINFO_STR_RELATION = "relation";
	public final static String DBYB_INSUREDINFO_RELATION_LENGTH = "3";
	public final static String DBYB_INSUREDINFO_RELATION_ISNULL = "Y";
	public final static String DBYB_INSUREDINFO_RELATION_TYPE = "String";
	// 受益人方式
	public final static String DBYB_INSUREDINFO_NAME_PAYTYPE = "受益人方式";
	public final static String DBYB_INSUREDINFO_STR_PAYTYPE = "paytype";
	public final static String DBYB_INSUREDINFO_PAYTYPE_LENGTH = "1";
	public final static String DBYB_INSUREDINFO_PAYTYPE_ISNULL = "Y";
	public final static String DBYB_INSUREDINFO_PAYTYPE_TYPE = "String";
	// 循环标志位
	public final static String DBYB_INSUREDINFO_NAME_CIRNUM = "循环标志位";
	public final static String DBYB_INSUREDINFO_STR_CIRNUM = "cirnum";
	public final static String DBYB_INSUREDINFO_CIRNUM_LENGTH = "2";
	public final static String DBYB_INSUREDINFO_CIRNUM_ISNULL = "Y";
	public final static String DBYB_INSUREDINFO_CIRNUM_TYPE = "Number";
	// 险种
	public final static String DBYB_INSUREDINFO_NAME_CLASSCODE = "险种";
	public final static String DBYB_INSUREDINFO_STR_CLASSCODE = "classcode";
	public final static String DBYB_INSUREDINFO_CLASSCODE_LENGTH = "6";
	public final static String DBYB_INSUREDINFO_CLASSCODE_ISNULL = "Y";
	public final static String DBYB_INSUREDINFO_CLASSCODE_TYPE = "String";
	// 主附险标志
	public final static String DBYB_INSUREDINFO_NAME_APPF = "主附险标志";
	public final static String DBYB_INSUREDINFO_STR_APPF = "appf";
	public final static String DBYB_INSUREDINFO_APPF_LENGTH = "1";
	public final static String DBYB_INSUREDINFO_APPF_ISNULL = "Y";
	public final static String DBYB_INSUREDINFO_APPF_TYPE = "String";
	// 缴费金额
	public final static String DBYB_INSUREDINFO_NAME_AMOUNT = "缴费金额";
	public final static String DBYB_INSUREDINFO_STR_AMOUNT = "amount";
	public final static String DBYB_INSUREDINFO_AMOUNT_LENGTH = "13";
	public final static String DBYB_INSUREDINFO_AMOUNT_ISNULL = "Y";
	public final static String DBYB_INSUREDINFO_AMOUNT_TYPE = "Double";
	// 份数
	public final static String DBYB_INSUREDINFO_NAME_PIECES = "份数";
	public final static String DBYB_INSUREDINFO_STR_PIECES = "pieces";
	public final static String DBYB_INSUREDINFO_PIECES_LENGTH = "13";
	public final static String DBYB_INSUREDINFO_PIECES_ISNULL = "Y";
	public final static String DBYB_INSUREDINFO_PIECES_TYPE = "Number";
	// 缴费形式
	public final static String DBYB_INSUREDINFO_NAME_PAYCODE = "缴费形式";
	public final static String DBYB_INSUREDINFO_STR_PAYCODE = "paycode";
	public final static String DBYB_INSUREDINFO_PAYCODE_LENGTH = "2";
	public final static String DBYB_INSUREDINFO_PAYCODE_ISNULL = "Y";
	public final static String DBYB_INSUREDINFO_PAYCODE_TYPE = "String";
	// 缴费年限
	public final static String DBYB_INSUREDINFO_NAME_YEARNUM = "缴费年限";
	public final static String DBYB_INSUREDINFO_STR_YEARNUM = "yearnum";
	public final static String DBYB_INSUREDINFO_YEARNUM_LENGTH = "3";
	public final static String DBYB_INSUREDINFO_YEARNUM_ISNULL = "Y";
	public final static String DBYB_INSUREDINFO_YEARNUM_TYPE = "String";
	// 缴费起期
	public final static String DBYB_INSUREDINFO_NAME_PBDATE = "缴费起期";
	public final static String DBYB_INSUREDINFO_STR_PBDATE = "pbdate";
	public final static String DBYB_INSUREDINFO_PBDATE_LENGTH = "10";
	public final static String DBYB_INSUREDINFO_PBDATE_ISNULL = "Y";
	public final static String DBYB_INSUREDINFO_PBDATE_TYPE = "Date";
	// 缴费终期
	public final static String DBYB_INSUREDINFO_NAME_PEDATE = "缴费终期";
	public final static String DBYB_INSUREDINFO_STR_PEDATE = "pedate";
	public final static String DBYB_INSUREDINFO_PEDATE_LENGTH = "10";
	public final static String DBYB_INSUREDINFO_PEDATE_ISNULL = "Y";
	public final static String DBYB_INSUREDINFO_PEDATE_TYPE = "Date";
	// 缴费终止年龄
	public final static String DBYB_INSUREDINFO_NAME_PEAGE = "缴费终止年龄";
	public final static String DBYB_INSUREDINFO_STR_PEAGE = "peage";
	public final static String DBYB_INSUREDINFO_PEAGE_LENGTH = "3";
	public final static String DBYB_INSUREDINFO_PEAGE_ISNULL = "Y";
	public final static String DBYB_INSUREDINFO_PEAGE_TYPE = "String";
	// 责任起期
	public final static String DBYB_INSUREDINFO_NAME_BEGDATE = "责任起期";
	public final static String DBYB_INSUREDINFO_STR_BEGDATE = "begdate";
	public final static String DBYB_INSUREDINFO_BEGDATE_LENGTH = "10";
	public final static String DBYB_INSUREDINFO_BEGDATE_ISNULL = "Y";
	public final static String DBYB_INSUREDINFO_BEGDATE_TYPE = "Date";
	// 责任终期
	public final static String DBYB_INSUREDINFO_NAME_STOPDATE = "责任终期";
	public final static String DBYB_INSUREDINFO_STR_STOPDATE = "stopdate";
	public final static String DBYB_INSUREDINFO_STOPDATE_LENGTH = "10";
	public final static String DBYB_INSUREDINFO_STOPDATE_ISNULL = "Y";
	public final static String DBYB_INSUREDINFO_STOPDATE_TYPE = "Date";
	// 责任终止年龄
	public final static String DBYB_INSUREDINFO_NAME_STOPAGE = "责任终止年龄";
	public final static String DBYB_INSUREDINFO_STR_STOPAGE = "stopage";
	public final static String DBYB_INSUREDINFO_STOPAGE_LENGTH = "3";
	public final static String DBYB_INSUREDINFO_STOPAGE_ISNULL = "Y";
	public final static String DBYB_INSUREDINFO_STOPAGE_TYPE = "String";

	/*
	 * 补录被保人信息常量定义 END
	 */

	/*
	 * 查询客户基本信息常量定义 BEGIN
	 */
	// 交易码
	public final static String DBYB_FF0100105_NAME_TRANSNO = "交易码";
	public final static String DBYB_FF0100105_STR_TRANSNO = "transno";
	public final static String DBYB_FF0100105_TRANSNO_LENGTH = "7";
	public final static String DBYB_FF0100105_TRANSNO_ISNULL = "Y";
	public final static String DBYB_FF0100105_TRANSNO_TYPE = "String";
	// 交易来源
	public final static String DBYB_FF0100105_NAME_TRANSSOURCE = "交易来源";
	public final static String DBYB_FF0100105_STR_TRANSSOURCE = "transsource";
	public final static String DBYB_FF0100105_TRANSSOURCE_LENGTH = "2";
	public final static String DBYB_FF0100105_TRANSSOURCE_ISNULL = "Y";
	public final static String DBYB_FF0100105_TRANSSOURCE_TYPE = "String";
	// 交易日期
	public final static String DBYB_FF0100105_NAME_DATE = "交易日期";
	public final static String DBYB_FF0100105_STR_DATE = "date";
	public final static String DBYB_FF0100105_DATE_LENGTH = "10";
	public final static String DBYB_FF0100105_DATE_ISNULL = "Y";
	public final static String DBYB_FF0100105_DATE_TYPE = "Date";
	// 交易时间
	public final static String DBYB_FF0100105_NAME_TIME = "交易时间";
	public final static String DBYB_FF0100105_STR_TIME = "time";
	public final static String DBYB_FF0100105_TIME_LENGTH = "8";
	public final static String DBYB_FF0100105_TIME_ISNULL = "Y";
	public final static String DBYB_FF0100105_TIME_TYPE = "Time";
	// 应答码
	public final static String DBYB_FF0100105_NAME_RETNO = "应答码";
	public final static String DBYB_FF0100105_STR_RETNO = "retno";
	public final static String DBYB_FF0100105_RETNO_LENGTH = "7";
	public final static String DBYB_FF0100105_RETNO_ISNULL = "Y";
	public final static String DBYB_FF0100105_RETNO_TYPE = "String";
	// 应答信息
	public final static String DBYB_FF0100105_NAME_RETMESG = "应答信息";
	public final static String DBYB_FF0100105_STR_RETMESG = "retmesg";
	public final static String DBYB_FF0100105_RETMESG_LENGTH = "57";
	public final static String DBYB_FF0100105_RETMESG_ISNULL = "N";
	public final static String DBYB_FF0100105_RETMESG_TYPE = "String";
	// 鉴定码
	public final static String DBYB_FF0100105_NAME_MAC = "鉴定码";
	public final static String DBYB_FF0100105_STR_MAC = "mac";
	public final static String DBYB_FF0100105_MAC_LENGTH = "8";
	public final static String DBYB_FF0100105_MAC_ISNULL = "N";
	public final static String DBYB_FF0100105_MAC_TYPE = "String";
	// 当前页数
	public final static String DBYB_FF0100105_NAME_CURRPAGE = "当前页数";
	public final static String DBYB_FF0100105_STR_CURRPAGE = "currpage";
	public final static String DBYB_FF0100105_CURRPAGE_LENGTH = "3";
	public final static String DBYB_FF0100105_CURRPAGE_ISNULL = "N";
	public final static String DBYB_FF0100105_CURRPAGE_TYPE = "Number";
	// 总页数
	public final static String DBYB_FF0100105_NAME_ALLPAGE = "总页数";
	public final static String DBYB_FF0100105_STR_ALLPAGE = "allpage";
	public final static String DBYB_FF0100105_ALLPAGE_LENGTH = "3";
	public final static String DBYB_FF0100105_ALLPAGE_ISNULL = "N";
	public final static String DBYB_FF0100105_ALLPAGE_TYPE = "Number";
	// 每页记录数
	public final static String DBYB_FF0100105_NAME_RECNUM = "每页记录数";
	public final static String DBYB_FF0100105_STR_RECNUM = "recnum";
	public final static String DBYB_FF0100105_RECNUM_LENGTH = "3";
	public final static String DBYB_FF0100105_RECNUM_ISNULL = "N";
	public final static String DBYB_FF0100105_RECNUM_TYPE = "Number";
	// 证件类型
	public final static String DBYB_FF0100105_NAME_IDTYPE = "证件类型";
	public final static String DBYB_FF0100105_STR_IDTYPE = "idtype";
	public final static String DBYB_FF0100105_IDTYPE_LENGTH = "1";
	public final static String DBYB_FF0100105_IDTYPE_ISNULL = "Y";
	public final static String DBYB_FF0100105_IDTYPE_TYPE = "String";
	// 被保险人证件号
	public final static String DBYB_FF0100105_NAME_IDNMBR = "被保险人证件号";
	public final static String DBYB_FF0100105_STR_IDNMBR = "idnmbr";
	public final static String DBYB_FF0100105_IDNMBR_LENGTH = "18";
	public final static String DBYB_FF0100105_IDNMBR_ISNULL = "Y";
	public final static String DBYB_FF0100105_IDNMBR_TYPE = "String";

	// 返回报文长度
	public final static int DBYB_FF0100105_RESP_LEN = 692;
	public final static int[] DBYB_FF0100105_RESP_LENS = new int[] { 7, 2, 10, 8, 7, 57, 8, 3, 3, 3, 40, 1, 10, 3, 60,
			6, 7, 60, 14, 6, 60, 14, 6, 10, 8, 1, 1, 10, 50, 30, 30, 30, 30, 7, 2, 4, 1, 3, 80 };
	/*
	 * 查询客户基本信息常量定义 END
	 */

	/*
	 * 绩效系统报表常量定义 begin
	 */
	public final static String preFileName = "lcmi2jx_";
	// 分公司按月累计
	public final static String fileNameJgtj = "simi_reg_statistical";
	public final static String fileNameBfmx = "bfmx";
	// 保单按天累计人数
	public final static String fileNamePaymx = "simi_peymentdetail";
	public final static String fileNameCostRatio = "costratio_";
	// 项目协议信息表
	public final static String fileNamePolicyInfo = "simi_pro_treaty_info";
	// 报案信息
	public final static String fileNameAppClm = "simi_app_clm";
	// 立案信息
	public final static String fileNameNregClm = "simi_nregclm";
	// 结算表
	public final static String fileNameFootDate = "simi_footdate";
	// 团体保单表
	public final static String fileNameGrpcon = "simi_grpcon";
	// 江苏供数
	public final static String fileNameJiangSu = "simi_js_data";

	public final static String DBYB_LCMI2JXJGTJ_filialeCode_NAME = "filialeCode";
	public final static String DBYB_LCMI2JXJGTJ_filialeCode_ISNULL = "N";
	public final static String DBYB_LCMI2JXJGTJ_filialeCode_LENGTH = "32";

	public final static String DBYB_LCMI2JXJGTJ_filialeName_NAME = "filialeName";
	public final static String DBYB_LCMI2JXJGTJ_filialeName_ISNULL = "N";
	public final static String DBYB_LCMI2JXJGTJ_filialeName_LENGTH = "32";

	public final static String DBYB_LCMI2JXJGTJ_payMonth_NAME = "payMonth";
	public final static String DBYB_LCMI2JXJGTJ_payMonth_ISNULL = "N";
	public final static String DBYB_LCMI2JXJGTJ_payMonth_LENGTH = "6";

	public final static String DBYB_LCMI2JXJGTJ_provenceProjectNum_NAME = "provenceProjectNum";
	public final static String DBYB_LCMI2JXJGTJ_provenceProjectNum_ISNULL = "N";
	public final static String DBYB_LCMI2JXJGTJ_provenceProjectNum_LENGTH = "5";

	public final static String DBYB_LCMI2JXJGTJ_areaProjectNum_NAME = "areaProjectNum";
	public final static String DBYB_LCMI2JXJGTJ_areaProjectNum_ISNULL = "N";
	public final static String DBYB_LCMI2JXJGTJ_areaProjectNum_LENGTH = "5";

	public final static String DBYB_LCMI2JXJGTJ_countyProjectNum_NAME = "countyProjectNum";
	public final static String DBYB_LCMI2JXJGTJ_countyProjectNum_ISNULL = "N";
	public final static String DBYB_LCMI2JXJGTJ_countyProjectNum_LENGTH = "5";

	public final static String DBYB_LCMI2JXJGTJ_payPeopleNum_NAME = "payPeopleNum";
	public final static String DBYB_LCMI2JXJGTJ_payPeopleNum_ISNULL = "N";
	public final static String DBYB_LCMI2JXJGTJ_payPeopleNum_LENGTH = "10";

	public final static String DBYB_LCMI2JXJGTJ_payPeoples_NAME = "payPeoples";
	public final static String DBYB_LCMI2JXJGTJ_payPeoples_ISNULL = "N";
	public final static String DBYB_LCMI2JXJGTJ_payPeoples_LENGTH = "10";

	// ----------------------------------------监管统计结束----------------------------------------

	public final static String DBYB_LCMI2JXBFMX_projectCode_NAME = "projectCode";
	public final static String DBYB_LCMI2JXBFMX_projectCode_ISNULL = "N";
	public final static String DBYB_LCMI2JXBFMX_projectCode_LENGTH = "20";

	public final static String DBYB_LCMI2JXBFMX_projectName_NAME = "projectName";
	public final static String DBYB_LCMI2JXBFMX_projectName_ISNULL = "N";
	public final static String DBYB_LCMI2JXBFMX_projectName_LENGTH = "64";

	public final static String DBYB_LCMI2JXBFMX_filialeCode_NAME = "filialeCode";
	public final static String DBYB_LCMI2JXBFMX_filialeCode_ISNULL = "N";
	public final static String DBYB_LCMI2JXBFMX_filialeCode_LENGTH = "32";

	public final static String DBYB_LCMI2JXBFMX_filialeName_NAME = "filialeName";
	public final static String DBYB_LCMI2JXBFMX_filialeName_ISNULL = "N";
	public final static String DBYB_LCMI2JXBFMX_filialeName_LENGTH = "32";

	public final static String DBYB_LCMI2JXBFMX_branchCode_NAME = "branchCode";
	public final static String DBYB_LCMI2JXBFMX_branchCode_ISNULL = "N";
	public final static String DBYB_LCMI2JXBFMX_branchCode_LENGTH = "32";

	public final static String DBYB_LCMI2JXBFMX_branchName_NAME = "branchName";
	public final static String DBYB_LCMI2JXBFMX_branchName_ISNULL = "N";
	public final static String DBYB_LCMI2JXBFMX_branchName_LENGTH = "32";

	public final static String DBYB_LCMI2JXBFMX_areaLevel_NAME = "areaLevel";
	public final static String DBYB_LCMI2JXBFMX_areaLevel_ISNULL = "N";
	public final static String DBYB_LCMI2JXBFMX_areaLevel_LENGTH = "32";

	public final static String DBYB_LCMI2JXBFMX_policyNumber_NAME = "policyNumber";
	public final static String DBYB_LCMI2JXBFMX_policyNumber_ISNULL = "N";
	public final static String DBYB_LCMI2JXBFMX_policyNumber_LENGTH = "32";

	public final static String DBYB_LCMI2JXBFMX_productCode_NAME = "productCode";
	public final static String DBYB_LCMI2JXBFMX_productCode_ISNULL = "N";
	public final static String DBYB_LCMI2JXBFMX_productCode_LENGTH = "32";

	public final static String DBYB_LCMI2JXBFMX_responseStartDate_NAME = "responseStartDate";
	public final static String DBYB_LCMI2JXBFMX_responseStartDate_ISNULL = "N";
	public final static String DBYB_LCMI2JXBFMX_responseStartDate_LENGTH = "10";
	public final static String DBYB_LCMI2JXBFMX_responseStartDate_TYPE = "DATE";

	public final static String DBYB_LCMI2JXBFMX_responseEndDate_NAME = "responseEndDate";
	public final static String DBYB_LCMI2JXBFMX_responseEndDate_ISNULL = "N";
	public final static String DBYB_LCMI2JXBFMX_responseEndDate_LENGTH = "10";
	public final static String DBYB_LCMI2JXBFMX_responseEndDate_TYPE = "DATE";

	// ----------------------------------------保费明细结束----------------------------------------

	public final static String DBYB_LCMI2JXPAYMX_projectCode_NAME = "projectCode";
	public final static String DBYB_LCMI2JXPAYMX_projectCode_ISNULL = "N";
	public final static String DBYB_LCMI2JXPAYMX_projectCode_LENGTH = "20";

	public final static String DBYB_LCMI2JXPAYMX_projectName_NAME = "projectName";
	public final static String DBYB_LCMI2JXPAYMX_projectName_ISNULL = "N";
	public final static String DBYB_LCMI2JXPAYMX_projectName_LENGTH = "64";

	public final static String DBYB_LCMI2JXPAYMX_filialeCode_NAME = "filialeCode";
	public final static String DBYB_LCMI2JXPAYMX_filialeCode_ISNULL = "N";
	public final static String DBYB_LCMI2JXPAYMX_filialeCode_LENGTH = "32";

	public final static String DBYB_LCMI2JXPAYMX_filialeName_NAME = "filialeName";
	public final static String DBYB_LCMI2JXPAYMX_filialeName_ISNULL = "N";
	public final static String DBYB_LCMI2JXPAYMX_filialeName_LENGTH = "32";

	public final static String DBYB_LCMI2JXPAYMX_branchCode_NAME = "branchCode";
	public final static String DBYB_LCMI2JXPAYMX_branchCode_ISNULL = "N";
	public final static String DBYB_LCMI2JXPAYMX_branchCode_LENGTH = "32";

	public final static String DBYB_LCMI2JXPAYMX_branchName_NAME = "branchName";
	public final static String DBYB_LCMI2JXPAYMX_branchName_ISNULL = "N";
	public final static String DBYB_LCMI2JXPAYMX_branchName_LENGTH = "32";

	public final static String DBYB_LCMI2JXPAYMX_areaLevel_NAME = "areaLevel";
	public final static String DBYB_LCMI2JXPAYMX_areaLevel_ISNULL = "N";
	public final static String DBYB_LCMI2JXPAYMX_areaLevel_LENGTH = "32";

	public final static String DBYB_LCMI2JXPAYMX_policyNumber_NAME = "policyNumber";
	public final static String DBYB_LCMI2JXPAYMX_policyNumber_ISNULL = "N";
	public final static String DBYB_LCMI2JXPAYMX_policyNumber_LENGTH = "32";

	public final static String DBYB_LCMI2JXPAYMX_productCode_NAME = "productCode";
	public final static String DBYB_LCMI2JXPAYMX_productCode_ISNULL = "N";
	public final static String DBYB_LCMI2JXPAYMX_productCode_LENGTH = "32";

	public final static String DBYB_LCMI2JXPAYMX_claimDate_NAME = "claimDate";
	public final static String DBYB_LCMI2JXPAYMX_claimDate_ISNULL = "N";
	public final static String DBYB_LCMI2JXPAYMX_claimDate_LENGTH = "10";
	public final static String DBYB_LCMI2JXPAYMX_claimDate_TYPE = "DATE";

	public final static String DBYB_LCMI2JXPAYMX_claimCustomerCount_NAME = "claimCustomerCount";
	public final static String DBYB_LCMI2JXPAYMX_claimCustomerCount_ISNULL = "N";
	public final static String DBYB_LCMI2JXPAYMX_claimCustomerCount_LENGTH = "10";

	public final static String DBYB_LCMI2JXPAYMX_claimAccount_NAME = "claimAccount";
	public final static String DBYB_LCMI2JXPAYMX_claimAccount_ISNULL = "N";
	public final static String DBYB_LCMI2JXPAYMX_claimAccount_LENGTH = "10";
	// ----------------------------------------赔付明细结束----------------------------------------
	/*
	 * 绩效系统报表常量定义 end
	 */

	/*
	 * 结算单接口常量常量定义开始
	 */
	public final static String finalStatementInterfacePreFileName = "DBJS_";
	/*
	 * 结算单接口常量常量定义结束
	 */

	/*
	 * 结算单接口常量常量定义开始
	 */
	public final static String jingSuanPreFileName = "HT_";
	public final static String JingSuanPolicyProjectInfoPreFileName = "policy_related_info";
	/*
	 * 结算单接口常量常量定义结束
	 */

	/*
	 * 未决接口常量常量定义开始
	 */
	public final static String appClmPreFileName = "bigill_app_clm";
	public final static String nregclmPreFileName = "bigill_nregclm";
	public final static String nclmcclPreFileName = "bigill_nclmccl";
	public final static String projectInfoFileName = "bigill_project_info";
	public final static String treatyInfoPreFileName = "bigill_treaty_info";
	public final static String clmestimatePreFileName = "bigill_clmestimate";
	public final static String settleFinalPreFileName = "bigill_finalstatement_info";
	public final static String changeLineWindows = "\r\n";
	public final static String changeLineLinux = "\n";
	/*
	 * 未决接口常量常量定义结束
	 */

	/*
	 * 综意险理赔红冲接口常量定义 BEGIN
	 */
	// 交易码
	public final static String DBYB_RUSHCLAIM_NAME_TRANSNO = "交易码";
	public final static String DBYB_RUSHCLAIM_STR_TRANSNO = "transno";
	public final static String DBYB_RUSHCLAIM_TRANSNO_LENGTH = "7";
	public final static String DBYB_RUSHCLAIM_TRANSNO_ISNULL = "Y";
	public final static String DBYB_RUSHCLAIM_TRANSNO_TYPE = "String";
	// 交易来源
	public final static String DBYB_RUSHCLAIM_NAME_TRANSSOURCE = "交易来源";
	public final static String DBYB_RUSHCLAIM_STR_TRANSSOURCE = "transsource";
	public final static String DBYB_RUSHCLAIM_TRANSSOURCE_LENGTH = "2";
	public final static String DBYB_RUSHCLAIM_TRANSSOURCE_ISNULL = "Y";
	public final static String DBYB_RUSHCLAIM_TRANSSOURCE_TYPE = "String";
	// 交易日期
	public final static String DBYB_RUSHCLAIM_NAME_DATE = "交易日期";
	public final static String DBYB_RUSHCLAIM_STR_DATE = "date";
	public final static String DBYB_RUSHCLAIM_DATE_LENGTH = "10";
	public final static String DBYB_RUSHCLAIM_DATE_ISNULL = "Y";
	public final static String DBYB_RUSHCLAIM_DATE_TYPE = "Date";
	// 交易时间
	public final static String DBYB_RUSHCLAIM_NAME_TIME = "交易时间";
	public final static String DBYB_RUSHCLAIM_STR_TIME = "time";
	public final static String DBYB_RUSHCLAIM_TIME_LENGTH = "8";
	public final static String DBYB_RUSHCLAIM_TIME_ISNULL = "Y";
	public final static String DBYB_RUSHCLAIM_TIME_TYPE = "Time";
	// 应答码
	public final static String DBYB_RUSHCLAIM_NAME_RETNO = "应答码";
	public final static String DBYB_RUSHCLAIM_STR_RETNO = "retno";
	public final static String DBYB_RUSHCLAIM_RETNO_LENGTH = "7";
	public final static String DBYB_RUSHCLAIM_RETNO_ISNULL = "Y";
	public final static String DBYB_RUSHCLAIM_RETNO_TYPE = "String";
	// 应答信息
	public final static String DBYB_RUSHCLAIM_NAME_RETMESG = "应答信息";
	public final static String DBYB_RUSHCLAIM_STR_RETMESG = "retmesg";
	public final static String DBYB_RUSHCLAIM_RETMESG_LENGTH = "57";
	public final static String DBYB_RUSHCLAIM_RETMESG_ISNULL = "N";
	public final static String DBYB_RUSHCLAIM_RETMESG_TYPE = "String";
	// 鉴定码
	public final static String DBYB_RUSHCLAIM_NAME_MAC = "鉴定码";
	public final static String DBYB_RUSHCLAIM_STR_MAC = "mac";
	public final static String DBYB_RUSHCLAIM_MAC_LENGTH = "8";
	public final static String DBYB_RUSHCLAIM_MAC_ISNULL = "N";
	public final static String DBYB_RUSHCLAIM_MAC_TYPE = "String";
	// 当前页数
	public final static String DBYB_RUSHCLAIM_NAME_CURRPAGE = "当前页数";
	public final static String DBYB_RUSHCLAIM_STR_CURRPAGE = "currpage";
	public final static String DBYB_RUSHCLAIM_CURRPAGE_LENGTH = "3";
	public final static String DBYB_RUSHCLAIM_CURRPAGE_ISNULL = "N";
	public final static String DBYB_RUSHCLAIM_CURRPAGE_TYPE = "Number";
	// 总页数
	public final static String DBYB_RUSHCLAIM_NAME_ALLPAGE = "总页数";
	public final static String DBYB_RUSHCLAIM_STR_ALLPAGE = "allpage";
	public final static String DBYB_RUSHCLAIM_ALLPAGE_LENGTH = "3";
	public final static String DBYB_RUSHCLAIM_ALLPAGE_ISNULL = "N";
	public final static String DBYB_RUSHCLAIM_ALLPAGE_TYPE = "Number";
	// 每页记录数
	public final static String DBYB_RUSHCLAIM_NAME_RECNUM = "每页记录数";
	public final static String DBYB_RUSHCLAIM_STR_RECNUM = "recnum";
	public final static String DBYB_RUSHCLAIM_RECNUM_LENGTH = "3";
	public final static String DBYB_RUSHCLAIM_RECNUM_ISNULL = "N";
	public final static String DBYB_RUSHCLAIM_RECNUM_TYPE = "Number";
	// 赔案号
	public final static String DBYB_RUSHCLAIM_NAME_SCLAIMNO = "赔案号";
	public final static String DBYB_RUSHCLAIM_STR_SCLAIMNO = "sClaimno";
	public final static String DBYB_RUSHCLAIM_SCLAIMNO_LENGTH = "15";
	public final static String DBYB_RUSHCLAIM_SCLAIMNO_ISNULL = "Y";
	public final static String DBYB_RUSHCLAIM_SCLAIMNO_TYPE = "String";
	// 赔案日期
	public final static String DBYB_RUSHCLAIM_NAME_SREGDATE = "赔案日期";
	public final static String DBYB_RUSHCLAIM_STR_SREGDATE = "sRegdate";
	public final static String DBYB_RUSHCLAIM_SREGDATE_LENGTH = "10";
	public final static String DBYB_RUSHCLAIM_SREGDATE_ISNULL = "Y";
	public final static String DBYB_RUSHCLAIM_SREGDATE_TYPE = "date";
	// 证件类型
	public final static String DBYB_RUSHCLAIM_NAME_SIDTYPE = "证件类型";
	public final static String DBYB_RUSHCLAIM_STR_SIDTYPE = "sIdtype";
	public final static String DBYB_RUSHCLAIM_SIDTYPE_LENGTH = "1";
	public final static String DBYB_RUSHCLAIM_SIDTYPE_ISNULL = "Y";
	public final static String DBYB_RUSHCLAIM_SIDTYPE_TYPE = "String";
	// 被保人证件号码
	public final static String DBYB_RUSHCLAIM_NAME_SPID = "被保人证件号码";
	public final static String DBYB_RUSHCLAIM_STR_SPID = "sPid";
	public final static String DBYB_RUSHCLAIM_SPID_LENGTH = "18";
	public final static String DBYB_RUSHCLAIM_SPID_ISNULL = "Y";
	public final static String DBYB_RUSHCLAIM_SPID_TYPE = "String";
	// 团单号
	public final static String DBYB_RUSHCLAIM_NAME_TPOLICYNO = "团单号";
	public final static String DBYB_RUSHCLAIM_STR_TPOLICYNO = "tPolicyNo";
	public final static String DBYB_RUSHCLAIM_TPOLICYNO_LENGTH = "15";
	public final static String DBYB_RUSHCLAIM_TPOLICYNO_ISNULL = "Y";
	public final static String DBYB_RUSHCLAIM_TPOLICYNO_TYPE = "String";
	// 保单号
	public final static String DBYB_RUSHCLAIM_NAME_SPOLICYNO = "保单号";
	public final static String DBYB_RUSHCLAIM_STR_SPOLICYNO = "sPolicyno";
	public final static String DBYB_RUSHCLAIM_SPOLICYNO_LENGTH = "15";
	public final static String DBYB_RUSHCLAIM_SPOLICYNO_ISNULL = "Y";
	public final static String DBYB_RUSHCLAIM_SPOLICYNO_TYPE = "String";
	// 结算单号
	public final static String DBYB_RUSHCLAIM_NAME_SETTLEMENT = "结算单号";
	public final static String DBYB_RUSHCLAIM_STR_SETTLEMENT = "settleMent";
	public final static String DBYB_RUSHCLAIM_SETTLEMENT_LENGTH = "15";
	public final static String DBYB_RUSHCLAIM_SETTLEMENT_ISNULL = "Y";
	public final static String DBYB_RUSHCLAIM_SETTLEMENT_TYPE = "String";
	// 冲正金额
	public final static String DBYB_RUSHCLAIM_NAME_POSITIVEAMOUNT = "冲正金额";
	public final static String DBYB_RUSHCLAIM_STR_POSITIVEAMOUNT = "positiveAmount";
	public final static String DBYB_RUSHCLAIM_POSITIVEAMOUNT_LENGTH = "15";
	public final static String DBYB_RUSHCLAIM_POSITIVEAMOUNT_ISNULL = "Y";
	public final static String DBYB_RUSHCLAIM_POSITIVEAMOUNT_TYPE = "Number";

	/*
	 * 综意险理赔红冲接口常量定义 END
	 */

	/*
	 * 综意险理赔结算单接口常量定义 BEGIN
	 */
	// 交易码
	public final static String DBYB_SETTLEMENT_NAME_TRANSNO = "交易码";
	public final static String DBYB_SETTLEMENT_STR_TRANSNO = "transno";
	public final static String DBYB_SETTLEMENT_TRANSNO_LENGTH = "7";
	public final static String DBYB_SETTLEMENT_TRANSNO_ISNULL = "Y";
	public final static String DBYB_SETTLEMENT_TRANSNO_TYPE = "String";
	// 交易来源
	public final static String DBYB_SETTLEMENT_NAME_TRANSSOURCE = "交易来源";
	public final static String DBYB_SETTLEMENT_STR_TRANSSOURCE = "transsource";
	public final static String DBYB_SETTLEMENT_TRANSSOURCE_LENGTH = "2";
	public final static String DBYB_SETTLEMENT_TRANSSOURCE_ISNULL = "Y";
	public final static String DBYB_SETTLEMENT_TRANSSOURCE_TYPE = "String";
	// 交易日期
	public final static String DBYB_SETTLEMENT_NAME_DATE = "交易日期";
	public final static String DBYB_SETTLEMENT_STR_DATE = "date";
	public final static String DBYB_SETTLEMENT_DATE_LENGTH = "10";
	public final static String DBYB_SETTLEMENT_DATE_ISNULL = "Y";
	public final static String DBYB_SETTLEMENT_DATE_TYPE = "Date";
	// 交易时间
	public final static String DBYB_SETTLEMENT_NAME_TIME = "交易时间";
	public final static String DBYB_SETTLEMENT_STR_TIME = "time";
	public final static String DBYB_SETTLEMENT_TIME_LENGTH = "8";
	public final static String DBYB_SETTLEMENT_TIME_ISNULL = "Y";
	public final static String DBYB_SETTLEMENT_TIME_TYPE = "Time";
	// 应答码
	public final static String DBYB_SETTLEMENT_NAME_RETNO = "应答码";
	public final static String DBYB_SETTLEMENT_STR_RETNO = "retno";
	public final static String DBYB_SETTLEMENT_RETNO_LENGTH = "7";
	public final static String DBYB_SETTLEMENT_RETNO_ISNULL = "Y";
	public final static String DBYB_SETTLEMENT_RETNO_TYPE = "String";
	// 应答信息
	public final static String DBYB_SETTLEMENT_NAME_RETMESG = "应答信息";
	public final static String DBYB_SETTLEMENT_STR_RETMESG = "retmesg";
	public final static String DBYB_SETTLEMENT_RETMESG_LENGTH = "57";
	public final static String DBYB_SETTLEMENT_RETMESG_ISNULL = "N";
	public final static String DBYB_SETTLEMENT_RETMESG_TYPE = "String";
	// 鉴定码
	public final static String DBYB_SETTLEMENT_NAME_MAC = "鉴定码";
	public final static String DBYB_SETTLEMENT_STR_MAC = "mac";
	public final static String DBYB_SETTLEMENT_MAC_LENGTH = "8";
	public final static String DBYB_SETTLEMENT_MAC_ISNULL = "N";
	public final static String DBYB_SETTLEMENT_MAC_TYPE = "String";
	// 当前页数
	public final static String DBYB_SETTLEMENT_NAME_CURRPAGE = "当前页数";
	public final static String DBYB_SETTLEMENT_STR_CURRPAGE = "currpage";
	public final static String DBYB_SETTLEMENT_CURRPAGE_LENGTH = "3";
	public final static String DBYB_SETTLEMENT_CURRPAGE_ISNULL = "N";
	public final static String DBYB_SETTLEMENT_CURRPAGE_TYPE = "Number";
	// 总页数
	public final static String DBYB_SETTLEMENT_NAME_ALLPAGE = "总页数";
	public final static String DBYB_SETTLEMENT_STR_ALLPAGE = "allpage";
	public final static String DBYB_SETTLEMENT_ALLPAGE_LENGTH = "3";
	public final static String DBYB_SETTLEMENT_ALLPAGE_ISNULL = "N";
	public final static String DBYB_SETTLEMENT_ALLPAGE_TYPE = "Number";
	// 每页记录数
	public final static String DBYB_SETTLEMENT_NAME_RECNUM = "每页记录数";
	public final static String DBYB_SETTLEMENT_STR_RECNUM = "recnum";
	public final static String DBYB_SETTLEMENT_RECNUM_LENGTH = "3";
	public final static String DBYB_SETTLEMENT_RECNUM_ISNULL = "N";
	public final static String DBYB_SETTLEMENT_RECNUM_TYPE = "Number";
	// 结算单号
	public final static String DBYB_SETTLEMENT_NAME_SETTLENO = "结算单号";
	public final static String DBYB_SETTLEMENT_STR_SETTLENO = "settleno";
	public final static String DBYB_SETTLEMENT_SETTLENO_LENGTH = "15";
	public final static String DBYB_SETTLEMENT_SETTLENO_ISNULL = "Y";
	public final static String DBYB_SETTLEMENT_SETTLENO_TYPE = "String";
	// 领款人身份证
	public final static String DBYB_SETTLEMENT_NAME_PID = "领款人身份证";
	public final static String DBYB_SETTLEMENT_STR_PID = "pid";
	public final static String DBYB_SETTLEMENT_PID_LENGTH = "12";
	public final static String DBYB_SETTLEMENT_PID_ISNULL = "Y";
	public final static String DBYB_SETTLEMENT_PID_TYPE = "String";
	// 支付方式
	public final static String DBYB_SETTLEMENT_NAME_SETCODE = "支付方式";
	public final static String DBYB_SETTLEMENT_STR_SETCODE = "setcode";
	public final static String DBYB_SETTLEMENT_SETCODE_LENGTH = "1";
	public final static String DBYB_SETTLEMENT_SETCODE_ISNULL = "Y";
	public final static String DBYB_SETTLEMENT_SETCODE_TYPE = "String";
	// 保单号
	public final static String DBYB_SETTLEMENT_NAME_POLICYNO = "保单号";
	public final static String DBYB_SETTLEMENT_STR_POLICYNO = "policyno";
	public final static String DBYB_SETTLEMENT_POLICYNO_LENGTH = "15";
	public final static String DBYB_SETTLEMENT_POLICYNO_ISNULL = "Y";
	public final static String DBYB_SETTLEMENT_POLICYNO_TYPE = "String";
	// 险种代码
	public final static String DBYB_SETTLEMENT_NAME_CLASSCODE = "险种代码";
	public final static String DBYB_SETTLEMENT_STR_CLASSCODE = "classcode";
	public final static String DBYB_SETTLEMENT_CLASSCODE_LENGTH = "6";
	public final static String DBYB_SETTLEMENT_CLASSCODE_ISNULL = "Y";
	public final static String DBYB_SETTLEMENT_CLASSCODE_TYPE = "String";
	// 给付类型码/责任代码
	public final static String DBYB_SETTLEMENT_NAME_DELCODE = "责任代码";
	public final static String DBYB_SETTLEMENT_STR_DELCODE = "delcode";
	public final static String DBYB_SETTLEMENT_DELCODE_LENGTH = "3";
	public final static String DBYB_SETTLEMENT_DELCODE_ISNULL = "Y";
	public final static String DBYB_SETTLEMENT_DELCODE_TYPE = "String";
	// 给付内容码/责任子代码
	public final static String DBYB_SETTLEMENT_NAME_TYPENO = "责任子代码";
	public final static String DBYB_SETTLEMENT_STR_TYPENO = "typeno";
	public final static String DBYB_SETTLEMENT_TYPENO_LENGTH = "2";
	public final static String DBYB_SETTLEMENT_TYPENO_ISNULL = "Y";
	public final static String DBYB_SETTLEMENT_TYPENO_TYPE = "String";
	// 给付金额
	public final static String DBYB_SETTLEMENT_NAME_AMDEL = "给付金额";
	public final static String DBYB_SETTLEMENT_STR_AMDEL = "amdel";
	public final static String DBYB_SETTLEMENT_AMDEL_LENGTH = "15";
	public final static String DBYB_SETTLEMENT_AMDEL_ISNULL = "Y";
	public final static String DBYB_SETTLEMENT_AMDEL_TYPE = "Double";
	/*
	 * 综意险理赔结算单接口常量定义 END
	 */

	/*
	 * 接口保全常量定义 BEGIN
	 */
	// 交易码
	public final static String DBYB_PRESERINFO_NAME_TRANSNO = "交易码";
	public final static String DBYB_PRESERINFO_STR_TRANSNO = "transno";
	public final static String DBYB_PRESERINFO_TRANSNO_LENGTH = "7";
	public final static String DBYB_PRESERINFO_TRANSNO_ISNULL = "Y";
	public final static String DBYB_PRESERINFO_TRANSNO_TYPE = "String";
	// 交易来源
	public final static String DBYB_PRESERINFO_NAME_TRANSSOURCE = "交易来源";
	public final static String DBYB_PRESERINFO_STR_TRANSSOURCE = "transsource";
	public final static String DBYB_PRESERINFO_TRANSSOURCE_LENGTH = "2";
	public final static String DBYB_PRESERINFO_TRANSSOURCE_ISNULL = "Y";
	public final static String DBYB_PRESERINFO_TRANSSOURCE_TYPE = "String";
	// 交易日期
	public final static String DBYB_PRESERINFO_NAME_DATE = "交易日期";
	public final static String DBYB_PRESERINFO_STR_DATE = "date";
	public final static String DBYB_PRESERINFO_DATE_LENGTH = "10";
	public final static String DBYB_PRESERINFO_DATE_ISNULL = "Y";
	public final static String DBYB_PRESERINFO_DATE_TYPE = "Date";
	// 交易时间
	public final static String DBYB_PRESERINFO_NAME_TIME = "交易时间";
	public final static String DBYB_PRESERINFO_STR_TIME = "time";
	public final static String DBYB_PRESERINFO_TIME_LENGTH = "8";
	public final static String DBYB_PRESERINFO_TIME_ISNULL = "Y";
	public final static String DBYB_PRESERINFO_TIME_TYPE = "Time";
	// 应答码
	public final static String DBYB_PRESERINFO_NAME_RETNO = "应答码";
	public final static String DBYB_PRESERINFO_STR_RETNO = "retno";
	public final static String DBYB_PRESERINFO_RETNO_LENGTH = "7";
	public final static String DBYB_PRESERINFO_RETNO_ISNULL = "Y";
	public final static String DBYB_PRESERINFO_RETNO_TYPE = "String";
	// 应答信息
	public final static String DBYB_PRESERINFO_NAME_RETMESG = "应答信息";
	public final static String DBYB_PRESERINFO_STR_RETMESG = "retmesg";
	public final static String DBYB_PRESERINFO_RETMESG_LENGTH = "57";
	public final static String DBYB_PRESERINFO_RETMESG_ISNULL = "N";
	public final static String DBYB_PRESERINFO_RETMESG_TYPE = "String";
	// 鉴定码
	public final static String DBYB_PRESERINFO_NAME_MAC = "鉴定码";
	public final static String DBYB_PRESERINFO_STR_MAC = "mac";
	public final static String DBYB_PRESERINFO_MAC_LENGTH = "8";
	public final static String DBYB_PRESERINFO_MAC_ISNULL = "N";
	public final static String DBYB_PRESERINFO_MAC_TYPE = "String";
	// 当前页数
	public final static String DBYB_PRESERINFO_NAME_CURRPAGE = "当前页数";
	public final static String DBYB_PRESERINFO_STR_CURRPAGE = "currpage";
	public final static String DBYB_PRESERINFO_CURRPAGE_LENGTH = "3";
	public final static String DBYB_PRESERINFO_CURRPAGE_ISNULL = "N";
	public final static String DBYB_PRESERINFO_CURRPAGE_TYPE = "Number";
	// 总页数
	public final static String DBYB_PRESERINFO_NAME_ALLPAGE = "总页数";
	public final static String DBYB_PRESERINFO_STR_ALLPAGE = "allpage";
	public final static String DBYB_PRESERINFO_ALLPAGE_LENGTH = "3";
	public final static String DBYB_PRESERINFO_ALLPAGE_ISNULL = "N";
	public final static String DBYB_PRESERINFO_ALLPAGE_TYPE = "Number";
	// 每页记录数
	public final static String DBYB_PRESERINFO_NAME_RECNUM = "每页记录数";
	public final static String DBYB_PRESERINFO_STR_RECNUM = "recnum";
	public final static String DBYB_PRESERINFO_RECNUM_LENGTH = "3";
	public final static String DBYB_PRESERINFO_RECNUM_ISNULL = "N";
	public final static String DBYB_PRESERINFO_RECNUM_TYPE = "Number";
	// 保单号
	public final static String DBYB_PRESERINFO_NAME_POLICYNO = "保单号";
	public final static String DBYB_PRESERINFO_STR_POLICYNO = "sPolicyno";
	public final static String DBYB_PRESERINFO_POLICYNO_LENGTH = "15";
	public final static String DBYB_PRESERINFO_POLICYNO_ISNULL = "Y";
	public final static String DBYB_PRESERINFO_POLICYNO_TYPE = "String";
	// 险种代码
	public final static String DBYB_PRESERINFO_NAME_CLASSCODE = "险种代码";
	public final static String DBYB_PRESERINFO_STR_CLASSCODE = "sClasscode";
	public final static String DBYB_PRESERINFO_CLASSCODE_LENGTH = "6";
	public final static String DBYB_PRESERINFO_CLASSCODE_ISNULL = "Y";
	public final static String DBYB_PRESERINFO_CLASSCODE_TYPE = "String";
	// 保全变更类型
	public final static String DBYB_PRESERINFO_NAME_CHANGEID = "保全变更类型";
	public final static String DBYB_PRESERINFO_STR_CHANGEID = "sChangeid";
	public final static String DBYB_PRESERINFO_CHANGEID_LENGTH = "2";
	public final static String DBYB_PRESERINFO_CHANGEID_ISNULL = "Y";
	public final static String DBYB_PRESERINFO_CHANGEID_TYPE = "String";
	// 变更时间
	public final static String DBYB_PRESERINFO_NAME_APPDATE = "变更时间";
	public final static String DBYB_PRESERINFO_STR_APPDATE = "sAppdate";
	public final static String DBYB_PRESERINFO_APPDATE_LENGTH = "10";
	public final static String DBYB_PRESERINFO_APPDATE_ISNULL = "Y";
	public final static String DBYB_PRESERINFO_APPDATE_TYPE = "String";
	// 批单号
	public final static String DBYB_PRESERINFO_NAME_ENDORNO = "批单号";
	public final static String DBYB_PRESERINFO_STR_ENDORNO = "sEndorno";
	public final static String DBYB_PRESERINFO_ENDORNO_LENGTH = "15";
	public final static String DBYB_PRESERINFO_ENDORNO_ISNULL = "Y";
	public final static String DBYB_PRESERINFO_ENDORNO_TYPE = "String";
	// 变更前总人数
	public final static String DBYB_PRESERINFO_NAME_ALLNUM = "变更前总人数";
	public final static String DBYB_PRESERINFO_STR_ALLNUM = "sAllnum";
	public final static String DBYB_PRESERINFO_ALLNUM_LENGTH = "13";
	public final static String DBYB_PRESERINFO_ALLNUM_ISNULL = "Y";
	public final static String DBYB_PRESERINFO_ALLNUM_TYPE = "String";
	// 变更前总保费
	public final static String DBYB_PRESERINFO_NAME_STMOUNT = "变更前总保费";
	public final static String DBYB_PRESERINFO_STR_STMOUNT = "sTmount";
	public final static String DBYB_PRESERINFO_STMOUNT_LENGTH = "15";
	public final static String DBYB_PRESERINFO_STMOUNT_ISNULL = "Y";
	public final static String DBYB_PRESERINFO_STMOUNT_TYPE = "String";
	// 保全增减人数
	public final static String DBYB_PRESERINFO_NAME_SMODNUM = "变更人数";
	public final static String DBYB_PRESERINFO_STR_SMODNUM = "sModnum";
	public final static String DBYB_PRESERINFO_SMODNUM_LENGTH = "13";
	public final static String DBYB_PRESERINFO_SMODNUM_ISNULL = "Y";
	public final static String DBYB_PRESERINFO_SMODNUM_TYPE = "String";
	// 保全变更金额
	public final static String DBYB_PRESERINFO_NAME_SMODMOUNT = "变更金额";
	public final static String DBYB_PRESERINFO_STR_SMODMOUNT = "sModmount";
	public final static String DBYB_PRESERINFO_SMODMOUNT_LENGTH = "15";
	public final static String DBYB_PRESERINFO_SMODMOUNT_ISNULL = "Y";
	public final static String DBYB_PRESERINFO_SMODMOUNT_TYPE = "String";

	public final static String DBYB_PRESERINFO_ADD_PERSON = "1";// 保全表T_preser_info增加被保险人字段值定义
	public final static String DBYB_PRESERINFO_REDUCE_PERSON = "2";// 保全表T_preser_info减少被保险人字段值定义
	public final static String DBYB_PRESERINFO_INTERFACE_ADD_PERSON = "52";// 接口保全增加被保险人定义字段值
	public final static String DBYB_PRESERINFO_INTERFACE_REDUCE_PERSON = "53";// 接口保全减少被保险人定义字段值

	/*
	 * 接口保全接口常量定义 END
	 */

	/*
	 * 应缴记录常量定义 BEGIN
	 */
	// 交易码
	public final static String DBYB_PAYABLEINFO_NAME_TRANSNO = "交易码";
	public final static String DBYB_PAYABLEINFO_STR_TRANSNO = "transno";
	public final static String DBYB_PAYABLEINFO_TRANSNO_LENGTH = "7";
	public final static String DBYB_PAYABLEINFO_TRANSNO_ISNULL = "Y";
	public final static String DBYB_PAYABLEINFO_TRANSNO_TYPE = "String";
	// 交易来源
	public final static String DBYB_PAYABLEINFO_NAME_TRANSSOURCE = "交易来源";
	public final static String DBYB_PAYABLEINFO_STR_TRANSSOURCE = "transsource";
	public final static String DBYB_PAYABLEINFO_TRANSSOURCE_LENGTH = "2";
	public final static String DBYB_PAYABLEINFO_TRANSSOURCE_ISNULL = "Y";
	public final static String DBYB_PAYABLEINFO_TRANSSOURCE_TYPE = "String";
	// 交易日期
	public final static String DBYB_PAYABLEINFO_NAME_DATE = "交易日期";
	public final static String DBYB_PAYABLEINFO_STR_DATE = "date";
	public final static String DBYB_PAYABLEINFO_DATE_LENGTH = "10";
	public final static String DBYB_PAYABLEINFO_DATE_ISNULL = "Y";
	public final static String DBYB_PAYABLEINFO_DATE_TYPE = "Date";
	// 交易时间
	public final static String DBYB_PAYABLEINFO_NAME_TIME = "交易时间";
	public final static String DBYB_PAYABLEINFO_STR_TIME = "time";
	public final static String DBYB_PAYABLEINFO_TIME_LENGTH = "8";
	public final static String DBYB_PAYABLEINFO_TIME_ISNULL = "Y";
	public final static String DBYB_PAYABLEINFO_TIME_TYPE = "Time";
	// 应答码
	public final static String DBYB_PAYABLEINFO_NAME_RETNO = "应答码";
	public final static String DBYB_PAYABLEINFO_STR_RETNO = "retno";
	public final static String DBYB_PAYABLEINFO_RETNO_LENGTH = "7";
	public final static String DBYB_PAYABLEINFO_RETNO_ISNULL = "Y";
	public final static String DBYB_PAYABLEINFO_RETNO_TYPE = "String";
	// 应答信息
	public final static String DBYB_PAYABLEINFO_NAME_RETMESG = "应答信息";
	public final static String DBYB_PAYABLEINFO_STR_RETMESG = "retmesg";
	public final static String DBYB_PAYABLEINFO_RETMESG_LENGTH = "57";
	public final static String DBYB_PAYABLEINFO_RETMESG_ISNULL = "N";
	public final static String DBYB_PAYABLEINFO_RETMESG_TYPE = "String";
	// 鉴定码
	public final static String DBYB_PAYABLEINFO_NAME_MAC = "鉴定码";
	public final static String DBYB_PAYABLEINFO_STR_MAC = "mac";
	public final static String DBYB_PAYABLEINFO_MAC_LENGTH = "8";
	public final static String DBYB_PAYABLEINFO_MAC_ISNULL = "N";
	public final static String DBYB_PAYABLEINFO_MAC_TYPE = "String";
	// 当前页数
	public final static String DBYB_PAYABLEINFO_NAME_CURRPAGE = "当前页数";
	public final static String DBYB_PAYABLEINFO_STR_CURRPAGE = "currpage";
	public final static String DBYB_PAYABLEINFO_CURRPAGE_LENGTH = "3";
	public final static String DBYB_PAYABLEINFO_CURRPAGE_ISNULL = "N";
	public final static String DBYB_PAYABLEINFO_CURRPAGE_TYPE = "Number";
	// 总页数
	public final static String DBYB_PAYABLEINFO_NAME_ALLPAGE = "总页数";
	public final static String DBYB_PAYABLEINFO_STR_ALLPAGE = "allpage";
	public final static String DBYB_PAYABLEINFO_ALLPAGE_LENGTH = "3";
	public final static String DBYB_PAYABLEINFO_ALLPAGE_ISNULL = "N";
	public final static String DBYB_PAYABLEINFO_ALLPAGE_TYPE = "Number";
	// 每页记录数
	public final static String DBYB_PAYABLEINFO_NAME_RECNUM = "每页记录数";
	public final static String DBYB_PAYABLEINFO_STR_RECNUM = "recnum";
	public final static String DBYB_PAYABLEINFO_RECNUM_LENGTH = "3";
	public final static String DBYB_PAYABLEINFO_RECNUM_ISNULL = "N";
	public final static String DBYB_PAYABLEINFO_RECNUM_TYPE = "Number";
	// 保单号
	public final static String DBYB_PAYABLEINFO_NAME_SGPOLICYNO = "团体保单号";
	public final static String DBYB_PAYABLEINFO_STR_SGPOLICYNO = "sGpolicyno";
	public final static String DBYB_PAYABLEINFO_SGPOLICYNO_LENGTH = "15";
	public final static String DBYB_PAYABLEINFO_SGPOLICYNO_ISNULL = "Y";
	public final static String DBYB_PAYABLEINFO_SGPOLICYNO_TYPE = "String";
	// 险种代码
	public final static String DBYB_PAYABLEINFO_NAME_SDOCNO = "批单号";
	public final static String DBYB_PAYABLEINFO_STR_SDOCNO = "sDocno";
	public final static String DBYB_PAYABLEINFO_SDOCNO_LENGTH = "15";
	public final static String DBYB_PAYABLEINFO_SDOCNO_ISNULL = "Y";
	public final static String DBYB_PAYABLEINFO_SDOCNO_TYPE = "String";
	// 保全变更类型
	public final static String DBYB_PAYABLEINFO_NAME_SGRPCODE = "团体客户单号";
	public final static String DBYB_PAYABLEINFO_STR_SGRPCODE = "sGrpcode";
	public final static String DBYB_PAYABLEINFO_SGRPCODE_LENGTH = "18";
	public final static String DBYB_PAYABLEINFO_SGRPCODE_ISNULL = "Y";
	public final static String DBYB_PAYABLEINFO_SGRPCODE_TYPE = "String";
	// 变更时间
	public final static String DBYB_PAYABLEINFO_NAME_SSETCODE = "缴费方式";
	public final static String DBYB_PAYABLEINFO_STR_SSETCODE = "sSetcode";
	public final static String DBYB_PAYABLEINFO_SSETCODE_LENGTH = "1";
	public final static String DBYB_PAYABLEINFO_SSETCODE_ISNULL = "Y";
	public final static String DBYB_PAYABLEINFO_SSETCODE_TYPE = "String";
	// 批单号
	public final static String DBYB_PAYABLEINFO_NAME_SAMOUNT = "缴费金额";
	public final static String DBYB_PAYABLEINFO_STR_SAMOUNT = "sAmount";
	public final static String DBYB_PAYABLEINFO_SAMOUNT_LENGTH = "13";
	public final static String DBYB_PAYABLEINFO_SAMOUNT_ISNULL = "Y";
	public final static String DBYB_PAYABLEINFO_SAMOUNT_TYPE = "String";

	public final static String DBYB_PAYABLEINFO_NAME_SMONEY = "管理费金额";
	public final static String DBYB_PAYABLEINFO_STR_SMONEY = "sMoney";
	public final static String DBYB_PAYABLEINFO_SMONEY_LENGTH = "13";
	public final static String DBYB_PAYABLEINFO_SMONEY_ISNULL = "Y";
	public final static String DBYB_PAYABLEINFO_SMONEY_TYPE = "String";
	// 应缴记录交易码对应值
	public final static String DBYB_PAYABLEINFO_TRANSNO_VALUE = "1208002";

	// 应缴支付方式：现金
	public final static String DBYB_PAYABLEINFO_CASH_PAY_STATUS = "1";

	// 应缴支付方式：支票
	public final static String DBYB_PAYABLEINFO_CHEQUE_PAY_STATUS = "2";

	/*
	 * 应缴记录接口常量定义 END
	 */
	/**
	 * 综意险公用常量定义开始
	 */
	// 交易来源
	public final static String DBYB_PUBLICCONST_TRANSSOURCE_VALUE = "07";
	// 应答码
	public final static String DBYB_PUBLICCONST_RETNO_VALUE = "0000000";
	/**
	 * 综意险公用常量定义结束
	 */

	/**
	 * 供数接口标识定义开始
	 */
	public final static String DATA_SOURCE_WEIJUE = "weijue";
	public final static String DATA_SOURCE_JINGSUAN = "jingsuan";
	public final static String DATA_SOURCE_JIXIAO = "lcmi2jx";
	/**
	 * 供数接口标识定义结束
	 */

	/*
	 * FF0101115接口：领款人信息是否存在 常量定义开始
	 */
	public final static String DBYB_FF0101115IMPL_ID_TYPE_NAME = "ID_TYPE";
	public final static String DBYB_FF0101115IMPL_ID_TYPE_LENGTH = "1";
	public final static String DBYB_FF0101115IMPL_ID_TYPE_ISNULL = "N";
	public final static String DBYB_FF0101115IMPL_ID_TYPE_TYPE = "String";

	public final static String DBYB_FF0101115IMPL_ID_NMBR_NAME = "ID_NMBR";
	public final static String DBYB_FF0101115IMPL_ID_NMBR_LENGTH = "18";
	public final static String DBYB_FF0101115IMPL_ID_NMBR_ISNULL = "N";
	public final static String DBYB_FF0101115IMPL_ID_NMBR_TYPE = "String";

	public final static String DBYB_FF0101115IMPL_BNFCRY_NAME_NAME = "BNFCRY_NAME";
	public final static String DBYB_FF0101115IMPL_BNFCRY_NAME_LENGTH = "90";
	public final static String DBYB_FF0101115IMPL_BNFCRY_NAME_ISNULL = "N";
	public final static String DBYB_FF0101115IMPL_BNFCRY_NAME_TYPE = "String";

	public final static String DBYB_FF0101115IMPL_BANK_CODE_NAME = "BANK_CODE";
	public final static String DBYB_FF0101115IMPL_BANK_CODE_LENGTH = "12";
	public final static String DBYB_FF0101115IMPL_BANK_CODE_ISNULL = "N";
	public final static String DBYB_FF0101115IMPL_BANK_CODE_TYPE = "String";

	public final static String DBYB_FF0101115IMPL_ACCT_NMBR_NAME = "ACCT_NMBR";
	public final static String DBYB_FF0101115IMPL_ACCT_NMBR_LENGTH = "25";
	public final static String DBYB_FF0101115IMPL_ACCT_NMBR_ISNULL = "N";
	public final static String DBYB_FF0101115IMPL_ACCT_NMBR_TYPE = "String";
	/*
	 * FF0101115接口：领款人信息是否存在 常量定义结束
	 */

	/*
	 * FF0100234接口：创建客户的账户信息 常量定义开始
	 */
	public final static String DBYB_FF0100234IMPL_ID_TYPE_NAME = "ID_TYPE";
	public final static String DBYB_FF0100234IMPL_ID_TYPE_LENGTH = "1";
	public final static String DBYB_FF0100234IMPL_ID_TYPE_ISNULL = "N";
	public final static String DBYB_FF0100234IMPL_ID_TYPE_TYPE = "String";

	public final static String DBYB_FF0100234IMPL_ID_NMBR_NAME = "ID_NMBR";
	public final static String DBYB_FF0100234IMPL_ID_NMBR_LENGTH = "18";
	public final static String DBYB_FF0100234IMPL_ID_NMBR_ISNULL = "N";
	public final static String DBYB_FF0100234IMPL_ID_NMBR_TYPE = "String";

	public final static String DBYB_FF0100234IMPL_OPER_TYPE_NAME = "OPER_TYPE";
	public final static String DBYB_FF0100234IMPL_OPER_TYPE_LENGTH = "1";
	public final static String DBYB_FF0100234IMPL_OPER_TYPE_ISNULL = "N";
	public final static String DBYB_FF0100234IMPL_OPER_TYPE_TYPE = "String";

	public final static String DBYB_FF0100234IMPL_OLDACCT_INFO_NAME = "OLDACCT_INFO";
	public final static String DBYB_FF0100234IMPL_OLDACCT_INFO_LENGTH = "77";
	public final static String DBYB_FF0100234IMPL_OLDACCT_INFO_ISNULL = "Y";
	public final static String DBYB_FF0100234IMPL_OLDACCT_INFO_TYPE = "String";

	public final static String DBYB_FF0100234IMPL_BANK_CODEO_NAME = "BANK_CODE";
	public final static String DBYB_FF0100234IMPL_BANK_CODE_LENGTH = "12";
	public final static String DBYB_FF0100234IMPL_BANK_CODE_ISNULL = "N";
	public final static String DBYB_FF0100234IMPL_BANK_CODE_TYPE = "String";

	public final static String DBYB_FF0100234IMPL_ACCT_NMBR_NAME = "ACCT_NMBR";
	public final static String DBYB_FF0100234IMPL_ACCT_NMBR_LENGTH = "25";
	public final static String DBYB_FF0100234IMPL_ACCT_NMBR_ISNULL = "N";
	public final static String DBYB_FF0100234IMPL_ACCT_NMBR_TYPE = "String";

	public final static String DBYB_FF0100234IMPL_ACCT_NAME_NAME = "ACCT_NAME";
	public final static String DBYB_FF0100234IMPL_ACCT_NAME_LENGTH = "40";
	public final static String DBYB_FF0100234IMPL_ACCT_NAME_ISNULL = "N";
	public final static String DBYB_FF0100234IMPL_ACCT_NAME_TYPE = "String";

	public final static String DBYB_FF0100234IMPL_expiry_date_NAME = "expiry_date";
	public final static String DBYB_FF0100234IMPL_expiry_date_LENGTH = "10";
	public final static String DBYB_FF0100234IMPL_expiry_date_ISNULL = "Y";
	public final static String DBYB_FF0100234IMPL_expiry_date_TYPE = "String";
	/*
	 * FF0100234接口：创建客户的账户信息 常量定义结束
	 */

	/*
	 * 个人结算单
	 */
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sSettleno_NAME = "sSettleno";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sSettleno_LENGTH = "15";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sSettleno_ISNULL = "N";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sSettleno_TYPE = "String";

	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sPidType_NAME = "sPidType";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sPidType_LENGTH = "1";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sPidType_ISNULL = "N";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sPidType_TYPE = "String";

	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sPid_NAME = "sPid";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sPid_LENGTH = "50";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sPid_ISNULL = "N";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sPid_TYPE = "String";

	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sSetcode_NAME = "sSetcode";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sSetcode_LENGTH = "1";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sSetcode_ISNULL = "N";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sSetcode_TYPE = "String";

	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sPolicyno_NAME = "sPolicyno";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sPolicyno_LENGTH = "15";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sPolicyno_ISNULL = "N";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sPolicyno_TYPE = "String";

	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sClasscode_NAME = "sClasscode";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sClasscode_LENGTH = "6";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sClasscode_ISNULL = "N";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sClasscode_TYPE = "String";

	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sBankCode_NAME = "sBankCode";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sBankCode_LENGTH = "32";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sBankCode_ISNULL = "N";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sBankCode_TYPE = "String";

	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sBankAccount_NAME = "sBankAccount";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sBankAccount_LENGTH = "32";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sBankAccount_ISNULL = "N";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sBankAccount_TYPE = "String";

	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sDelcode_NAME = "sDelcode";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sDelcode_LENGTH = "3";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sDelcode_ISNULL = "N";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sDelcode_TYPE = "String";

	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sTypeno_NAME = "sTypeno";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sTypeno_LENGTH = "2";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sTypeno_ISNULL = "N";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sTypeno_TYPE = "String";

	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sAmdel_NAME = "sAmdel";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sAmdel_LENGTH = "15";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sAmdel_ISNULL = "N";
	public final static String DBYB_ZYXPERSONSETTLEMENTIMPL_sAmdel_TYPE = "BigDecimal";
	/*
	 * 个人结算单结束
	 */

	/*
	 * 对外支付开始
	 */
	// 团体保单号
	public final static String DBYB_EXTERNALPAYMENT_sGpolicyno_NAME = "sGpolicyno";
	public final static String DBYB_EXTERNALPAYMENT_sGpolicyno_LENGTH = "15";
	public final static String DBYB_EXTERNALPAYMENT_sGpolicyno_ISNULL = "N";
	public final static String DBYB_EXTERNALPAYMENT_sGpolicyno_TYPE = "String";
	// 批单号
	public final static String DBYB_EXTERNALPAYMENT_sDocno_NAME = "sDocno";
	public final static String DBYB_EXTERNALPAYMENT_sDocno_LENGTH = "15";
	public final static String DBYB_EXTERNALPAYMENT_sDocno_ISNULL = "N";
	public final static String DBYB_EXTERNALPAYMENT_sDocno_TYPE = "String";
	// 团体客户号
	public final static String DBYB_EXTERNALPAYMENT_sGrpcode_NAME = "sGrpcode";
	public final static String DBYB_EXTERNALPAYMENT_sGrpcode_LENGTH = "15";
	public final static String DBYB_EXTERNALPAYMENT_sGrpcode_ISNULL = "N";
	public final static String DBYB_EXTERNALPAYMENT_sGrpcode_TYPE = "String";
	// 费用类型
	public final static String DBYB_EXTERNALPAYMENT_sPayType_NAME = "sPayType";
	public final static String DBYB_EXTERNALPAYMENT_sPayType_LENGTH = "1";
	public final static String DBYB_EXTERNALPAYMENT_sPayType_ISNULL = "N";
	public final static String DBYB_EXTERNALPAYMENT_sPayType_TYPE = "String";
	// 支出类型
	public final static String DBYB_EXTERNALPAYMENT_sPayCode_NAME = "sPayCode";
	public final static String DBYB_EXTERNALPAYMENT_sPayCode_LENGTH = "1";
	public final static String DBYB_EXTERNALPAYMENT_sPayCode_ISNULL = "N";
	public final static String DBYB_EXTERNALPAYMENT_sPayCode_TYPE = "String";
	// 缴费方式
	public final static String DBYB_EXTERNALPAYMENT_sPayTypes_NAME = "sPayTypes";
	public final static String DBYB_EXTERNALPAYMENT_sPayTypes_LENGTH = "1";
	public final static String DBYB_EXTERNALPAYMENT_sPayTypes_ISNULL = "N";
	public final static String DBYB_EXTERNALPAYMENT_sPayTypes_TYPE = "String";
	// 缴费金额
	public final static String DBYB_EXTERNALPAYMENT_sAmount_NAME = "sAmount";
	public final static String DBYB_EXTERNALPAYMENT_sAmount_LENGTH = "13";
	public final static String DBYB_EXTERNALPAYMENT_sAmount_ISNULL = "N";
	public final static String DBYB_EXTERNALPAYMENT_sAmount_TYPE = "BigDecimal";
	// 银行代码
	public final static String DBYB_EXTERNALPAYMENT_sBankCode_NAME = "sBankCode";
	public final static String DBYB_EXTERNALPAYMENT_sBankCode_LENGTH = "15";
	public final static String DBYB_EXTERNALPAYMENT_sBankCode_ISNULL = "Y";
	public final static String DBYB_EXTERNALPAYMENT_sBankCode_TYPE = "String";
	// 银行账号
	public final static String DBYB_EXTERNALPAYMENT_sBankAccount_NAME = "sBankAccount";
	public final static String DBYB_EXTERNALPAYMENT_sBankAccount_LENGTH = "40";
	public final static String DBYB_EXTERNALPAYMENT_sBankAccount_ISNULL = "Y";
	public final static String DBYB_EXTERNALPAYMENT_sBankAccount_TYPE = "String";
	// 损失(抵消)金额
	public final static String DBYB_EXTERNALPAYMENT_sBeAmount_NAME = "sBeAmount";
	public final static String DBYB_EXTERNALPAYMENT_sBeAmount_LENGTH = "13";
	public final static String DBYB_EXTERNALPAYMENT_sBeAmount_ISNULL = "Y";
	public final static String DBYB_EXTERNALPAYMENT_sBeAmount_TYPE = "BigDecimal";
	/*
	 * 对外支付结束
	 */

	/*
	 * 人管系统供数开始
	 */
	public final static String fileNameHtrgProjectSumreport = "htrg_project_sumreport_";
	public final static String fileNameHtrgPolicySum = "htrg_policy_sum_";
	public final static String fileNameHtrgProjectReprt = "htrg_project_reprt_";
	// 保全文件名前缀 @author zengbiao 2014/07/17
	public final static String htrgPersonSum_prefix = "htrg_person_sum_";
	// 太保寿险编码 @author zengbiao 2014/07/17
	public final static String cpic_life_code = "000015";

	public static final String HTRG_IMPORT_PERSON = "htrg_import_person_";
	public static final String HTRG_PRESERVATION_RES = "htrg_preservation_res_";
	public static final String HTRG_INDEM_ESTIME = "htrg_indem_estime_";

	/**
	 * @author zengbiao
	 * 2014/08/20
	 * 	创建客户信息和代开户信息start
	 */
	public final static String DBYB_FF0100215_PID = "pid";
	public final static String DBYB_FF0100215_PID_LENGTH = "18";
	public final static String DBYB_FF0100215_PID_ISNULL = "Y";
	public final static String DBYB_FF0100215_PID_TYPE = "String";

	public final static String DBYB_FF0100215_NAME = "name";
	public final static String DBYB_FF0100215_NAME_LENGTH = "40";
	public final static String DBYB_FF0100215_NAME_ISNULL = "Y";
	public final static String DBYB_FF0100215_NAME_TYPE = "String";

	public final static String DBYB_FF0100215_SEX = "sex";
	public final static String DBYB_FF0100215_SEX_LENGTH = "1";
	public final static String DBYB_FF0100215_SEX_ISNULL = "Y";
	public final static String DBYB_FF0100215_SEX_TYPE = "String";

	public final static String DBYB_FF0100215_PHONE = "phone";
	public final static String DBYB_FF0100215_PHONE_LENGTH = "30";
	public final static String DBYB_FF0100215_PHONE_ISNULL = "Y";
	public final static String DBYB_FF0100215_PHONE_TYPE = "String";

	public final static String DBYB_FF0100215_ACCTNMBR = "acctnmbr";
	public final static String DBYB_FF0100215_ACCTNMBR_LENGTH = "25";
	public final static String DBYB_FF0100215_ACCTNMBR_ISNULL = "Y";
	public final static String DBYB_FF0100215_ACCTNMBR_TYPE = "String";

	public final static String DBYB_FF0100215_BANKCODE = "bankcode";
	public final static String DBYB_FF0100215_BANKCODE_LENGTH = "12";
	public final static String DBYB_FF0100215_BANKCODE_ISNULL = "Y";
	public final static String DBYB_FF0100215_BANKCODE_TYPE = "String";

	public final static String DBYB_FF0100215_PASSPORT_TYPE = "passportType";
	public final static String DBYB_FF0100215_PASSPORT_TYPE_LENGTH = "1";
	public final static String DBYB_FF0100215_PASSPORT_TYPE_ISNULL = "Y";
	public final static String DBYB_FF0100215_PASSPORT_TYPE_TYPE = "String";

	public final static String DBYB_FF0100215_ACCTNAME = "acctName";
	public final static String DBYB_FF0100215_ACCTNAME_LENGTH = "40";
	public final static String DBYB_FF0100215_ACCTNAME_ISNULL = "Y";
	public final static String DBYB_FF0100215_ACCTNAME_TYPE = "String";

	public final static String DBYB_FF0100215_GJDM = "gjdm";
	public final static String DBYB_FF0100215_GJDM_LENGTH = "3";
	public final static String DBYB_FF0100215_GJDM_ISNULL = "Y";
	public final static String DBYB_FF0100215_GJDM_TYPE = "String";

	public final static String DBYB_FF0100215_professionCode = "professionCode";
	public final static String DBYB_FF0100215_professionCode_LENGTH = "7";
	public final static String DBYB_FF0100215_professionCode_ISNULL = "Y";
	public final static String DBYB_FF0100215_professionCode_TYPE = "String";

	public final static String DBYB_FF0100215_filtaleCode = "filtaleCode";
	public final static String DBYB_FF0100215_filtaleCode_LENGTH = "14";
	public final static String DBYB_FF0100215_filtaleCode_ISNULL = "Y";
	public final static String DBYB_FF0100215_filtaleCode_TYPE = "String";

	public final static String DBYB_FF0100215_branchCode = "branchCode";
	public final static String DBYB_FF0100215_branchCode_LENGTH = "14";
	public final static String DBYB_FF0100215_branchCode_ISNULL = "Y";
	public final static String DBYB_FF0100215_branchCode_TYPE = "String";

	public final static String DBYB_FF0100215_birthday = "birthday";
	public final static String DBYB_FF0100215_birthday_LENGTH = "10";
	public final static String DBYB_FF0100215_birthday_ISNULL = "Y";
	public final static String DBYB_FF0100215_birthday_TYPE = "String";

	public final static String DBYB_FF0100215_mrrgStatus = "mrrgStatus";
	public final static String DBYB_FF0100215_mrrgStatus_LENGTH = "3";
	public final static String DBYB_FF0100215_mrrgStatus_ISNULL = "Y";
	public final static String DBYB_FF0100215_mrrgStatus_TYPE = "String";

	public final static String DBYB_FF0100215_nation = "nation";
	public final static String DBYB_FF0100215_nation_LENGTH = "2";
	public final static String DBYB_FF0100215_nation_ISNULL = "Y";
	public final static String DBYB_FF0100215_nation_TYPE = "String";

	public final static String DBYB_FF0100215_mobilePhone = "mobilePhone";
	public final static String DBYB_FF0100215_mobilePhone_LENGTH = "30";
	public final static String DBYB_FF0100215_mobilePhone_ISNULL = "Y";
	public final static String DBYB_FF0100215_mobilePhone_TYPE = "String";
	/**
	 * 	创建客户信息和代开户信息end
	 */
	/**
	 * @author zengbiao
	 * 2014/08/21
	 * 	综意险验证账号信息start
	 */
	public final static String DBYB_ZYX1222029_sAcctno = "sAcctno";
	public final static String DBYB_ZYX1222029_sAcctno_LENGTH = "30";
	public final static String DBYB_ZYX1222029_sAcctno_ISNULL = "Y";
	public final static String DBYB_ZYX1222029_sAcctno_TYPE = "String";

	public final static String DBYB_ZYX1222029_sIdno = "sIdno";
	public final static String DBYB_ZYX1222029_sIdno_LENGTH = "18";
	public final static String DBYB_ZYX1222029_sIdno_ISNULL = "Y";
	public final static String DBYB_ZYX1222029_sIdno_TYPE = "String";
	/**
	 * 	综意险验证账号信息end
	 */
	/**
	 * @author zengbiao
	 * 2014/08/27
	 * 	FF判断账户信息start
	 */
	public final static String DBYB_FF0100153_id_type = "id_type";
	public final static String DBYB_FF0100153_id_type_LENGTH = "1";
	public final static String DBYB_FF0100153_id_type_ISNULL = "Y";
	public final static String DBYB_FF0100153_id_type_TYPE = "String";

	public final static String DBYB_FF0100153_id_nmbr = "id_nmbr";
	public final static String DBYB_FF0100153_id_nmbr_LENGTH = "18";
	public final static String DBYB_FF0100153_id_nmbr_ISNULL = "Y";
	public final static String DBYB_FF0100153_id_nmbr_TYPE = "String";

	/**
	 * @author zengbiao
	 * 2014/08/27
	 * 	FF判断账户信息end
	 */
	/*
	 * 人管系统供数结束
	 */

	/*
	 * 保全信息常量定义 BEGIN zhangwei
	 */
	// 交易码
	public final static String DBYB_PRESERVEINFO_NAME_TRANSNO = "交易码";
	public final static String DBYB_PRESERVEINFO_STR_TRANSNO = "transno";
	public final static String DBYB_PRESERVEINFO_TRANSNO_LENGTH = "7";
	public final static String DBYB_PRESERVEINFO_TRANSNO_ISNULL = "Y";
	public final static String DBYB_PRESERVEINFO_TRANSNO_TYPE = "String";
	// 交易来源
	public final static String DBYB_PRESERVEINFO_NAME_TRANSSOURCE = "交易来源";
	public final static String DBYB_PRESERVEINFO_STR_TRANSSOURCE = "transsource";
	public final static String DBYB_PRESERVEINFO_TRANSSOURCE_LENGTH = "2";
	public final static String DBYB_PRESERVEINFO_TRANSSOURCE_ISNULL = "Y";
	public final static String DBYB_PRESERVEINFO_TRANSSOURCE_TYPE = "String";
	// 交易日期
	public final static String DBYB_PRESERVEINFO_NAME_DATE = "交易日期";
	public final static String DBYB_PRESERVEINFO_STR_DATE = "date";
	public final static String DBYB_PRESERVEINFO_DATE_LENGTH = "10";
	public final static String DBYB_PRESERVEINFO_DATE_ISNULL = "Y";
	public final static String DBYB_PRESERVEINFO_DATE_TYPE = "Date";
	// 交易时间
	public final static String DBYB_PRESERVEINFO_NAME_TIME = "交易时间";
	public final static String DBYB_PRESERVEINFO_STR_TIME = "time";
	public final static String DBYB_PRESERVEINFO_TIME_LENGTH = "8";
	public final static String DBYB_PRESERVEINFO_TIME_ISNULL = "Y";
	public final static String DBYB_PRESERVEINFO_TIME_TYPE = "Time";
	// 应答码
	public final static String DBYB_PRESERVEINFO_NAME_RETNO = "应答码";
	public final static String DBYB_PRESERVEINFO_STR_RETNO = "retno";
	public final static String DBYB_PRESERVEINFO_RETNO_LENGTH = "7";
	public final static String DBYB_PRESERVEINFO_RETNO_ISNULL = "Y";
	public final static String DBYB_PRESERVEINFO_RETNO_TYPE = "String";
	// 应答信息
	public final static String DBYB_PRESERVEINFO_NAME_RETMESG = "应答信息";
	public final static String DBYB_PRESERVEINFO_STR_RETMESG = "retmesg";
	public final static String DBYB_PRESERVEINFO_RETMESG_LENGTH = "57";
	public final static String DBYB_PRESERVEINFO_RETMESG_ISNULL = "N";
	public final static String DBYB_PRESERVEINFO_RETMESG_TYPE = "String";
	// 鉴定码
	public final static String DBYB_PRESERVEINFO_NAME_MAC = "鉴定码";
	public final static String DBYB_PRESERVEINFO_STR_MAC = "mac";
	public final static String DBYB_PRESERVEINFO_MAC_LENGTH = "8";
	public final static String DBYB_PRESERVEINFO_MAC_ISNULL = "N";
	public final static String DBYB_PRESERVEINFO_MAC_TYPE = "String";
	// 当前页数
	public final static String DBYB_PRESERVEINFO_NAME_CURRPAGE = "当前页数";
	public final static String DBYB_PRESERVEINFO_STR_CURRPAGE = "currpage";
	public final static String DBYB_PRESERVEINFO_CURRPAGE_LENGTH = "3";
	public final static String DBYB_PRESERVEINFO_CURRPAGE_ISNULL = "N";
	public final static String DBYB_PRESERVEINFO_CURRPAGE_TYPE = "Number";
	// 总页数
	public final static String DBYB_PRESERVEINFO_NAME_ALLPAGE = "总页数";
	public final static String DBYB_PRESERVEINFO_STR_ALLPAGE = "allpage";
	public final static String DBYB_PRESERVEINFO_ALLPAGE_LENGTH = "3";
	public final static String DBYB_PRESERVEINFO_ALLPAGE_ISNULL = "N";
	public final static String DBYB_PRESERVEINFO_ALLPAGE_TYPE = "Number";
	// 每页记录数
	public final static String DBYB_PRESERVEINFO_NAME_RECNUM = "每页记录数";
	public final static String DBYB_PRESERVEINFO_STR_RECNUM = "recnum";
	public final static String DBYB_PRESERVEINFO_RECNUM_LENGTH = "3";
	public final static String DBYB_PRESERVEINFO_RECNUM_ISNULL = "N";
	public final static String DBYB_PRESERVEINFO_RECNUM_TYPE = "Number";
	// 保单号
	public final static String DBYB_PRESERVEINFO_NAME_SPOLICYNO = "保单号";
	public final static String DBYB_PRESERVEINFO_STR_SPOLICYNO = "sPolicyno";
	public final static String DBYB_PRESERVEINFO_SPOLICYNO_LENGTH = "15";
	public final static String DBYB_PRESERVEINFO_SPOLICYNO_ISNULL = "Y";
	public final static String DBYB_PRESERVEINFO_SPOLICYNO_TYPE = "String";
	// 险种代码
	public final static String DBYB_PRESERVEINFO_NAME_SCLASSCODE = "险种代码";
	public final static String DBYB_PRESERVEINFO_STR_SCLASSCODE = "sClasscode";
	public final static String DBYB_PRESERVEINFO_SCLASSCODE_LENGTH = "6";
	public final static String DBYB_PRESERVEINFO_SCLASSCODE_ISNULL = "Y";
	public final static String DBYB_PRESERVEINFO_SCLASSCODE_TYPE = "String";
	// 保全变更类型（增人 or 减人）
	public final static String DBYB_PRESERVEINFO_NAME_SCHANGEID = "保全变更类型";
	public final static String DBYB_PRESERVEINFO_STR_SCHANGEID = "sChangeid";
	public final static String DBYB_PRESERVEINFO_SCHANGEID_LENGTH = "2";
	public final static String DBYB_PRESERVEINFO_SCHANGEID_ISNULL = "Y";
	public final static String DBYB_PRESERVEINFO_SCHANGEID_TYPE = "String";
	// 变更时间
	public final static String DBYB_PRESERVEINFO_NAME_SAPPDATE = "变更时间";
	public final static String DBYB_PRESERVEINFO_STR_SAPPDATE = "sAppdate";
	public final static String DBYB_PRESERVEINFO_SAPPDATE_LENGTH = "10";
	public final static String DBYB_PRESERVEINFO_SAPPDATE_ISNULL = "Y";
	public final static String DBYB_PRESERVEINFO_SAPPDATE_TYPE = "String";
	// 批单号
	public final static String DBYB_PRESERVEINFO_NAME_SENDORNO = "批单号";
	public final static String DBYB_PRESERVEINFO_STR_SENDORNO = "sEndorno";
	public final static String DBYB_PRESERVEINFO_SENDORNO_LENGTH = "15";
	public final static String DBYB_PRESERVEINFO_SENDORNO_ISNULL = "Y";
	public final static String DBYB_PRESERVEINFO_SENDORNO_TYPE = "String";
	// 变更前总人数
	public final static String DBYB_PRESERVEINFO_NAME_SALLNUM = "变更前总人数";
	public final static String DBYB_PRESERVEINFO_STR_SALLNUM = "sAllnum";
	public final static String DBYB_PRESERVEINFO_SALLNUM_LENGTH = "13";
	public final static String DBYB_PRESERVEINFO_SALLNUM_ISNULL = "Y";
	public final static String DBYB_PRESERVEINFO_SALLNUM_TYPE = "String";
	// 变更前总费用
	public final static String DBYB_PRESERVEINFO_NAME_STMOUNT = "变更前总费用";
	public final static String DBYB_PRESERVEINFO_STR_STMOUNT = "sTmount";
	public final static String DBYB_PRESERVEINFO_STMOUNT_LENGTH = "15";
	public final static String DBYB_PRESERVEINFO_STMOUNT_ISNULL = "Y";
	public final static String DBYB_PRESERVEINFO_STMOUNT_TYPE = "String";
	// 变更人数
	public final static String DBYB_PRESERVEINFO_NAME_SMODNUM = "变更人数";
	public final static String DBYB_PRESERVEINFO_STR_SMODNUM = "sModnum";
	public final static String DBYB_PRESERVEINFO_SMODNUM_LENGTH = "13";
	public final static String DBYB_PRESERVEINFO_SMODNUM_ISNULL = "Y";
	public final static String DBYB_PRESERVEINFO_SMODNUM_TYPE = "String";
	// 变更金额
	public final static String DBYB_PRESERVEINFO_NAME_SMODMOUNT = "变更金额";
	public final static String DBYB_PRESERVEINFO_STR_SMODMOUNT = "sModmount";
	public final static String DBYB_PRESERVEINFO_SMODMOUNT_LENGTH = "15";
	public final static String DBYB_PRESERVEINFO_SMODMOUNT_ISNULL = "Y";
	public final static String DBYB_PRESERVEINFO_SMODMOUNT_TYPE = "String";

	/*
	 * 期末保全定义
	 * 
	 */
	// 操作员
	public final static String DBYB_TERMINAL_PRESERVEINFO_NAME_OPERNO = "操作员";
	public final static String DBYB_TERMINAL_PRESERVEINFO_STR_OPERNO = "operno";
	public final static String DBYB_TERMINAL_PRESERVEINFO_OPERNO_LENGTH = "10";
	public final static String DBYB_TERMINAL_PRESERVEINFO_OPERNO_ISNULL = "Y";
	public final static String DBYB_TERMINAL_PRESERVEINFO_OPERNO_TYPE = "String";
	// 团体保单号
	public final static String DBYB_TERMINAL_PRESERVEINFO_NAME_GPOLICYNO = "团体保单号";
	public final static String DBYB_TERMINAL_PRESERVEINFO_STR_GPOLICYNO = "gpolicyno";
	public final static String DBYB_TERMINAL_PRESERVEINFO_GPOLICYNO_LENGTH = "15";
	public final static String DBYB_TERMINAL_PRESERVEINFO_GPOLICYNO_ISNULL = "Y";
	public final static String DBYB_TERMINAL_PRESERVEINFO_GPOLICYNO_TYPE = "String";
	// 应收金额
	public final static String DBYB_TERMINAL_PRESERVEINFO_NAME_PAYAMT = "应收金额";
	public final static String DBYB_TERMINAL_PRESERVEINFO_STR_PAYAMT = "payamt";
	public final static String DBYB_TERMINAL_PRESERVEINFO_PAYAMT_LENGTH = "12";
	public final static String DBYB_TERMINAL_PRESERVEINFO_PAYAMT_ISNULL = "Y";
	public final static String DBYB_TERMINAL_PRESERVEINFO_PAYAMT_TYPE = "String";
	// 实收金额
	public final static String DBYB_TERMINAL_PRESERVEINFO_NAME_RETAMT = "实收金额";
	public final static String DBYB_TERMINAL_PRESERVEINFO_STR_RETAMT = "retamt";
	public final static String DBYB_TERMINAL_PRESERVEINFO_RETAMT_LENGTH = "12";
	public final static String DBYB_TERMINAL_PRESERVEINFO_RETAMT_ISNULL = "Y";
	public final static String DBYB_TERMINAL_PRESERVEINFO_RETAMT_TYPE = "String";
	// 批单号
	public final static String DBYB_TERMINAL_PRESERVEINFO_NAME_DOCNO = "批单号";
	public final static String DBYB_TERMINAL_PRESERVEINFO_STR_DOCNO = "docno";
	public final static String DBYB_TERMINAL_PRESERVEINFO_DOCNO_LENGTH = "15";
	public final static String DBYB_TERMINAL_PRESERVEINFO_DOCNO_ISNULL = "Y";
	public final static String DBYB_TERMINAL_PRESERVEINFO_DOCNO_TYPE = "String";
	// 确认保费
	public final static String DBYB_TERMINAL_PRESERVEINFO_NAME_COMAMT = "确认保费";
	public final static String DBYB_TERMINAL_PRESERVEINFO_STR_COMAMT = "comamt";
	public final static String DBYB_TERMINAL_PRESERVEINFO_COMAMT_LENGTH = "12";
	public final static String DBYB_TERMINAL_PRESERVEINFO_COMAMT_ISNULL = "Y";
	public final static String DBYB_TERMINAL_PRESERVEINFO_COMAMT_TYPE = "String";
	// 退费金额
	public final static String DBYB_TERMINAL_PRESERVEINFO_NAME_REFAMT = "退费金额";
	public final static String DBYB_TERMINAL_PRESERVEINFO_STR_REFAMT = "refamt";
	public final static String DBYB_TERMINAL_PRESERVEINFO_REFAMT_LENGTH = "12";
	public final static String DBYB_TERMINAL_PRESERVEINFO_REFAMT_ISNULL = "Y";
	public final static String DBYB_TERMINAL_PRESERVEINFO_REFAMT_TYPE = "String";

	/*
	 * 保全信息常量定义 END
	 */

	/*
	 * 风险调节基金常量定义开始
	 */
	public final static String DBYB_RiskRegulationFund_treatyNumber_length = "15";
	public final static String DBYB_RiskRegulationFund_settleNumber_length = "15";
	public final static String DBYB_RiskRegulationFund_productCode_length = "6";
	public final static String DBYB_RiskRegulationFund_policyNumber_length = "15";
	public final static String DBYB_RiskRegulationFund_riskRegulationCost_length = "16";
	public final static String DBYB_RiskRegulationFund_paymentType_length = "2";
	public final static String DBYB_RiskRegulationFund_riskRegulationType_length = "3";
	public final static String DBYB_RiskRegulationFund_riskRegulationYear_length = "10";
	public final static String DBYB_RiskRegulationFund_filialeCode_length = "14";
	public final static String DBYB_RiskRegulationFund_branchCode_length = "14";
	public final static String DBYB_RiskRegulationFund_operator_length = "8";
	public final static String DBYB_RiskRegulationFund_groupCode_length = "18";
	public final static String DBYB_RiskRegulationFund_backSettleNumber_length = "15";

	/*
	 * 风险调节基金常量定义结束
	 */

	public static String getZYXRetrunErrorMsg(Map<String, ArrayList<String>> rs) {
		String errorMsg = "";
		for (Map.Entry<String, ArrayList<String>> entry : rs.entrySet()) {
			/**
			 * 看前面对校验结果的信息封转虽然是以一个集合的形式来存放的，但是其实只是一个字符串，因此直接采用以下方式获取，不多嵌套循环了，
			 * 如果后续封转有改动直接把下面注释掉的代码放开，把现在这块代码去掉即可。
			 */
			String value = entry.getValue().get(0);
			if (!"OK".equals(value)) {
				if (!"".equals(errorMsg)) {
					errorMsg += ";";
				}
				errorMsg += value;
			}
			/*
			 * for(String value : entry.getValue()){
			 * 
			 * if(!"OK".equals(value)){ if(!"".equals(errorMsg)){ errorMsg +=";"; } errorMsg
			 * += value; } }
			 */
		}
		return errorMsg;
	}
}

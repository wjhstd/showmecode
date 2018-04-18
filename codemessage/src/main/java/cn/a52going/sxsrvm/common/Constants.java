package cn.a52going.sxsrvm.common;

/**
 * 
 * <p>
 * <strong> Description:</strong>
 * </p>
 * <p>
 * <strong> Copyright:</strong>&copy2009 HT
 * </p>
 * <p>
 * <strong> Company:</strong>上海华腾软件系统有限公司
 * </p>
 * 
 * @author tobba.yy
 * @version 1.0
 */

public class Constants {

    // ////////////////////////
    // 从这里开始定义常用字符
    // ////////////////////////
    /**
     * 字符短线 "-"
     */
    public static final String S_FLUSH = "-";

    /**
     * 字符 下划线 "_"
     */
    public static final String S_DOWNLINE = "_";

    /**
     * 字符 空格 " "
     */
    public static final String S_SPACE = " ";

    /**
     * 字符 空字符串 ""
     */
    public static final String S_BLANK = "";

    /**
     * 字符 句点 "."
     */
    public static final String S_DOT = ".";

    /**
     * 字符 逗号 ","
     */
    public static final String S_COMMA = ",";

    /**
     * 字符 HTML换行 "<br>
     * "
     * 
     */
    public static final String S_HTML_BR = "<br>";

    /**
     * 字符 换行 "\n"
     */
    public static final String S_ENTER = "\n";

    /**
     * 字符 等号 "="
     */
    public static final String S_EQUAL = "=";

    /**
     * 字符 竖线分隔符 "|"
     */
    public static final String S_COLUMN = "|";

    /**
     * 字符 冒号 ":"
     */
    public static final String S_KEYVALUE = ":";

    /**
     * 字符 分号 ";"
     */
    public static final String S_ROW = ";";

    /**
     * 字符 文本文档后缀 ".txt"
     */
    public static final String S_SUB_TXT = ".txt";

    /**
     * 字符 点正斜杠 "./"
     */
    public static final String S_SEP = "./";

    /**
     * 字符 Y "Y"
     */
    public static final String S_Y = "Y";

    /**
     * 字符 N "NY"
     */
    public static final String S_N = "N";
    /**
     * 字符 0 "0"
     */
    public static final String S_ZERO = "0";

    /**
     * 字符 1 "1"
     */
    public static final String S_ONE = "1";

    /**
     * 整数 0
     */
    public static final int N_ZERO = 0;

    /**
     * 整数 6
     */
    public static final int N_SIX = 6;

    /**
     *
     */
    public static final char C_0 = '0';

    /**
     *
     */
    public static final char C_1 = '1';

    /**
     *
     */
    public static final char C_2 = '2';

    /**
     *
     */
    public static final char C_3 = '3';

    /**
     *
     */
    public static final char C_4 = '4';

    /**
     *
     */
    public static final char C_5 = '5';

    /**
     *
     */
    public static final char C_6 = '6';

    /**
     *
     */
    public static final char C_7 = '7';

    /**
     *
     */
    public static final char C_8 = '8';

    /**
     *
     */
    public static final char C_9 = '9';

    /**
     *
     */
    public static final char C_SPACE = ' ';

    // ////////////////////////
    //
    // ////////////////////////
    /**
     * 字符XML文件后缀 ".xml"
     */
    public static final String XML_FILE_POSTFIX = ".xml";

    /**
     * 字符PDF文件后缀 ".pdf"
     */
    public static final String PDF_FILE_POSTFIX = ".pdf";

    /**
     * 字符 EXCEL文件后缀 ".xls"
     */
    public static final String XLS_FILE_POSTFIX = ".xls";

    /**
     * 字符 HTML文件后缀 ".html"
     */
    public static final String HTML_FILE_POSTFIX = ".html";

    /**
     * 字符 数据文件后缀 ".dat"
     */
    public static final String DATA_FILE_POSTFIX = ".dat";

    /**
     * 字符 编码UTF-8 "UTF-8"
     */
    public final static String ENCODE_XML__UTF8 = "UTF-8";

    /**
     * 字符 上下文环境
     */
    public final static String CONTEXT_PATH = "contextPath";

    /**
     * 字符 管理员日志标识
     */
    public static final String LOGGER_ADMIN = "ADMIN";

    /**
     * 字符 柜员日志标识
     */
    public static final String LOGGER_TELLER = "TELLER";

    /**
     * 字符 通信日志标识
     */
    public static final String COMM_TELLER = "COMM";

    /**
     * 字符 JOLT通信标识 请求
     */
    public final static String JOLT_REQ_STRING = "req";

    /**
     * 字符 JOLT通信标识 应答
     */
    public final static String JOLT_RSP_STRING = "rsp";

    /**
     * CMTS通信报文字段属性名称 数据字典编号
     */
    public final static String FIELD_ATTR_NAME_DICINDEX = "dicIndex";

    /**
     * CMTS通信报文字段属性名称 是否转译
     */
    public final static String FIELD_ATTR_NAME_IFTRANS = "ifTrans";

    /**
     * CMTS通信报文字段属性名称 字段长度
     */
    public final static String FIELD_ATTR_NAME_LEN = "len";

    /**
     * CMTS通信报文字段属性名称 字段类型
     */
    public final static String FIELD_ATTR_NAME_TYPE = "type";

    /**
     * 与交易码组合成关联BO的关键字
     */
    public final static String BUS_CODE_PREFIX = "CMET_";

    // //////////////////////////
    // 从这里开始定义交易码相关
    // //////////////////////////
    /**
     * 定义CMTS报文 数据字典
     */
    public final static String BUFFER_NAME = "Package";

    /**
     * 处理平台标志-管理平台
     */
    public final static String PLATFLAG_ADMIN = "A";

    /**
     * 处理平台标志-柜员平台
     */
    public final static String PLATFLAG_TELLER = "T";

    // CMTS报文类型定义
    /**
     * A 字母字符
     */
    public static final String CMTS_FIELDTYPE_A = "A";

    /**
     * N 数字
     */
    public static final String CMTS_FIELDTYPE_N = "N";

    /**
     * S 特殊字符
     */
    public static final String CMTS_FIELDTYPE_S = "S";

    /**
     * AN 字母和数字字符
     */
    public static final String CMTS_FIELDTYPE_AN = "AN";

    /**
     * AS 字母和特殊字符
     */
    public static final String CMTS_FIELDTYPE_AS = "AS";

    /**
     * NS 数字和特殊字符
     */
    public static final String CMTS_FIELDTYPE_NS = "NS";

    /**
     * ANS 字母、数字和特殊字符
     */
    public static final String CMTS_FIELDTYPE_ANS = "ANS";

    /**
     * MM 月份
     */
    public static final String CMTS_FIELDTYPE_MM = "MM";

    /**
     * DD 日期
     */
    public static final String CMTS_FIELDTYPE_DD = "DD";

    /**
     * YY 年份
     */
    public static final String CMTS_FIELDTYPE_YY = "YY";

    /**
     * hh 时
     */
    public static final String CMTS_FIELDTYPE_hh = "hh";

    /**
     * mm 分
     */
    public static final String CMTS_FIELDTYPE_mm = "mm";

    /**
     * ss 秒
     */
    public static final String CMTS_FIELDTYPE_ss = "ss";

    /**
     * VAR 可变长度字段
     */
    public static final String CMTS_FIELDTYPE_VAR = "VAR";

    /**
     * b 数据的二进制表示
     */
    public static final String CMTS_FIELDTYPE_b = "b";

    /**
     *
     */
    public final static String LOG_LINE = "################################################################################";


}

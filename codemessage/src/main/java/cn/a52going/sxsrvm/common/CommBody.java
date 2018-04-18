package cn.a52going.sxsrvm.common;


import java.util.Date;


public class CommBody {

	private String sTransNo; // 7 '交易码
	private String sTransSource = ""; // 2 '交易来源
	private String sDate; // 10 '交易日期
	private String sTime; // 8 '交易时间
	private String sRetNo; // 7 '应答码
	private String sRetMsg = ""; // 57 '应答消息
	private String sMac = ""; // 8 '鉴定码
	private String iCurrPage = "000"; // 3 '当前页数
	private String iAllPage = "000"; // 3 '总页数
	private String iRecNum = "000"; // 3'每页记录数

	private String sPrivData; //私有数据 59位

	private String sSendBuf;
	private String sRcvBuf;
	// 私有的oid
	private String sReturnOid;
	//长护接入交易管理系统的代码：CH
	private static final String SYSTEM_CODE = "CH";
	public CommBody() {
		sTransSource = SYSTEM_CODE;
		sDate = CommonFunction.getTime10fmt2().format(new Date());
		sTime = CommonFunction.getTime8fmt().format(new Date());
		sRetNo = "0000000";
		sRetMsg = "";
		sMac = "";

	}

	/**
	 * GPS返回报文处理中文 sRetMsg中返回报文中文占用字符超长 qingbo.xu 2012.06.04
	 *
	 * @param sPrivData
	 */
	public void PackForGpsReturn(String sPrivData) {

		this.sPrivData = sPrivData;
		MyPackage tp = new MyPackage();

		tp.addHeadItemForGpsReturn(sTransNo, 7);
		tp.addHeadItemForGpsReturn(sTransSource, 2);
		tp.addHeadItemForGpsReturn(sDate, 10);
		tp.addHeadItemForGpsReturn(sTime, 8);
		tp.addHeadItemForGpsReturn(sRetNo, 7);
		tp.addHeadItemForGpsReturn(sRetMsg, 57);
		tp.addHeadItemForGpsReturn(sMac, 8);
		tp.addHeadItemForGpsReturn(iCurrPage, 3);
		tp.addHeadItemForGpsReturn(iAllPage, 3);
		tp.addHeadItemForGpsReturn(iRecNum, 3);
		tp.addHeadItemForGpsReturn(this.sPrivData, this.sPrivData.length());
		this.sSendBuf = tp.getSendbuf();
	}

	public void Pack(String sPrivData) {

		this.sPrivData = sPrivData;
		MyPackage tp = new MyPackage();

		tp.addHeadItem(sTransNo, 7);
		tp.addHeadItem(sTransSource, 2);
		tp.addHeadItem(sDate, 10);
		tp.addHeadItem(sTime, 8);
		tp.addHeadItem(sRetNo, 7);
		tp.addHeadItem(sRetMsg, 57);
		tp.addHeadItem(sMac, 8);
		tp.addHeadItem(iCurrPage, 3);
		tp.addHeadItem(iAllPage, 3);
		tp.addHeadItem(iRecNum, 3);
		tp.addHeadItem(this.sPrivData, this.sPrivData.length());
		this.sSendBuf = tp.getSendbuf();
	}

//	public void execute(String TransNo) {
//		//LOG.ADMININFO(CommBody.class.getName());
//		String flag = BusParaMap.getParDef("envFlag");
////		String flag = "devClient";
//		if("devClient".equals(flag)){
//			sRcvBuf=this.sendReq(TransNo, sSendBuf);
//		}else{
//			EnvokeTrans et = new EnvokeTrans();
//			sRcvBuf = et.ExecuteTrans(TransNo, sSendBuf);
//		}
//		//LOG.ADMININFO("返回数据  sRcvBuf：" + sRcvBuf);
//
//	}

	/**
	 * 通过HttpClient请求远程的服务器协助发送报文

	 */
//	public String sendReq(String TransNo,String SendBuf) {
//		String result="";
//		//LOG.ADMININFO("收到发送报文请求！");
////		String url=SysParam.getSysParam("envUrl");
//		//local run url
////		String url="http://10.196.36.169:7001/WtcEmu/WtcReq";
//		String url=BusParaMap.getParDef("envUrl");
//		HashMap<String, String> params = new HashMap<String, String>();
//    	params.put("TransNo", TransNo);
//    	params.put("sSendBuf", SendBuf);
//    	HttpClientNOSSL httpclient=new HttpClientNOSSL(url);
//    	httpclient.processUTF8(params);
//    	result=new String(httpclient.getResultInputByte());
////		LOG.ADMININFO("返回数据   sRcvBuf：" + result);
//		return result;
//	}



	public String UnPackComm() {
		String sTmpRecv[] = new String[2];
		sTmpRecv[0] = "";
		sTmpRecv[1] = sRcvBuf;
		MyUnPackage tup = new MyUnPackage();
		sTmpRecv = tup.explainBodyItem(sTmpRecv[1], 7);
		sTransNo = sTmpRecv[0];
		sTmpRecv = tup.explainBodyItem(sTmpRecv[1], 2);
		sTransSource = sTmpRecv[0];

		sTmpRecv = tup.explainBodyItem(sTmpRecv[1], 10);
		sDate = sTmpRecv[0];

		sTmpRecv = tup.explainBodyItem(sTmpRecv[1], 8);
		sTime = sTmpRecv[0];
		sTmpRecv = tup.explainBodyItem(sTmpRecv[1], 7);
		sRetNo = sTmpRecv[0];
		sTmpRecv = tup.explainBodyItem(sTmpRecv[1], 57);
		sRetMsg = sTmpRecv[0];
		sTmpRecv = tup.explainBodyItem(sTmpRecv[1], 8);
		sMac = sTmpRecv[0];
		sTmpRecv = tup.explainBodyItem(sTmpRecv[1], 3);
		iCurrPage = sTmpRecv[0];

		sTmpRecv = tup.explainBodyItem(sTmpRecv[1], 3);
		iAllPage = sTmpRecv[0];

		sTmpRecv = tup.explainBodyItem(sTmpRecv[1], 3);
		iRecNum = sTmpRecv[0];
		sPrivData = sTmpRecv[1];

		return sPrivData;
	}

	/**
	 * 在byte数组中间插入字符串
	 * @param a 原字符串
	 * @param n 要插入的位置
	 * @param an 插入后的总长度
	 * @return
	 */
	public String add2(String a,int n,int an){
		byte bb[]=new byte[an];
		byte aa[]=a.getBytes();
		int j=0;
		for(int i=0;i<aa.length;i++){
			if(i==n){
				bb[j++]="3".getBytes()[0];
				bb[j++]="4".getBytes()[0];
				bb[j++]=aa[i];
			}else{
				bb[j++]=aa[i];
			}

		}

//		LOG.ADMININFO(new String(bb));
		return new String(bb);
	}

	public String getsTransNo() {
		return sTransNo;
	}

	public void setsTransNo(String sTransNo) {
		this.sTransNo = sTransNo;
	}

	public String getsTransSource() {
		return sTransSource;
	}

	public void setsTransSource(String sTransSource) {
		this.sTransSource = sTransSource;
	}

	public String getsDate() {
		return sDate;
	}

	public void setsDate(String sDate) {
		this.sDate = sDate;
	}

	public String getsTime() {
		return sTime;
	}

	public void setsTime(String sTime) {
		this.sTime = sTime;
	}

	public String getsRetNo() {
		return sRetNo;
	}

	public void setsRetNo(String sRetNo) {
		this.sRetNo = sRetNo;
	}

	public String getsRetMsg() {
		return sRetMsg;
	}

	public void setsRetMsg(String sRetMsg) {
		this.sRetMsg = sRetMsg;
	}

	public String getsMac() {
		return sMac;
	}

	public void setsMac(String sMac) {
		this.sMac = sMac;
	}

	public String getiCurrPage() {
		return iCurrPage;
	}

	public void setiCurrPage(String iCurrPage) {
		this.iCurrPage = iCurrPage;
	}

	public String getiAllPage() {
		return iAllPage;
	}

	public void setiAllPage(String iAllPage) {
		this.iAllPage = iAllPage;
	}

	public String getiRecNum() {
		return iRecNum;
	}

	public void setiRecNum(String iRecNum) {
		this.iRecNum = iRecNum;
	}

	public String getsPrivData() {
		return sPrivData;
	}

	public void setsPrivData(String sPrivData) {
		this.sPrivData = sPrivData;
	}

	public String getsSendBuf() {
		return sSendBuf;
	}

	public void setsSendBuf(String sSendBuf) {
		this.sSendBuf = sSendBuf;
	}

	public String getsRcvBuf() {
		return sRcvBuf;
	}

	public void setsRcvBuf(String sRcvBuf) {
		this.sRcvBuf = sRcvBuf;
	}

	public String getSPrivData() {
		return sPrivData;
	}

	public String getSRcvBuf() {
		return sRcvBuf;
	}

	public String getSSendBuf() {
		return sSendBuf;
	}

	public void setsReturnOid(String sReturnOid) {
		this.sReturnOid = sReturnOid;
	}

	public String getsReturnOid() {
		return sReturnOid;
	}

}
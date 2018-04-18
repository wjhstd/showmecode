package cn.a52going.inter0100125;


import cn.a52going.common.PrivDataBean;

public class GCustInfoSend extends PrivDataBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5263455218793436992L;
	@Override
	public void setListVal() {
		this.priNameList = new String[]{"grpcode"};
		this.priLenList = new int[]{10};
	}
	private String grpcode;  //团体客户代码
	public String getGrpcode() {
		return grpcode;
	}
	public void setGrpcode(String grpcode) {
		this.grpcode = grpcode;
	}
	
}

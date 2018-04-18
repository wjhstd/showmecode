package cn.a52going.common;

import java.io.Serializable;


public abstract class PrivDataBean implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1009294116347498885L;
	public String[] priNameList;//报文字段名数组
	public int[] priLenList;//对应报文字段名的长度
	public String[] priFormatList;//报文字段名数组

	public String[] getPriFormatList() {
		return priFormatList;
	}

	public void setPriFormatList(String[] priFormatList) {
		this.priFormatList = priFormatList;
	}

	public PrivDataBean(){
		setListVal();
	}
	public String[] getPriNameList() {
		return priNameList;
	}
	public abstract void setListVal();
	public int[] getPriLenList() {
		return priLenList;
	}

}

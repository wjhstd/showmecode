package cn.a52going.sxsrvm.common;


import cn.a52going.common.PrivDataBean;

/**
 * 创建客户信息（原ZYX接口 TransNo:0100215）
 * @author Administrator
 *
 */
public class CjInfoSend extends PrivDataBean {
	
	private String xuhao;
	private String groupno;
	private String groupname;
	private String ptype;
	private String num;

	/**
	 * 
	 */
	private static final long serialVersionUID = -3353349923223920000L;
	@Override
	public void setListVal() {
		this.priNameList = new String[]{"xuhao","groupno","groupname","ptype","num"};
		this.priLenList = new int[]{4,2,100,20,8};
	}
	

	public String getXuhao() {
		return xuhao;
	}


	public void setXuhao(String xuhao) {
		this.xuhao = xuhao;
	}


	public String getGroupno() {
		return groupno;
	}

	public void setGroupno(String groupno) {
		this.groupno = groupno;
	}

	public String getGroupname() {
		return groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

}

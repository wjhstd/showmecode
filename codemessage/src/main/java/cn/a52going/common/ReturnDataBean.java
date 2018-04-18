package cn.a52going.common;
import java.io.Serializable;

public abstract class ReturnDataBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -824560740577031969L;

	public String[] retNameList;// 报文字段名数组
	public int[] retLenList;// 对应报文字段名的长度
	private String sysFlag; // 系统标识

	public String getSysFlag() {
		return sysFlag;
	}

	public void setSysFlag(String sysFlag) {
		this.sysFlag = sysFlag;
	}

	public ReturnDataBean() {
		this.setVal();
	}

	public String[] getRetNameList() {
		return retNameList;
	}

	public int[] getRetLenList() {
		return retLenList;
	}

	public abstract void setVal();

	/**
	 * public int getSingleLenth(){ int sum=0; int cirnum=0; int singlecir=0;
	 * boolean flag=false; for(int i=0;i<retLenList.length;i++){
	 * if("true".equals(retNameList[i])){ sum+=retLenList[i];
	 * cirnum=retLenList[++i]; flag=true; continue; } if(flag){
	 * singlecir+=retLenList[i]; }else sum+=retLenList[i]; }
	 * sum+=cirnum*singlecir; return sum; }
	 */

	/**
	 * modify by zhangweiming
	 * 
	 * @return:结果bean的总字节数(包括聚合的每个bean的每个成员变量的程度)
	 */
	public int getBeanByteLength() {
		int res = 0;
		if (null != this.retNameList && this.retNameList.length > 0) {
			for (int i = 0; i < retNameList.length; i++) {
				if (retNameList[i].trim().equals("maxCircleNum")) {
					// 增加循环标识的2位字节
					res += 2;
					// 循环次数
					int circleNum = this.retLenList[i];
					// 循环的列数
					i++;
					int colNum = this.retLenList[i];
					i++;
					int temp = i; // 临时存储
					for (int k = 0; k < circleNum; k++) {
						for (int m = 0; m < colNum; m++) {
							temp++;
							res += this.retLenList[temp];
						}
						temp = i;
					}
					i = i + colNum;
				} else {
					res += this.retLenList[i];
				}
			}
		}
		return res;
	}

}

package cn.a52going.sxsrvm.common;

public class MyPackage {

	private StringBuffer sendbuf;

	public MyPackage() {
		this.sendbuf = new StringBuffer("");
	}

	/**
	 * 处理GPS返回报文时的中文超长问题
	 * qingbo.xu 2012.06.04
	 * @param item
	 * @param len
	 */
	public void addHeadItemForGpsReturn(String item, int len) {
		StringBuffer tmpItem = new StringBuffer("");

		// 判断item不能为空，为空自动增加空格
		if (item == null || item.length() <= 0) {
			for (int i = 0; i < len; i++)
				tmpItem.append(" ");
		} else {
			tmpItem.append(item);
		}

		// 补足item的长度到len,以空格补
		int tLen = tmpItem.toString().length();
		if (len > tLen) {
			for (int i = 0; i < len - tLen; i++)
				tmpItem.append(" ");
		}

		// 处理item以及汉字问题
		String tmp = tmpItem.toString();

		char cTmp[] = tmp.toCharArray();
		// char cBuf [] = new char [len];
		for (int i = 0, k = 0; i < len; i++) {
			if (cTmp[i] > 128) {// 汉字
				k += 2;
				
				
//同addHeadItem()的区别在于此处
//				len++;
				
				
				if (k >= len) {
					if (k == len) {
						this.sendbuf.append(cTmp[i]);
						break;
					} else {
						this.sendbuf.append(" ");
						break;
					}
				}
				this.sendbuf.append(cTmp[i]);
			} else {
				k++;
				if (k >= len) {
					this.sendbuf.append(cTmp[i]);
					break;
				} else {
					this.sendbuf.append(cTmp[i]);
				}
			}
		}
		// 与tuxedo通讯时在每个项目的后面加一个空格
		// this.sendbuf.append(" ");
	}
	
	public void addHeadItem(String item, int len) {
		StringBuffer tmpItem = new StringBuffer("");

		// 判断item不能为空，为空自动增加空格
		if (item == null || item.length() <= 0) {
			for (int i = 0; i < len; i++)
				tmpItem.append(" ");
		} else {
			tmpItem.append(item);
		}

		// 补足item的长度到len,以空格补
		int tLen = tmpItem.toString().length();
		if (len > tLen) {
			for (int i = 0; i < len - tLen; i++)
				tmpItem.append(" ");
		}

		// 处理item以及汉字问题
		String tmp = tmpItem.toString();

		char cTmp[] = tmp.toCharArray();
		// char cBuf [] = new char [len];
		for (int i = 0, k = 0; i < len; i++) {
			if (cTmp[i] > 128) {// 汉字
				k += 2;
				len++;
				if (k >= len) {
					if (k == len) {
						this.sendbuf.append(cTmp[i]);
						break;
					} else {
						this.sendbuf.append(" ");
						break;
					}
				}
				this.sendbuf.append(cTmp[i]);
			} else {
				k++;
				if (k >= len) {
					this.sendbuf.append(cTmp[i]);
					break;
				} else {
					this.sendbuf.append(cTmp[i]);
				}
			}
		}
		// 与tuxedo通讯时在每个项目的后面加一个空格
		// this.sendbuf.append(" ");
	}

	public void addBodyItem(String item, int len) {
		StringBuffer tmpItem = new StringBuffer("");

		// 判断item不能为空，为空自动增加空格
		if (item == null || item.length() <= 0) {
			for (int i = 0; i < len; i++)
				tmpItem.append(" ");
		} else {
			tmpItem.append(item);
		}

		// 补足item的长度到len,以空格补
		int tLen = tmpItem.toString().length();
		if (len > tLen) {
			for (int i = 0; i < len - tLen; i++)
				tmpItem.append(" ");
		}

		// 处理item以及汉字问题
		String tmp = tmpItem.toString();

		char cTmp[] = tmp.toCharArray();
		for (int i = 0, k = 0; i < len; i++) {
			if (cTmp[i] > 128) { // 汉字
				k += 2;
				if (k >= len) {
					if (k == len) {
						this.sendbuf.append(cTmp[i]);
						break;
					} else {
						this.sendbuf.append(" ");
						break;
					}
				}
				this.sendbuf.append(cTmp[i]);
			} else {
				k++;
				if (k >= len) {
					this.sendbuf.append(cTmp[i]);
					break;
				} else {
					this.sendbuf.append(cTmp[i]);
				}
			}
		}
		// 与tuxedo通讯时在每个项目的后面加一个空格
		// this.sendbuf.append(" ");
	}

	public String getSendbuf() {
		return this.sendbuf.toString();
	}
}

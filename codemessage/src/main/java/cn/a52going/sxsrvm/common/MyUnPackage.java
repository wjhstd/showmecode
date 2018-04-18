package cn.a52going.sxsrvm.common;


public class MyUnPackage {

	public MyUnPackage() {

	}

	public String[] explainHeadItem(String sBuf, int len) {
//		LOG.ADMININFO(" len=" + len);
		String sSourceBuf[] = new String[2];
		sSourceBuf[1] = sBuf;

		if (sSourceBuf == null || sSourceBuf[1].length() <= len)
			return sSourceBuf;

		sSourceBuf[0] = "";
		try {
			char cTmp[] = sSourceBuf[1].toCharArray();
			char cBuf[] = new char[len];
			for (int i = 0, j = 0; i < len; i++, j++) {
				cBuf[j] = cTmp[i];
				if (cTmp[i] > 128) {// 汉字
					len--;
				}
			}
			sSourceBuf[0] = new String(cBuf);
			sSourceBuf[1] = sSourceBuf[1].substring(len);// 除掉多加的空格
		} catch (Exception e) {
			sSourceBuf[0] = "";
		} finally {
			//LOG.ADMININFO("out sRet=" + sSourceBuf[0]);
		}
		return sSourceBuf;

	}

	public String[] explainBodyItem(String sBuf, int len) {
//		LOG.ADMININFO(" len=" + len);
		String sSourceBuf[] = new String[2];
		sSourceBuf[1] = sBuf;
		sSourceBuf[0] = "";
		try {
			char cTmp[] = sSourceBuf[1].toCharArray();
			char cBuf[] = new char[len];
			for (int i = 0, j = 0; i < len; i++, j++) {
				cBuf[j] = cTmp[i];
				if (cTmp[i] > 128) {// 汉字
					len--;
				}
			}
			if (sSourceBuf == null || sSourceBuf[1].length() <= len){
				sSourceBuf[0] = sBuf;
				sSourceBuf[1] = null;
			}else{
				sSourceBuf[0] = new String(cBuf);
				sSourceBuf[1] = sSourceBuf[1].substring(len);// 除掉多加的空格
			}
		} catch (Exception e) {
			sSourceBuf[0] = "";
		} finally {
//			LOG.ADMININFO("out sRet=" + sSourceBuf[0]);
		}
		return sSourceBuf;
	}

}

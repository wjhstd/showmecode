package cn.a52going.sxsrvm.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ZYXHeadMsgCreate {

	public static String getHeadMsg(String transno) {
		StringBuilder str = new StringBuilder("");
		str.append(transno);
		str.append("07");
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/ddHH:mm:ss");
		String currentdate = df.format(new Date());
		// String month;
		// String year;
		// String date;
		// year = String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
		// if((Calendar.getInstance().get(Calendar.MONTH)+1) < 10)
		// month = "0" + String.valueOf(Calendar.getInstance().get(Calendar.MONTH)+1);
		// else
		// month = String.valueOf(Calendar.getInstance().get(Calendar.MONTH)+1);
		// if(Calendar.getInstance().get(Calendar.DATE) < 10)
		// date = "0" + String.valueOf(Calendar.getInstance().get(Calendar.DATE));
		// else
		// date = String.valueOf(Calendar.getInstance().get(Calendar.DATE));;
		// str.append( year + "/" + month + "/" + date);
		str.append(currentdate);
		str.append("0000000");
		for (int i = 0; i < 57; i++) {
			str.append(" ");
		}
		for (int i = 0; i < 8; i++) {
			str.append(" ");
		}
		for (int i = 0; i < 3; i++) {
			str.append(" ");
		}
		for (int i = 0; i < 3; i++) {
			str.append(" ");
		}
		for (int i = 0; i < 3; i++) {
			str.append(" ");
		}

		return str.toString();
	}

	public static void main(String[] arg) {
		System.out.println(getHeadMsg("1222018").length());
	}

}

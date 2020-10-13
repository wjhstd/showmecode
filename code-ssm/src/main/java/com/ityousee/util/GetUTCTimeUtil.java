package com.ityousee.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class GetUTCTimeUtil {
    
    private static DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    
    public static String getUTCTimeStr (Date date) {
    
//        TimeZone tz = TimeZone.getTimeZone("Asia/Shanghai");
//        df.setTimeZone(tz);
        String nowAsISO = df.format(date);
        return nowAsISO;
    }
    
    /**
     * 将UTC时间转换为东八区时间
     * @param UTCTime
     * @return
     */
    public static String getLocalTimeFromUTC (String UTCTime) {
        
        Date UTCDate = null;
        String localTimeStr = null;
        try {
            UTCDate = df.parse(UTCTime);
            localTimeStr = df.format(UTCDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        return localTimeStr;
    }
    
    public static void main (String[] args) {
        
        String UTCTimeStr = getUTCTimeStr(new Date());
        System.out.println(UTCTimeStr);
        System.out.println(getLocalTimeFromUTC(UTCTimeStr));
    }
    
}

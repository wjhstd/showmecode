package cn.a52going.codejava;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class MainTest {
    public static void main (String[] args) {
    
        String fromFileName = "G:\\wjh\\from.mp4";
        String toFileName = "G:\\wjh\\to.mp4";
        long startTime = System.currentTimeMillis();
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(fromFileName);
//            System.out.println("inStream size :" + RamUsageEstimator.shallowSizeOf(in));
            out = new FileOutputStream(toFileName);
            int tempRead ;
            while((tempRead = in.read())>-1) {
                out.write(tempRead);
//                Long size = RamUsageEstimator.shallowSizeOf(out);
//                System.out.println("outStream size :" + size);
                out.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(in!=null)in.close();
                if(out!=null)out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        long spendTime = endTime - startTime;
        System.out.println("方法一，基础复制花费时间："+ spendTime + "毫秒；");
    }
    @Test
    public void test1() throws ParseException {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:00");
        System.out.println(format.format(new Date()));
        Date now = new Date();
        String nowTIme = format.format(now);
        
        long mil = format.parse(nowTIme).getTime();
       for (int i=1; i <= 180; i++){
           SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
           Date d = new Date(mil - 1000L * 60 * i);
           System.out.println("INSERT INTO block_pool_recover_speed (device_id, pool_id, speed, sampling_time) VALUES (100, 1, 341835776, '" + format2 .format(d) + "');");
           System.out.println("INSERT INTO block_pool_recover_speed (device_id, pool_id, speed, sampling_time) VALUES (101, 1, 561134961, '" + format2 .format(d) + "');");
           System.out.println("INSERT INTO block_pool_recover_speed (device_id, pool_id, speed, sampling_time) VALUES (102, 1, 417333248, '" + format2 .format(d) + "');");
       }
    }
    @Test
    public void test2(){
    
        List<String> listSource = new ArrayList<>();
        listSource.add("wang");
        listSource.add("jun");
        listSource.add("hui");
        System.out.println(listSource);
        List<String> tmpList = new LinkedList<>();
        tmpList.add("lili");
        tmpList.add("li");
        
        listSource = tmpList;
        System.out.println(listSource);
        System.out.println( (long)((double)25 / 100 * 2 * 60 * 1000));
    }
    
}

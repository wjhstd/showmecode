package cn.a52going.codejava;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

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
    public void test1(){
        Double ddd = new Double(0.282);
        System.out.println(ddd);
    }
}

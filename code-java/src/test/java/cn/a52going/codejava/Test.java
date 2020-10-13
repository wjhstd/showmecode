package cn.a52going.codejava;

import java.util.Collections;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.LongStream;

public class Test {
    @org.junit.Test
    public void test1(){
    
        System.out.println(new Date());
        Date now = getFormateDate(172800);
        Date currentSampling = new Date(now.getTime() - (172800 * 1000));
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:MM:ss");
        System.out.println(currentSampling);
    }
    public Date getFormateDate(int period) {
        // 时区 差异
        long TIME_ZONE_OFFSET = TimeZone.getDefault().getOffset((new Date().getTime()));
        // 因时区差异 8小时，下面处理时，因这8小时差异 时间转换会出问题，故转换时对时间做了时区的加减
        Date now = new Date((new Date().getTime() + TIME_ZONE_OFFSET) / (period * 1000) * (period * 1000) - TIME_ZONE_OFFSET);
        return now;
    }
    
    @org.junit.Test
    public void test2(){
    
        System.out.println(compute(10, value -> value*value));
    }
    
    public int compute(int a, Function<Integer, Integer> function) {
        int result = function.apply(a);
        return result;
    }
    
    @org.junit.Test
    public void test3(){
    
    }
}

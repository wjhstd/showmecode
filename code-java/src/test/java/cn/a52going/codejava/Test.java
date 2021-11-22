package cn.a52going.codejava;

import java.util.Date;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

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
        Long a = Long.parseLong("80010207559680");
        String size = "955630223360000";
        Long b = Long.parseLong(size);
        System.out.println(a < b);
    }
    @org.junit.Test
    public void test4(){
        int cpus = Runtime.getRuntime().availableProcessors();
        Random random=new Random();
        int cpuForTask0=random.nextInt(cpus);
       
    }
    
    @org.junit.Test
    public void test5() throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("线程一正在执行，将进入等待状态，时间= "+System.currentTimeMillis()+",中断标志位："+Thread.currentThread().isInterrupted());
            try {
                System.out.println("first sleep");
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("zhong duan 111111");
                Thread.currentThread().interrupt();
            }
            System.out.println("线程一从等待状态中醒来，时间= "+System.currentTimeMillis()+",中断标志位："+Thread.currentThread().isInterrupted());
            try {
                System.out.println("second sleep");
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("zhong duan 22222");
            }
            System.out.println("线程一从等待状态中醒来，时间= "+System.currentTimeMillis()+",中断标志位："+Thread.currentThread().isInterrupted());
        });
    
        System.out.println("主线程正在执行");
        thread.start();
        System.out.println("主线程等待，睡眠两秒");
        TimeUnit.SECONDS.sleep(2);
        thread.interrupt();
        TimeUnit.SECONDS.sleep(10);
        
    }
    
    
    @org.junit.Test
    public void test6(){
    
    }
}

package cn.a52going.codejava.thread;
/**
 *@ClassName: Thread1
 *@description: 类描述
 *@author: wangjunhui@wondersgroup.com
 *@data: 2018/4/20 15:03
 **/
class Thread3 extends Thread{
    private String name;
    public Thread3(String name) {
        this.name=name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("当前线程是:"+Thread.currentThread().getName()+"  "+name + "运行  :  " + i);
            System.out.println( );
            try {
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("当前线程是："+Thread.currentThread().getName());
        Thread3 mTh1=new Thread3("A");
        Thread3 mTh2=new Thread3("B");
        mTh1.start();
        mTh2.start();

    }

}
package cn.a52going.codejava.thread;

public class Thread1 implements Runnable {

    private String name;
    private Object self;
    private Object next;
    private Thread1(String name,Object self,Object next) {
        this.name = name;
        this.self = self;
        this.next = next;
    }

    @Override
    public void run() {
        int count = 10;
        while (count > 0) {
            synchronized (self) {

                synchronized (next) {
                    System.out.print(name);
                    count--;
                    next.notify();
                }
                try {
                    self.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    public static void main(String[] args) throws Exception {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        Thread1 pa = new Thread1("A",a,b);
        Thread1 pb = new Thread1("B",b,c);
        Thread1 pc = new Thread1("C",c,a);


        new Thread(pa).start();
        Thread.sleep(100);  //确保按顺序A、B、C执行
        new Thread(pb).start();
        Thread.sleep(100);
        new Thread(pc).start();
        Thread.sleep(100);
    }
}
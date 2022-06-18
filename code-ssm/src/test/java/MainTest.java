public class MainTest {
    public static void main (String[] args) throws Exception{
//        ExecutorService executorService = Executors.newCachedThreadPool();
//
//        //信号量，只允许 3个线程同时访问
//        Semaphore semaphore = new Semaphore(3);
//
//        for (int i=0;i<10;i++){
//            final long num = i;
//            executorService.submit(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        //获取许可
//                        semaphore.acquire();
//                        //执行
//                        System.out.println("Accessing: " + num);
//                        Thread.sleep(2000); // 模拟随机执行时长
//                        //释放
//                        System.out.println("Release..." + num);
//                        semaphore.release();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//        }
//
//        executorService.shutdown();
    
        Long aa = 42352552352L;
        float bb = aa;
        System.out.println(bb);
    
    }
}

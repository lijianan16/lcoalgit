import java.util.concurrent.CountDownLatch;

public class bingfagongju {
   static CountDownLatch countDownLatch1= new CountDownLatch(1);
    static CountDownLatch countDownLatch2= new CountDownLatch(1);

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new test1());
        Thread t2 = new Thread(new test2());
        Thread t3 = new Thread(new test3());
        t1.start();
        countDownLatch1.countDown();
        countDownLatch1.await();
        t2.start();
        countDownLatch2.countDown();
        countDownLatch2.await();
        t3.start();

    }
    public  void test1(){

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("A");
            }
        }).start();
    }
    public  void test2(){

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("B");
            }
        }).start();
    }
    public  void test3(){

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("C");
            }
        }).start();
    }
}


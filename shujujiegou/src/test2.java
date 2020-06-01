import java.util.concurrent.CountDownLatch;

public class test2 implements Runnable {
    CountDownLatch countDownLatch = new CountDownLatch(1);
    @Override
    public void run() {
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("B");
        new test3().countDownLatch1.countDown();
    }
}

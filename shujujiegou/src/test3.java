import java.util.concurrent.CountDownLatch;

public class test3 implements Runnable {
    CountDownLatch countDownLatch1 = new CountDownLatch(1);
    @Override
    public void run() {
        try {
            countDownLatch1.await();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("C");
    }
}

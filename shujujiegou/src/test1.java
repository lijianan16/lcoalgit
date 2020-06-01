import java.util.concurrent.CountDownLatch;

public class test1 implements Runnable {
 //   CountDownLatch countDownLatch = new CountDownLatch(1);

    public void run() {

        System.out.println("A");
        new test2().countDownLatch.countDown();

    }
}

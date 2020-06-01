package duoxiancheng1;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Test {
    static CyclicBarrier c =new CyclicBarrier(2);
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new d1());
        Thread t2 = new Thread(new d2());
        Thread t3 = new Thread(new d3());


        t1.start();

        t2.start();

        t3.start();



    }
}

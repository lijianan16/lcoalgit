package duoxiancheng1;

public class d3 implements Runnable {
    @Override
    public void run() {

        try {
            Test.c.await();
        }catch (Exception e){

        }
        new duoxiancheng().shuchu("C");
    }
}

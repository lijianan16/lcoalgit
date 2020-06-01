import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class climbStairs {
    public static int climbStairs(int n) {
        if(n==1||n==2){
            return n;
        }
        return climbStairs(n-1)+climbStairs(n-2);

    }

    public static void main(String[] args) {
        System.out.println(climbStairs(10));
        Lock lock = new ReentrantLock();
        lock.lock();
        lock.tryLock();
        ReentrantReadWriteLock.ReadLock readLock;


        ReentrantLock reentrantLock;
    }
}

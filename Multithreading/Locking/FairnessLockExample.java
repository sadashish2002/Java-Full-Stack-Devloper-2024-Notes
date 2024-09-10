
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

//fair locking is refer to systematic or order wise acquisition of lock by different thread. 
  // it means that there will be ordering or FIFO in fairlocking by OS Scheduler.
  // those who will request first from OS Schedular  will definetly get lock first .
// Starvation can resolve in fairLock  - it means that every single thread get chance to acquire lock.

// To achieve fairness in lock we need to put true during object creation 
    // of lock like: 
    //Lock fairlock = new ReentrantLock(true);

public class FairnessLockExample {
      // fairness syntax
     private final Lock fairlock = new ReentrantLock(true);


     public void accessResource(){
        fairlock.lock();

        try{
          System.out.println(Thread.currentThread().getName()+ "acquired the lock");
          Thread.sleep(1000);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }finally{
            System.out.println(Thread.currentThread().getName()+ "released the lock");

            fairlock.unlock();
        }
     }

     public static void main(String[] args) {
        UnfairLockExample ule = new UnfairLockExample();

        Runnable task = new Runnable() {

            @Override
            public void run() {
                   ule.accessResource();                
            }
            
        };

        Thread t1 = new Thread(task,"Thread 1");
        Thread t2 = new Thread(task,"Thread 2");
        Thread t3 = new Thread(task,"Thread 3");

        t1.start();
        t2.start();
        t3.start();
     }
}


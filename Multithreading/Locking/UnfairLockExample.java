import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

//unfair locking is refer to arbitary or random acquisition of lock by different thread 
  // it means that there will be no ordering in unfairlocking 
  // those who will request first from OS Schedular  will might be get lock first  or not  
// Starvation can occur in unfairLock  - it means that there will be also chance that any one thread will not
           // get chance to acquire lock
public class UnfairLockExample {
     private final Lock unfairlock = new ReentrantLock();


     public void accessResource(){
        unfairlock.lock();

        try{
          System.out.println(Thread.currentThread().getName()+ "acquired the lock");
          Thread.sleep(1000);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }finally{
            System.out.println(Thread.currentThread().getName()+ "released the lock");

            unfairlock.unlock();
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

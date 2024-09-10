
// ReentrantLock() is a type of Lock class which is used to avoid Deadlock
// Example outermethod() put 1 lock in main thread(rle) and 
        // innermethod() also put 2nd lock in same main thread
 // PROBLEM - when main thread will enter to innermethod() after outermethod()
              // then it will wait for itself to get unlock() from innermethod then proceed outermethod () further task.
              // it cant be possible because of deadlock( same thread wait for itself to finish task).
              // ReentrantLock resolve this problem and accept both lock and allow to perform 
              // both method to do its task 

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    private final Lock lock = new ReentrantLock();

    public void outerMethod(){
        lock.lock();
        try{
             System.out.println("outerMethod");
             innerMethod();
        }finally{
            lock.unlock();
        }
    }

    public void innerMethod(){
        lock.lock();
        try{
               System.out.println("inner Method");
        }finally{
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantLockExample rle = new ReentrantLockExample();
        rle.outerMethod();
    }
}

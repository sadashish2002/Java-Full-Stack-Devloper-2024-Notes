import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

//Readwrite Lock is used to allow multiple thread concurrently to read
  // resources  as long  as no thread is writing to it.
  // it ensure exclusive acces for write operation.

  // other lock will allow only  one thread to do work at a time
public class ReadWriteCounter {
    private int count = 0;

    private final ReadWriteLock  lock = new ReentrantReadWriteLock();

    private final Lock readLock = lock.readLock();

    private final Lock writeLock = lock.writeLock();


    public void increment() {
        writeLock.lock();
        try{
            count++;
            Thread.sleep(50);
        }catch(InterruptedException e){
             Thread.currentThread().interrupt();
        }finally{
            writeLock.unlock();
        }
    }

    public int getcount(){
        readLock.lock();
        try{
             return count;
        }finally{
            readLock.unlock();
        }
        
    }
    public static void main(String[] args) throws InterruptedException{
        ReadWriteCounter rwc = new ReadWriteCounter();

        // task for read  thread to do

        Runnable readTask = new Runnable(){
            public void run(){
                   for(int i =0;i<10;i++){
                    System.out.println(Thread.currentThread().getName() + " read: " + rwc.getcount());
                   }
            }
        };

        // task for write thread to do 
        Runnable writeTask = new Runnable() {
            public void run(){
                for(int i = 0;i<10;i++){
                    rwc.increment();
                    System.out.println(Thread.currentThread().getName() + " incremented");
                 
                }
               }
        };

        Thread writerThread = new Thread(writeTask);
        Thread readerThread1 = new Thread(readTask);
        Thread readerThread2 = new Thread(readTask);


        writerThread.start();
        readerThread1.start();
        readerThread2.start();

        writerThread.join();
        readerThread2.join();
        readerThread2.join();

        System.out.println("final count: " + rwc.getcount());
    }
        
    
}

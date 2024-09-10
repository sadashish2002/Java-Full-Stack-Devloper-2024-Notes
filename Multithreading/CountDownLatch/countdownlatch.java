//CountDownLatch is a concurrency utility in Java 
//that allows one or more threads to wait for a set of operations being performed 
//in other threads to complete. 
//It is a synchronization aid that can be used for various purposes, 
//such as ensuring that a task waits for other threads before it starts 
//or making a thread wait until a certain condition is met.

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class countdownlatch {
public static void main(String[] args) throws  InterruptedException {

    int numberOfServices = 3;
    ExecutorService  executor = Executors.newFixedThreadPool(numberOfServices);
    
    CountDownLatch latch = new CountDownLatch(numberOfServices);
    //countDownLatch is used to make one or more threads to wait for its completion
    // its constructor contain numbers which indicate the number of events that must occur 
    //before the latch is released. 
    //Each call to the countDown() method decrements the count, 
    //and the await() methods block until the count reaches zero. 
    //Once the count reaches zero, all waiting threads are released.

    executor.submit(new DependentService(latch));
    executor.submit( new DependentService(latch));
    executor.submit(new DependentService(latch));
   
    // latch.await();
    // main thread will wait only for 5 second then it will run 
    // if above task 3 will run before 5 seconds then execute 
    // otherwise after main thread execution , all task 3 will execute.

    latch.await(5,TimeUnit.SECONDS);

    System.out.println("Main thread");
    executor.shutdown();

}
    
}

@SuppressWarnings("rawtypes")

class DependentService implements Callable<String>{
   
    private final CountDownLatch latch;
     
  public DependentService(CountDownLatch latch) {
        this.latch = latch;
    }



public String call() throws Exception {
    try {
        Thread.sleep(7000); // main thread will run because it > then await time
       
       // Thread.sleep(2000); // all tasks 3 will run because its time < await time.
        System.out.println(Thread.currentThread().getName() + " service started.");
       
    }finally{
        latch.countDown();
    }
    return "OK";
     
  }
}
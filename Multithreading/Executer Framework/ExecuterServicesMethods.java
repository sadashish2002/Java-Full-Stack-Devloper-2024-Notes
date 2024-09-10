import java.util.concurrent.*;

public class ExecuterServicesMethods {
    
    public static void main(String[] args) throws ExecutionException , InterruptedException{
                      //1. .newFixedThreadPool(2)  
                      
      //.newFixedThreadPool(2) Creates a thread pool that reuses a fixed number of threads 
        //operating off a shared unbounded queue. 
        //At any point, at most nThreads threads will be active processing tasks. 
        //If additional tasks are submitted when all threads are active, 
        //they will wait in the queue until a thread is available.

        ExecutorService  executor = Executors.newFixedThreadPool(2);
        
        /* 
                      //2 .newCachedThreadPool()
        // .newCachedThreadPool() is use when load is variable means
        // u dont know how many  task will come
        // .newCachedThreadPool()  Creates a thread pool that creates 
        //new threads as needed, but will reuse previously constructed threads when they are available. 
        //If no existing thread is available, a new thread will be created and added to the pool. 
        //Threads that have not been used for sixty seconds are terminated and removed from the cache.
       
        ExecutorService  executor = Executors.newCachedThreadPool();
        */

      Future<Integer> future =   executor.submit(()-> 1 + 2);

      Integer i = future.get();
      System.out.println("sum is : " +i);
      executor.shutdown();
      System.out.println(executor.isShutdown()); // return true
      
      // executor.isTerminated() return false because 
      // we run it immediately after shutdown() method
      //Returns true if all tasks have completed following shut down.
      System.out.println(executor.isTerminated()); // return false
      
      // So we need to give little time to main thread to finish all task 
      // then executor.isTerminated() return true
      Thread.sleep(1);
      System.out.println(executor.isTerminated()); // return true

    }
}

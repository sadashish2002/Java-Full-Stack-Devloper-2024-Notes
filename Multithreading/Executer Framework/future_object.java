
import java.util.concurrent.*;

public class future_object {
    public static void main(String[] args) throws ExecutionException ,InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
         
      /*
        
         // .submit method has  three types of parameter 
            //  1. callable - it is used to return something
           // 2. runnable - it is used to not return anything.
           // 3. runnable - it is used to not return anything with timestamp
        
            
          //  Runnable  runnable = ()-> "Hello"; // error because Runnable doesnot return anything
             // Callable callable = () -> "Hellow orew"; // return string because it can return something <v> 
             // Future<?> future = executor.submit(callable);
                  

        Future<Integer> future = executor.submit(()-> 42);

        // <?> it indicate that something type of data it wll return
      //  Future<?> future = executor.submit(()-> System.out.println("Namaste Duniya"));
        
        // .get() method Waits if necessary for the computation to complete,
          // and then retrieves its result.
        System.out.println(future.get());
         
        // we can  call other different built in method of Future
        if(future.isDone()){
            System.out.println("Task is done !");
        }
       */

     
       // we will see other feature of future
/*
 
       Future<Integer> future1 = executor.submit(() ->{
          Thread.sleep(2000);
          return 42;

       });
       Integer i = null;
       try {
        i = future1.get(1,TimeUnit.SECONDS);
        System.out.println(future1.isDone());
        System.out.println(i);
       } catch (Exception e) {
        System.out.println("Exception occured : " + e);
       }
        executor.shutdown();
    
 */

   // future.cancel()method is used to cancel in middle of thread workd

   Future<Integer> future1 = executor.submit(() ->{
    Thread.sleep(2000);
    System.out.println("Hello");
    return 42;

 });
//    Make main thread to sleep for 1 sec 
//  then future scope will cancel because that will finish in 2 min
 try {
    Thread.sleep(1000);
  } catch (Exception e) {
    // TODO: handle exception

  } 
//  Attempts to cancel execution of this task. 
//This method has no effect if the task is already completed or cancelled,
// or could not be cancelled for some other reason.
// Otherwise, if this task has not started when cancel is called, this task should never run
  
future1.cancel(true);
    System.out.println(future1.isCancelled());
    System.out.println(future1.isDone());
    executor.shutdown();
}
}

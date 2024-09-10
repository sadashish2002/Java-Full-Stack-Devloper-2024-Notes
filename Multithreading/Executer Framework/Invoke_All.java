import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/*
 

public class Invoke_All {
   public static void main(String[] args) throws ExecutionException , InterruptedException {

       ExecutorService  executor = Executors.newFixedThreadPool(2);    
       
       Callable<Integer> callable1 = () -> {
             System.out.println("Task 1");
             return 1;
       };
       Callable<Integer> callable2 = () -> {

             System.out.println("Task 2");
             return 2;
       };
       Callable<Integer> callable3 = () -> {

             System.out.println("Task 3");
             return 3;
       };

       // Arrays.aslist() returns a fixed-size list backed by the specified array. 
       //Changes made to the array will be visible in the returned list, 
       //and changes made to the list will be visible in the array. 

      List<Callable<Integer>> list = Arrays.asList(callable1,callable2,callable3);
      
      //invokeall() method is used to take multiple task and execute it together .
      // it Executes the given multiple tasks, 
      //returning a list of Futures holding their status and results when all complete. 

    // invokeall() block main thread until all task given in parameter will not complete
          List<Future<Integer>> future= executor.invokeAll(list);



     executor.shutdown(); 
     System.out.println("Hello world I am last line of code run by main thread");

   } 
}

 */

 // 2. invokeall(list ,timeout,tiemunit.second) will perform
/*
 public class Invoke_All {
    public static void main(String[] args){
 
        ExecutorService  executor = Executors.newFixedThreadPool(2);    
        
        Callable<Integer> callable1 = () -> {
              Thread.sleep(1000); // it requires when we run invokeall(list,timeout,)
              System.out.println("Task 1");
              return 1;
        };
        Callable<Integer> callable2 = () -> {
         Thread.sleep(1000); // it requires when we run invokeall(list,timeout,)
 
              System.out.println("Task 2");
              return 2;
        };
        Callable<Integer> callable3 = () -> {
         Thread.sleep(1000); // it requires when we run invokeall(list,timeout,)
 
              System.out.println("Task 3");
              return 3;
        };
 
        // Arrays.aslist() returns a fixed-size list backed by the specified array. 
        //Changes made to the array will be visible in the returned list, 
        //and changes made to the list will be visible in the array. 
 
       List<Callable<Integer>> list = Arrays.asList(callable1,callable2,callable3);
       
       //invokeall() method is used to take multiple task and execute it together .
       // it Executes the given multiple tasks, 
       //returning a list of Futures holding their status and results when all complete. 
 
     // invokeall() block main thread until all task given in parameter will not complete
          //  List<Future<Integer>> future= executor.invokeAll(list);
 
     // invokeall(list,1,timeunit.second) will block or wait only for 1 second only 
     // after that it run mainn thread next block of code("hello world")
      
     List<Future<Integer>> future = null;
     try {
        future = executor.invokeAll(list,1,TimeUnit.SECONDS);
     } catch (InterruptedException e) {
        // Thread.currentThread().interrupt();
     }
    
     for(Future<Integer> f: future){
        try {
        System.out.println(f.get());
            
        } catch( CancellationException e) {
        
        }catch(InterruptedException e ){

        }catch(ExecutionException e){

        }
     }
 
     executor.shutdown(); 
      System.out.println("Hello world I am last line of code run by main thread");
 
    } 
 }
 */

// invokeany(list) means those who will complete task first will return first and all will cancel

public class Invoke_All {
    public static void main(String[] args){
 
        ExecutorService  executor = Executors.newFixedThreadPool(3 );    
        
        Callable<Integer> callable1 = () -> {
              Thread.sleep(1000); // it requires when we run invokeall(list,timeout,)
              System.out.println("Task 1");
              return 1;
        };
        Callable<Integer> callable2 = () -> {
         Thread.sleep(1000); // it requires when we run invokeall(list,timeout,)
 
              System.out.println("Task 2");
              return 2;
        };
        Callable<Integer> callable3 = () -> {
         Thread.sleep(1000); // it requires when we run invokeall(list,timeout,)
 
              System.out.println("Task 3");
              return 3;
        };
 
        // Arrays.aslist() returns a fixed-size list backed by the specified array. 
        //Changes made to the array will be visible in the returned list, 
        //and changes made to the list will be visible in the array. 
 
       List<Callable<Integer>> list = Arrays.asList(callable1,callable2,callable3);
       
       try{
           Integer i = executor.invokeAny(list);
           System.out.println(i);
       }catch(InterruptedException | ExecutionException e){
        throw new RuntimeException(e);
       }
 
     executor.shutdown(); 
      System.out.println("Hello world I am last line of code run by main thread");
 
    } 
 }
 
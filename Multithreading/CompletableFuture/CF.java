//Completable future was introducted in java 8 programmin
// It is used to handle asynchronous programmin.



import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CF {
    public static void main(String[] args) {
        
        @SuppressWarnings("unused")
        CompletableFuture<String> f1=   CompletableFuture.supplyAsync(() ->{
           
            try {
                System.out.println("Worker is waiting for 5 sec");
                Thread.sleep(5000);
                
            } catch (Exception e) {
               
            }
            return "ok";
        });

        @SuppressWarnings("unused")
        CompletableFuture<String> f2=   CompletableFuture.supplyAsync(() ->{
           
            try {
                System.out.println("Worker is waiting for 5 sec");
                Thread.sleep(5000);
                
            } catch (Exception e) {
               
            }
            return "ok";
        });
       
        // method 1
        /*
          //To make main thread to wait then use do it 
        String s = null;
        try {
            s = f1.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(s);
        System.out.println("Main Thread");
        
         */

         //method 2

         //.allof() Returns a new CompletableFuture that is completed 
         //when all of the given CompletableFutures complete. 
         //If any of the given CompletableFutures complete exceptionally, 
         //then the returned CompletableFuture also does so,

   CompletableFuture<Void> f = CompletableFuture.allOf(f1,f2);
    
   f.join();
   //.join() Returns the result value when complete, 
   //or throws an (unchecked) exception if completed exceptionally.
  System.out.println("Main");

 
  //Method 3

  /*
    @SuppressWarnings("unused")
  CompletableFuture<String> f3=   CompletableFuture.supplyAsync(() ->{
     
      try {
          System.out.println("Worker is waiting for 5 sec");
          Thread.sleep(5000);
          
      } catch (Exception e) {
         
      }
      return "ok";
      
      //java 8 feature is .exceptionally
  }).orTimeout(1, TimeUnit.SECONDS).exceptionally(s-> "Timeout Occured");
  try {
    System.out.println(f3.get());
} catch (InterruptedException | ExecutionException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
   */
      
}
}

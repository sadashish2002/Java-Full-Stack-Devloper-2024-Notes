// When we will do execution of the code without using executor framework 
// then we have to create run thread slipping everything we have to do manually 
// but when I will use executor framework in the code that time we don't need to care about thread creation anything

// Basically in this code i will show difference of time taking to execute code 
// between normal code taking time and 
// create multiple multiple thread taking time to execute same work

// program to find factorial of 10 number

// This code will take time of 9313 millisecond

/*
 public class Main{

    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        // it gives time in millisecond  upto now since  1970.

        for(int i =1;i<10;i++){
            System.out.println(factorial(i));
        }
        System.out.println("Total time: "+ (System.currentTimeMillis() - startTime));
    }
    private static long factorial(int n){
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
             throw new RuntimeException(e);
        }

        long result =1;
        for(int i =1;i<=n;i++){
            result *=i;
        }

        return result;
    }


}
 */

// After executing array of threads in below code 
// then it will take only Total time: 1022 ms.

/*
 public class Main{

    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        // it gives time in millisecond  upto now since  1970.

        // Now i will create array of thread so that multiple thread will find factorial and take less time 

        Thread[] threads = new Thread[19];

        for(int i =1;i<10;i++){
            int finalI = i;
           threads[i-1] = new Thread(
            
                 () ->{
                    long result = factorial(finalI);
                    System.out.println(result);

                 }
           );
           threads[i-1].start();
        }

        // Now we have to wait for all thread to finish its task and execute time wala code in below
        // then it need to show total time taken by all threads to execute factorial task

        for(Thread thread : threads){
            try{
                thread.join();
            }catch(InterruptedException e) {
               Thread.currentThread().interrupt();
            }
        }
        System.out.println("Total time: "+ (System.currentTimeMillis() - startTime));
    }
    private static long factorial(int n){
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
             throw new RuntimeException(e);
        }

        long result =1;
        for(int i =1;i<=n;i++){
            result *=i;
        }

        return result;
    }


}
 */

// we are creating 9 threads
// we are not doing thread reusablity
// we are finding time manually in millisecond
// we are waiting(using .join()) for threads to finish its task then further line of code will execute

// So all these things Executor framework can handle 

     // it will take time for 9 threads as 1019 ms.
     // No. of threads increase then time taken will decrease 
     

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main{

    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        // it gives time in millisecond  upto now since  1970.

       // Now I wiil create object(executor) of Executor for using builtin method to create threads
        ExecutorService executor = Executors.newFixedThreadPool(10);

        for(int i =1;i<10;i++){
            int finalI = i;
          executor.submit(() -> {
            long result = factorial(finalI);
            System.out.println(result);
          });
        }
        executor.shutdown();
        // To get time how much executor is taking to complete the task
        // then call awaitTermination method().
        // this will wait for executor to finish task upto given time in paramter of it
        // otherwise it will run next line of code(to measure time taken) 
        
       try {
        executor.awaitTermination(100, TimeUnit.SECONDS);
        
       } catch (InterruptedException e) {
        throw new RuntimeException(e);
       }
       
        System.out.println("Total time: "+ (System.currentTimeMillis() - startTime));
    }
    private static long factorial(int n){
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
             throw new RuntimeException(e);
        }

        long result =1;
        for(int i =1;i<=n;i++){
            result *=i;
        }

        return result;
    }


}


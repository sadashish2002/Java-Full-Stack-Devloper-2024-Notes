// lifecycle of thread are mention in 5 states : 

// 1. NEW 
// 2. RUNNABLE
// 3. RUNNING
// 4. BLOCKING/ WAITING
// 5. TERMINATION

// import ExceptionHandling.tryCatch;

class MyThread extends Thread {
    
    @Override
    public void run() {

     //   t1 thread started runnin its code of running method 
            try {
/*step-5 */ System.out.println("my another process is running.");
/*step-6 */     Thread.sleep(2000);
             
             }catch (Exception e) {
                System.out.println(e);
             }
    }

    public static void main(String[] args) throws Exception {
         // we will see state of thread
         // create object of class which extend Thread

/*step-1 */ MyThread t1 = new MyThread();  // thread created
           System.out.println(t1.getState()); //NEW

/*step-2 */ t1.start();   // thread about to run or runninng
         System.out.println(t1.getState());  // RUNNABLE
         
/*step-3 */ System.out.println(Thread.currentThread().getState()); // Runnable main method
         
         // Make main ( method )thread to wait or sleep for 100ms until 
         //another above thread(run() method) will execute
/*step-4 */ Thread.sleep(100);

           //Now it will show time_waiting because t1 is executing its code 
/*step-7 */ System.out.println(t1.getState());
          
         // .join() is used for main method to wait 
         // for t1 thread when it will come , then .join() will terminate it(t1) and 
         // move to main thread
/*step-8 */ t1.join();
        System.out.println(t1.getState());

        // Now main thread is running it show RUNNNABLE
/*step -9 */System.out.println(Thread.currentThread().getState() +" -Main thread is running");
  

             

    }
    
}

// to create a new thread in java 
// you can either extend the thread class of another class not main class or
// implement the Runnavle interface

// execute run function withoud main fun and override it 

// public class childThread extends Thread {  // extend thread class
           // or 
public class childThread implements Runnable {
    
        @Override
        public void run() {
            for(;;){
                System.out.println(Thread.currentThread().getName());
            }
        }
    

   
}
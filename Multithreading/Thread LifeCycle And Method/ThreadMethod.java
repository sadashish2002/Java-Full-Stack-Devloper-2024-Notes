// Methods of threads are : 

// start 
// run
// sleep
// join
// setPriority
// interrupt
//yield
//setDaemon

// 1. sleep counter

/*
 
public class ThreadMethod extends Thread{

    @Override
    public void run() {
        for(int i =1;i<=5;i++){
            try{
                Thread.sleep(2000);
            }catch(Exception e){
    
                System.out.println(e.getMessage());
            }
            System.out.println(i);
        }
       
    }

    public static void main(String[] args) throws Exception {
        ThreadMethod tm = new ThreadMethod();
        tm.start();
         
        tm.join();
        System.out.println("Hello");
    }
    
}
 */

 // 2.) modiyfy thread name manually and see priority andthread name
 /*
  
public class ThreadMethod extends Thread{
// we can give thread name manually 
     public ThreadMethod(String name){
        super(name);
     }
    @Override
    public void run() {
        for(int i =1;i<=5;i++){
            System.out.println(Thread.currentThread().getName() + "- Priority: "+ Thread.currentThread().getPriority()+ " Count -" + i);
            try{
                Thread.sleep(200);
            }catch(Exception e){
    
                System.out.println(e.getMessage());
            }
           
        }
       
    }

    public static void main(String[] args) throws Exception {
        ThreadMethod tm = new ThreadMethod("Sadashish_Thread");
       //we can set priority of thread 
       // so that cpu can execute thread based on priority
       tm.setPriority(Thread.MIN_PRIORITY);
       tm.start();

         
      
    }
    
}
  */

  // 3.) How set priority of multiple threads

  /*
public class ThreadMethod extends Thread{
    // we can give thread name manually 
         public ThreadMethod(String name){
            super(name);
         }
        @Override
        public void run() {
            for(int i =1;i<=5;i++){
                System.out.println(Thread.currentThread().getName() + "- Priority: "+ Thread.currentThread().getPriority()+ " Count -" + i);
                try{
                    Thread.sleep(200);
                }catch(Exception e){
        
                    System.out.println(e.getMessage());
                }
               
            }
           
        }
    
        public static void main(String[] args) throws Exception {
            
           //we can set priority of thread 
           // so that cpu can execute thread based on priority
           
           ThreadMethod l = new ThreadMethod("Low priority Thread");
           ThreadMethod m = new ThreadMethod("med priority Thread");
           ThreadMethod h = new ThreadMethod("High priority Thread");
            
           l.setPriority(Thread.MIN_PRIORITY);
           m.setPriority(Thread.NORM_PRIORITY);
           h.setPriority(Thread.MAX_PRIORITY);

           l.start();
           m.start();
           h.start();
    
             
          
        }
        
    }
         */

// 4. How to interrupt the thread running or sleeping
/*
 

public class ThreadMethod extends Thread{
   
        @Override
        public void run() {
           
                try{
                    Thread.sleep(200);
                    System.out.println("Thread is running........");
                }catch(Exception e){
        
                    System.out.println("Thread is interrupted " + e.getMessage());
                }
               
            
           
        }
    
        public static void main(String[] args) throws Exception {
        ThreadMethod tm = new ThreadMethod();
        tm.start();
        // when .interrupt() call then main method used to interrupt or stop sleeping time (.sleep())of  tm thread method
        
        tm.interrupt();
             
          
        }
        
    }
 */

 //5. How to give hint (.yield()) to JVM that u give time for other thread also

 /*
  
public class ThreadMethod extends Thread{
   
    @Override
    public void run() {
       
           for(int i = 0;i<5;i++){
            System.out.println(Thread.currentThread().getName() + " is running");
             //A hint to the scheduler that the current thread is willing
             // to yield its current use of a processor.
             // .yeild() give hint to JVM that u can give cPU time to another thread
             // no need to give complete time for one threead only

            Thread.yield();
           }
           
        
       
    }

    public static void main(String[] args) throws Exception {
    ThreadMethod t1 = new ThreadMethod();
    ThreadMethod t2 = new ThreadMethod();
    t1.start();
    t2.start();        
      
    }
    
}
  */

// 6.) setDaemon is background thread , for daemon JVM will not wait 
// it is used to stop and terminate thread when some useless work is going in thread 
// it will terminate when main thread work would have been finished

public class ThreadMethod extends Thread{
   
    @Override
    public void run() {
           while(true){
            System.out.println("Hello world !");
           }     
       }

    public static void main(String[] args) throws Exception {
    ThreadMethod t1 = new ThreadMethod();

    //The shutdown sequence begins when all started non-daemon threads have terminated.
    t1.setDaemon(true);
    t1.start();
    System.out.println("Sadashish is main thread to be done");       
      System.out.println("I will not stop to myself.");
    }
    
}


    
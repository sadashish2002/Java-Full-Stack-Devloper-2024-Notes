public class Test {
    
 
      
    public static void main(String[] args) {
    System.out.println("Hello world");
 //  When a java pgm starts , one thread begins 
  ///  running immediatly 

  //  that thread is called main thread

  //  Main thread is resposible for executing main 
   // method of prgm.
    System.out.println(Thread.currentThread().getName());
       
       //1.) for  other class(childTread)  who extend the Thread class 
        // To run new thread together with main thread
        // then u have to create object of other(childThread) class
        // run .start method

             /*childThread ct1 = new childThread();
               ct1.start(); */

        //2.) for other class(childThread) who implements the Runnable class..
        // to run new thread (childThread) with main (test) thread
        // then u have to create object of new thread(childThread) class
        // and u have to also create object of inbuilt Thread class
        // and put object of childThread class in constructor of inbuild Thread class
        childThread ct2 = new childThread();
        Thread td = new Thread(ct2);
         td.start();

      for(;;){
        System.out.println(Thread.currentThread().getName());
      }

      
    }
}

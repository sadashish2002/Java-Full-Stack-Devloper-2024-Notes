// We can do synchronization in two ways:
  // 1. complete method will be synchronized , 
        // use synchronized keyword before return data type in method name
  // 2. specific block of code inside method can be synchronized. 
public class Counter {
     private  int count = 0;

//  complete method is synchronized
      public synchronized void increment(){
        count++;
     } 

// specific block of code is synchronized
     /*public void increment(){
        synchronized (this){
            count++;
        }
     }
    */

     public int getCount(){
        return count;
     }
    
}

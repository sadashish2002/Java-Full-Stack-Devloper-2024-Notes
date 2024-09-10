import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Locking 
  // it is process of locking a thread for a particular function to execute 
  // other threads will not able to acces that function at the time of locked thread.

// Types of Locking are
    // 1. Intrinsic
    // 2. Explicit

  // 1. Intrinsic (using Synchronized keyword)
        // These are built into every ovject in java
        // when u use a synchronized keyword , you are 
        // using these automatic locks.
       
        // Disadvantages of Synchronization are: 
           //a.) No Fairness 
           // b.) Blocking - indefinetly blocking
           // c.) No Interruptibility - other thread cant interrupt until first thread will not release lock
           // d.) Read/ write Locking - it dont know which thread is read or write locking.. 
        /*
        public class BankAccount {
     private int balance = 100;

     public synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + "attempting to withdraw " + amount);
        
        if(balance >= amount){
            System.out.println(Thread.currentThread().getName() + "proceeding with withdrawl ");
           try{
            Thread.sleep(3000);
           }catch(InterruptedException e){

           }

            balance -= amount;
            System.out.println(Thread.currentThread().getName()+ "completed withdrawl . Remaining balance: "+ balance);
        }else{
            System.out.println(Thread.currentThread().getName()+ "insufficient balance ");
        }
    
    }
}

         */

  // 2.Explicit (using library java.util.concurrent.locks) 
      // All disadvantage of synchronization can be overcome by using explicit lock.
      // we will not use synchronized keyword
      // we will create object (lock)of Lock type .
      // Lock class contain:
      // a.) lock.lock(),
      // b.) lock.trylock(),
      // c.) lock.trylock(time,timeunit)
       // d.)  lock.unlock() and so on.
      //You explicitly say when to lockk or unlock , 
      // giving you more control over how and when people can write in notebook


public class BankAccount {
        private int balance = 100;
        //Create object of Lock type
       private final Lock lock = new ReentrantLock();

        public void withdraw(int amount){
           System.out.println(Thread.currentThread().getName() + "attempting to withdraw " + amount);
           
          try{
              if(lock.tryLock(3000,TimeUnit.MILLISECONDS)){
              
                if(balance>=amount){
                  try{
                    System.out.println(Thread.currentThread().getName() + "proceeding with withdrawl ");
                    // simulate time taken to process the withdrawl 
                    // if sleep > .trylock ()time , then second will able to enter into task
                    // if sleep < .trylock ()time , then second will also  able to enter into task after first thread finish or come out from task.
                    Thread.sleep(1000);
                    balance -= amount;
                   System.out.println(Thread.currentThread().getName()+ "completed withdrawl . Remaining balance: "+ balance);
                    
                  }catch(Exception e){
                     Thread.currentThread().interrupt();
                  }finally{
                    lock.unlock();
                  }
               }else{
                System.out.println(Thread.currentThread().getName()+"insufficient balance"); 
            }

              }else{
                System.out.println(Thread.currentThread().getName()+"could not acquire the lock , will try later");
              }
          }catch(Exception e){
            // Its good practice to revoked or get back or restore the state of thread
            // so that clean up or any maintainance code u can write after catch{} block.
            // that code will run after catch{}
            
            Thread.currentThread().interrupt();
             
          }
          // for example to monitor which thread is interrupted
         
         /* if(Thread.currentThread().isInterrupted()){
            System.out.println("it will be accessible if u will write .intrupped() in catch{} block");
          } */
       
       }
   }
   
// We are not going to make separate class for our thread(class Mythread exntend Thread{...})
// Instead of that we will implement runnable interace
// this will implement anonymous class with object (task) of runnable interface.


public class Main {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount();
        //Creation of object of runnable interface
         // anonymous class syntax is below:
         
        Runnable task = new Runnable(){
           
            public void run(){
                sbi.withdraw(50);
            }
        };

        Thread t1 = new Thread(task , "Thread 1");
        Thread t2 = new Thread(task , "Thread 2");
        
        t1.start();

        t2.start();

    }
}

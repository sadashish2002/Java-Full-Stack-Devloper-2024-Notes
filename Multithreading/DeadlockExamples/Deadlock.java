// Deadlock is a situation occur in multithreading where two or more 
// threads are waiting for each other to use resources


//Deadlock situation :  example of pen and paper where paper is waiting for pen and pen is waiting for papaer

/*
class Pen{

    public synchronized void writeWithPenAndPaper(Paper paper){
        System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and try to to write on " + paper);
        paper.finishWriting();
    }
    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName()+ " finished using pen "+ this);

    }

}

class Paper {
public synchronized void writeWithPenAndPaper(Pen pen){
        System.out.println(Thread.currentThread().getName() + " is using paper " + this + " and try to write by " + pen);
        pen.finishWriting(); 
    }
    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName()+ " finished using paper "+ this);

    }
}

// thread1 to do work is here 
class Task1 implements Runnable{
     private Pen pen;
     private Paper paper;

     public Task1(Pen pen , Paper paper){
        this.pen = pen;
        this.paper = paper;
     }

     public void run(){
        // thread 1 locks pen and tries to lock paper
        pen.writeWithPenAndPaper(paper);
     }
}
// thread2 to do work is here 
class Task2 implements Runnable{
     private Pen pen;
     private Paper paper;
      
     public Task2(Pen pen , Paper paper){
        this.pen = pen;
        this.paper = paper;
     }
     public void run(){
        // thread 2 locks paper and tries to lock pen
        paper.writeWithPenAndPaper(pen); 
     }
}


public class Deadlock {
   public static void main(String[] args) {
    Paper paper = new Paper();
    Pen pen = new Pen();

    Thread thread1 = new Thread(new Task1(pen, paper), "thread -1 ");
    Thread thread2 = new Thread(new Task2(pen, paper), "thread -2 ");

    thread1.start();
    thread2.start();

   try {
    thread1.join();
    thread2.join();
   } catch (InterruptedException e) {
    Thread.currentThread().interrupt();;
   }
    System.out.println("Deadlock occur  between thread-1 and thread-2 so this line will not print ");
   
}
     
}



 */


/// How to make this program deadlock free , we have to use synchronized () on any thread's task run method 
class Pen{

    public synchronized void writeWithPenAndPaper(Paper paper){
        System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and try to to write on " + paper);
        paper.finishWriting();
    }
    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName()+ " finished using pen "+ this);

    }

}

class Paper {
public synchronized void writeWithPenAndPaper(Pen pen){
        System.out.println(Thread.currentThread().getName() + " is using paper " + this + " and try to write by " + pen);
        pen.finishWriting(); 
    }
    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName()+ " finished using paper "+ this);

    }
}

// thread1 to do work is here 
class Task1 implements Runnable{
     private Pen pen;
     private Paper paper;

     public Task1(Pen pen , Paper paper){
        this.pen = pen;
        this.paper = paper;
     }

     // after using synchronized on paper then 
        // thread1 will get instruction to find lockfree  of paper then lock to pen
        // it means thread1 cannot able to even lock pen or pen resource will not using yet by thread1.
        // and pen is free to lock by thread 2 
        // paper is already with thread 2  and  thread2 will get pen also.
        // after thread 2 finish task

        // then paper will be also unlock or paper resource will be available for another thread to use
        // then thread1 can apply lock on paper and pen


     public void run(){

        // so it is deadlock free now because we made a sequential way one by one for multiple thread to use resource
        synchronized(paper){
            pen.writeWithPenAndPaper(paper);
        } 
     }
}
// thread 1 will wait for getting  paper resources release by thread 2.

// thread2 to do work is here 
class Task2 implements Runnable{
     private Pen pen;
     private Paper paper;
      
     public Task2(Pen pen , Paper paper){
        this.pen = pen;
        this.paper = paper;
     }
     public void run(){
        // thread 2 lock paper and try to find lock for pen 
        // it will work because we synchronixed task1 for find paper resources to lock  then lock pen 
        // so pen resource will be available for another thread
        // so thread 2 will have pen resources to lock

        paper.writeWithPenAndPaper(pen); 
            
     }
}


public class Deadlock {
   public static void main(String[] args) {
    Paper paper = new Paper();
    Pen pen = new Pen();

    Thread thread1 = new Thread(new Task1(pen, paper), "thread -1 ");
    Thread thread2 = new Thread(new Task2(pen, paper), "thread -2 ");

    thread1.start();
    thread2.start();

   try {
    thread1.join();
    thread2.join();
   } catch (InterruptedException e) {
    Thread.currentThread().interrupt();;
   }
    System.out.println("Deadlock is resolved   between thread-1 and thread-2 so this line will  print ");
   
}
     
}

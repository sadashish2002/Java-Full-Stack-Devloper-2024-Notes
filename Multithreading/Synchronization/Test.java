// 1. Both threads t1 and t2 are sharing same resuources and same object

// without synchronized keyword  (raise condition)
  // a. both thread are running simultaneously.
  // b.So we will not get ideal answer 2000.
  // c.There will be no surity to get always answer

// with Synchronized keyword  (Critical section)
  // a. it will make sure that one thread will access increment() fun.
  //b. other thread will wait until t1 will not finish its task.
  // c. These above process is called mutual Exclusion.
  // d. when t1 will finish ,from that point or value t2 will increment value 
  // e. so due to synchronization we can get always 2000.

public class Test {
    public static void main(String[] args) {
        Counter counter = new Counter();

        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();
        
        try{
            t1.join();
            t2.join();
        }catch(Exception e){

        }
        System.out.println(counter.getCount());
    }
}

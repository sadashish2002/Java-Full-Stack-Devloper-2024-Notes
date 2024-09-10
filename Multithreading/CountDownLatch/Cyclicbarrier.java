import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.BrokenBarrierException;

//Drawback of CountDownLatch is that it is not resusable 
// once countdown reaches to zero

// To OverCome drawback of CountDownLatch , we use CyclicBarrier.

// It is a  synchronization aid that allows a set of threads
// to all wait for each other to reach a common barrier point. 
//CyclicBarriers are useful in programs involving a fixed sized party of threads 
//that must occasionally wait for each other. 
//The barrier is called cyclic because it can be re-used after the waiting threads are released.

//A CyclicBarrier constructor supports an optional Runnable command that is run once per barrier point,
// after the last thread in the party arrives, but before any threads are released. 
//This barrier action is useful for updating shared-state before any of the parties continue.

public class Cyclicbarrier {
    public static void main(String[] args) {
        
        int numberOfSubsystem = 4;
        CyclicBarrier barrier = new CyclicBarrier(numberOfSubsystem,new Runnable() {
            public void run(){
                System.out.println("All subsystem are up and running . System startup complete.");
            }
            
        });

        Thread webServerThread = new Thread(new Subsystem("Web Server", 2000, barrier));
        Thread databaseThread = new Thread(new Subsystem("Database", 4000, barrier));
        Thread cacheThread = new Thread(new Subsystem("Cache", 3000, barrier));
        Thread messagingServiceThread = new Thread(new Subsystem("Messaging Service", 3500, barrier));

        webServerThread.start();
        databaseThread.start();
        cacheThread.start();
        messagingServiceThread.start();

    }


}

class Subsystem implements Runnable {
    private String name;
    private int initializationTime;
    private CyclicBarrier barrier;

    public Subsystem(String name, int initializationTime, CyclicBarrier barrier) {
        this.name = name;
        this.initializationTime = initializationTime;
        this.barrier = barrier;
    }

   
    @Override
    public void run() {
        try {
            System.out.println(name + " initialization started.");
            Thread.sleep(initializationTime); // Simulate time taken to initialize
            System.out.println(name + " initialization complete.");
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

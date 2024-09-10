
import java.sql.Time;
import java.util.concurrent.*;

public class ScheduledExecutorServce {
    

    public static void main(String[] args) {
        // Creates a thread pool that can schedule commands to run after a given delay, 
        //or to execute periodically.
       /*
         ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.schedule(
             ()->System.out.println("Task executed after 5 second delay "),
         5, 
         TimeUnit.SECONDS);
         scheduler.shutdown();
        */

        // 2. .scheduleAtFixedRate() method

       /*
         //it Submits a periodic action that becomes enabled first after the given initial delay,
        // and subsequently with the given period;
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(
            () -> System.out.println("Task executed after every 5 seconds"),
            3,
            5,
            TimeUnit.SECONDS);
         // if we will not shutdown scheduler then for infinite time 
         // above code will run  at scheduleAtFixedRate
         
         //below code will wait for 20 second after that 
         //it will print and shutdown excecuter

       scheduler.schedule(()->{
        System.out.println("Initiating shutdown...");
        scheduler.shutdown();
        System.out.println(scheduler.isShutdown());
       }, 20, TimeUnit.SECONDS);

        */

        // 3. .scheduleWithFixedDelay()
           // it Submits a periodic action that becomes enabled first after the given initial delay,
           // and subsequently with the given delay between the termination of one execution and the commencement of the next.
    
        //scheduleAtFixedDelay() have feature of no over lapping becasue after 1 task it will delay for specific time to do other print
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleWithFixedDelay(
            () -> System.out.println("Task executed after every 5 seconds"),
            3,
            5,
            TimeUnit.SECONDS);
         // if we will not shutdown scheduler then for infinite time 
         // above code will run  at scheduleAtFixedRate
         
         //below code will wait for 20 second after that 
         //it will print and shutdown excecuter

       scheduler.schedule(()->{
        System.out.println("Initiating shutdown...");
        scheduler.shutdown();
        System.out.println(scheduler.isShutdown());
       }, 20, TimeUnit.SECONDS);

        
            
    }
}

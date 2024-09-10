class SharedResources {
    private int data;

    private boolean hasData;

    public synchronized void produce(int value){

        while(hasData){
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + data);
        notify();
        // if multiple consumer is there
        // notifyall();
    }

    public synchronized int  consume(){
                 
        while(!hasData){
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        hasData= false;
        System.out.println("Consumed: "+ data);
        notify();
        return data;
    }
}
class ProducerTask implements Runnable{
     private SharedResources resource;

     public  ProducerTask(SharedResources resource){
        this.resource = resource;

     }

     public void run(){
        for(int i =0;i<10;i++){
            resource.produce(i);
        }
     }
}


class ConsumerTask implements Runnable{
     private SharedResources resource;

     public  ConsumerTask (SharedResources resource){
        this.resource = resource;
     }
     public void run(){
        for(int i =0;i<10;i++){
            int value = resource.consume();
        }
     }
}



public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResources resource = new SharedResources();

        Thread producerThread = new Thread(new ProducerTask(resource));
        Thread consumerThread = new Thread(new ConsumerTask(resource));

        producerThread.start();
        consumerThread.start();
    }
    
}

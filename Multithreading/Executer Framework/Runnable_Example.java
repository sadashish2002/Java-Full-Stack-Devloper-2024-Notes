
public class Runnable_Example implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            
           throw new RuntimeException(e);
        }
        
    }
    
}

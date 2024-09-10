import java.util.concurrent.Callable;

@SuppressWarnings("rawtypes")
public class Callable_Example implements Callable{

    @Override
    public Object call() throws Exception {
       Thread.sleep(10);
        return 1;
    }

  

    
    
}

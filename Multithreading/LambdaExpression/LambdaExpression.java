
public class LambdaExpression {
        
    public static void main(String[] args) {
       // Anonymous class

         /* Runnable runnable = new Runnable(){

             public void run(){
                System.out.println("I am anonymous normal class");
            }
        }; */

        // Lambda Expression

       /* // Runnable runnable = ()-> {
        //       System.out.println("I am lambda Expression.");
        // };

         //or
        Runnable runnable = ()-> System.out.println("I am lambda Expression.");

        Thread t1 = new Thread(runnable);
        t1.start(); */

// Using Lambda Expression to create thread and its definition 
         
        Thread t1 = new Thread(()-> {
            for(int i =0;i<10;i++){
                System.out.println("Hellow world");
            }
        });

        t1.start();
    }

}

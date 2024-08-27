package ExceptionHandling;
public class tryCatch {
    public static void main(String[] args) {
       int a[] = new int[5];
       
       System.out.println("hello gys");
    //    try{


    //     int result = 5/8;
    //     System.out.println(a[4]);
        

    //    } catch (ArrayIndexOutOfBoundsException e){
    //     System.out.println("Tried to access the out of bond element ");
    //    }catch(ArithmeticException e){
    //     System.out.println("all not good");
    //     System.out.println(e.getMessage());
    //     System.out.println(e.toString());
    //     System.out.println(e.getStackTrace());
    //     System.out.println(e);
    //    }


       try{

        int result = 5/0;

        System.out.println(a[8]);
       }catch(ArrayIndexOutOfBoundsException|NullPointerException | ArithmeticException e){
        System.out.println("Handling the exception");
       }catch(RuntimeException e){

       }
       //If u want to handle all type of exception even though u dont kknow that which type of exception will occur then use parent exception (Exception e)
       catch(Exception e){
        System.out.println("Handling the  all type of exceptionexception");
       }



       
       System.out.println("Bye gusy");
      
    }
}

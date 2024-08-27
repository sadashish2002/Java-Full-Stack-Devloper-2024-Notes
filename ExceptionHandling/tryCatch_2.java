import java.io.FileReader;
import java.util.*;
public class tryCatch_2 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        
        FileReader f1 ;

        try{
            f1 = new FileReader("abc.txt");
            System.out.println(f1);
        }catch(Exception e){
            System.out.println(e.getLocalizedMessage());
        }finally{
            System.out.println("hello I am from finaly block");
        }


        System.out.println(8);

       System.out.println("*******************************************");
         int arr[] = {1,2};
        try{
            System.out.println(4/0);
            System.out.println(arr[3]);
            
        }catch(ArithmeticException ae){
            System.out.println(ae);
        }catch(NullPointerException ne){
            System.out.println(ne);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}

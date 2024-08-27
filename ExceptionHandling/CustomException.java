
import java.util.*;
/*public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");

        try{
            int age = sc.nextInt();
            if(age > 100){
                // throw  new MyException("My error is this");
                throw new ArithmeticException("exception handle ho gy");
            }

        }catch (Exception e){
            System.out.println(e);
        }

    }
} */

                         // CUSTOM EXCEPTION 

class MyException extends Exception{
  public MyException(String message){
    super(message);
}
    }

class Papu{
        static void pass(int marks) throws MyException{
            if(marks<30){
                throw new  MyException("Pappu fail ho gya");
            }
        }
    }

class CustomException{
    public static void main(String[] args) {
           try{
            Papu.pass(20);

           } catch(MyException e){
            System.out.println(e);
           }
        }
    }


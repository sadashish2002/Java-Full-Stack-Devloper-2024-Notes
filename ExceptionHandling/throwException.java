package ExceptionHandling;
public class throwException {
    public static void main(String[] args) {
        int a[] = new int[5];
      try{
        getNumberArray(a);
      
    }catch(Exception e){
        System.out.println("Catched exception handled");
    }
      
    }

    static int getNumberArray(int a[]) throws ArithmeticException{
        return a[8];
    }
}

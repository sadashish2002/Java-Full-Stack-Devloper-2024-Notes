package ExceptionHandling;
public class finallyTryCatchException {
    public static void main(String[] args) {
        int a[] = new int[6];

        System.out.println("Hello world");

        try{
            System.out.println(a[4]);
            System.out.println(a[14]);
        
        
        
        }catch(Exception e){
            System.out.println("Exception handled ");
       
       
        }finally{
            System.out.println("I will always run whether code has expcetion or not.");
        }
    }
}

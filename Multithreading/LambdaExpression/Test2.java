package Multithreading.LambdaExpression;

public class Test2 {
     public static void main(String[] args) {
          // we can implement  this using two method:
             //1. first create one engineering  interface
                  // second create a student class implement engineering
                  // third create object of student class 
                  // fourth call its method using oject and print

          //  Student st = new Student();

          //  String ram  = st.getBio("Ram");
          //  System.out.println(ram);

            //2. direct create object of Engineering interface with its function's definition mention in below

          EngineeringStudent es = new EngineeringStudent() {

               public String getBio(String name) {
                   return name + " is Engineering student ";
               }
               
          };
          String bio = es.getBio("Ram");
          System.out.println(bio);
     }
}

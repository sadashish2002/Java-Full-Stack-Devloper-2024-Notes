package MethodMath;
public class Method_Java {
    public static void main(String[] args) {
        greet();
       int av =  average(5, 3);
       int doubleavg = av * 2;
       System.out.println(doubleavg);
       int a = min(5,2);
       System.out.println(a);
    }

// if u want to call method inside static main method then
// u have to make method definition also static

      static void greet() {
        System.out.println("Hello world ");
      }

      // parametric method
      public static int  average(int a, int b){
        int avg = (a+b)/2;
        // System.out.println("average is " + avg);
        return avg;
      }

      static int min(int a , int b){
        return a<b ? a:b;
      }
}

import java.util.*;
public class StackList {
    public static void main(String[] args) {
      
        Stack<String> fruits = new Stack<>();

        fruits.push("A");
        fruits.push("B");
        fruits.push("C");
        fruits.push("D");
        fruits.push("E");

        System.out.println(fruits);

        //pop operationn
        System.out.println(fruits.pop());
        System.out.println(fruits);
       //peek operation
        System.out.println(fruits.peek());
        System.out.println(fruits.pop());
        System.out.println(fruits);

        //isempty operation
        System.out.println(fruits.isEmpty());





    }
}

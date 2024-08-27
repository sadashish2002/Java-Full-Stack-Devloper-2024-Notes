import java.util.*;
public class learnArrayList {
    

    public static void main(String[] args) {
        

      /*  List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list); */


        List<String> fruits = new ArrayList<>();

        fruits.add("Kiwi");
        fruits.add("mango");
        fruits.add("papaya");
        fruits.add("Apple");

        //to print list of stirng array
         System.out.println(fruits);

       System.out.println("------------------------------");

         // to print specific element line by line
         for(int i = 0 ; i < fruits.size(); i++){
            System.out.println("Fruits is " + fruits.get(i));
        }
       System.out.println("------------------------------");
        // to print all element using for each loop
        for( String fruit : fruits){
            System.out.println("for each fruit " + fruit );
        }

       System.out.println("------------------------------");
 
        // to print using iterator of collection framework.

        // Iterator<String> fe = fruits.iterator();// we can use .iterator for any interface of collection framework
        Iterator<String> fe = fruits.listIterator(); // we can use listiterator() for only list(array,list, stack)
        while(fe.hasNext()){
            System.out.println("iterator " + fe.next());
        }
        
        //.sublist()
        try{
        List<String> smallList = fruits.subList(1,3);
        System.out.println(smallList);


        }catch(Exception e){
            System.out.println("index is out of bond");
        }
       



    }
}



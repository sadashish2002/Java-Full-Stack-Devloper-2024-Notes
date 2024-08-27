import java.util.*;

// comprator class

class mycustomDogComparator implements Comparator<Animal>{

    public int compare(Animal o1 , Animal o2){
        return o1.weight - o2.weight;
    }
}
public class LearnComaparableAndComparator {
    public static void main(String[] args) {
        Animal a1 = new Animal(2, "Leo", 10);
        Animal a2= new Animal(5, "Bruno", 4);
        Animal a3 = new Animal(1, "Maxo", 6);
        Animal a4 = new Animal(4, "Don", 3);

        List<Animal> dogs = new ArrayList<>();

        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);

        System.out.println(dogs);

        //Two method to sort list of animal type collection 
        
        //1. comaprable sort method

         /*
         Collections.sort(dogs);

           System.out.println(dogs);
         */ 


         /*2. Comparator basis sorting helps to not do cherkani with animal main class
          u can define ur own comparator here only for own factor like based on weight or age or name
         */


        //  Collections.sort(dogs, new mycustomDogComparator());
                 
                  //or

        /*
          Collections.sort(dogs, new Comparator<Animal>() {
            public int compare(Animal o1 , Animal o2){
                return o1.name.compareTo(o2.name);
            }
         });
         System.out.println(dogs);
         
         */

           //or

         Collections.sort(dogs, (o1,o2) -> o1.name.compareTo(o2.name));
         System.out.println(dogs);
        

         // want to sort 2d matrix

         int a[][] = {{4,5,2},
                       {5,1,2},
                       {1,4,7}};
        Arrays.sort(a,(arr1,arr2)-> arr1[0]-arr2[0]);

        for(int e[]: a){
            for(int element:e){
                System.out.print(element+" ");
            }
            System.out.println();
        }
}
}

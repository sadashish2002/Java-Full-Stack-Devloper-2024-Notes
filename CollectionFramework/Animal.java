import java.util.*;

public class Animal implements Comparable<Animal>  {
    int age;

    String name;

    int weight;

    public Animal(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal [age=" + age + ", name=" + name + ", weight=" + weight + "]" + "\n";

        
    }

    public int compareTo(Animal that){
       if(this.age ==that.age){
        return this.name.compareTo(that.name);
       }
        return this.age - that.age;
    }



}

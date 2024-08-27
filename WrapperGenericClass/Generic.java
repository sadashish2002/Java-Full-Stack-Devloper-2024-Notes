package WrapperGenericClass;
public class Generic {
    public static void main(String[] args) {
        // Dog d1 = new Dog("addd325");
        // Dog d2 = new Dog("4622dsdgdg");

        // if u dont want string id in Dog method then 
        // generic come in picture
       
        // Dog<String> d1  = new Dog("dghdhg");
        // Dog<String> d2  = new Dog("dggdfklhg23");

        // Dog<Integer> d3 = new Dog(123);

        // System.out.println(d2.getid());

        Dog<String,String> d1  = new Dog("dghdhg", "bitch");
        Dog<Integer , String> d2  = new Dog(23,"lelo");

        Dog<Integer,Integer> d3 = new Dog(123,111);

    }
}

// class Dog {
//     String id;
//     public Dog(String id){
//         this.id = id;
//     }
// }

// Genric class

class Dog<E,V> {
// class Dog<E> {
    E id;
    V name;
     public Dog(E id , V name){
        this.id = id;
        this.name = name;
    }

    E getid() {
       return id; 
    }
}



import java.util.*;

// code for Java HashSet of Custom Objects
class student{
    int rollNo;
    String name;

    public student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + rollNo;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        student other = (student) obj;
        if (rollNo != other.rollNo)
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "student [rollNo=" + rollNo + ", name=" + name + "]";
    }

    

    
}
public class LearnSet {
    enum Color{
        RED , YELLOW , GREEN
    }
    public static void main(String[] args) {
    
        //ENUM set operation
System.out.println(Color.RED);
EnumSet<Color> enumSet = EnumSet.allOf(Color.class);

System.out.println("-----------------");

        // hashset operation



       /* Set<String> set = new HashSet<>();
        set.add("Ram");
        set.add("Ram");
        set.add("Shyam");
        set.add("Nam");
        set.add("Nam");
        set.add("Nam");
        System.out.println(set); */
        


    /*  Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(50);
        set.add(5);
        set.add(1);
        set.add(30);

        System.out.println(set.size());

        System.out.println(set.remove(10));


        System.out.println(set); 
        
        */  

        // code for Java HashSet of Custom Objects

        Set<student> set = new HashSet<>();

        student s1 = new student(1, "Sadashish");
        student s2 = new student(1, "vaishnavi");
        
System.out.println(s1.equals(s2));
        

        set.add(new student(1, "ram"));
        set.add(new student(1, "ram"));
        set.add(new student(1, "ram"));

        System.out.println(set);

        //LinkedHashset operation

    /* Set<Integer> st = new LinkedHashset<>();
        st.add(10);
        st.add(50);
        st.add(5);
        st.add(1);
        st.add(30);

     System.out.println(st); */

     // TreeSet operation

    /* 
    Set<Integer> st = new TreeSet<>(); //it store as  sort in binary search tree
     st.add(10);
        st.add(50);
        st.add(5);
        st.add(1);
        st.add(1);
        st.add(30);
        st.add(30);

        st.remove(1);
        System.out.println(st.contains(20));
        System.out.println(st);
 */

 

    }
}

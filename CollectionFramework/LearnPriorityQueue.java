
import java.util.*;
public class LearnPriorityQueue {
    public static void main(String[] args) {

        // Queue<Integer> pq = new PriorityQueue<>(); //min priority
        Queue<Integer> pq = new PriorityQueue<>((a,b)->b-a); //max priority


         pq.add(80);
         pq.add(70);
         pq.add(50);
         pq.add(10);
         pq.add(20);

         System.out.println(pq);

         System.out.println(pq.poll());
         System.out.println(pq.poll());
         System.out.println(pq.poll());
         System.out.println(pq.poll());
         System.out.println(pq.poll());
         System.out.println(pq.poll());

         System.out.println(pq);
        


        }
    }


import java.util.*;

public class LearnDeque {

   public static void main(String[] args) {
    
    
    //Stack and queue operation using ArrayDeque
       ArrayDeque<Integer> stack = new ArrayDeque<>();

       stack.push(10);
       stack.push(20);
       stack.push(40);
       stack.push(30);
       stack.push(50);

       System.out.println(stack);

       System.out.println(stack.pop());
       System.out.println(stack);

       System.out.println(stack.peek());

       // queue operation 
       ArrayDeque<Integer> q = new ArrayDeque<>();
        q.offer(11);
        q.offer(12);
        q.offer(13);
        q.offer(9);
        q.offer(1);

        System.out.println("queue =" + q);

        System.out.println(q.poll());
        System.out.println(q);

        System.out.println(q.peek());
        System.out.println(q);



    // Doubly ended queue (Deque) operations

   /* 
   ArrayDeque<Integer> dq = new ArrayDeque<>();
   dq.offer(12);
    dq.offer(13);
    dq.offer(14);
    dq.offer(15);
    dq.offer(16);

    System.out.println(dq);
     
    dq.pollLast();
    System.out.println(dq);

    System.out.println(dq.pollFirst());
    System.out.println(dq);

    System.out.println(dq.peek());
    System.out.println(dq); */
 

   }
  
}

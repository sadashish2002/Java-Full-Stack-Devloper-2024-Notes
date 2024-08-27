import java.util.*;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
       //offer()/add() operation
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        System.out.println(q);

        // .poll() or .remove() operation
        System.out.println(q.poll());

        System.out.println(q);

        //.peek() or .element() opetation
        System.out.println(q.peek());

        //to iterate using while and poll
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }

        System.out.println(q.peek());
        // System.out.println(q.element()); //show exception

        System.out.println(q.poll());
    }
}

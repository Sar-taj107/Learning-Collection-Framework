package QueueInterfaceExamples;
import java.util.*;

public class ImplementQueueUsingLinkedList {
    
    static void QueueExp(){

        LinkedList<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);

        System.out.println(q.peek());  //1
        System.out.println(q.poll());  //1 will also remove
        System.out.println(q.peek());  //2
        System.out.println(q.isEmpty()); //false
        System.out.println(q.size()); //2
        System.out.println(q);

    }
    public static void main(String[] args) {
        QueueExp();
    }
}

/*
 
1
1
2
false
2
[2, 3]

 */
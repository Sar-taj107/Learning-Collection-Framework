package QueueInterfaceExamples;
import java.util.*;

public class ImplementQueueUsingDeque {
    
    static void dequeExampleUsingArrayDeque(){

        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq); //2, 1, 3, 4
        System.out.println(dq.pollFirst()); //2
        System.out.println(dq.pollLast()); //4
        System.out.println(dq); //1,3

    }
    public static void main(String[] args) {
        dequeExampleUsingArrayDeque();
    }
}

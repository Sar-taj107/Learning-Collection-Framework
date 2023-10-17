package QueueInterfaceExamples;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ImplementQueueUsingPriorityQueue {
    
    static void priorityQueueExp(){

        PriorityQueue<Integer> pq = new PriorityQueue<>(); //by default min priority queue is form i.e the smallest element has the highest priority.
        //PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //max priority queue
        pq.add(10);
        pq.add(5);
        pq.add(7);

        System.out.println(pq.peek()); //5 
        System.out.println(pq);        //gurantee topmost ele will be processed first
        System.out.println(pq.poll()); //5
        System.out.println(pq);
        System.out.println(pq.peek()); //7




    }
    public static void main(String[] args) {
        priorityQueueExp();
    }
}

/*

OUTPUT: 
5
[5, 10, 7]
5
[7, 10]
7

 */

//------------------------------------------------------------------------

/*

we can make max priority queue using custom comparator
in this case
Output: 

10
[10, 5, 7]
10
[7, 5]
7

 */
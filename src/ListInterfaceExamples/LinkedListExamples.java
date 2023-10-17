import java.util.*;

public class LinkedListExamples {
    
    static void LinkedListExp(){

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);  // 1,2,3,4,5
        System.out.println(list.get(3));  //4
        list.add(4, 15);
        System.out.println(list); //1,2,3,15,5

        System.out.println(list.contains(15)); //true
    }
    public static void main(String[] args) {
        LinkedListExp();
    }
}

/*
 
[1, 2, 3, 4, 5]
4
[1, 2, 3, 4, 15, 5]
true

 */
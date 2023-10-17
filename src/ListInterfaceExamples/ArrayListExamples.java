import java.util.ArrayList;
//or 
import java.util.*;
public class ArrayListExamples {

    static void ArrayListExp(){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);                  //1,2,3
        System.out.println(l.get(1));     //1-based indexing = 2

        l.set(1,10 );             // modify at index 1
        System.out.println(l);                  // 1, 10, 3
  
        System.out.println(l.contains(10));   //true

        
    }
    public static void main(String[] args) {
        ArrayListExp();
    }
}

/*
 OUTPUT:
 
[1, 2, 3]
2
[1, 10, 3]
true

 */
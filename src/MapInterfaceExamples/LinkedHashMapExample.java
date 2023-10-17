package MapInterfaceExamples;
import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        Map<Integer,String> mp = new LinkedHashMap<>(); //here order preserved
        mp.put(2,"Raj");
        mp.put(3,"Sahil");
        mp.put(1,"Aman");
        mp.put(5,"Jhon");
        System.out.println(mp);


    }
}

package MapInterfaceExamples;
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> mp = new HashMap<>();
        mp.put(3, "Aryan");
        mp.put(1, "Soham");
        mp.put(2, "ali");
        mp.put(4, "Rahul");
        mp.putIfAbsent(3, "Aryan"); //if value previousely not present then only add 
        System.out.println(mp);

        System.out.println(mp.get(2)); //ali
        System.out.println(mp.containsKey(6)); //false
        System.out.println(mp.containsValue("Soham")); //true

        //iteraing over keys in a map
        for(var i:mp.keySet()){
            System.out.println(i);
        }
        //iteraing over values in a map
        for(var i:mp.values()){
            System.out.println(i);
        }

    }
}

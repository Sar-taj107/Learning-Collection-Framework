package MapInterfaceExamples;
import java.util.*;
//import java.util.TreeMap;

public class TreeMapExample {
    
    public static void main(String[] args) {
        
        TreeMap<Integer,String> mp = new TreeMap<>(); //preserve sorted order
        mp.put(2,"Jay");
        mp.put(1,"Ria");
        mp.put(3,"Sameer");
        System.out.println(mp);

        mp.putIfAbsent(4, "Aryan"); //if value previousely not present then only add 
        System.out.println(mp);

        System.out.println(mp.get(2)); //Jay
        System.out.println(mp.containsKey(6)); //false
        System.out.println(mp.containsValue("Sameer")); //true

        //iteraing over keys in a map
        for(var i:mp.keySet()){
            System.out.println(i);
        }
    }
}

/*
 
{1=Ria, 2=Jay, 3=Sameer}
{1=Ria, 2=Jay, 3=Sameer, 4=Aryan}        
Jay
false
true
1
2
3
4

 */
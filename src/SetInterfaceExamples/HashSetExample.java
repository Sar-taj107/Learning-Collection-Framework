package SetInterfaceExamples;
import java.util.*;

public class HashSetExample {

    public static void main(String[] args){

        HashSet<Integer> st =new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(48);
        st.add(15);
        st.add(10);
        System.out.println(st); //48,1,2,3,10,15

        st.add(1);
        st.add(1);
        st.add(2);
        System.out.println(st); //48,1,2,3,10,15
        st.remove(2);
        System.err.println(st.contains(2)); //false
        System.out.println(st.size()); //5
    }
}

/*
 
[48, 1, 2, 3, 10, 15]
[48, 1, 2, 3, 10, 15]
false
5

 */
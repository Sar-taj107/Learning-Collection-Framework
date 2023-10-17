package SetInterfaceExamples;
import java.util.*;

public class LinkedHashSetExample {
    
    public static void main(String[] args) {

        LinkedHashSet<Integer> st = new LinkedHashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(48);
        st.add(30);
        st.add(24);
        System.out.println(st); //1,2,3,48,30,24 here order of insertion is preserved
    }
}

/*
 
[1, 2, 3, 48, 30, 24]

 */
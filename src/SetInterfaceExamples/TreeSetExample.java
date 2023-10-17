package SetInterfaceExamples;
import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        
        TreeSet<Integer> st = new TreeSet<>(); //sotred order preserve
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(48);
        st.add(15);
        st.add(36);
        System.out.println(st);
    }
}

/*
 
[1, 2, 3, 15, 36, 48]

 */
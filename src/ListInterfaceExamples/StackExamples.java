import java.util.*;

public class StackExamples {
    
   static void stackExp(){

    Stack st = new Stack<>();

    st.push("Hello");
    st.push("World");

    System.out.println(st.peek()); // World
    System.out.println(st.pop());  // World (will also remove it)
    System.out.println(st.peek()); // Hello
    System.out.println(st.size()); //1
    System.out.println(st.empty()); //false


   }
   public static void main(String[] args) {
    stackExp();
   }

}

/*
 
World
World
Hello
1
false

 */
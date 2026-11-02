package coding_blocks_lec25;

import com.sun.security.jgss.GSSUtil;

import java.util.Stack;

public class Stack_java {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.capacity());
        //push
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
//        st.push(50);
        System.out.println(st);
        //view
        System.out.println(st.peek()); // only show the data at the top
        //remove
        System.out.println(st.pop()); //only delete the data from the top
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.isEmpty());


        for(int x:st){
            System.out.print( x +" ");
        }
        System.out.println();

    }
}

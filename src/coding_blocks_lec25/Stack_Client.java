package coding_blocks_lec25;

public class Stack_Client {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        Stack st = new Stack();
        // add
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        //st.push(60);
        // remove
        System.out.println(st.pop());
        // view
        System.out.println(st.peek());
        st.display();
    }

}

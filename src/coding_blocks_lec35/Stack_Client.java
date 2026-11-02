package coding_blocks_lec35;


public class Stack_Client {
    public static void main(String[] args) {
       Stack_Class sc = new Stack_Class();
       Stack_Class sc1 = new Stack_Class(){
           @Override
           public void push(int x) {
               super.push(x);
           }

           @Override
           public int pop() {
               return super.pop();
           }

           @Override
           public int peek() {
               return super.peek();
           }
       };

    }
}

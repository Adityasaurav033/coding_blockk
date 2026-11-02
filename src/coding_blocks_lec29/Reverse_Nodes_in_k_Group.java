package coding_blocks_lec29;

import java.util.Stack;

public class Reverse_Nodes_in_k_Group {
           public class ListNode {
           int val;
           ListNode next;
           ListNode() {}
           ListNode(int val) { this.val = val; }
           ListNode(int val, ListNode next) { this.val = val; this.next = next; }
       }

    class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
            ListNode dummy = new ListNode();
            ListNode start = new ListNode();
            ListNode temp = dummy;
            Stack<ListNode> st = new Stack<>();
            while(head != null){
                if(st.size() == k){
                    start = head;
                    while(!st.isEmpty()) {
                        dummy.next = st.pop();
                        dummy = dummy.next;
                    }
                    dummy.next = null;
                }else{
                    st.push(head);
                    head = head.next;
                }
            }
            if(!st.isEmpty()){
                dummy.next = start;
            }
            return  temp.next;
        }
    }
}

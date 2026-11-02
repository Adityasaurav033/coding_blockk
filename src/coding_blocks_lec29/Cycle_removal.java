package coding_blocks_lec29;


public class Cycle_removal {

    private class Node {
        int val;
        Node next;

    }

    private Node head;
    private Node tail;
    private int size;

    // O(1)
    public void addLast(int item) {
        Node nn = new Node();
        nn.val = item;
        if (size == 0) {
            head = nn;
            tail = nn;
            size++;
        } else {
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    private Node getNode(int k) {

        Node temp = head;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void CreateCycle() {
        tail.next = getNode(2);
    }

    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.println(".");

    }

    public Node hasCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return slow;
            }

        }
        return null;
    }
    public void flyoedCycleRemoval(){
        Node meet = hasCycle();
        if (meet == null) {
            return;
        }
        Node fast = meet;
        Node slow = head;
        while(slow.next != fast.next){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }

    //O(N)
    public void Cycleremoval2() {
        Node meet = hasCycle();
        if (meet == null) {
            return;
        }
        // 1. Cycle ki length
        Node temp = meet ;
        int c = 1;
        while(temp.next != meet){
            c++;
            temp = temp.next;
        }
        //2. Fast ko c distance ahead move kar do
        Node fast = head;
        for(int i = 0; i < c;i++){
            fast = fast.next;
        }
        // 2. slow and fast ko move krna hai
        Node slow = head;
        while(slow.next != fast.next){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }

    //O(N^2)
    public void Cycleremoval1(){
        Node meet = hasCycle();
        if(meet == null){
            return;
        }
        Node start = head;
        while(start != null){
            Node temp = meet;
            while(temp.next != meet){
                if(temp.next == start){
                    temp.next = null;
                    return;
                }
                temp = temp.next;
            }
            start = start.next;
        }
    }
    public static void main(String[] args) throws Exception {
        Cycle_removal cl = new Cycle_removal();
        cl.addLast(1);
        cl.addLast(2);
        cl.addLast(3);
        cl.addLast(4);
        cl.addLast(5);
        cl.addLast(6);
        cl.addLast(7);
        cl.addLast(8);
        cl.CreateCycle();
//        cl.Cycleremoval1();
//        cl.Cycleremoval2();
        cl.flyoedCycleRemoval();
        cl.Display();
    }

}

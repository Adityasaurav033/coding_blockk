package coding_blocks_lec28;

public class linkedList {
    public static class Node{
        int val;
        public Node next;
        public Node(int val){
            this.val = val;
        }
    }
    private Node head;
    private Node tail;
    private int size;


    //O(1)
    public void addfirst(int item){
        Node nn = new Node(item);
        if(size == 0){
            head = nn;
            tail = nn;
            size++;
        }
        else{
            nn.next = head;
            head = nn;
            size++;
        }
    }

    public void addlast(int item){
        if(size == 0){
            addfirst(item);
        }else{
            Node n = new Node(item);
            tail.next = n;
            tail = n;
            size++;
        }
    }

    //O(N)
    public void addAtIndex(int item,int k){
        if(k == 0){
            addfirst(item);
        }
        else if(k == size){
            addlast(item);
        }else{
            Node nn = new Node(item);
            Node prev = getNode(k-1);
            nn.next = prev.next;
            prev.next = nn;
            size++;
        }
    }
    //O(N)
    private Node getNode(int k){
        Node temp = head;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+ "->");
            temp = temp.next;
        }
        System.out.println(".");
    }

    //O(1)
    public int size(){
        return size;
    }
    //O(1)
    public int getfirst(){
        return head.val;
    }
    //O(1)
    public int getlast(){
        return tail.val;
    }
    //O(1)
    public int getatindex(int k){
        return getNode(k).val;
    }

    //O(1)
    public int removefirst(){
        Node temp = head;
        if(size == 1){
            head = null;
            tail = null;

        }else{
            head = head.next;
            temp.next = null;
        }
        size--;
        return temp.val;
    }

    //O(N)
    public int removelast(){
        if(size == 1){
            return removefirst();
        }
        else{
            Node prev = getNode(size - 2);
            int val = tail.val;
            tail = prev;
            tail.next = null;
            size--;
            return val;
        }
    }

    public int removestindex(int k){
        if(k==0){
            return removefirst();
        }else if( k == size-1){
            return removelast();
        }else{
            Node prev = getNode(k-1);
            Node curr = prev.next;
            prev.next = curr.next;
            curr.next = null;
            size--;
            return curr.val;
        }
    }
}

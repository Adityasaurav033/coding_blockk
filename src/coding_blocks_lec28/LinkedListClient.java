package coding_blocks_lec28;

public class LinkedListClient {
    public static void main(String[] args){
        linkedList ll = new linkedList();
        ll.addfirst(10);
        ll.addfirst(20);
        ll.addfirst(30);
        ll.addfirst(40);
        ll.display();

        System.out.println(ll.getatindex(2));
//        System.out.println(ll.getfirst());

    }
}

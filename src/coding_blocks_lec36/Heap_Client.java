package coding_blocks_lec36;

import coding_blocks_lec26.P;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap_Client {
    static void main() {
        Heap hp = new Heap();
        hp.add(5);
        hp.add(7);
        hp.add(9);
        hp.add(4);
        hp.add(2);
        hp.add(3);
        hp.add(2);
        hp.display();

//        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(5);
        pq.add(7);
        pq.add(9);
        pq.add(4);
        pq.add(2);
        pq.add(3);
        pq.add(2);
        System.out.println(pq);

    }


}

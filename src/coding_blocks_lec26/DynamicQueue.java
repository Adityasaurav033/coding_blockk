package coding_blocks_lec26;

import coding_blocks_lec25.*;

public class DynamicQueue extends Queue {
    @Override
    public void Enqueue(int x) throws Exception {
        if (isfull()) {
            int[] ar = new int[2 * size()];
            for (int i = 0; i < size(); i++) {
                int idx=(front+i)%size();
                ar[i]=arr[idx];
            }
            arr=ar;
            front=0;
        }
        super.Enqueue(x);
    }
    public static void main(String[] args) throws Exception {
        DynamicQueue dq = new  DynamicQueue();
        dq.Enqueue(10);
        dq.Enqueue(20);
        dq.Enqueue(30);
        dq.Enqueue(40);
        dq.Enqueue(50);
        System.out.println(dq.Deqeueu());
        System.out.println(dq.Deqeueu());
        dq.Enqueue(60);
        dq.Enqueue(70);
        dq.Enqueue(80);
        dq.display();
    }

}
package coding_blocks_lec26;

public class DynamicQueueClient {
    public static void main(String[] args) throws Exception{
        DynamicQueue dq = new DynamicQueue();
        dq.Enqueue(10);
        dq.Enqueue(20);
        dq.Enqueue(30);
        dq.Enqueue(40);
        dq.Enqueue(50);
        System.out.println(dq.Deqeueu());
        System.out.println(dq.Deqeueu());
        dq.Enqueue(60);
        dq.Enqueue(70);



    }
}

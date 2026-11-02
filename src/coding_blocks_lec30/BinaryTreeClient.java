package coding_blocks_lec30;

public class BinaryTreeClient {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.Display();
        System.out.println(bt.max());
        System.out.println(bt.find(90));
        System.out.println(bt.ht());
        bt.PreOrder();
        System.out.println();
        bt.InOrder();
        System.out.println();
        bt.PostOrder();
        System.out.println();
        bt.LevelOrder();

    }
}

// 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
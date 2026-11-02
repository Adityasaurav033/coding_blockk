package coding_blocks_lec32;

public class BinarySearchTree {
    class Node{
        int val;
        Node right;
        Node left;
        public Node(int val){
            this.val = val;
        }

    }

    private Node root;
    public BinarySearchTree(int[] in){
        root = CreateTree(in,0,in.length-1);
    }

    private Node CreateTree(int[] in , int si , int ei){
        if(si > ei){
            return null;
        }
        int mid = (si + ei) / 2;
        Node nn = new Node(in[mid]);
        nn.left = CreateTree(in,si,mid-1);
        nn.right = CreateTree(in,mid+1,ei);
        return nn;

    }
}

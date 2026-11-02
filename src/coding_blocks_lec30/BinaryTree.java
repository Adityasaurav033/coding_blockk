package coding_blocks_lec30;

import coding_blocks_lec26.P;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
    class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }

    private Node root;
    Scanner sc = new Scanner(System.in);

    //constructor
    public BinaryTree(){
        root = createTree();
    }

    private Node createTree(){
        int val = sc.nextInt();
        Node node = new Node(val);
        boolean hlc = sc.nextBoolean();// for left
        if(hlc){
            node.left = createTree();
        }
        boolean hrc = sc.nextBoolean(); // for tight
        if (hrc) {
            node.right = createTree();
        }
        return node;
    }

    public void Display(){
        Display(root);
    }

    private void Display(Node nn){
        if(nn == null){
            return;
        }
        String s = "";
        s = "<--" + nn.val + "-->";
        if(nn.left != null){
            s=nn.left.val+s;
        }
        else{
            s = "." +s;
        }
        if(nn.right != null){
            s = s + nn.right.val;
        }else{
            s = s +".";
        }

        System.out.println(s);
        Display(nn.left);
        Display(nn.right);
    }

    public int max(){
        return max(root);
    }

    private int max(Node nn){
        if(nn == null){
            return Integer.MIN_VALUE; // when the node is null
        }
        int lf = max(nn.left);
        int rf = max(nn.right);
        return Math.max(nn.val,Math.max(lf,rf));
    }

    public boolean find(int val){
        return find(root,val);
    }

    private boolean find(Node nn, int val){
        if(nn == null){
            return false;
        }
        if(nn.val == val){
            return true;
        }
        boolean l = find(nn.left,val);
        boolean r = find(nn.right,val);
        return  l || r;

    }

    public int ht(){
        return ht(root);
    }

    private int ht(Node node){
        if(node == null){
            return -1;
        }

        int lh = ht(node.left);
        int rh = ht(node.right);
        return Math.max(lh,rh)+1;
    }

    public void PreOrder(){
        PreOrder(root);
        System.out.println();
    }

    private void PreOrder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.val + " ");
        PreOrder(node.left);
        PreOrder(node.right);
    }

    public void InOrder(){
        InOrder(root);
        System.out.println();
    }

    private void InOrder(Node node){
        if(node == null){
            return;
        }

        InOrder(node.left);
        System.out.println(node.val + " ");
        InOrder(node.right);


    }
    public void PostOrder(){
        PostOrder(root);
        System.out.println();
    }

    private void PostOrder(Node node){
        if(node == null){
            return;
        }

        PostOrder(node.left);
        PostOrder(node.right);
        System.out.println(node.val + " ");


    }


    public void LevelOrder(){
        Queue<Node>  q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node r = q.poll();
            System.out.println(r.val);
            if(r.left != null){
                q.add(r.left);
            }

            if(r.right != null){
                q.add(r.right);
            }
        }
        System.out.println();
    }
}

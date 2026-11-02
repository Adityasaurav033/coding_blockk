package coding_blocks_lec34;

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {

    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
   }

    class Solution {
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            return bT(preorder,inorder,0,inorder.length - 1,0,preorder.length - 1);
        }
        public TreeNode bT(int[] pre, int[] in,int ilo,int ihi,int plo,int phi) {
            if(ilo > ihi || plo > phi){
                return null;
            }
            TreeNode t = new TreeNode(pre[plo]);
            int idx = search(in,ilo,ihi,pre[plo]);
            int c = idx - ilo;
            t.left = bT(pre,in,ilo,idx-1,plo + 1 ,plo + c);
            t.right = bT(pre,in,idx + 1, ihi, plo + c + 1, phi );
            return t;
        }

        public int search(int[] in , int si , int ei , int item){
            for(int i = si;i <= ei; i++){
                if(in[i] == item){
                    return i;
                }
            }
            return -1;

        }

    }
}

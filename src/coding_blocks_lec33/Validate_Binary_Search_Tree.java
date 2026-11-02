package coding_blocks_lec33;

public class Validate_Binary_Search_Tree {
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
        public boolean isValidBST(TreeNode root) {
            return validBST(root).bst;
        }
        public BstPair validBST(TreeNode root){
            if(root == null){
                return new BstPair();
            }
            BstPair lbp = validBST(root.left);
            BstPair rbp = validBST(root.right);
            BstPair sbp = new BstPair();
            sbp.min = Math.min(lbp.min, Math.min(rbp.min,root.val));
            sbp.max = Math.max(lbp.max, Math.max(rbp.max,root.val));
            if(lbp.bst && rbp.bst && lbp.max < root.val && rbp.min > root.val){
                sbp.bst = true;
            }else{
                sbp.bst = false;
            }
            return sbp;
        }

        class BstPair{
            boolean bst = true;
            long min = Long.MAX_VALUE;
            long max = Long.MIN_VALUE;
        }
    }
}

package coding_blocks_lec33;

public class Maximum_sum_BSt {
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
        public int maxSumBST(TreeNode root) {
            return  0;
        }

        public BstPair validBST(TreeNode root){
            if(root == null) {
                return new BstPair();
            }
            BstPair lbp = validBST(root.left);
            BstPair rbp = validBST(root.right);
            BstPair sbp = new BstPair();
            sbp.min = Math.min(lbp.min, Math.min(rbp.min,root.val));
            sbp.max = Math.max(lbp.max, Math.max(rbp.max,root.val));
            sbp.sum = lbp.sum + rbp.sum + root.val;
            if(lbp.bst && rbp.bst && lbp.max < root.val && rbp.min > root.val){
                sbp.bst = true;
                sbp.ans = Math.max(lbp.ans,Math.max(rbp.ans,sbp.sum));
            }else{
                sbp.bst = false;
                sbp.ans = Math.max(lbp.ans,rbp.ans);
            }
            return sbp;
        }

        class BstPair{
            boolean bst = true;
            long min = Long.MAX_VALUE;
            long max = Long.MIN_VALUE;
            int ans = 0;
            int sum = 0;
        }
    }
}

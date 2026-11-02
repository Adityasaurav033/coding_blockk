//package coding_blocks_lec34;
//
//import java.util.*;
//
//public class Serialize_and_Deserialize_Binary_Tree {
//      public class TreeNode {
//       int val;
//       TreeNode left;
//       TreeNode right;
//       TreeNode(int x) { val = x; }
//   }
//
//    public class Codec {
//
//        // Encodes a tree to a single string.
//        public String serialize(TreeNode root) {
//            StringBuilder sb = new StringBuilder();
//            reserialize(root,sb);
//            return sb.toString();
//        }
//
//        public void reserialize(TreeNode root,StringBuilder sb) {
//            if(root == null){
//                sb.append(null + ",");
//                return;
//            }
//            sb.append(root.val+ ",");
//            reserialize(root.left, sb);
//            reserialize(root.right,sb);
//        }
//
//        // Decodes your encoded data to tree.
//        public TreeNode deserialize(String data) {
//            String[] arr = data.split(",");
//            List<String> l = new ArrayList<>();
//            for(String x :arr){
//                l.add(x);
//            }
//
//        }
//
//        public TreeNode redeserialize(String[] arr,int i) {
//            if(i == arr.length || arr[i].equals("null")){
//                return null;
//            }
//            TreeNode t= new TreeNode(Integer.parseInt(arr[i]));
//            t.left = redeserialize(arr,i + 1);
//        }
//
//
//    }
//
//}

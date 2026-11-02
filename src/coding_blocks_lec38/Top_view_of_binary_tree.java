package coding_blocks_lec38;

import coding_blocks_lec26.P;

import java.util.*;

public class Top_view_of_binary_tree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public List<Integer> TopView(TreeNode root) {
            Queue<Pair> q = new LinkedList<>();
            q.add(new Pair(root,0));
            TreeMap<Integer,Integer> map = new TreeMap<>();
            while(!q.isEmpty()) {
                Pair rp = q.poll();
                if(!map.containsKey(rp.vt)){
                    map.put(rp.vt,rp.root.val);
                }

                if(rp.root.left != null) {
                    q.add(new Pair(rp.root.left,rp.vt-1));
                }
                if(rp.root.right != null) {
                    q.add(new Pair(rp.root.right,rp.vt+1));
                }
            }
            List<Integer> ll = new ArrayList<Integer>();
            for(int x : map.keySet()){
                ll.get(map.get(x));
            }
            return ll;
        }

    }

    class Pair{
        TreeNode root;
        int vt;
        public Pair(TreeNode root, int vt){
            this.root = root;
            this.vt = vt;
        }
    }
}

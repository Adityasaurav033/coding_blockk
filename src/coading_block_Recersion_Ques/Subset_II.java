package coading_block_Recersion_Ques;

import java.util.*;

public class Subset_II {
    public static void main(String[] args) {

        int[] nums = {1, 2,2};

        List<List<Integer>> ll = new ArrayList<>();
        Arrays.sort(nums);
        subSet(nums,ll,new ArrayList<>(),0);

        System.out.println(ll);
    }

    public static void subSet(int[] nums, List<List<Integer>> ll,List<Integer> li, int idx) {
        if(idx == nums.length){
            for (int i = 0; i <ll.size(); i++) {
                if (ll.get(i).equals(li)) {
                   return;
                }
            }
            ll.add(new ArrayList<>(li));
            return;
        }


            subSet(nums, ll, li, idx + 1);
            li.add(nums[idx]);
            subSet(nums, ll, li, idx + 1);
            li.remove(li.size() - 1);


    }
}

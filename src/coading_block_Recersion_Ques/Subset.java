package coading_block_Recersion_Ques;
import javax.lang.model.type.ArrayType;
import java.util.*;
import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ll = new ArrayList<>();
        subSet(nums,ll,new ArrayList<>(),0);
        System.out.println(ll);
    }

    public static void subSet(int[] nums, List<List<Integer>> ll,List<Integer> li, int idx) {
        if(idx == nums.length) {
            ll.add(new ArrayList<>(li));
            return;
        }
                subSet(nums,ll,li,idx+ 1 );
                li.add(nums[idx]);
                subSet(nums,ll,li,idx+1);
                li.remove(li.size()-1);
    }

}




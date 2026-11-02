package coading_block_Recersion_Ques;

import java.util.ArrayList;
import java.util.List;

public class Combination_sum_II {
    public static void main(String[] args) {
        List<List<Integer>> li = new ArrayList<>();
        int[] candidates = {2,5,2,1};
        int target = 5;
        List<Integer> ans = new ArrayList<>();
        combination(candidates,target,ans,li,0 );

        System.out.println(li);
    }
    public static void combination(int[] ques, int target, List<Integer> ans, List<List<Integer>> li , int idx){

        if(target == 0){
            li.add(new ArrayList<>(ans)); // To save the copy of the array
            return;
        }

        for(int i = idx; i < ques.length;i++){
            if(target >= ques[i]) {

                if (!isValid(ques,ques[i],i+1)) {
                ans.add(ques[i]);

                    combination(ques, target - ques[i], ans, li, i + 1);
                    ans.remove(ans.size() - 1); // undo
                }
            }
        }
    }
    public static boolean isValid(int[] ques, int key ,int id){
        for(int i = id; i< ques.length;i++){
            if(ques[i] == key){
                return true;
            }
        }
        return false;
    }
}

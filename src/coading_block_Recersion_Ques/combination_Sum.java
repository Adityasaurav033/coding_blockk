package coading_block_Recersion_Ques;
import java.util.*;

public class combination_Sum {
    public static void main(String[] args) {
        List<List<Integer>> li = new ArrayList<>();
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
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


                    ans.add(ques[i]);
                    combination(ques, target - ques[i], ans, li, i+1);
                    ans.remove(ans.size() - 1); // undo

            }
        }
    }



}

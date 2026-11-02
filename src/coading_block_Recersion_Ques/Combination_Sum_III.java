package coading_block_Recersion_Ques;

import java.util.*;
public class Combination_Sum_III {
    public static void main(String[] args) {
        List<List<Integer>> ll = new ArrayList<>();
        int k = 3;
        int n = 9;

        List<Integer> li = new ArrayList<>();
        Combination(n,k,ll,li,0);

        System.out.println(ll);


    }

    public static void Combination(int n, int k, List<List<Integer>> ll, List<Integer> li , int idx) {
        if (li.size() == k && n == 0) {
            ll.add(new ArrayList<>(li));
            return;
        }
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

            for (int i = idx; i < arr.length; i++) {
                if(n >= arr[i]) {
                    li.add(arr[i]);
                    Combination(n - arr[i], k, ll, li, i + 1);
                    li.remove(li.size() - 1);
                }
            }

    }
}

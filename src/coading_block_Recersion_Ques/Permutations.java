package coading_block_Recersion_Ques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        List<List<Integer>> ll = new ArrayList<>();
        call_permutation(arr, "", 0, new ArrayList<>(), ll);
        System.out.println(ll);
    }

    public static void call_permutation(int[] arr, String ans, int idx, List<Integer> li, List<List<Integer>> ll) {

        if (li.size() == arr.length) {
            ll.add(new ArrayList<>(li));
            return;
        }


        for (int i = 0; i < arr.length; i++) {


                li.add(arr[i]);

                call_permutation(arr, ans + arr[idx], i, li, ll);
                li.remove(li.size() - 1);
            }

            }

    }


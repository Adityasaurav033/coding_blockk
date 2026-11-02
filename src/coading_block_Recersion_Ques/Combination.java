package coading_block_Recersion_Ques;
import java.util.*;

public class Combination {
    public static void main(String[] args) {
        List<List<Integer>> ll = new ArrayList<>();
        int n= 4;
        int k = 2;

        int[] arr= new int[n];
        List<Integer> la = new ArrayList<>();

        combination(k,arr,ll,la,0);

        System.out.println(ll);
    }

    public static  void combination( int k ,int[] arr, List<List<Integer>> ll,List<Integer> la ,int idx){
        if(la.size() == k){ // la size = k return
            ll.add(new ArrayList<>(la));
            return;
        }
        for(int i = idx ; i< arr.length;i++){
            arr[i] = i+1;
            la.add(arr[i]); // add kar diya -> la
            combination(k,arr,ll,la,i+1);
            la.remove(la.size()-1);//Undo
        }
    }
}

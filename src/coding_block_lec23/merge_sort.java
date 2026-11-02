package coding_block_lec23;

public class merge_sort {
    public static void main(String[] args) {
        int[] arr = {2,3,7,4,1};
        int[] a = Sort(arr,0,arr.length-1);

        for(int i = 0 ; i< arr.length;i++){
            System.out.print(a[i] + " ");
        }
    }
    //merge sort ka best case, worst case and average case nlogn

    public static int[] Sort(int[] arr, int si, int ei){
        if(si == ei){
            int[] bs = new int[1];
            bs[0] = arr[si];
            return bs;
        }
        int mid = (si + ei) / 2;
        int[] a = Sort(arr,si,mid);
        int[] b = Sort(arr,mid + 1 ,ei);
        return Merge_two(a,b);
    }

    public static int[] Merge_two(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[n + m];

        int i = 0, j = 0, k = 0;
        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                ans[k++] = arr1[i++];
            }else{
                ans[k++] = arr2[j++];
            }
        }

        while(i < n){
            ans[k++] = arr1[i++];
        }
        while(j < m){
            ans[k++] = arr2[j++];
        }

        return ans;
    }
}

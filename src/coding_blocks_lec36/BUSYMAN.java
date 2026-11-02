package coding_blocks_lec36;
import  java.util.*;
public class BUSYMAN {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        pair[] arr = new pair[n];
        for(int i = 0; i< arr.length;i++){
            int st = sc.nextInt();
            int et = sc.nextInt();
            arr[i] = new pair(st,et);
        }
        Arrays.sort(arr,(a,b)-> a.et - b.et);
        int activitie = 1;
        int end = arr[0].et;
        for(int i = 0; i< arr.length;i++){
            if(arr[i].st >= end){
                activitie++;
                end = arr[i].et;
            }
        }
        System.out.println(activitie);
    }

    static class pair{
        int st;
        int et;
        public pair(int st ,int et){
            this.et = et;
            this.st = st;

        }
    }
}

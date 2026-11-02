package coding_blocks_lec36;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Meeting_Rooms_II {
   public static void main() {
        int[][] intervals = { { 9, 30 }, { 5, 10 }, { 15, 20 }, { 6, 9 }, { 2, 6 }, { 3, 5 } };

    }

    public static int meeting_room(int[][] intervals){
        Arrays.sort(intervals,(a,b) ->a[0] -b[0]);
        PriorityQueue<int []> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        pq.add(intervals[0]);
        for(int i = 1;i <intervals.length;i++){
            if(intervals[i][0] >= pq.peek()[1]){
                pq.poll();
            }
            pq.add(intervals[i]);
        }
     return pq.size();
    }
}

package coding_blocks_lec35;

public class cars_Client {

    public static void main() {
        Cars[] arr = new Cars[5];
        arr[0] = new Cars(200, 10, "White");// P S C
        arr[1] = new Cars(1000, 20, "Black");
        arr[2] = new Cars(345, 3, "Yellow");
        arr[3] = new Cars(34, 89, "Grey");
        arr[4] = new Cars(8907, 6, "Red");

        display(arr);
    }

    public static <A extends Comparable<A>> void Sort(A[] arr) {
        int n = arr.length;
        for (int turn = 1; turn < n; turn++) {
            for (int i = 0; i < n - turn; i++) {
                if(arr[i].compareTo(arr[i + 1])> 0) {
                    A temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                }
            }
        }

    }

    public static  <A> void display(A[] arr){
        for (int i = 0; i< arr.length;i++){
            System.out.println(arr[i] ) ;
        }
    }




}

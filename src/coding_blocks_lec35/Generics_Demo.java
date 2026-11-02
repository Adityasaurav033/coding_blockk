package coding_blocks_lec35;

public class Generics_Demo{
    public static void main(String[] args) {
        Integer[] arr = {10,20,30,40,50};
        display(arr);
        String[] arr1 = {"Ankit" , "Raj" , "Anas" ,"DJ" ,"Champa"};
        display(arr1);
    }

    public static <A> void display(A[] arr){
        for(int i= 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

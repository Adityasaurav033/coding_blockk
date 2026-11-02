package coding_blocks_lec26;

public class Sum_of_N_Number {
    public static void main(String[] args) {
        System.out.println(add(2,3));
        System.out.println(add(2,3,5));
        System.out.println(add(2,3,5.7));
        System.out.println(add(2,3,4,53,5,6,4,6,4,6,3));
    }

    public static int add(int a,int b){
        return a + b;
    }

    public static int add(int a,int b,int c){
        return a + b + c;
    }
    public static int add(int a,int b,double c){
        return (int)(a + b + c);
    }
    public static int add(int ...x){ // int ...x only be used in the last....because it takes the continuous length
        int sum = 0;
        for(int i = 0; i < x.length;i++){
            sum += x[i];
        }
        return sum;
    }
}

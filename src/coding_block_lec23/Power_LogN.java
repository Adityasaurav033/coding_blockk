package coding_block_lec23;

public class Power_LogN {
    public static void main(String[] args) {
        int a= 3;
        int n = 3;
        System.out.println(pow(a,n));
    }
    public static int pow (int a , int n ){
        if(n == 0){
            return 1;
        }
        int x = pow(a,n/2);
        x = x *x ;
        if(n%2 !=0){
            x = x *a;
        }
        return x;
    }
}

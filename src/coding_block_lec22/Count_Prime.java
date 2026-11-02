package coding_block_lec22;

public class Count_Prime {
    public static void main(String[] args) {
        int n= 10;
        int count = 0;
        for(int i=2;i<n;i++){
            if(IsPrime(i) == true){
                count++;
            }
        }

        System.out.println(count);
    }
    public static boolean IsPrime(int n){

        int div = 2;
        while(div*div<=n){
            if(n % div == 0) {
                return false;
            }
            div++;
        }
        return true;
    }
}

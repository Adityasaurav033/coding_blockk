package coding_block_lec23;

import java.util.Random;

public class random_number {
    public static void main(String[] args) {


    int lo = 10;
    int hi = 100;
    Random rn = new Random();
    for(int i = 0; i<10;i++){
        int x = rn.nextInt(hi - lo + 1) + lo;
        System.out.println(x);
    }
    }
}

package coding_blocks_lec26;
import coding_blocks_lec25.*;
public class DynamicStack extends  Stack{
    @Override
    public void push(int x) throws Exception{
        if(isFull()){
            int[] ar = new int[2 * size()];
            for(int i = 0; i < size();i++){
                ar[i] = arr[i];
            }

            arr = ar;
        }
        super.push(x);// parent class
    }
}

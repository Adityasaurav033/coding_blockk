package coding_block_lec22;

public class Palindromic_Substrings {
    public static void main(String[] args) {
        String s = "naan";

    }

    public static int Axis_Orbit(String s){
        //odd
        int odd = 0;
        for(int axis = 0; axis < s.length();axis++){
            for(int orbit = 0; axis - orbit >=0 && axis + orbit < s.length();orbit++){
                if(s.charAt(axis - orbit) == s.charAt(axis + orbit)){
                    odd++;
                }else{
                    odd++;
                    break;
                }

            }
        }
        //Even
        int even = 0;
        for(double axis = 0.5; axis < s.length();axis++){
            for(double orbit = 0.5; axis - orbit >=0 && axis + orbit < s.length();orbit++){
                if(s.charAt((int)(axis - orbit)) == s.charAt((int)(axis + orbit))){
                    even++;
                }else{
                    even++;
                    break;
                }
            }
        }
        return odd + even;
    }
}

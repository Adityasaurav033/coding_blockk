package coding_blocks_lec27;


import java.util.Stack;

public class Construct_Smallest_Number_From_DI_String {
    public static void main(String[] args) {
        String pattern = "IIIDIDDD";
        System.out.println(Construct_Smallest_Number(pattern));
    }

    public static String Construct_Smallest_Number(String pattern){
        int[]  ans = new int[pattern.length() + 1];
        int c = 1;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i <= pattern.length();i++){
            if(i == pattern.length() || pattern.charAt(i) == 'I'){
                ans[i] = c++;
                while(!st.isEmpty()){
                     ans[st.pop()] = c++;
                }
            }
            else {
                st.push(i);
            }
        }
        String str = "";
        for(int i= 0; i< ans.length;i++){
            str += ans[i];
        }
        return str;
    }
}

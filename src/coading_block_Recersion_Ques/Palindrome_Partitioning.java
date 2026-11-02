package coading_block_Recersion_Ques;

public class Palindrome_Partitioning {
    public static void main(String[] args) {
        String ques = "aab";
        subString(ques,"");

    }

    public static void subString(String ques, String ans){
        if(ques.length() == 0){
            if(isPalindrom(ans) == true) {
                System.out.println(ans);
            }
            return;
        }
        Character ch =  ques.charAt(0);

            subString(ques.substring(1), ans);
            subString(ques.substring(1), ans + ch);

    }

    public static boolean isPalindrom(String ques){
        String str = "";
        for(int i = ques.length()-1;i>=0;i--){
            str += ques.charAt(i);
        }
        return ques.equals(str);
    }
}

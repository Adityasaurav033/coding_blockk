package coading_block_Recersion_Ques;
import java.util.*;
public class Letter_Combinations_of_a_Phone_Number {

    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        String ques = "23";
        Letter_combinations("",ques,ls);
        System.out.println(ls);
    }

    private static void Letter_combinations( String ans,String digits,List<String> ls) {
        String[] key = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits.length() == 0){
            ls.add(ans);
            return;
        }

        char ch = digits.charAt(0);
        String keypaid = key[ch - '0'];
        for(int i = 0; i< keypaid.length();i++){
            Letter_combinations(ans + keypaid.charAt(i),digits.substring(1),ls);
        }

    }
}

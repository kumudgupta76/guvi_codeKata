import java.util.*;


public class VowelCon{
    public static boolean isVowel(char c){
        String vowels = "aeiouAEIOU";
        return vowels.contains(c+"");
    }
    
    public static boolean isConsanant(char c){
        String cons = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        return cons.contains(c+"");
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char c=s.charAt(0);
        if(isVowel(c)&&(s.length()==1))
        {
            System.out.println("Vowel");
        }else if (isConsanant(c)&&(s.length()==1))
        {
            System.out.println("Consanant");
        }else
        {
            System.out.println("invalid");
        }
        }
}
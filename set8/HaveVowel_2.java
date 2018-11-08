import java.util.*;

public class HaveVowel_2{
    public static void main (String srgs[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        boolean bool=false;
        for (int i =0;i<s1.length();i++)
        {
            if (s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'||s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i)=='U')
            {
                bool=true; 
                break;
                
            }
           
        }
        if (bool)
        System.out.print("yes");
        else
        System.out.println("no");
    }
}
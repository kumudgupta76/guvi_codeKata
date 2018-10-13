import java.util.*;


public class NoOfDigits{
    public static void main(String ags[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        String s=n+"";
        if(n<0)
        s=s.substring(1);
        System.out.println(s.length());
    }
}
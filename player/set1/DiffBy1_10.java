import java.util.*;

public class DiffBy1_10{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String p=sc.next();
        int c=0,n;
        if(s.length()<p.length())
            {
                n=s.length();
                c=p.length()-s.length();
            }
            else{
                n=p.length();
                c=s.length()-p.length();
            }
        for (int i=0;i<n;i++)
        {
            if (s.charAt(i)!=p.charAt(i))
            {
                c++;
            }
        }
        if(c==1)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
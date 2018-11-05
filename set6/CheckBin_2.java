import java.util.*;

public class CheckBin_2{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        boolean flag=true;
        for ( int i =0;i<s.length();i++)
        {
            if ( s.charAt(i)!='0' && s.charAt(i)!='1')
            {
              
            System.out.println("no");
            flag=false;
            break;
            }
        }
        if(flag)
        System.out.println("yes");
    }
}
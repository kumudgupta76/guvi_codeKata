import java.util.*;

public class IsISO_5{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        String T=sc.next();
        if (S.length()==T.length())
        {
        boolean f=true;
        for (int i=1;i<S.length();i++)
        {
            if((S.charAt(i)-T.charAt(i))!=(S.charAt(i-1)-T.charAt(i-1)))
            {
                f=false;
            }
        }
        if (f)
        System.out.println("yes");
        else
        System.out.println("no");
    }else
    System.out.println("no");
}
    
}
import java.util.*;

public class DigitLen_9{
    public static void main(String at[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0;
        n=sc.nextInt();
        if(n>0)
        {
            System.out.println((""+n).length());
        }else
        {
            n=-n;
            System.out.println((""+n).length());
        }
    }
    
}

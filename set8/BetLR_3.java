import java.util.*;

public class BetLR_3{
    public static void main (String srgs[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=sc.nextInt();
        int r=sc.nextInt();
        if (l<=n&&r>=n)
        System.out.print("yes");
        else
        System.out.println("no");
    }
}
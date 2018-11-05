import java.util.*;

public class CountK_7{
    public static void main(String at[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k,c=0;
        n=sc.nextInt();
        k=sc.nextInt();
        for ( int i=0;i<n;i++)
        {
            if (k==sc.nextInt())
            {
                c++;
            }
        }
        System.out.println(c);
    }
    
}

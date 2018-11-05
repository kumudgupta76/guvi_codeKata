import java.util.*;

public class ExitsK_8{
    public static void main(String at[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k,c=0;
        n=sc.nextInt();
        k=sc.nextInt();
        for ( int i=0;i<n;i++)
        {
            if (k==sc.nextInt())
            {c++;
                
            }
        }
        if(c==0)
        System.out.println("no");
        else
        System.out.println("yes");
    }
    
}

import java.util.*;

public class Max10_9{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int max=Integer.MIN_VALUE;
        for ( int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        for ( int i=0;i<10;i++)
        {
            if(a[i]>max)
            max=a[i];
        }
        System.out.println(max);
    }
}

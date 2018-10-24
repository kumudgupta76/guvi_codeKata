import java.util.*;

class LowHighArray_7{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for ( int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for (int j:a)
        {
            if(j<min)
            {
                min=j;
            }
            if(j>max)
            {
                max=j;
            }
        }
        System.out.println(min+" "+max);
        
    }
}
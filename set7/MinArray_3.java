import java.util.*;

public class MinArray_3{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int min=Integer.MAX_VALUE;
        for ( int i =0;i<10;i++)
        {
            int n=sc.nextInt();
            if(min>n)
            {
                min=n;
            }
        }
        System.out.println(min);
    }
}
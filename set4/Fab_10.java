import java.util.*;

public class Fab_10{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=1,b=1;
    if (n==1)
    System.out.print(a);
    else if (n==2)
    System.out.println(a+" "+b);
    else
    {
        System.out.print(a+" "+b+" ");
        for (int i=2;i<n;i++)
        {
            int c=a+b;
            
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    
}}
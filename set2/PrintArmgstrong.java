import java.util.*;



public class PrintArmgstrong{
    public static boolean isPrime(int a)
    {
        int b=0;
        int c=a;
        while(a>0)
        {
            int r=a%10;
            r=r*r*r;
            b+=r;
            a/=10;
        }
        return b==c;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for ( int i =a+1;i<b;i++)
        {
            if (isPrime(i))
            System.out.print(i+" ");
        }
        
    }
}
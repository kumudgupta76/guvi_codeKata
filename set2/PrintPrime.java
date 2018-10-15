import java.util.*;



public class PrintPrime{
    public static boolean isPrime(int n)
    {
        boolean result=false;
        for ( int i =2;i<=n/2;i++)
        {
            if (n%i==0)
            result=true;
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for ( int i =a+1;i<b;i++)
        {
            if (!isPrime(i))
            System.out.print(i+" ");
        }
        
    }
}
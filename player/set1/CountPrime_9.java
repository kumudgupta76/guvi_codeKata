import java.util.*;



public class CountPrime_9{
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
        int l=sc.nextInt();
        int r=sc.nextInt();
        int c=0;
        for (int i=l;i<=r;i++)
        if (!isPrime(i))
        {
            c++;
        }
        System.out.println(c);
    }
}
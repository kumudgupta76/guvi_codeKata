import java.util.*;



public class Factorial{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact =1;
        if (n==0||n==1)
        {
            fact=0;
        }
        for ( int i =2;i<=n;i++)
        {
            fact*=i;
        }
        System.out.println(fact);
    }
}
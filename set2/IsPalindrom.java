import java.util.*;



public class IsPalindrom{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a;
        int c=0;
        while (b>0)
        {
            int r=b%10;
            c=c*10+r;
            b/=10;
        }

        
        boolean result=(a==c);
        if (result)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
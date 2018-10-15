import java.util.*;



public class IsArmgstrong{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=0;
        int c=a;
        while(a>0)
        {
            int r=a%10;
            r=r*r*r;
            b+=r;
            a/=10;
        }
        if (b==c)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
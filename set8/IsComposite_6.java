import java.util.*;



public class IsComposite_6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean result=false;
        for ( int i =2;i<=n/2;i++)
        {
            if (n%i==0)
            result=true;
        }
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
import java.util.*;



public class ISPS_9{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int m=sc.nextInt();
        System.out.println(n*m);
        if (n==m)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
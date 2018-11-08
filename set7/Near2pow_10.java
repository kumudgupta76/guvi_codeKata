import java.util.*;



public class Near2pow_10{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=1;
        while(m<n)
            m*=2;
            System.out.println(m);
    }
}
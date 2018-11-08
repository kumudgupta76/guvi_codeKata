import java.util.*;



public class Max{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for ( int i =0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for( int i: a){
            if (i>max)
            {
                max=i;
            }
        }
        System.out.println(max);
    }
}
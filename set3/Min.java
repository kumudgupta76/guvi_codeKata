import java.util.*;



public class Min{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for ( int i =0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int min=a[0];
        for( int i: a){
            if (i<min)
            {
                min=i;
            }
        }
        System.out.println(min);
    }
}
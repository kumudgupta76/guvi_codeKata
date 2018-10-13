import java.util.*;

import javax.sound.midi.SysexMessage;

public class SumOfK{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        for ( int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        if (n>=k)
        {
            for (int i=0;i<k;i++)
            {
                sum+=a[i];
            }
            System.out.println(sum);
        }
        else{
            System.out.println("Invalid k");
        }
        
    }
}
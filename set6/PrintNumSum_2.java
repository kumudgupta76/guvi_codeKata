import java.util.*;

public class PrintNumSum_2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String n;
        if(num>0)
            n=""+num;
        else
        {
            num=-num;
            n=""+num;
        }
        int sum =0;
        for( int i=0;i<n.length();i++)
        {
           sum=sum+Integer.parseInt(""+n.charAt(i));
        }
        System.out.println(sum);
    }
    
}
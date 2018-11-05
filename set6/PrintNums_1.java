import java.util.*;

public class PrintNums_1
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
        for( int i=0;i<n.length();i++)
        {
            System.out.print(n.charAt(i)+" ");
        }
    }
    
}
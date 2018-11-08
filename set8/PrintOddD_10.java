import java.util.*;



public class PrintOddD_10{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=n+"";
        for ( int i =0;i<s.length();i++)
        {
            if ((Integer.parseInt(s.charAt(i)+"")%2!=0))
            System.out.print((Integer.parseInt(""+s.charAt(i)))+" ");
        }
    }
}
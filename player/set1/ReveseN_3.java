import java.util.*;

public class ReveseN_3{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Integer.parseInt(new String((new StringBuilder(""+n)).reverse())));
    }
}
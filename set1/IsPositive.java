import java.util.*;


public class IsPositive{
    public static void main(String ags[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        if (n>0)
            System.out.println("Positive");
        else if (n<0)
            System.out.println("Negitive");
        else
            System.out.println("Zero");
    }
}

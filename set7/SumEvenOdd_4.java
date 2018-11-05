import java.util.*;

public class SumEvenOdd_4{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
       if((sc.nextInt()+sc.nextInt())%2==0)
        System.out.println("even");
        else
        System.out.println("odd");
    }
}
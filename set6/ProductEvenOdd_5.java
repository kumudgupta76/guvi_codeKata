import java.util.*;

public class ProductEvenOdd_5
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num1=sc.nextInt();
        if((num*num1)%2==0)
            System.out.println("even");
        else
        {
            System.out.println("odd");
        }
    }
    
}
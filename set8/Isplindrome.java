import java.util.*;

public class Isplindrome{
    public static void main (String srgs[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        boolean bool=true;
        for (int i =0,j=s1.length()-1;i<=j;i++,j--)
        {
            if (s1.charAt(i)==s1.charAt(j))
            continue;
            else
            {
                bool=false; 
                break;
                
            }
           
        }
        if (bool)
        System.out.print("yes");
        else
        System.out.println("no");
    }
}
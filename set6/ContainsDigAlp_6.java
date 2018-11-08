import java.util.*;

public class ContainsDigAlp_6
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        boolean flagd=false,flaga=false;
        
        for( int i=0;i<n.length();i++)
        {
            if (n.charAt(i)==' ')
            {
                continue;
            }
            if ((n.charAt(i)<='9')&&(n.charAt(i)>='0'))
            {
                flagd=true;
            }
            else if(((n.charAt(i)<='z')&&(n.charAt(i)>='a'))||((n.charAt(i)<='Z')&&(n.charAt(i)>='A')))
            {
                flaga=true;
            }
        }
        if(flaga&&flagd)
           System.out.println("yes");
        else
        {
            System.out.println("no");
        }
    }
    
}
import java.util.*;

public class C2m_5{
    public static void main (String srgs[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if (s.length()%2==0)
        System.out.print(s.substring(0,s.length()/2-1)+"**"+s.substring(s.length()/2+1));
        else
        System.out.println(s.substring(0,s.length()/2)+"*"+s.substring(s.length()/2+1));
    }
}
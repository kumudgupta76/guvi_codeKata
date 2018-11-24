import java.util.*;

public class Roman_5{
    public static void main(String args[])
    {
        String s[]=new String[]{"I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX"};
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        for (int i=0;i<s.length;i++)
        {
            if (S.equals(s[i]))
            {
                System.out.print(i+1);
            }
        }
    }
}
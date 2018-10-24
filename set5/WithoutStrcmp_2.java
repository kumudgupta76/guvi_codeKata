import java.util.*;

class WithoutStrcmp_2{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        int t=0;
        if(a.length()>=b.length())
        {
            for ( int i=0;i<b.length();i++)
            {
                if (a.charAt(i)>b.charAt(i))
                {
                    System.out.println(a);
                    break;
                }
                else if(a.charAt(i)<b.charAt(i))
                {
                    System.out.println(b);
                    break;
                }
                t++;
            }
        }
        if(t==a.length())
        System.out.println(a);
    }
}
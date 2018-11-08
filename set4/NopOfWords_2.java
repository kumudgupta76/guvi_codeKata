import java.util.*;

class NopOfWords{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ss[]=s.split(" ");
        System.out.println(ss.length);
    }
}
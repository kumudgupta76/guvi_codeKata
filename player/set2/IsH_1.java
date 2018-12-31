import java.util.*;



public class IsH_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if (s.equalsIgnoreCase("sunday")||s.equalsIgnoreCase("saturday"))
        System.out.println("yes");
        else
        {
            System.out.println("no");
        }
    }
}
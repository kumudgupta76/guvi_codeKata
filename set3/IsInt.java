import java.util.*;



public class IsInt{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        String s=sc.next();
        try {
            n=Integer.parseInt(s);
            System.out.println("yes");
        }
        catch(Exception e)
        {
            System.out.println("no");
        }
        
    }
}
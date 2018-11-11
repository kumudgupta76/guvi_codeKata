import java.util.*;



public class IsInt{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double n;
        String s=sc.next();
        try {
            n=Double.parseDouble(s);
            System.out.println("yes");
        }
        catch(Exception e)
        {
            System.out.println("no");
        }
        
    }
}
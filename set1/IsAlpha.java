import java.util.*;

import javax.sound.midi.SysexMessage;

public class IsAlpha{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int c=s.charAt(0);
        if(((c>='a' && c<='z') || (c>='A' && c<='Z'))&&(s.length()==1))
        {
            System.out.println("Alphabat");
        }else 
        {
            System.out.println("No");
        }
        }
}
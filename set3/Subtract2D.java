import java.util.*;
import java.time.*;


public class Subtract2D{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        LocalTime l1=LocalTime.of(sc.nextInt(),sc.nextInt());
        long h=sc.nextLong();
        long m=sc.nextLong();
        LocalTime l2=l1.minusMinutes(m);
        l2=l2.minusHours(h);
        System.out.println(l2.getHour()+" "+l2.getMinute());
    }
}
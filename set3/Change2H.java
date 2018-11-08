import java.util.*;



public class Change2H{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),hour=0,min=0;
        if (n<60)
        {
            min=n;
            hour=0;
        }
        else{
            min=n%60;
            hour=n/60;
        }
        System.out.println(hour+" "+min);
    }
}
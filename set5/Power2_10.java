import java.util.*;

class Power2_10{
    public static void main(String arg[])
    {
        int tempNum,flag;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        tempNum=num;
        flag=0;
        while(tempNum!=1)
        {
            if(tempNum%2!=0){
                flag=1;
                break;
            }
            tempNum=tempNum/2;
        }
    
        if(flag==0)
        System.out.println("yes");
        else
        System.out.println("no");
        
    }
}
 
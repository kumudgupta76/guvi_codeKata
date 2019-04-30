package set6;
import java.util.Scanner;

public class _3 {
	public static int SubString(String str, int n,int k) 
    {
		int count=0;
       for (int i = 0; i < n; i++)  
           for (int j = i+1; j <= n; j++)  
                {
        	   if(str.substring(i,j).length()==k)
        	   System.out.print(str.substring(i, j)+" ");
                }
    return count;
    } 
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		SubString(st,st.length(), sc.nextInt());
		sc.close();
	}
}

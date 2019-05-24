package set13;

import java.util.Scanner;

public class _1 {

	public static boolean isPal(String str)
	{
		String rev="";
		int length = str.length();
		 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
		return rev.equals(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String X=new String ();
		int count=0;
		for(int i=0;i<s.length();i++)
			for(int j=i+1;j<=s.length();j++)
			{
				String x=s.substring(i,j);
				//System.out.println(i+":"+j+"    "+(j+i)+"*"+s.substring(i,j)+":"+isPal(s.substring(i,j)));
				if(isPal(x)&&x.length()>count) {
					count=x.length();
					X=x;
				}
			}
		System.out.println(X);
		sc.close();
				
	}


}

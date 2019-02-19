package set3;

import java.util.Scanner;

public class _7NotPal {
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
		String s2=new String ();
		int count=0;
		for(int i=1;i<=s.length();i++)
			for(int j=s.length()-i;j>=0;j--)
			{
				//System.out.println(i+":"+j+"    "+(j+i)+"*"+s.substring(j,i+j)+":"+isPal(s.substring(j,i+j)));
				if(!isPal(s.substring(j,i+j)))
					s2=s.substring(j,i+j);
				count++;
			}
		System.out.println(s2);
		sc.close();
				
	}

}

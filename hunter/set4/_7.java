package set4;

import java.util.Scanner;

public class _7 {
	public static boolean isPal(String s)
	{
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		boolean b=true;
		for(int i=0;i<s.length();i++)
		{
			String c="";
			if(i==0)
				c=s.substring(1);
			if(i==s.length()-1)
				c=s.substring(0, s.length()-1);
			else
				c=s.substring(0,i)+s.substring(i+1);
			//System.out.println(c);
			if(isPal(String.valueOf(c)))
			{
				System.out.println("YES");
				b=false;
				break;
			}
		}
		if(b)
			System.out.println("NO");
		sc.close();
	}

}

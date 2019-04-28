package set4;

import java.util.Scanner;

public class _10 {
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
		int sumd=0;
		for(int i=0;i<s.length();i++)
		{
			sumd+=(int)(s.charAt(i)-48);
		}
		if(isPal(sumd+""))
			System.out.println("YES");
		else
			System.out.println("NO");
		sc.close();
	}

}

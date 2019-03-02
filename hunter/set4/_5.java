package set4;

import java.util.Scanner;

public class _5 {

	public static boolean pal(String s)
	{
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()/2+i))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		boolean b=false;
		for(int i=0;i<s.length();i++)
		{
			if(!b) {

				if(i==0)
					b=pal(s.substring(1));
				else if(i==s.length()-1)
					b=pal(s.substring(0, s.length()-1));
				else 
					b=pal(s.substring(0,i)+s.substring(i+1));

			}
			else
				break;
		}
		if(b)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}

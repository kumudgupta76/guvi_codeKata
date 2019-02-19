package set1;

import java.util.Scanner;

public class TransN {
	static int count=0;
	public static void subs(String pre,String s)
	{
		//System.out.println("in subs: "+pre+"*"+s+"@"+count++);
		int n=s.length();
		if(n==0) {
			//System.out.println("-"+pre);
			count++;
		}
		else if(n==1)
		{
			//System.out.println("-"+pre+""+(char)(Integer.parseInt(s)+64));
			count++;
		}else if(s.length()==2)
		{
			int i=Integer.parseInt(s.substring(0, 1));
			char c=(char) (i+64);
			subs(pre+c,s.substring(1));
			if(Integer.parseInt(s)<=26)
				subs(pre+(char)(Integer.parseInt(s)+64),"");
		}else
		{
			int i=Integer.parseInt(s.substring(0, 1));
			char c=(char) (i+64);
			subs(pre+c,s.substring(1));
			i=Integer.parseInt(s.substring(0, 2));
			if(i<=26)
			subs(pre+(char)(i+64),s.substring(2));
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		subs(new String(),n+"");
		System.out.print(count);
		sc.close();
	}
	
		
}

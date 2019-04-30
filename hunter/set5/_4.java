package set5;

import java.util.Scanner;

public class _4 {
	public static void main(String argd[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0){
			char a[]=Integer.toBinaryString(n).toCharArray();
			String s="";
		for(int x=0;x<a.length;x++)
		{
			if(a[x]=='1')
				s+='4';
			else
				s+='3';
		}
		System.out.println(s);
		}
		sc.close();
	}
}

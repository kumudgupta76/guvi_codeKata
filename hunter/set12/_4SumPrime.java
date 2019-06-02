package set12;

import java.util.Scanner;

public class _4SumPrime {
	
	public static boolean checkP(char ch[])
	{
		int n=0;
		for(char c:ch)
		{
			n+=(c-'0');
		}
		if(n==1)
			return false;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return  false;
			
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int r=sc.nextInt();
		int count =0;
		for(int i=l;i<=r;i++)
		{
			//System.out.println(checkP((i+"").toCharArray()));
			if(checkP((i+"").toCharArray()))
				count++;
		}
		System.out.println(count);
	}

}

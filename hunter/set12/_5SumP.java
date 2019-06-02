package set12;

import java.util.Scanner;

public class _5SumP {
	public static boolean checkP(int n)
	{
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
		int n=sc.nextInt();
		int count =0;
		for(int i=1;i<=n/2;i++)
		{
			//System.out.println(checkP((i+"").toCharArray()));
			if(checkP(i)&&checkP(n-i))
				count++;
		}
		System.out.println(count);
	}

}

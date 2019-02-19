package set3;

import java.util.Scanner;

public class _4sum2k {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a []=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		boolean b=false;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]+a[j]==k)
				{
					b=true;
					break;
				}
			}
		}
		if(b)
			System.out.println("YES");
		else
			System.out.println("NO");
		sc.close();
	}
}

package set3;

import java.util.Scanner;

public class _9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE;
		for(int i=1;i<=n;i++)
			for(int j=n-i;j>=0;j--)
			{
				int sum=0;
				for(int k=j;k<j+i;k++)
				{
					sum+=a[k];
				}
				if(sum>max)
					max=sum;
			}
		System.out.println(max);
		sc.close();
	}

}

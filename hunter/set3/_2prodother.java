package set3;

import java.util.Scanner;

public class _2prodother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int prod=1;
			for(int j=0;j<n;j++)
			{
				if(i!=j)
					prod*=a[j];
			}
			System.out.print(prod+" ");
		}
	}

}

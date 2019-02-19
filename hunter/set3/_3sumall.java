package set3;

import java.util.Scanner;

public class _3sumall {
	public static int max(int a,int b)
	{
		return a>b?a:b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int sum=0;
		int a[][]=new int[n][m];
		int b[][]=new int[n][m];
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				a[i][j]=sc.nextInt();
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
			{
				if(i==0||j==0)
				{
					if(i>0)
						b[i][j]=b[i-1][j]+a[i][j];
					else if(j>0)
						b[i][j]=b[i][j-1]+a[i][j];
					else
						b[i][j]=a[i][j];
				}
				else
				{
					b[i][j]=max(b[i][j-1],b[i-1][j])+a[i][j];
				}
			}
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<m;j++)
//			{
//				System.out.print(b[i][j]+" ");
//			}
//			System.out.println();
//		}
		System.out.println(b[n-1][m-1]);
		sc.close();
	}

}

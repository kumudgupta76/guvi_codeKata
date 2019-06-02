package set12;

import java.util.Scanner;

public class _1DigSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
				if(i==j)
					sum+=a[i][j];
			}
				
		}
		System.out.println(sum);
		sc.close();
	}

}

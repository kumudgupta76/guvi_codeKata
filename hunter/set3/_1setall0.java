package set3;

import java.util.ArrayList;
import java.util.Scanner;

public class _1setall0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				a[i][j]=sc.nextInt();
		ArrayList<Integer> row=new ArrayList<>();
		ArrayList<Integer> col=new ArrayList<>();
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				if(a[i][j]==0)
				{
					row.add(i);
					col.add(j);
				}
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
			{
				if(row.contains(i)||col.contains(j))
					a[i][j]=0;
			}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++)
				System.out.print(a[i][j]);
			System.out.println();}
		
	}

}

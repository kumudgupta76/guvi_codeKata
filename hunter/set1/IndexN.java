package set1;

import java.util.Scanner;

public class IndexN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for (int i=0;i<a.length;i++) {
			if(i==a[i])
				System.out.print(a[i]);
		}
		sc.close();
	}

}

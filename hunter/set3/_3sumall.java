package set3;

import java.util.Scanner;

public class _3sumall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				sum+=sc.nextInt();
		System.out.println(sum);
		sc.close();
	}

}

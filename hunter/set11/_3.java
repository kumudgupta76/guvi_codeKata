package set11;

import java.util.Scanner;

public class _3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<k;j++)
			{
				System.out.print(1+" ");
			}
			k+=2;
			System.out.println();
		}
	}

}

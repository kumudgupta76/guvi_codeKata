package set6;

import java.util.Scanner;

public class _5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int r=input.nextInt();
		int a[]=new int[n];	
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		for(int i=r;i<n;i++)
			System.out.print(a[i]+" ");
		for(int i=0;i<r;i++)
			System.out.print(a[i]+" ");
		input.close();
	}

}

package set6;

import java.util.Arrays;
import java.util.Scanner;

public class _9 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int a[]=new int[n],b[]=new int[n];	
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			b[i]=input.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print((a[i]+b[i])+" ");
		}
		input.close();
	}

}

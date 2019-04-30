package set6;

import java.util.Scanner;

public class _8 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int k=input.nextInt();
		int a[]=new int[n];	
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++)
			for(int j=0;j<i;j++)
			{
				if(k==Math.abs(a[i]-a[j]))
					{
						count++;
					}
			}
		System.out.println(count);
		input.close();
	}

}

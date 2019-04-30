package set6;

import java.util.Scanner;

public class _6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int a[]=new int[n];	
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		int x=0,y=0,min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
			{
				if(i!=j)
				{
					if(min>Math.abs(a[i]+a[j]))
					{
						min=a[i]+a[j];
						x=i;
						y=j;
					}
				}
			}
		System.out.println(a[x]+" "+a[y]);
		input.close();
	}

}

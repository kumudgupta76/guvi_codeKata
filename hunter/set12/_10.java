package set12;

import java.util.Scanner;

public class _10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//System.out.println(i+" "+j+" "+a[i]+" "+a[j]);
				for(int k=0;k<n;k++)
					{
						if(i<j&&j<k&&a[i]+a[j]==a[k])
							count++;
					}
					
			}
		}
		System.out.println(count);
	}

}

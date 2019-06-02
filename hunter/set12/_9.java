package set12;

import java.util.Scanner;

public class _9 {

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
				if(i<j&&a[i]<a[j])
					count++;
			}
		}
		System.out.println(count);
	}

}

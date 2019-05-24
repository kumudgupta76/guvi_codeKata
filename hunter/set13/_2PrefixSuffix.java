package set13;

import java.util.Scanner;

public class _2PrefixSuffix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		int pre=a[0],suff=sum-(a[0]+a[1]);
		boolean b=false;
		for(int i=1;i<n-1;i++)
		{
			if(pre==suff) {
				b=true;
				break;
			}
			pre+=a[i];
			suff-=a[i+1];
		}
		if(b)
		System.out.println("yes");
		else
			System.out.println("no");
		sc.close();
	}

}

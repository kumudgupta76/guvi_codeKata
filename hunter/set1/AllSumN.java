package set1;
import java.util.Scanner;

public class AllSumN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int k=0;k<n;k++)
		{
			for(int j=0;j<k;j++)
			{
				for(int i=0;i<j;i++)
				{
					if(a[i]+a[j]==a[k])
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
				}
			}
		}
		sc.close();
	}

}

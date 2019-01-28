package set1;
import java.util.Scanner;

public class Close20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		int min=Integer.MAX_VALUE;
		int J=0,K=0;
		for(int k=0;k<n;k++)
		{
			for(int j=0;j<n;j++)
			{
				if(j!=k)
				{
					if(Math.abs(a[j]+a[k])<min)
					{
						min=Math.abs(a[j]+a[k]);
						J=a[j];
						K=a[k];
					}
				}
					
			}
		}
		System.out.println(J+" "+K);
		sc.close();
	}

}


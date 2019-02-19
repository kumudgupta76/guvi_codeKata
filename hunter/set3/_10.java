package set3;

import java.util.ArrayList;
import java.util.Scanner;

class p{
	int a;
	int b;
	public p(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
}
public class _10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s[]=new int[n];
		int f[]=new int[n];
		for(int i=0;i<n;i++)
		{
			s[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			f[i]=sc.nextInt();
		}
		ArrayList<p> k=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			k.add(new p(s[i],f[i]));
		}
		k.sort((p e1,p e2)->e1.b-e2.b);
		int count=1;
		for(int i=1;i<n;i++)
		{
			if(k.get(i).a>=k.get(i-1).b)
				count++;
		}
		System.out.println(count);
		sc.close();
	}

}

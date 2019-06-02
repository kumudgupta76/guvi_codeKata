package set12;

import java.util.Scanner;

public class _6Pass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char a[]=sc.next().toCharArray();
		char b[]=sc.next().toCharArray();
		int al=a.length;
		int bl=b.length;
		int max=Math.max(bl, al);
		char c[]=new char[max*2];
		int count=1;
		int p=0,q=0;
		for(int i=0;i<max*2;i+=2)
		{
			//System.out.println(i+" "+al+" "+bl);
			if(i/2>=al)
			{
				c[i]=(char) ('0'+ count++);
				c[i+1]=b[q++];
			}else if(i/2>=bl)
			{
				c[i+1]=(char) ('0'+ count++);
				c[i]=a[p++];
			}else
			{
				c[i]=a[p++];
				c[i+1]=b[q++];
			}
		}
		System.out.println(new String (c));
	}

}

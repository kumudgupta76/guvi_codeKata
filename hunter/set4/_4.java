package set4;

import java.util.Scanner;

public class _4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] a=s.toCharArray();
		boolean b = false;
		for(int i=s.length()-1;i>1;i++)
		{
			char x=a[i];
			char y=a[i-1];
			if(x>y)
			{
				b=true;
				a[i]=y;
				a[i-1]=x;
				break;
			}
		}
		if(b)
		{
			System.out.println(String.valueOf(a));
		}else
		{
			System.out.println("impossible");
		}
		sc.close();
	}

}

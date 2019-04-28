package set4;

import java.util.Scanner;

public class _8 {
	public static void recfun(String s,int opening ,int closing)
	{
		if(opening==0&&closing==0)
			System.out.println(s);
		if(opening>closing)//close are more then open
			return;
		if(opening>0)
			recfun(s+"{",opening-1,closing);
		if(closing>0)
			recfun(s+"}",opening,closing-1);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		recfun("",n,n);
		sc.close();
	}

}

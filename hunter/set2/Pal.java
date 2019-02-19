package set2;

import java.util.Scanner;

public class Pal {
	public static void permutation(String prefix,String str)
	{
		int n=str.length();
		if(n==0)
		{
			System.out.println(prefix);
		}else
		{
			for(int i=0;i<n;i++) {
				permutation(prefix+str.charAt(i),str.substring(0, i)+str.substring(i+1, n));
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		permutation("",s);
		sc.close();
	}

}

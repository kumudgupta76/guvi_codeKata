package set12;

import java.util.Scanner;

public class _7 {

	public static int checkP(char ch[])
	{
		int n=0,count=0;
		for(char c:ch)
		{
			n+=Math.pow(c-'0', count++);
		}
		return (int)n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(checkP((n+"").toCharArray()));
		sc.close();
	}

}

package set11;

import java.util.Scanner;

public class _5 {
	public static int checkP(char ch[])
	{
		int n=0;
		int k=ch.length;
		for(char c:ch)
		{
			n+=Math.pow((c-'0'),k);
		}
		return (int)n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(checkP(sc.next().toCharArray()));
	}
}

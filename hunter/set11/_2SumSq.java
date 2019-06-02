package set11;

import java.util.Scanner;

public class _2SumSq {
	public static int checkP(char ch[])
	{
		int n=0;
		for(char c:ch)
		{
			n+=(c-'0')*(c-'0');
		}
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(checkP(sc.next().toCharArray()));
	}
}

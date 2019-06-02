package set11;

import java.util.Scanner;

public class _4 {

	public static int checkP(char ch[])
	{
		int n=0;
		int prev=0;
		for(char c:ch)
		{
			n+=(c-'0');
			prev+=n;
		}
		return prev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(checkP(sc.next().toCharArray()));
	}
}

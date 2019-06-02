package set12;

import java.util.Scanner;

public class _8Char {

	public static int checkP(char ch[])
	{
		int n=0;
		for(char c:ch)
		{
			n+=c;
		}
		return (int)n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(checkP(sc.next().toCharArray()));
		sc.close();
	}

}

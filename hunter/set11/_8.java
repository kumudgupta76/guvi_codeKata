package set11;

import java.util.Scanner;

public class _8 {
	public static int checkP(char ch[])
	{
		int n=0;
		int prev=-1;
		
		for(char c:ch)
		{
			if(prev!=-1)
			{
				n+=Math.pow(prev,(c-'0'));
			}prev=(c-'0');
		}
		n+=Math.pow(prev,ch[0]-'0');
		return (int)n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(checkP(sc.next().toCharArray()));
		sc.close();
	}
}

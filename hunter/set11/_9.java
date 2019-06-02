package set11;

import java.util.Arrays;
import java.util.Scanner;

public class _9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s[]=new String[n];
		while(n-->0)
		{
			s[n]=sc.next().toLowerCase();
		}
		Arrays.sort(s);
		while(n++<s.length-1)
		{
			System.out.println(s[n]);
		}
	}

}

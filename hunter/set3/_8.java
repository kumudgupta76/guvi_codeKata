package set3;

import java.util.HashSet;
import java.util.Scanner;

public class _8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		HashSet<Character> h=new HashSet<>();
		for(int i=0;i<s.length();i++)
		{
			h.add(s.charAt(i));
		}
		String r="";
		for(Character i:h)
			r+=i;
		System.out.println(r);
	}

}

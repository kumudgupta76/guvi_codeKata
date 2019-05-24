package set13;

import java.util.Scanner;

public class _3IsSubStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String sub=sc.next();
		boolean b=false;
		for(int i=0;i<s.length()-sub.length();i++){
			if(s.substring(i).startsWith(sub))
			{
				b=true;
				break;
			}
		}if(b)
			System.out.println("yes");
			else
				System.out.println("no");
		sc.close();
	}

}

package set13;

import java.util.Scanner;

public class _6CamalCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		boolean b=true;
		if(!(s.charAt(0)>=65&&s.charAt(0)<=91))
			b=false;
		for(int i=1;i<s.length();i++){//System.out.println((s.charAt(i)>=65&&s.charAt(i)<=91));
			if(s.charAt(i)>=65&&s.charAt(i)<=91)
				if((s.charAt(i-1)!=' '))
			{
				b=false;
				break;
			}
			
		}if(b)
			System.out.println("yes");
			else
				System.out.println("no");
		sc.close();
	}

}

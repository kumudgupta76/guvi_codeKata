package set4;

import java.util.Scanner;

public class _3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int count=0,max=0;
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i-1)=='a'&&s.charAt(i)=='b')
			{
				count+=2;
				if(i<s.length()-2)
				i++;
			}
			else
			{
				if(s.charAt(i)=='a'&&count!=0)
					count++;
				if(count>max)
					max=count;
				count=0;
			}
		}
		System.out.println(max);
		sc.close();
	}

}

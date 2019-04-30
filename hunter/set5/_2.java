package set5;

import java.util.Scanner;

public class _2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char [][]a=new char[][] {
				{'W','E','L','C','O'},
				{'M','E','T','O','G'},
				{'U','V','I','C','O'},
				{'R','P','O','R','A'},
				{'T','I','O','N','S'}
		};
		char initial=s.charAt(0);
		boolean found=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(a[i][j]==initial)
				{
					if(4-i>=s.length())
					{
						String k="";
						for(int x=0;x<s.length();x++)
						{
							k+=a[i+x][j];
						}
						if(k.equals(s))
						{
							found=true;
							System.out.println(i+" "+j+"\n"+(i+s.length())+" "+j);
						}
					}
					if(4-j>=s.length())
					{
						String k="";
						for(int x=0;x<s.length();x++)
						{
							k+=a[i][j+x];
						}
						if(k.equals(s))
						{
							found=true;
							System.out.println(i+" "+j+"\n"+i+" "+(j+s.length()));
						}
					}
				}
			}
		}
		if(!found)
		{
			System.out.println("0");
		}
		sc.close();
	}

}

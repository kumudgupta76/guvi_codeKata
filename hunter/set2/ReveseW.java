package set2;

import java.util.Scanner;

public class ReveseW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s[]=sc.nextLine().split(" ");
		for(String i:s)
		{
			StringBuilder sr=new StringBuilder(i);
			System.out.print(sr.reverse()+" ");
		}
		sc.close();
	}

}

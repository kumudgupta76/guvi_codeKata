package set13;

import java.util.Scanner;

public class _4pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>=0;i--) {
			for(int j=0;j<i;j++)
			{
				System.out.print("1 ");
				
			}
		System.out.println();
		}
		sc.close();
	}

}

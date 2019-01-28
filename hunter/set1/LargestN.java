package set1;

import java.util.Arrays;
import java.util.Scanner;

public class LargestN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		Arrays.sort(a);
		String s=new String();
		for (int i=a.length-1;i>=0;i--) {
			s+=Integer.toString(a[i]);
		}
		System.out.println(Integer.parseInt(s));
		sc.close();
	}

}


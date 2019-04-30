package set6;

import java.util.Arrays;
import java.util.Scanner;

public class _7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int a[]=new int[n];	
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		Arrays.sort(a);
		boolean f=true;
		for(int i=0;i<n-1;i+=2)
		{
			if(a[i]!=a[i+1]) {
				System.out.println(a[i]);f=false;
				break;
				
			}
		}
		if(f)
			System.out.println(a[a.length-1]);
		input.close();
	}

}

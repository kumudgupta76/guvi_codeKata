package set6;

import java.util.LinkedList;
import java.util.Scanner;

public class _10 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		LinkedList<Integer> a=new LinkedList<>(),b=new LinkedList<>();
		for(int i=0;i<n;i++)
		{
			a.add(input.nextInt());
		}
		for(int i=0;i<n;i++)
		{
			b.add(input.nextInt());
		}
		int c=0;
		while(!a.equals(b))
		{
			a.add(a.removeFirst());
			c++;
		}
		System.out.println(c);
	}

}

package set1;

import java.util.HashSet;
import java.util.Scanner;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		HashSet<Integer> a=new HashSet<>(),b=new HashSet<>();
		for(int i=0;i<n;i++)
			a.add(sc.nextInt());
		for(int i=0;i<m;i++)
			b.add(sc.nextInt());
		System.out.println(a+"  *  "+b);
		if(a.containsAll(b))
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}

package set2;

import java.util.*;

public class KthLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> a=new ArrayList<Integer>(n);
		for(int i=0;i<n;i++)
		{
			a.add(sc.nextInt());
		}
		a.sort((e,f)->f-e);
		System.out.println(a.get(sc.nextInt()-1));
		sc.close();
	}

}

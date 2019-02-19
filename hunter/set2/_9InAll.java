package set2;

import java.util.*;

public class _9InAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		Set<Integer> s=new HashSet<>();
		for(int i=0;i<k;i++)
		{
			s.add(sc.nextInt());
		}
		for(int i=1;i<n;i++)
		{
			Set<Integer> s1=new HashSet<>();
			for(int j=0;j<k;j++)
			{
				s1.add(sc.nextInt());
			}
			s.retainAll(s1);
		}
		s.forEach(e->System.out.print(e));
		sc.close();
	}

}

package set3;

import java.util.*;

public class _6reverselist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> al=new LinkedList<>();
		for(int i=0;i<n;i++)
		{
			al.add(sc.nextInt());
		}
		Collections.reverse(al);
		for(int i=0;i<al.size();i++)
		{
			if(i==al.size()-1)
				System.out.println(i);
			else
			System.out.print(i+"->");
		}
		sc.close();
	}

}

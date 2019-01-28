package set1;

import java.util.HashMap;
import java.util.Scanner;

public class RepeatN2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer,Integer> h=new HashMap<>();
		boolean b=false;
		int a[]=new int[n];
		for (int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j:a) {
			if(h.containsKey(j))
			{
				System.out.println(j);
				b=true;
				break;
			}else
			{
				h.put(j,1);
			}
		}
		if(b==false)
			System.out.println("unique");
		sc.close();
	}

}

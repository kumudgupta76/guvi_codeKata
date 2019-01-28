package set1;

import java.util.HashMap;
import java.util.Scanner;

public class RepeatN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer,Integer> h=new HashMap<>();
		for (int i=0;i<n;i++)
		{
			Integer j=sc.nextInt();
			if(h.containsKey(j))
			{
				h.put(j,h.get(j)+1);
			}else
			{
				h.put(j,1);
			}
		}
		h.forEach((e,f)->{
			if(f>1)System.out.print(e);
		});
		sc.close();
	}

}

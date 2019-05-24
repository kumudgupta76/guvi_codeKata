package set13;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class _9MaxOcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		HashMap<Integer,Integer> h=new HashMap<>();
		for(int i=0;i<a.length;i++)
		{
			if(h.containsKey(a[i]))
				h.put(a[i], h.get(a[i])+1);
			else
				h.put(a[i], 1);
		}
		int max=Integer.MIN_VALUE;
		int val=0;
		Set<Entry<Integer, Integer>> entrySet = h.entrySet();
		for(Entry<Integer, Integer> entry : entrySet)
        {
        	if(entry.getValue()>max)
        		{
        		val=entry.getKey();
        		max=entry.getValue();
        		}
        }
		System.out.println(val);
	}

}

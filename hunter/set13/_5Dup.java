package set13;

import java.util.*;
import java.util.Map.Entry;

public class _5Dup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char a[]=sc.next().toCharArray();
		String s=new String("");
		HashMap<Character,Integer> h=new HashMap<>();
		for(int i=0;i<a.length;i++)
		{
			if(h.containsKey(a[i]))
				h.put(a[i], h.get(a[i])+1);
			else
				h.put(a[i], 1);
		}
		Set<Entry<Character, Integer>> entrySet = h.entrySet();
        for(Entry<Character, Integer> entry : entrySet)
        {
        	if(entry.getValue()==1)
        		s+=entry.getKey();
        }
		System.out.println(s);
		sc.close();
	}

}

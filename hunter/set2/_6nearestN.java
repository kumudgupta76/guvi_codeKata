package set2;

import java.util.*;
import java.util.stream.Collectors;

public class _6nearestN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		HashMap<Integer,Integer> h=new HashMap<>();
		for(int i:a)
		{
			if(Math.abs(i-k)!=0)
			h.put(i, Math.abs(i-k));
		}
		//System.out.println(h);
		h=h.entrySet().stream()
        .sorted(Map.Entry.comparingByValue())
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		//System.out.println(h);
		int i=0;
		for(Integer ij:h.keySet())
		{
			if(i++<3)
				System.out.print(ij+" ");
		}
		sc.close();
	}

}

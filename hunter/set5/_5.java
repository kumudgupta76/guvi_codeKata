package set5;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Lucky Number: n*i also present in the array;
 * where n is the number and i is position of array element 
 */

public class _5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		ArrayList<Integer > a=new ArrayList<>();
		while(n-->0)
		{
			a.add(sc.nextInt());
		}
		int k=1;
		for(Integer i:a)
		{
			if(a.contains(new Integer(i*k++)));
				System.out.println(i+" "+k);
		}
	}

}

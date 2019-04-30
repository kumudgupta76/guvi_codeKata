package set6;

import java.util.PriorityQueue;
import java.util.Scanner;

public class _4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n_coin=sc.nextInt();
		PriorityQueue<Integer> q=new PriorityQueue<>();
		for(int i=0;i<n_coin;i++)
		{
			q.add(sc.nextInt());
			System.out.println(q.peek());
		}
		sc.close();
	}

}

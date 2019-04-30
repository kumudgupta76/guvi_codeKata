package set6;

import java.util.Scanner;

public class _2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n_coin=sc.nextInt();
		int coins[]=new int[n_coin];
		for(int i=0;i<n_coin;i++)
		{
			coins[i]=sc.nextInt();
		}
		int amt=sc.nextInt();
		System.out.println(changeCoins(n_coin,coins,amt));
		sc.close();
	}

	private static int changeCoins(int n_coin, int[] coins, int amt) {
		int combi[]=new int[amt+1];
		combi[0]=1;
		for(int i=0;i<n_coin;i++)
		{
			for(int j=0;j<=amt;j++)
			{
				if(j>=coins[i])
				{
					if(j-coins[i]>=0)
					combi[j]+=combi[j-coins[i]];
				}
			}
		}
		return combi[amt];
	}

}
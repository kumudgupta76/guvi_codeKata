package set13;

import java.util.Scanner;

public class _10Prime3 {
	static boolean isPrime(int n) 
    { 
        // Corner case 
        if (n <= 1) return false; 
      
        // Check from 2 to n-1 
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
      
        return true; 
    } 
	public static void main(String args[]) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	int sum=0;
	for(int i=3;i<=n;i+=10)
	{
		if(isPrime(i))
			sum+=i;
	}
	System.out.println(sum);
	sc.close();
	}
}

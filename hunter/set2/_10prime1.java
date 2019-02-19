package set2;

import java.util.Scanner;

public class _10prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int tot=0;
		for(int i=a;i<=b;i++)
		{
			String s=Integer.toBinaryString(i);
			int c=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(j)=='1')
					c++;
			}
			//System.out.println(c+" "+s);
			if(isPrime(c))
				tot++;
		}
		System.out.println(tot);
		sc.close();
	}

	 public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i < Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }  

}

package set11;

import java.util.Scanner;

public class _1 {
	static int a = 0, b = 0; 
    static boolean isPrime(int x) 
    {
        int s = (int)Math.sqrt(x); 
        for (int i = 2; i <= s; i++) 
            if (x % i == 0) 
                return false; 
        return true; 
    } 
  
    static void Num(int x) 
    {       for (int i = 2; i <= x / 2; i++) { 
            if (isPrime(i) && isPrime(x - i)) { 
                a = i; 
                b = x - i; 
                return; 
            } 
        } 
    } 
    static void generate(int n) 
    { 
  
        if (n <= 5) 
            System.out.println("Impossible"
                               + " to form"); 
  
        if (n % 2 != 0) { 
            Num(n - 3);  
            System.out.println("3 " + a + " " + b); 
        } 
  
        else { 
            Num(n - 2); 
            System.out.println("2 " + a + " " + b); 
        } 
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		generate(n);
	}

}

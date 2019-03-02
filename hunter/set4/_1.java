package set4;

import java.util.Scanner;

public class _1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < n; i ++) 
        {  
            for (int j = i; j < n; j ++) 
            {
            	int pro=1;
                for (int k = i; k <= j; k++) 
                    pro*=a[k];
                if(max<pro)
                	max=pro;
            } 
        }
		System.out.println(max);
		sc.close();
	}

}

package set4;

import java.util.Scanner;

public class _2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int a[] = new int[n];
	        for(int i=0;i<n;i++){
	            a[i]=sc.nextInt();
	        }
	        int v=2;
	        int i;
	        for(i=1;v<=n;i++){
	            v=(int)Math.pow(2,i);
	            //System.out.println(v+" : "+i );
	        }
	        System.out.println((int)Math.pow(2,i-2)-1);
	        sc.close();
	}

}

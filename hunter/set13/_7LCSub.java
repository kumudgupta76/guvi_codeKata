package set13;

import java.util.Scanner;

public class _7LCSub {

   
    static void print(String X, String Y, int m, int n) 
    { 
        int[][] LCSuff = new int[m + 1][n + 1]; 
        int len = 0;
        int row = 0, col = 0; 
        for (int i = 0; i <= m; i++) { 
            for (int j = 0; j <= n; j++) { 
                if (i == 0 || j == 0) 
                    LCSuff[i][j] = 0; 
  
                else if (X.charAt(i - 1) == Y.charAt(j - 1)) { 
                    LCSuff[i][j] = LCSuff[i - 1][j - 1] + 1; 
                    if (len < LCSuff[i][j]) { 
                        len = LCSuff[i][j]; 
                        row = i; 
                        col = j; 
                    } 
                } 
                else
                    LCSuff[i][j] = 0; 
            } 
        } 
        if (len == 0) { 
            System.out.println("No Common Substring"); 
            return; 
        }
        String resultStr = ""; 
        while (LCSuff[row][col] != 0) { 
            resultStr = X.charAt(row - 1) + resultStr; // or Y[col-1] 
            --len; 
            row--; 
            col--; 
        }
        System.out.println(resultStr); 
    } 
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String X=sc.next();
		String Y=sc.next();
		print(X, Y, X.length(), Y.length());
		sc.close();
	}

}

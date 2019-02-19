package set2;

import java.util.Scanner;
import java.util.Stack;

public class PalbyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		boolean b=true;
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<s.length()/2;i++)
			stack.push(s.charAt(i));
		for(int i=Math.floorDiv(s.length(), 2);i<s.length();i++)
		{
			if(stack.empty())
				b=false;
			else
				stack.pop();
		}
		System.out.println(stack);
		if(stack.empty()&&b)
			System.out.println("YES");
		else
			System.out.println("NO");
		sc.close();
	}

}

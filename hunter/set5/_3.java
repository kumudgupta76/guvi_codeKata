package set5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _3 {
	protected static List<String> getTokens(String text,String pattern)
	{
		ArrayList<String> tokens = new ArrayList<String>();
		Pattern tokSplitter = Pattern.compile(pattern);
		Matcher m = tokSplitter.matcher(text);
		
		while (m.find()) {
			tokens.add(m.group());
		}
		
		return tokens;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		 Iterator<String> st = getTokens(s,"[0-9]+").iterator();
		getTokens(s,"[a-zA-Z]").forEach(e->{
			int i=Integer.parseInt(st.next());
			for(int j=0;j<i;j++)
			{
				System.out.print(e);
			}
				
		});
		sc.close();
	}

}

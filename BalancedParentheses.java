package interviewProgramm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BalancedParentheses {
	public static void main(String[] args) {
		String input = new Scanner(System.in).next();
		boolean out = isValid(input);
		System.out.println("Result ::> "+out);
	}

	public static boolean isValid(String input) {
		Map<Character, Character> parentheses = new HashMap<Character, Character>();
		parentheses.put('(', ')');
		parentheses.put('[', ']');
		parentheses.put('{', '}');
		if(input == null || input.isEmpty() || input.length()%2 == 1)return false;
		int intLen = input.length();
		for(int i=0;i<input.length()/2;i++) {
			char open = input.charAt(i);
			char close = input.charAt(intLen-(i+1));
			if(close != parentheses.get(open)) return false;			
		}
		return true;
	}
}

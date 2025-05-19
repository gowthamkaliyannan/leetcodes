package interviewProgramm;

import java.util.HashSet;
import java.util.Set;

public class SpecialCharacterCount1 {
	public static void main(String[] args) {
		String word = "abBCab";
		int rslt = numberOfSpecialChars(word);
		System.out.println(rslt);
	}

	public static int numberOfSpecialChars(String word) {
		Set<String>small = new HashSet<String>();
		Set<String>caps = new HashSet<String>();
		int rslt = 0;		 
		Set<String> finalChar = new HashSet<String>();
		for(int i=0;i<word.length();i++){
			char c = word.charAt(i);
			finalChar.add(String.valueOf(c).toLowerCase());
			if((int)c<=122 && (int)c>=97)small.add(String.valueOf(c));
			else caps.add(String.valueOf(c).toLowerCase());
		}
		for(String c1 : finalChar){
			if(small.contains(c1) && caps.contains(c1.toLowerCase())) rslt++;
		}
		return rslt;

	}
}

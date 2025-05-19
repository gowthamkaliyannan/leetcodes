package interviewProgramm;

import java.util.Arrays;

public class ValibPalindrome125 {
	public static void main(String[] args) {
		String str = "A man, a plan, a canal: Panama";//"sfdsf564.,;fhgf fdg546g dfv';[]fgdfv gtg;'";
		boolean rslt = isValid(str);
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
		System.out.println(rslt);
	}
	
	public static boolean isValid(String s) {
		String str1 = s.replaceAll("[^a-zA-Z0-9]", "");
		String[] str2 = new String[str1.length()];
		int j = 0;
		for(int i = str1.length()-1; i>=0;i--) {
			str2[j] = String.valueOf(str1.charAt(i));
			j++;
		}
		System.out.println("str2 ::>"+String.join("", str2));
		if(str1.equalsIgnoreCase(String.join("", str2)))return true;
		else return false;
	}
}

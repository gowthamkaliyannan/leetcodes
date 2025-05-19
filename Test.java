package interviewProgramm;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List l = new ArrayList<String>();
		String a = "abbbaca";
		System.out.println("start string ::> "+ a);
		String r = removeDuplicate(a);
		System.out.println(r);
		ArrayList<String> al = new ArrayList<>();
		al.add("String");
	}
	
	@SuppressWarnings("null")
	public static String removeDuplicate(String s1) {
		System.out.println("Initial String ::> "+s1);
		boolean rslt = true;
		int i = 0;
		char c = 0;
		char[] c1 = s1.toCharArray();
		while(rslt && 1<s1.length()) {
			c=s1.charAt(i);
			System.out.println("inside while loop ::> "+c);
			if(c == s1.charAt(i+1)) {
				c=s1.charAt(i);
				c1[i] = ' ';
				i++;
				c = s1.charAt(i);
				rslt = true;
			}else rslt = false;
		}
		System.out.println("Outside loop ::> " +c);
		s1= c1.toString();
		s1.replaceAll(" ", "");
		
		System.out.println(s1.toString());
		//if(!rslt)
		//removeDuplicate(s1);
		return s1;
		
	}
	

}

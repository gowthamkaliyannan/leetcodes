package interviewProgramm;

public class ReverseOnlyLetters917 {
	public static void main(String[] args) {
		String s = "z<*zj";
	String rslt = reverseOnlyLetters(s);
	System.out.println(s);
	System.out.println(rslt);
	System.out.println("j<*zz");
	}
	public static String reverseOnlyLetters(String s) {
		char[] temp = s.toCharArray();
		int pos = s.length()-1;
		for(int i= 0;i<s.length();i++) {
			if((s.charAt(i) <= 90 && s.charAt(i) >= 65) || (s.charAt(i) <= 122 && s.charAt(i) >= 97)) {
				System.out.println(pos);
				if((temp[pos] <= 90 && temp[pos] >= 65) || (temp[pos] <= 122 && temp[pos] >= 97)) {
					temp[pos] = s.charAt(i);
					if(pos>0) pos = pos-1;
				}else if(!((s.charAt(i) <= 90 && s.charAt(i) >= 65) || (s.charAt(i) <= 122 && s.charAt(i) >= 97))) {
					pos = pos-1; 
					temp[pos] = s.charAt(i); 
					if(pos>0) pos = pos-1; 
				}
					
				
			}
		}	
		return new String(temp);        
	}
}

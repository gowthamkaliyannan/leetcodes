package interviewProgramm;

public class ReverseStringII541 {

	public static void main(String[] args) {
		String s = "abcdefg";
		int k = 2;
		String rslt = reverseStr(s, k);
		System.out.println(rslt);
	}
	
	public static String reverseStr(String s, int k) {
		String subStr1 = s.substring(0, k);
		String subStr2 = s.substring(k, s.length());
		String s1 = "";		
		for(int i = subStr1.length()-1; i>=0;i--) {
			s1 = s1.concat(Character.toString(subStr1.charAt(i)));
		}
		String tmp1 = "";
		String tmp2 = "";
		int cnt = 0;
		for(int j = 0;j<s.length();j++) {
			if(j<s.length()) {
				if(cnt%k == 0) {
					System.out.println("jhfgc");
				}
			}
		}
		return s1.concat(subStr2);
		
	}

}

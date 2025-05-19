package interviewProgramm;

public class ValidAnagram {

	public static void main(String[] args) {
		String s = null;
		String t = null;
		isAnagram( s, t);
	}

	private static boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) return false;
		if(!s.equals(new StringBuffer(t).reverse().toString())) return false;
		return true;
	}

}

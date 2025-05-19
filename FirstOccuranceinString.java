package interviewProgramm;

public class FirstOccuranceinString {

	public static void main(String[] args) {
		String haystack = "a";
		String needle = "a";
		int rslt = strStr(haystack, needle);
		System.out.println("Result ::> "+rslt);

	}

public static int strStr(String haystack, String needle) {
	int l1 = haystack.length();
	int l2 = needle.length();
	if(l1 <= l2)return -1;
	for(int i=0;i<=l1-l2;i++) {
		int j=0;
		while(j<l2 && haystack.charAt(j+i) == needle.charAt(j)) j++;
		if(j==l2)return i;
	}
	
	return -1;
    }
}

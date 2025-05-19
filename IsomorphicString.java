package interviewProgramm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IsomorphicString {
	public static void main(String[] args) {
		String s = "foo";
		String t = "bads";
		boolean rslt = isIsomorphic(s, t);
		System.out.println(rslt);
		
	}
	
public static boolean isIsomorphic(String s, String t) {
	Map<Character, Character> mapStr = new HashMap<Character, Character>();
	List<Character> chList = new ArrayList<Character>();
	if(!(s.length()==t.length())) return false;
	for(int i=0;i<s.length();i++) {		
		char s1 = s.charAt(i);
		char t1 = t.charAt(i);
		if(mapStr.get(s1) == null && chList.contains(t1)) return false;
		if(mapStr.get(s1) == null) mapStr.put(s1, t1);
		chList.add(t1);
		if (!mapStr.get(s1).equals(t1)) return false;
	}
	return true;
        
    }
}

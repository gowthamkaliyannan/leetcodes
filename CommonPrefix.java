package interviewProgramm;
public class CommonPrefix {

	public static void main(String[] args) {
		String[] arr = {"float","flower", "floor"};
		String rslt = longestCommonPrefix(arr);
		System.out.println(rslt);
	}

	public static String longestCommonPrefix(String[] strs) {
		/*
		 * TreeSet<String> treeSet = new TreeSet<>();
		 * treeSet.addAll(Arrays.asList(strs));
		 * treeSet.forEach(e->System.out.println(e));
		 * System.out.println(treeSet.size()); System.out.println(treeSet);
		 */
		
		if(strs == null || strs.length == 0) return "Empty";
		String str = strs[0];
		String out = "";
		loop1:
			for(int j=0;j<str.length();j++) {
				String substr = str.substring(0, j+1);
                String temp = "";
				for(int i=0;i<strs.length;i++) {
					if(strs[i].startsWith(substr)) {
						temp = substr;
					}else {
						break loop1;
					}
				}
                out= temp;
			}
		return out;
	}
}

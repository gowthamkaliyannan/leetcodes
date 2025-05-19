package interviewProgramm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubArray {

	public static void main(String[] args) {
		String [] anagram = {"eat","tea","tan","ate","nat","bat"};
		List<String[]> result = findArray(anagram);
		System.out.println(result);
	}

	private static List<String[]> findArray(String[] anagram) {

		Map<Integer, List<String>> map = new HashMap<>();

		for(int i = 0; i<anagram.length;i++) {
			int asciiVal = 0;
			String val = anagram[i];
			for(int j = 0;j<val.length();j++) {
				asciiVal = asciiVal+(int) val.charAt(j);
			}
			System.out.println("String val ::> "+val +" ASCII val ::> "+asciiVal);
			List<String> list = new ArrayList<>();
			if(map.containsKey(asciiVal)) {
				list = map.get(asciiVal);
				list.add(val);
				map.replace(asciiVal, list);
			}else {
				list.add(val);
				map.put(asciiVal, list);
			}
		}
		List<String []> listArray  = new ArrayList<>();
		for(List<String> value : map.values()) {
			String[] valArr = value.toArray(new String[0]);
			listArray.add(valArr);
			System.out.println("Array val ::> "+valArr[0]);
		}
		return listArray;
	}
}

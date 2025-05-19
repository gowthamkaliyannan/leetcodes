package interviewProgramm;

import java.util.ArrayList;
import java.util.List;
 
public class StreamMax {
	public static void main(String[] args) {
		List<Integer> maxList = new ArrayList<>();
		maxList.add(15);
		maxList.add(42);
		maxList.add(23);
		maxList.add(30);
		maxList.add(18);
		maxList.add(78);
		System.out.println(maxList);
		System.out.println(maxList.stream().max((o1, o2) -> o1.compareTo(o2)));
		
		
	}
 
}
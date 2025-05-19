package interviewProgramm;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicartesFromSortedIntArrayP26 {
	public static void main(String[] args) {
		int[] arr = {1,1,2,3};
		int fnlArr = removeDup(arr);

	}

	public static int removeDup(int[] nums) {int j=0;
	List<Integer> ls = new ArrayList<Integer>();
	ls.add(nums[0]);

	int length = nums.length;
	for(int i=1;i<length;i++) {
		if(nums[i] != ls.get(j)) {
			ls.add(nums[i]);
			j++;				
		}
	}
   // nums = ls.stream().mapToInt(Integer::intValue).toArray();
    for(int i=0;i<ls.size();i++) {
		nums[i] = ls.get(i);
	}
	return ls.size();}

}

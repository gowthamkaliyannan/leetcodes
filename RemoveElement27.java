package interviewProgramm;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement27 {
	public static void main(String[] args) {
		int[] nums = {0,1,2,2,3,0,4,2};
		int val = 2;
		int output = removeElement(nums, val);
		System.out.println(output);
	}
	
	public static int removeElement(int[] nums, int val) {
		if(nums.length == 0)return 0;
		List<Integer> ls = new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(nums[i] != val) ls.add(nums[i]);
		}
		for(int i=0;i<ls.size();i++) {
			nums[i] = ls.get(i);
		}
		return ls.size();		
	}
}

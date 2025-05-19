package interviewProgramm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		Set<Integer> s = new HashSet<Integer>();
		boolean rslt = containsDuplicate(nums);
		System.out.println(rslt);
	}
	
	public static boolean containsDuplicate(int[] nums) {
		for(int i=0;i<nums.length-2;i++) {
			for(int j=nums.length-1;j>i;j--) {
				if(nums[i] == nums[j])
					return true;
			}
		}
		return false;

	}
}

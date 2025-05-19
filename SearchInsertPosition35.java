package interviewProgramm;

public class SearchInsertPosition35 {
		public static void main(String[] args) {
			int[] nums = {1};
			int target = 1;
			int rslt = searchInsert(nums, target);
			System.out.println(rslt);
		}
		public static int searchInsert(int[] nums, int target) {
			int length = nums.length;
			if(length == 0) return 0;
			else if(length == 1 && nums[0] == target) return 0;
			else if(nums[length-1] <= target) return length;
			else if(target < nums[0]) return 0;
			int rslt = 0;
			for(int i = 0;i<length-1;i++) {
				if(nums[i] == target) return i;
				else if(target > nums[i] && target < nums[i+1]) return i+1;
				else rslt = i+1;
			}
			return rslt;
			
		}
}

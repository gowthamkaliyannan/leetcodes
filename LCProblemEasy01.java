package interviewProgramm;

import java.util.Arrays;

public class LCProblemEasy01 {
	public static void main(String[] args) {
		try {
			int[] num = {2,7,11,14};
			comTwoNum(num, 13);
			int[] rslt = combination(num, 9);
			System.out.println(rslt[0]+", "+rslt[1]);
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
	}
	
	public static int[] combination(int[] num, int target) {
		int[] rslt = new int[num.length];
		for(int i=0;i<num.length-1;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]+num[j] == target){
                    rslt[0] = i;
                    rslt[1] = j;
                }
            }

        }
		return rslt;
		
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public static void comTwoNum(int[] num, int tar) {
		int[] nums = num;
		int target = tar;
		 int[] result = new int[2]  ;
	      int nextElement = 0;
	    //  boolean flag=false;
	      for(int element : nums){
	    	  System.out.println("element"+element);
	        if(element < target){
	            nextElement = target-element;
	            System.out.println("nextElement2::::"+nextElement);
	           if(Arrays.asList(nums).stream().equals(nextElement)	) {
	        	   System.out.println( Arrays.asList(nums).indexOf(element));
	        	   System.out.println( Arrays.asList(nums).indexOf(nextElement));
	        	   }
        	   break;
 
	           }
	      }
		//return result;
	      
	     // System.out.println(result[0]+" "+result[1]);
	}
}

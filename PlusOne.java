package interviewProgramm;

import java.math.BigInteger;

public class PlusOne {
	public static void main(String[] args) {
		//int[] digits = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,12,9,9};
		int[] digits = {9,8,7,6,5,4,3,2,1,0};
		int[] result =  plusOne(digits);
	}


	public static int[] plusOne(int[] digits) {
		
		BigInteger value = BigInteger.ZERO , temp = BigInteger.ZERO ;
		for(int i : digits) { 
			long ival = (long)i; 
			value = temp.add(BigInteger.valueOf(ival));
			temp = value.multiply(BigInteger.TEN);
			System.out.println("for ::> "+value);
		} 
		value =value.add(BigInteger.ONE); 
		System.out.println(value); 
		String s1 = String.valueOf(value);
		int[] result = new int[s1.length()];
		int i = 0;
		for(char s : s1.toCharArray()) { 
			result[i] = Character.getNumericValue(s);
			System.out.println(result[i]); 
			i++; 
		} 
		return result;
		 
		/*
		for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 != 10) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
        */
	}
}

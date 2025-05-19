package interviewProgramm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanConvertion {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//int t=in.nextInt();
		
		String input = in.next(); //"MMMMMMMMCMLXXVIII"; //8978
		int num = convertToRoman(input);		
	}
	
	public static int convertToRoman(String s) {
		Map<Character, Integer> rm = new HashMap<Character, Integer>();
		rm.put('I', 1);
		rm.put('V', 5);
		rm.put('X', 10);
		rm.put('L', 50);
		rm.put('C', 100);
		rm.put('D', 500);
		rm.put('M', 1000);

		int out = 0;
		int curNum = 0;
		int nxtNum = 0;
		
		
		char[] rmArr = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(i<s.length()-1) {
				curNum = (int)rm.get(rmArr[i]);
				nxtNum = (int)rm.get(rmArr[i+1]);
			}else if(i==s.length()-1) {
				curNum = (int)rm.get(rmArr[i]);
				nxtNum = (int)rm.get(rmArr[i]);
			}
			if(curNum < nxtNum) {
				out = out + (nxtNum-curNum);
				i++;
			}else {
				out = out+curNum;
			}
		}
		return out;
	}
}

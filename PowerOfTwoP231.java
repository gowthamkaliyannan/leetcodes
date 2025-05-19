package interviewProgramm;

import java.util.Scanner;

public class PowerOfTwoP231 {
	public static void main(String[] args) {
		int num = 1;
		Scanner numInp = new Scanner(System.in);
		while(num>0) {
		boolean result = isPowerOfTwo(num);
		System.out.println(result);
		System.out.println("Enter any num greater than '0' to continue or 0 to exit");
		num = new Scanner(System.in).nextInt();
		}
	}
	
	public static boolean isPowerOfTwo(int n) {
		
		if(n == 1 || n == 2) return true;
		else if(n%2 != 0) return false;		
		while(n >=2) {
			int num = n/2;
			if(num%2 != 0)return false;
			else if(num ==1 || num==2)return true;			
			else n = num;			
		}
		return true;
	}
}

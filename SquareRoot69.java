package interviewProgramm;

import java.util.Scanner;

public class SquareRoot69 {
	public static void main(String[] args) {
		int num = new Scanner(System.in).nextInt();
		int rslt = mySqrt(num);
		System.out.println("Result ::> "+rslt);
	}
	
 public static int mySqrt(int x) {
	 
	return (int) Math.floor(Math.sqrt(Double.valueOf(x)));
	
}
}

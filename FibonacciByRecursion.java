package interviewProgramm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciByRecursion {
	static List<Long> fibonacci = new ArrayList<Long>();
	public static void main(String[] args) {
		long f1 = 0;
		long f2 = 1;
		fibonacci.add(f1);
		fibonacci.add(f2);
		Scanner sc = new Scanner(System.in);
		try{
			
			System.out.println("Enter length : ");
			int s = sc.nextInt();
			
			if(s>0) {
				if(s==1) {
					System.out.println("fibonacci series ::>"+fibonacci.get(0));
				}else if(s == 2) {
					System.out.println("fibonacci series ::>"+fibonacci);
				}else {
					fibonacci(s, f1,f2);
					System.out.println("fibonacci series ::>"+fibonacci);
				}
			}else {
				System.out.println("Enter length : ");
			}
			
		}catch(Exception e) {
			System.out.println("Error ::> "+e.getMessage());
		}finally {
			sc.close();
		}
	}
	public static void fibonacci(int i, long f1, long f2) {
		if(i > 2) {
			long f3 = f1+f2;
			f1 = f2;
			f2 = f3;
			i--;
			fibonacci.add(f3);
			fibonacci(i,f1,f2);
		}
	}

}

package interviewProgramm;

import java.util.Scanner;

public class PatternProfram {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Please enter a number ::> ");
		int num = new Scanner(System.in).nextInt();
		printPattern(num);
	}

	private static void printPattern(int num) {
		System.out.println("Input ::> "+num);		
		for(int i=1; i<=num;i++) {
			for(int k=num;k>=i;k--) {
				if(k>i)
					System.out.print(" ");
				else {
					for(int l=i;l>=1;l--) {
						System.out.print(l);
					}
				}
			}			
			System.out.println();
		}		
	}
}

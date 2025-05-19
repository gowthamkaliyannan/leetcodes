package interviewProgramm;

import java.util.Scanner;

public class JavaLoop {
	public static void main(String []argh){
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++){
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			int rs = a;
			for(int j=0;j<n;j++) {
				int pow = (int)Math.pow(2, j);
				rs =  rs + ((pow*b));
				System.out.print(rs+" ");
			}
			System.out.print("\n");
		}
		in.close();
	}
}

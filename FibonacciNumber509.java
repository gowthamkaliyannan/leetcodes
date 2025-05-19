package interviewProgramm;

public class FibonacciNumber509 {
	public static void main(String[] args) {
		int n = 3;
		int rslt = fib(n);
		System.out.println(rslt);
	}
	
	public static int fib(int n) {
		int[] fibnum = new int[n+1];	
		if(n==0)
			return 0;
		else if(n== 1 || n == 2)
			return 1;
		else {
			int i= 2;
			fibnum[0] = 0;
			fibnum[1] = 1;
		while(i<=n) {
			fibnum[i] = fibnum[i-2]+fibnum[i-1];
			i++;
		}
		return fibnum[n];
		}
	}
}

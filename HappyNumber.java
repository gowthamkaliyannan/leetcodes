package interviewProgramm;

public class HappyNumber {
	public static void main(String[] args) {
		int num = 6;
		boolean result = isHappy(num);
		System.out.println(result);
	}

	public static boolean isHappy(int n) {
		if(n == 1) return true;
		int inp = n;
		while(inp>3) {
			int fnum = 0;
			while(n!=0) {
				int num = n%10;
				n = n/10;
				fnum = fnum+(int) Math.pow(num, 2);
			}
			inp = fnum;
			n = fnum;
			System.out.println(n);
			if(inp <= 9) break;
			//if(inp >= 1 && inp <= 3) break;
		}
		if(n == 1)return true;
		else return false;

	}
}

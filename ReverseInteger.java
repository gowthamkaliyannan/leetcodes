package interviewProgramm;

public class ReverseInteger {
	public static void main(String[] args) {
		//int x = 1534236469;
		//int x = 1234;
		int x = -2147483412;
		System.out.println(x);
		int rslt = reverse(x);
		System.out.println(rslt);
		
	}

	public static int reverse(int x) {
		int y = 0;
		boolean flg = false;
		if(x<0) {
			x = x*-1;
			flg = true;
		}
		while(x>0) {
			int a = x%10;
			y = (y*10)+a;
			x=x/10;
			//System.out.println("max Num ::> "+Integer.MAX_VALUE);
			System.out.println("rev Num ::> "+y);
			if(((long)y*10) > Integer.MAX_VALUE && x>0) return 0;
			//if((y*10) > 2147483647) return 0;
			
		}
		if(flg)y=y*-1;
		return y;

	}
	                  
}

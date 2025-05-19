package interviewProgramm;

public class ReverseNumber {
	
	public static void main (String[] args) {
		int i = 2147483640;
		StringBuffer r = new StringBuffer();
		while(i>0) {
			if(i%10 >0)
			r.append(i%10);
			i = i/10;
		}
		System.out.println(r.toString());
		
	}

}

package interviewProgramm;

public class PerfectNumber507 {
public static void main(String[] args) {
	int num = 28;
	boolean rslt = checkPerfectNumber(num);
	System.out.println(rslt);
}

public static boolean checkPerfectNumber(int num) {
	if(num == 1) return false;
	int itr = num/2;
	int rslt = 0;
	for(int i=1;i<=itr;i++) {
		if(num%i == 0) rslt = rslt+i;
	}
	System.out.println(rslt);
	if(rslt == num)
	return true;
	else return false;
	
}
}

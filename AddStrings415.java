package interviewProgramm;

import java.math.BigInteger;

public class AddStrings415 {

	public static void main(String[] args) {
		String rslt = addStrings("401716832807512840963", "167141802233061013023557397451289113296441069");
		System.out.println(rslt);
	}
	public static String addStrings(String num1, String num2) {
		BigInteger n1 = new BigInteger(num1);
		BigInteger n2 = new BigInteger(num2);
        return String.valueOf(n1.add(n2));
    }
}

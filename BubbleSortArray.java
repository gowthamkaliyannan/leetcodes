package interviewProgramm;

public class BubbleSortArray {
	public static void main(String[] args) {
		int[] a1 = {1,23,8,27,14};
		for(int i=0;i<a1.length;i++) {
			for(int j=i;j<a1.length;j++) {
				if(a1[i] < a1[j]) {
					int n1 = a1[i];
					a1[i] = a1[j];
					a1[j] = n1;
				}
			}
			System.out.println(a1[i]);
		}
	}

}

package interviewProgramm;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a1 = {64,12,75,54,11,101};
		for(int i=0;i<a1.length-1;i++){
			int minIndex = i;
			for(int j=i+1;j<a1.length;j++) {
				if(a1[j]<a1[minIndex]) {
					minIndex = j;					
				}
			}
					int temp = a1[minIndex];
					a1[minIndex] = a1[i];
					a1[i] = temp;
					
			
		}
		for(int i1:a1)
		{
			System.out.println(i1);
		}
	}

}

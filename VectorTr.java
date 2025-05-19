package interviewProgramm;

import java.util.Vector;

public class VectorTr {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		
		v1.add(1);
		v1.add(2);
		v1.add(3);
		System.out.println("Initial vector ::> "+v1);
		System.out.println("Initial vector ::> "+v1);
		int value = 0;
		
		int base = 1;
		if(value>0) {
			base = base*10;
		}
		
		for(int i=0;i<v1.size();i++) {
			if(value>0) {
				base = base*10;
				value = v1.get(i);
			}
		}
		
	}

}

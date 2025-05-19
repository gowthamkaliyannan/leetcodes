package interviewProgramm;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleTwo119 {
	public static void main(String[] args) {
		int rowIndex = 4;
		List<Integer> out = generate(rowIndex);
		System.out.println(out.size());
		System.out.println(out);
	}

	public static List<Integer> generate(int rowIndex){
		List<Integer> rows = null;
		List<List<Integer>> out = new ArrayList<List<Integer>>();		
		int i=0;
		while(i<=rowIndex) {
			rows = new ArrayList<Integer>();
			if(i == 0) {
				rows.add(1);
			}else if(i == 1) {
				rows.add(1);
				rows.add(1);
			}else {
				rows.add(1);
				for(int k =1;k<out.get(i-1).size();k++) {
					rows.add(out.get(i-1).get(k-1)+out.get(i-1).get(k));
				}
				rows.add(1);
			}
			out.add(rows);
			i++;
		}
        return out.get(rowIndex);
	}
}

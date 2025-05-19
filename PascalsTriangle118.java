package interviewProgramm;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle118 {
	public static void main(String[] args) {
		int numRows = 5;
		List<List<Integer>> out = generate(numRows);
		System.out.println(out.size());
	}

	public static List<List<Integer>> generate(int numRows){List<Integer> rows = null;
	List<List<Integer>> out = new ArrayList<List<Integer>>();		
	int i=1;
	while(i<=numRows) {
		rows = new ArrayList<Integer>();
		if(i == 1) {
			rows.add(1);
		}else if(i == 2) {
			rows.add(1);
			rows.add(1);
		}else {
			rows.add(1);
			for(int k =1;k<out.get(i-2).size();k++) {
				rows.add(out.get(i-2).get(k-1)+out.get(i-2).get(k));
			}
			rows.add(1);
		}
		out.add(rows);
		i++;
	}
	return out;
	}
}

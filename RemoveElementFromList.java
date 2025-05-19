package interviewProgramm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class RemoveElementFromList {

	public static void main(String[] args) {


		List<String> list = new
				ArrayList<String>(Arrays.asList("Gowtham","Edison","Ranjith","Arun","Ragul", "Ajay"));
		System.out.println("Before ::> "+list); 
		for(int i=0;i<list.size();i++) {
			//if(list.get(i).length()<=4) list.remove(i);
		}
		System.out.println("After ::> "+list); 
		for(String s : list) {
			if(s.length()<=4) list.remove(s);
		}
		System.out.println("After ::> "+list); 
		/*try {
			for(Iterator<String> itr = list.iterator();itr.hasNext();) {
				String name = itr.next(); 
				if(name.length() <= 4) { 
					itr.remove();
				} 
			}
			System.out.println("After ::> "+list);
		}catch(ConcurrentModificationException e) { 
			System.out.println(e.getMessage().toString());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage().toString()); 
		} */


	}

}

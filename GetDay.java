package interviewProgramm;

import java.util.Calendar;

public class GetDay {
	
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_WEEK); 

		switch (day) {
		    case Calendar.SUNDAY:
		        System.out.println("Day ::> "+day);
		        break;
		    case Calendar.MONDAY:
		    	System.out.println("Day ::> "+day);
		        break;
		    case Calendar.TUESDAY:
		    	System.out.println("Day ::> "+day);
		        break;
		    case Calendar.WEDNESDAY:
		    	System.out.println("Day ::> "+day);
		    	break;
		    case Calendar.THURSDAY:
		    	System.out.println("Day ::> "+day);
		    	break;
		    case Calendar.FRIDAY:
		    	System.out.println("Day ::> "+day);
		    	break;
		    case Calendar.SATURDAY:
		    	System.out.println("Day ::> "+day);
		    	break;
		}
	}

}

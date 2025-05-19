package interviewProgramm;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DateFormate {
	public static void main(String[] args) {
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("MMM_yy");
			/*
			 * Date d1 = new Date(); int m = d1.getMonth()-1; int y = d1.getYear();
			 * System.out.println("Month_year ::> "+y);
			 */
			 Date d1 = new Date();
			 Calendar calendar = Calendar.getInstance();
			 calendar.setTime(d1);
			 calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) - 1);
			
			System.out.println(formatter.format(calendar.getTime()));
			System.out.println(isValid("luffy is still joyboy  "));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int isValid(String s) {
		/*
		 * Map<Character,Character> charMap = new HashMap<>(); charMap.put('(',')');
		 * charMap.put('{','}'); charMap.put('[',']'); int cnt1 = 0; int cnt2 = 0;
		 * for(int i=0;i<s.length()-1;i++){ if(charMap.containsKey(s.charAt(i)) &&
		 * (charMap.get(s.charAt(i)) == s.charAt(i+1))){ cnt1++; }else cnt2++; }
		 * if(cnt1>0)return true; else return false;
		 */
		int cnt = 0;
		s=s.trim();
        for(int i= s.length()-1;i>=0;i--){
            if(s.charAt(i) == ' '){
                break;
            }else cnt++;
        }
        return cnt;
	}
}

package programmers.level.one;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

class Solution42 {
	public String solution(int a, int b) {
        String answer = "";
        
        LocalDate date=LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek=date.getDayOfWeek();
        answer=dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();
        
        
        return answer;
    }
	
}
//2016년
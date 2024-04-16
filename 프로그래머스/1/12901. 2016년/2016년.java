import java.time.DayOfWeek;
import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        int year = 2016;
        LocalDate date = LocalDate.of(year, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        String answer = dayOfWeek.toString().substring(0,3);
        
        return answer;
    }
}
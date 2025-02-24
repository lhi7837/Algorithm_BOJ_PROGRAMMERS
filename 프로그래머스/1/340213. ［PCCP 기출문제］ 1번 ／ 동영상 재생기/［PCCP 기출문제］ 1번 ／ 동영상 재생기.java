import java.util.*;
class Time {
    private int iTime;
    private int iPos;
    private int iStart;
    private int iEnd;
    
    public Time(String video_len, String pos, String op_start, String op_end) {
        this.iTime = stringToIntTime(video_len);
        this.iPos = stringToIntTime(pos);
        this.iStart = stringToIntTime(op_start);
        this.iEnd = stringToIntTime(op_end);
    }
    
    public int stringToIntTime(String sTime) {
        int result = 0;
        String[] split = sTime.split(":");
        result += Integer.parseInt(split[0]) * 60;
        result += Integer.parseInt(split[1]);
        return result;
    }
    
    public String getTime() {
        StringBuilder sb = new StringBuilder();
        int mm = this.iPos / 60;
        int ss = this.iPos % 60;
        if(mm < 10) {
            sb.append("0");
        }
        sb.append(mm);
        sb.append(":");
        if(ss < 10) {
            sb.append("0");
        }
        sb.append(ss);
        return sb.toString();
    }
    
    public void editTime(String command) {
        checkOpTime();
        // System.out.print("현재 : " + getTime());
        if(command.equals("next")) {
            if(this.iTime - this.iPos < 10) {
                this.iPos = this.iTime;
            }
            else {
                this.iPos += 10;
            }
        }
        else if(command.equals("prev")) {
            if(this.iPos < 10) {
                this.iPos = 0;
            }
            else {
                this.iPos -= 10;
            }
        }
        // System.out.println(" -> editTime(" + command + ") -> " + getTime());
    }
    
    public void checkOpTime() {
        if(this.iPos >= this.iStart && this.iPos <= this.iEnd) {
            this.iPos = this.iEnd;
            // System.out.println("오프닝 건너뛰기");
        }
    }
    
}

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        Time time = new Time(video_len, pos, op_start, op_end);
        for(String command : commands) {
            time.editTime(command);
            time.checkOpTime();
        }
        String answer = time.getTime();
        return answer;
    }
}
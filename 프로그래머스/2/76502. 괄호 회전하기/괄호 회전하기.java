import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int size = s.length();
        String[] split = s.split("");
        Queue<String> q = new LinkedList<>();
        for(String ss : split) {
            q.offer(ss);
        }
        for(int i = 0; i < size; i++) {
            int[] checked = new int[3];//   0: (), 1: [], 2: {}
            StringBuilder sb = new StringBuilder();
            
            for(String ss : q) {
                sb.append(ss);
            }
            String check = sb.toString();
            while(check.length() > 0) {
                // System.out.println(check);
                check = check.replace("()", "");
                check = check.replace("[]", "");
                check = check.replace("{}", "");
                // System.out.println("변경 후 : " + check);
                if(!check.contains("()") && !check.contains("[]") && !check.contains("{}"))
                    break;
            }
            if(check.length() == 0) answer++;
            q.offer(q.poll());
        }
        return answer;
    }
}
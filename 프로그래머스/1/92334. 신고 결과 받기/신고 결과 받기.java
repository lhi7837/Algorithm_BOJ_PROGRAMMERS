import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> reported = new HashMap<>();
        for(String s : report) {
            String[] temp = s.split(" ");
            Set<String> set = reported.getOrDefault(temp[1], new HashSet<>());
            set.add(temp[0]);
            reported.put(temp[1], set);
        }
        Map<String, Integer> mailed = new HashMap<>();
        for(int i = 0; i < id_list.length; i++) {
            Set<String> set = reported.getOrDefault(id_list[i], new HashSet<>());
            int cnt = set.size(); //해당 유저가 신고당한 횟수
            if(cnt >= k) {
                //정지된 유저를 신고한 유저 찾기
                for(String user : set) {
                    mailed.put(user, mailed.getOrDefault(user, 0) + 1);
                }
            }
        }
        for(int i = 0; i < id_list.length; i++) {
            answer[i] = mailed.getOrDefault(id_list[i], 0);
        }
        // System.out.println(reported.toString());
        // System.out.println(mailed.toString());
        return answer;
    }
}
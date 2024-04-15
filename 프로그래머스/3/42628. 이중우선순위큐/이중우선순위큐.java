import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> reverse_pq = new PriorityQueue<>(Collections.reverseOrder());
        int add_cnt = 0;
        int max_cnt = 0;
        int min_cnt = 0;
        for(String s : operations) {
            String[] values = s.split(" ");
            //I 모드 입력
            if("I".equals(values[0])) {
                pq.add(Integer.parseInt(values[1]));
                reverse_pq.add(Integer.parseInt(values[1]));
                add_cnt++;
            }
            //D 모드
            else if(!pq.isEmpty()){
                //최소값인 경우
                if(Integer.parseInt(values[1]) == -1) {
                    pq.poll();
                    min_cnt++;
                }
                //최대값인 경우
                else {
                    reverse_pq.poll();
                    max_cnt++;
                }
            }
        }
        Set<Integer> set = new TreeSet<>();
        for(Integer i : pq) {
            if(reverse_pq.contains(i)) set.add(i);
        }

        if(add_cnt <= max_cnt + min_cnt) {
            answer[0] = 0;
            answer[1] = 0;
        }
        else {
            List<Integer> list = new ArrayList<>();
            for(Integer i : set) {
                list.add(i);
            }            
            answer[0] = list.get(list.size()-1);
            answer[1] = list.get(0);
        }
        return answer;
    }
}
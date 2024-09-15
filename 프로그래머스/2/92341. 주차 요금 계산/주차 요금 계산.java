import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        //map에 각 차량별 입장, 퇴장 시각 저장
        Map<String, Queue<String>> cars = new TreeMap<>();
        for(String rec : records) {
            String[] split = rec.split(" ");
            Queue<String> newQueue;
            if(cars.containsKey(split[1])) {
                newQueue = new LinkedList<>(cars.get(split[1]));
            }
            else {
                newQueue = new LinkedList<>();
            }
            newQueue.offer(split[0]);
            cars.put(split[1], newQueue);
        }
        int[] answer = new int[cars.size()];
        int idx = 0;
        //map을 돌면서 누적 주차 시간 계산해서 answer에 담기
        for(String key : cars.keySet()) {
            int sum = 0;
            boolean isIn = true;
            Queue<String> queue = cars.get(key);
            // System.out.println(key + " : " + queue.toString());
            while(!queue.isEmpty()) {
                String time = queue.poll();
                int timeCal = Integer.parseInt(time.substring(0, 2)) * 60 + Integer.parseInt(time.substring(3, 5));
                // System.out.println("## timeCal : " + timeCal);
                if(isIn) {
                    sum -= timeCal;
                    isIn = false;
                }
                else {
                    sum += timeCal;
                    isIn = true;
                }
            }
            if(!isIn) {
                sum += 23 * 60 + 59;
            }
            // System.out.println("Is IN? " + isIn + ", sum=" + sum);
            answer[idx++] = sum;
        }
        //answer 돌면서 주차 요금으로 계산해서 answer 업데이트 후 리턴
        for(int i = 0; i < answer.length; i++) {
            // System.out.println(answer[i]);
            //기본 시간 이하이면 기본 요금 청구
            if(answer[i] <= fees[0]) {
                answer[i] = fees[1];
            }
            //기본 시관 초과하면 기본 요금 + 초과 시간 계산해서 청구
            else {
                int fee = fees[1];
                //올림 처리
                int feeCal = answer[i] - fees[0];
                if(feeCal % fees[2] != 0) {
                    fee += ((feeCal / fees[2]) + 1) * fees[3];
                }
                else {
                    fee += (feeCal / fees[2]) * fees[3];
                }
                answer[i] = fee;
            }
        }
        return answer;
    }
}
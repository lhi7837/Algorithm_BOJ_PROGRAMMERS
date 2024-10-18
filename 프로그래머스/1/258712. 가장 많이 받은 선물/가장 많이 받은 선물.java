import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        Map<String, Map<String, Integer>> push = new HashMap<>();
        Map<String, Map<String, Integer>> pull = new HashMap<>();
        //우선 초기화
        for(int i = 0; i < friends.length; i++) {
            for(int j = 0; j < friends.length; j++) {
                if(i == j) continue;
                Map<String, Integer> map = push.getOrDefault(friends[i], new HashMap<>());
                map.put(friends[j], 0);
                push.put(friends[i], map);
                pull.put(friends[i], map);
            }
        }
        //전체 기록 돌면서 주고 받은 기록 맵에 담기
        for(String log : gifts) {
            String[] who = log.split(" ");// [0]누가, [1]누구에게
            Map<String, Integer> map1 = new HashMap<>(push.get(who[0]));
            map1.put(who[1], map1.get(who[1]) + 1);
            push.put(who[0], map1);
            Map<String, Integer> map2 = new HashMap<>(pull.get(who[1]));
            map2.put(who[0], map2.get(who[0]) + 1);
            pull.put(who[1], map2);
        // System.out.println("준 기록 : " + push.toString());
        // System.out.println("받은 기록 : " + pull.toString());
        }

        
        Map<String, Integer> giftScore = new HashMap<>();
        for(String a : push.keySet()) {
            Map<String, Integer> map = push.get(a);
            int sum = 0;
            for(String b : map.keySet()) {
                sum += map.get(b);
            }
            giftScore.put(a, sum);
        }
        for(String a : pull.keySet()) {
            Map<String, Integer> map = pull.get(a);
            int sum = 0;
            for(String b : map.keySet()) {
                sum -= map.get(b);
            }
            giftScore.put(a, giftScore.getOrDefault(a, 0) + sum);
        }
        //선물 점수는 계산 완료된 상태
        //이제 1대1 대응 관계 계산
        int[] receive = new int[friends.length];
        for(int i = 0; i < friends.length; i++) {
            Map<String, Integer> pushMap = push.getOrDefault(friends[i], new HashMap<>());
            Map<String, Integer> pullMap = pull.getOrDefault(friends[i], new HashMap<>());
            String a = friends[i];
            // System.out.println(friends[i] + " : " + pushMap.toString() + "\n ---" + pullMap.toString());
            for(String b : pushMap.keySet()) {
                if(a.equals(b)) continue;
                int aCnt = pushMap.getOrDefault(b, 0);
                int bCnt = pullMap.getOrDefault(b, 0);
                    int aScore = giftScore.getOrDefault(a, 0);
                    int bScore = giftScore.getOrDefault(b, 0);
                    // System.out.print(a +"랑 " + b +"는 ");
                // System.out.print(aCnt + " vs " + bCnt + " / ");
                // System.out.println(aScore + " vs " + bScore);
                //a -> b에게 준 횟수가 많으면 받을 선물 +1

                
                if(aCnt > bCnt) receive[i]++;
                //준 적 없거나(0으로 처리) 같으면 선물 점수로 비교
                else if(aCnt == bCnt) {
                    // int aScore = giftScore.getOrDefault(a, 0);
                    // int bScore = giftScore.getOrDefault(b, 0);
                    if(aScore > bScore) {
                        // System.out.println(" --> 왼쪽 승, ++");
                        receive[i]++;
                    }
                }
            }
        }
        for(int i : receive) {
            answer = Math.max(answer, i);   
        }
        // System.out.println(push.toString());
        // System.out.println(pull.toString());
        // System.out.println(giftScore.toString());
        // System.out.println(Arrays.toString(receive));
        return answer;
    }
}
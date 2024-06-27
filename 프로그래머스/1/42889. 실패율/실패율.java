import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        // 실패율 저장을 위한 리스트 생성
        List<double[]> failureRates = new ArrayList<>();
        
        // 각 스테이지에 도달한 인원 수를 저장할 배열
        int[] reached = new int[N + 2]; // 인덱스 0은 사용하지 않음, N+1은 클리어 한 사용자
        
        for (int stage : stages) {
            reached[stage]++;
        }
        
        int players = stages.length; // 총 플레이어 수
        
        for (int i = 1; i <= N; i++) {
            if (players == 0) {
                failureRates.add(new double[]{i, 0});
            } else {
                double failureRate = (double) reached[i] / players;
                failureRates.add(new double[]{i, failureRate});
                players -= reached[i];
            }
        }
        
        // 실패율을 기준으로 내림차순 정렬, 실패율이 같으면 스테이지 번호 오름차순
        failureRates.sort((a, b) -> {
            if (b[1] == a[1]) {
                return Double.compare(a[0], b[0]);
            } else {
                return Double.compare(b[1], a[1]);
            }
        });
        
        // 결과 배열에 스테이지 번호만 담기
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = (int) failureRates.get(i)[0];
        }
        
        return answer;
    }
}

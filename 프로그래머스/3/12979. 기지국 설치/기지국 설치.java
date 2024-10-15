import java.util.*;

class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int idx = 1;  // 커버되지 않은 아파트의 시작 번호
        int coverage = 2 * w + 1;  // 기지국이 커버할 수 있는 범위
        
        for (int station : stations) {
            int left = station - w;  // 현재 기지국이 커버하는 범위의 왼쪽 끝
            if (idx < left) {
                // 기지국이 커버하지 않는 구간이 존재하는 경우, 기지국을 설치
                int uncovered = left - idx;
                answer += (uncovered + coverage - 1) / coverage;  // 필요한 기지국의 개수 계산
            }
            idx = station + w + 1;  // 다음으로 커버되지 않은 시작 위치 갱신
        }

        // 마지막 기지국 이후에 커버되지 않은 구간 처리
        if (idx <= n) {
            int uncovered = n - idx + 1;
            answer += (uncovered + coverage - 1) / coverage;
        }

        return answer;
    }
}

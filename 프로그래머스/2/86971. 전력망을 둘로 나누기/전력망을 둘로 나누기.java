import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = n; // 초기값을 n으로 설정
        // 전선을 하나씩 끊어가며 최소 차이를 구함
        for (int i = 0; i < wires.length; i++) {
            // 특정 전선을 끊은 상태의 그래프를 BFS로 탐색하여 송전탑 개수를 구함
            int result = bfs(n, wires, i);
            // 두 전력망의 차이를 계산하여 최소값을 업데이트
            answer = Math.min(answer, Math.abs(result - (n - result)));
        }
        return answer;
    }
    
    // BFS 탐색을 통해 연결된 송전탑의 개수를 반환
    public int bfs(int n, int[][] wires, int skip) {
        boolean[] visited = new boolean[n + 1]; // 송전탑 번호는 1부터 시작하므로 n+1 크기의 방문 배열
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1); // 첫 번째 송전탑부터 시작
        visited[1] = true; // 1번 송전탑을 방문 처리
        int count = 0; // 연결된 송전탑 개수

        while (!queue.isEmpty()) {
            int node = queue.poll();
            count++; // 탐색한 송전탑 개수를 증가
            
            for (int i = 0; i < wires.length; i++) {
                if (i == skip) continue; // 이번에 끊은 전선을 건너뜀
                int v1 = wires[i][0];
                int v2 = wires[i][1];
                
                // 현재 송전탑과 연결된 송전탑을 큐에 추가
                if (v1 == node && !visited[v2]) {
                    queue.offer(v2);
                    visited[v2] = true;
                } else if (v2 == node && !visited[v1]) {
                    queue.offer(v1);
                    visited[v1] = true;
                }
            }
        }
        return count; // 연결된 송전탑의 개수를 반환
    }
}
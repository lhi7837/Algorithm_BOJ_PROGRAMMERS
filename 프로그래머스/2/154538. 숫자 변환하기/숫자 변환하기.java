import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        // y가 x보다 작은 경우 변환 불가능하므로 -1 반환
        if (x > y) return -1;

        // BFS 탐색을 위한 큐 초기화 (현재 숫자, 연산 횟수)
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, 0});
        
        // 숫자에 도달했는지 여부를 저장하는 배열
        boolean[] visited = new boolean[y + 1];
        visited[x] = true;

        // BFS 탐색 시작
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int value = current[0]; // 현재 숫자
            int count = current[1]; // 현재까지의 연산 횟수

            // y에 도달하면 그 때의 연산 횟수를 반환
            if (value == y) return count;

            // 세 가지 연산을 시도
            int[] nextValues = {value + n, value * 2, value * 3};

            for (int nextValue : nextValues) {
                // 범위를 넘지 않고, 아직 방문하지 않은 숫자일 때만 큐에 추가
                if (nextValue <= y && !visited[nextValue]) {
                    visited[nextValue] = true;
                    queue.add(new int[]{nextValue, count + 1});
                }
            }
        }

        // 모든 경우를 탐색해도 y에 도달할 수 없다면 -1 반환
        return -1;
    }
}

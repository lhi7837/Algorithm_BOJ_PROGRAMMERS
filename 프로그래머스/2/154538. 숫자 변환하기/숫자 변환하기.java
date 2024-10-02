import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        boolean visited[] = new boolean[y+1];
        Queue<int[]> queue = new LinkedList<>();
        visited[x] = true;
        queue.offer(new int[] {x, 0});
        while(!queue.isEmpty()) {
            int[] value = queue.poll();
            int num = value[0];
            int cnt = value[1];
            if(num == y) return cnt;
            int[] nextVals = new int[] {num + n, num * 2, num * 3};
            //방문한 적 없으면 큐에 넣기
            for(int next : nextVals) {
                if(y >= next && !visited[next]) {
                    visited[next] = true;
                    queue.offer(new int[] {next, cnt + 1});
                }    
            }
            
        }
        return -1;
    }
}
import java.util.*;

class Solution {
    int[][] map;
    int N;
    int M;
    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};
    boolean[][] visited;
    List<Integer> result = new ArrayList<>();
    public int[] solution(String[] maps) {
        N = maps.length;
        M = maps[0].length();
        visited = new boolean[N][M];
        map = new int[N][M];
        
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                char c = maps[i].charAt(j);
                if(c == 'X') {
                    c = '0';
                }
                map[i][j] = c - '0';
            }
            // System.out.println(Arrays.toString(map[i]));
        }

        
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(map[i][j] != 0 && !visited[i][j]) {
                    // System.out.println("====== " + i + ", " + j + " ======");
                    bfs(i, j);
                }
            }
        }
        // for(boolean[] b : visited) {
        //     System.out.println(Arrays.toString(b));
        // }
        if(result.isEmpty()) return new int[]{-1};
        int[] answer = new int[result.size()];
        int idx = 0;
        for(int i : result) {
            answer[idx++] = i;
        }
        Arrays.sort(answer);
        return answer;
    }
    public void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        int sum = 0;
        queue.offer(new int[]{x, y});
        visited[x][y] = true;
        while(!queue.isEmpty()) {
            int[] temp = queue.poll();
            sum += map[temp[0]][temp[1]];
            for(int i = 0; i < 4; i++) {
                int nx = temp[0] + dx[i];
                int ny = temp[1] + dy[i];
                if(nx >= 0 && ny >= 0 && nx < N && ny < M 
                   && !visited[nx][ny] && map[nx][ny] != 0)  {
                    // System.out.println(i + ")--> (" + nx + ", " + ny + ") + " + map[nx][ny]);
                    queue.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }
        result.add(sum);
        // System.out.println(sum);
    }
}
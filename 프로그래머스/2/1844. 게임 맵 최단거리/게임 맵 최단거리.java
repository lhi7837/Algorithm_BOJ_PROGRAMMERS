import java.util.*;

class Solution {
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static int n;
    public static int m;
    public static int answer;
    public static boolean[][] visited;
    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        answer = 0;
        visited = new boolean[n][m];
        bfs(0, 0, maps);
        if(maps[n-1][m-1] == 1) return -1;
        answer = maps[n-1][m-1];
        return answer;
    }
    
    public void bfs(int x, int y, int[][] maps) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;
        while(!queue.isEmpty()) {
            int[] poll = queue.poll();
            int curX = poll[0];
            int curY = poll[1];

            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (!visited[nx][ny] && maps[nx][ny] == 1) {
                        maps[nx][ny] = maps[curX][curY] + 1;
                        queue.add(new int[]{nx, ny});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
    }
}
class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] visited = new int[m+1][n+1];
        for(int i = 0; i < puddles.length; i++) {
            visited[puddles[i][0]][puddles[i][1]] = -1;
        }
        visited[1][1] = 1;
        for(int i = 1; i < m + 1; i++) {
            for(int j = 1; j < n + 1; j++) {
                if(visited[i][j] != -1) {
                    visited[i][j] += Math.max(visited[i][j-1], 0) + Math.max(visited[i-1][j], 0);
                    visited[i][j] %= 1000000007;
                }
            }
        }
        return visited[m][n];
    }
}

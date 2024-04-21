class Solution {
    public int answer;
    public boolean[] isVisited;
    public int solution(int k, int[][] dungeons) {
        answer = 0;
        isVisited = new boolean[dungeons.length];
        
        dfs(0, k, dungeons);
        return answer;
    }
    
    public void dfs(int depth, int k, int[][] dungeons) {
        for(int i = 0; i < dungeons.length; i++) {
            //방문하지 않은 곳 && 필요 피로도가 k보다 작으면
            if(!isVisited[i] && dungeons[i][0] <= k) {
                //방문처리
                isVisited[i] = true;
                //다음 단계 방문, 내가 가진 피로도 빼주기
                dfs(depth + 1, k - dungeons[i][1], dungeons);
                
                isVisited[i] = false;
            }
        }
        answer = Math.max(answer, depth);
    }
}
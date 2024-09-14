class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int[][] dp = new int[land.length][4];
        for(int i = 0; i < 4; i++) {
            dp[0][i] = land[0][i];
        }
        for(int i = 1; i < land.length; i++) {
            //기존에 있는 값을 순서대로
            for(int j = 0; j < 4; j++) {
                int max = 0;
                //더할 값 : 순서대로 가장 큰 값 찾기
                for(int k = 0; k < 4; k++) {
                    if(j != k) {
                        max = Math.max(max, dp[i - 1][k]);
                    }
                }
                // System.out.println("찾은 max : " + max);
                //찾은 가장 큰 값을 더해서 j위치에 넣기
                dp[i][j] = max + land[i][j];
                // System.out.println("dp[" + i + "][" + j + "] : " + dp[i][j] + " = " + max + " + " + dp[i-1][j]);
            }
        }
        for(int i = 0; i < 4; i++) {
            answer = Math.max(answer, dp[dp.length-1][i]);
        }

        return answer;
    }
}
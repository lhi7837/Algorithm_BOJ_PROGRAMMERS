/* 12 13 14 23 24 34 */
/* idx 05 / 14 / 23 세가지 케이스만 체크하면 됨*/
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double[] dxdy = new double[6];
        dxdy[0] = ((double)(dots[0][0] - dots[1][0]) / (dots[0][1] - dots[1][1]));
        dxdy[1] = ((double)(dots[0][0] - dots[2][0]) / (dots[0][1] - dots[2][1]));
        dxdy[2] = ((double)(dots[0][0] - dots[3][0]) / (dots[0][1] - dots[3][1]));
        dxdy[3] = ((double)(dots[1][0] - dots[2][0]) / (dots[1][1] - dots[2][1]));
        dxdy[4] = ((double)(dots[1][0] - dots[3][0]) / (dots[1][1] - dots[3][1]));
        dxdy[5] = ((double)(dots[2][0] - dots[3][0]) / (dots[2][1] - dots[3][1]));
        if(dxdy[0] == dxdy[5]) {
            return 1;
        }
        if(dxdy[1] == dxdy[4]) {
            return 1;
        }
        if(dxdy[2] == dxdy[3]) {
            return 1;
        }
        return answer;
    }
}
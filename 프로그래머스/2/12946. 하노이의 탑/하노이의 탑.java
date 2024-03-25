import java.util.ArrayList;
import java.util.List;

class Solution {
    private static List<int[]> ansList;
    public void move(int n, int from, int to, int through) {
        if(n == 1) {
            ansList.add(new int[]{from, to});
            return;
        }  
        move(n-1, from, through, to);
        ansList.add(new int[]{from, to});
        move(n-1, through, to, from);
    }
    
    public int[][] solution(int n) {
        ansList = new ArrayList<>();
        move(n, 1, 3, 2);

        int[][] answer = new int[(int)Math.pow(2, n)-1][2];
        for(int i = 0; i < ansList.size(); i++) {
            answer[i] = ansList.get(i);
        }
        return answer;
    }
}
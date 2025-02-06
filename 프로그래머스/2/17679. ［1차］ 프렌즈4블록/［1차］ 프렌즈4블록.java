import java.util.*;

class Solution {
    public int solution(int m, int n, String[] board) {
        char[][] map = new char[m][n];
        for(int i=0; i<m; i++) map[i] = board[i].toCharArray();
        
        int answer = 0;
        
        while(true) {
            Set<List<Integer>> toRemove = new HashSet<>();
            
            // 1️⃣ 2x2 블록 체크 (범위 주의!)
            for(int i=0; i<m-1; i++) { // m-1까지만!
                for(int j=0; j<n-1; j++) { // n-1까지만!
                    char c = map[i][j];
                    if(c == ' ') continue;
                    if(c == map[i][j+1] && 
                       c == map[i+1][j] &&
                       c == map[i+1][j+1]) {
                        
                        // 좌표를 List로 저장
                        toRemove.add(Arrays.asList(i, j));
                        toRemove.add(Arrays.asList(i, j+1));
                        toRemove.add(Arrays.asList(i+1, j));
                        toRemove.add(Arrays.asList(i+1, j+1));
                    }
                }
            }
            
            if(toRemove.isEmpty()) break;
            answer += toRemove.size();
            
            // 2️⃣ 블록 제거
            for(List<Integer> pos : toRemove) {
                map[pos.get(0)][pos.get(1)] = ' ';
            }
            
            // 3️⃣ 블록 재정렬
            for(int col=0; col<n; col++) {
                Stack<Character> stack = new Stack<>();
                for(int row=0; row<m; row++) {
                    if(map[row][col] != ' ') stack.push(map[row][col]);
                }
                for(int row=m-1; row>=0; row--) {
                    map[row][col] = !stack.isEmpty() ? stack.pop() : ' ';
                }
            }
        }
        return answer;
    }
}

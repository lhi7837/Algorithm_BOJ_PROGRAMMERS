class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int size = board.length;
        int[][] new_board = new int[size][size];
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(board[i][j] == 1) {
                    int x = i;
                    int y = j;
                    if(x + 1 < size) {
                        if(y + 1 < size) {   
                            new_board[x+1][y+1] = 1;
                        }
                        if(y - 1 >= 0) {
                            new_board[x+1][y-1] = 1;
                        }
                        new_board[x+1][y] = 1;
                    }
                    
                    if(x - 1 >= 0) {
                        if(y + 1 < size) {
                            new_board[x-1][y+1] = 1;                        
                        }
                        if(y - 1 >= 0) {
                            new_board[x-1][y-1] = 1;
                        }
                        new_board[x-1][y] = 1;
                    }
                    if(y + 1 < size) {
                        new_board[x][y+1] = 1;
                    }
                    if(y - 1 >= 0) {
                        new_board[x][y-1] = 1;    
                    }
                    new_board[x][y] = 1;
                }
            }
        }
        for(int i = 0; i < new_board.length; i++) {
            for(int j = 0; j < new_board.length; j++) {
                if(new_board[i][j] == 0) answer++; 
            }
        }
        return answer;
    }
}
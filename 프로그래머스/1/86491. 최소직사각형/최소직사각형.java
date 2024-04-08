class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        int max_width = sizes[0][0];
        int max_height = sizes[0][1];
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] > max_width) max_width = sizes[i][0];
            if(sizes[i][1] > max_height) max_height = sizes[i][1];
        }
        answer = max_width * max_height;
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 1;
        Arrays.sort(routes, (a, b) -> {
            return a[1] - b[1];
        });
        int max = routes[0][1];
        for(int [] arr : routes) {
            if(arr[0] > max) {
                max = arr[1];
                answer++;
            }
        }
        return answer;
    }
}
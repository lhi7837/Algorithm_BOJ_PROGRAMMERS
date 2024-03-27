import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        for(int i = 1; i <= 2000; i++) {
            int[] arr = Arrays.copyOf(sides, sides.length + 1);
            arr[2] = i;
            Arrays.sort(arr);
            if(arr[2] < arr[1] + arr[0]) answer++;
        }
        
        return answer;
    }
}
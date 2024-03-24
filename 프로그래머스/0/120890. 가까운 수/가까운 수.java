import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int diff = Math.abs(n - array[0]);
        int answer = array[0];
        for(int i = 0; i < array.length; i++) {
            if(diff > Math.abs(n - array[i])) {
                diff = Math.abs(n - array[i]);
                answer = array[i];
            }
        }
        return answer;
    }
}
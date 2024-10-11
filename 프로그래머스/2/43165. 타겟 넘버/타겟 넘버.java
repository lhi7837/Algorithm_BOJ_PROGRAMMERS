import java.util.*;

class Solution {
    int[] numbers;
    int target;
    int count;
    public int solution(int[] numbers, int target) {
        this.target = target;
        this.numbers = numbers;
        this.count = 0;
        dfs(0, 0);
        int answer = count;
        return answer;
    }
    public void dfs(int sum, int idx) {
        // System.out.println(sum + " , " + idx);
        if(idx == numbers.length) {
            if(target == sum) count++;
            return;
        }
        dfs(sum + numbers[idx], idx+1);
        dfs(sum - numbers[idx], idx+1);
    }
}
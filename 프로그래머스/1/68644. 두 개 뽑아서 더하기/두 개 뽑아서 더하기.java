import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> answer_set = new HashSet<>();
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                answer_set.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[answer_set.size()];
        int idx = 0;
        for(int i : answer_set) {
            answer[idx++] = i;
        }
        Arrays.sort(answer);
        return answer;
    }
}
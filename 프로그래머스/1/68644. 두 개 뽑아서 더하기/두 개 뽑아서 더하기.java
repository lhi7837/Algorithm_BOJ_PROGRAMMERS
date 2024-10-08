import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Arrays.sort(numbers);
        Set<Integer> set = new TreeSet<>();
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[set.size()];//개수는 어떻게 구할 것인가? 리스트는 써도 되는건가?
        int idx = 0;
        for(int i : set) {
            answer[idx++] = i;
        }
        return answer;
    }
}
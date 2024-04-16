import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 1; i <= elements.length; i++) {
            for(int j = 1; j <= elements.length; j++) {
                int sum = 0;
                for(int k = j; k < j + i; k++) {
                    sum += elements[k % elements.length];
                }
                set.add(sum);
            }
        }
        // System.out.println();
        // for(Integer i : set) {
        //     System.out.print(i + ", ");
        // }
        answer = set.size();
        return answer;
    }
}
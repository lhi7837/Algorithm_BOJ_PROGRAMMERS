import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        List<Integer> A_ = new ArrayList<>();
        List<Integer> B_ = new ArrayList<>();
        for(int i : A) {
            A_.add(i);
        }
        for(int i : B) {
            B_.add(i);
        }
        Collections.sort(A_, Collections.reverseOrder());
        Collections.sort(B_, Collections.reverseOrder());
        for(int a : A_) {
            Integer target = null;
            for(int b : B_) {
                if(a < b) {
                    target = b;
                    break;
                }
            }
            if(target != null) {
                B_.remove(target);
                answer++;
            }
        }
        return answer;
    }
}
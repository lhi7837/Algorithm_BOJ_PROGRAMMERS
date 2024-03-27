import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        Stack<Integer> a = new Stack<>();
        Stack<Integer> b = new Stack<>();
        for(int i : A) {
            a.push(i);
        }
        for(int i = B.length - 1; i >= 0; i--){
            b.push(B[i]);
        }

        while(a.size() > 0) {
            answer += a.pop() * b.pop();
        }
        
        return answer;
    }
}
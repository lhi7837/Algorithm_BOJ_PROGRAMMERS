import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        Deque<Integer> q = new LinkedList<>();
        for(Integer i : people) {
            q.add(i);
        }
        //최대 두명
        //가장 많은 사람 한명 + 가장 적은 사람 한명씩 가는것과
        //50 / 50이어도 어차피 횟수는 동일하다
        while(q.size() > 0) {
            int sum = limit;
            if(q.peekLast() <= sum) {
                sum -= q.pollLast();
            }
            if(q.size() > 0 && q.peek() <= sum) {
                sum -= q.poll();
            }
            answer++;
            // System.out.print("남은 사람 : ");
            // for(Integer i : q) {
            //     System.out.print(i + ", ");
            // }
            // System.out.println();
        }
        return answer;
    }
}
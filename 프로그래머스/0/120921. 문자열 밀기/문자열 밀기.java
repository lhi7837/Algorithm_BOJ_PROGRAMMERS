class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        // System.out.println(A.substring(1));
        int i = 0;
        String C = A;
        if(A.equals(B)) return 0;
        while(!B.equals(C)) {
            C = C.substring(A.length() - 1, A.length()) + C.substring(0, A.length() - 1);
            answer++;
            if(answer > A.length()) return -1;
            
        }
        return answer;
    }
}
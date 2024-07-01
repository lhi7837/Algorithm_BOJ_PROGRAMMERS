class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        int goal = t * m;
        for(int i = 0; sb.length() <= goal; i++) {
            sb.append(Integer.toString(i, n).toUpperCase());
        }
        for(int i = 0; answer.length() < t; i++) {
            if(i % m == p - 1) {
                answer.append(sb.charAt(i));
            }
        }
        // System.out.println(sb);
        return answer.toString();
    }
}
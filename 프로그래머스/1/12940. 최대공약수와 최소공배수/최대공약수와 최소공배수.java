class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = GCD(n, m);
        answer[1] = n * m / GCD(n, m); 
        return answer;
    }
    
    public int GCD(int n, int m) {
        int x = n;
        int y = m;
        int r = n % m;
        
        while(r != 0) {
            x = y;
            y = r;
            r = x % y;
        }
        return y;
    }
}
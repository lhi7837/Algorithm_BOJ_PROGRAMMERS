class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int size = numbers.length;
        int idx = (k - 1) * 2;
        answer = numbers[idx % size];
        return answer;
    }
}

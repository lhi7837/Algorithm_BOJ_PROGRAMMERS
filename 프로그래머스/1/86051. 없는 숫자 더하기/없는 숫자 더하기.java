class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++) {
            arr[i] = i;
        }
        for(int i = 0; i < numbers.length; i++) {
            int idx = numbers[i];
            arr[idx] = 0;
        }
        for(int i : arr) {
            answer += i;
        }
        return answer + 1;
    }
}
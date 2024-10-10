class Solution {
    public int[] solution(int[] sequence, int k) {
        int n = sequence.length;
        int start = 0, end = 0;
        int sum = sequence[0];
        int[] answer = {0, n - 1};  // 최대 길이의 부분 수열로 초기화

        while (start < n && end < n) {
            if (sum == k) {
                // 현재 구간이 더 짧은지 확인하고 업데이트
                if (end - start < answer[1] - answer[0]) {
                    answer[0] = start;
                    answer[1] = end;
                }
                // 동일한 구간 길이라면, 더 앞에 있는 구간으로 업데이트
                else if (end - start == answer[1] - answer[0] && start < answer[0]) {
                    answer[0] = start;
                    answer[1] = end;
                }
                
                // 다음 구간을 확인하기 위해 start 포인터 이동
                sum -= sequence[start];
                start++;
            } else if (sum < k) {
                // sum이 k보다 작으면 end 포인터 이동
                end++;
                if (end < n) {
                    sum += sequence[end];
                }
            } else {
                // sum이 k보다 크면 start 포인터 이동
                sum -= sequence[start];
                start++;
            }
        }
        
        return answer;
    }
}
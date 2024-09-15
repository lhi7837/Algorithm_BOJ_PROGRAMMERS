class Solution {
    public int solution(String word) {
        int answer = 0;
        int[] weights = {781, 156, 31, 6, 1};
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        
        for (int i = 0; i < word.length(); i++) {
            int index = 0;
            // 현재 문자의 인덱스 찾기
            for (int j = 0; j < vowels.length; j++) {
                if (word.charAt(i) == vowels[j]) {
                    index = j;
                    break;
                }
            }
            // 순서 계산
            answer += weights[i] * index + 1;
        }
        
        return answer;
    }
}

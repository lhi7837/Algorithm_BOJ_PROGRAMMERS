import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        // target이 words에 없는 경우 변환 불가능
        if (!Arrays.asList(words).contains(target)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.offer(begin);
        visited.add(begin);

        int level = 0; // 변환 단계 수

        while (!queue.isEmpty()) {
            int size = queue.size();
            level++; // 다음 단계로 이동

            for (int i = 0; i < size; i++) {
                String currentWord = queue.poll();

                // words 배열에서 한 글자만 다른 단어들을 찾음
                for (String word : words) {
                    if (!visited.contains(word) && isOneLetterDifferent(currentWord, word)) {
                        if (word.equals(target)) {
                            return level;
                        }
                        queue.offer(word);
                        visited.add(word);
                    }
                }
            }
        }

        // 목표 단어에 도달하지 못한 경우
        return 0;
    }

    // 두 단어가 한 글자만 다른지 확인하는 함수
    private boolean isOneLetterDifferent(String word1, String word2) {
        int diffCount = 0;

        for (int i = 0; i < word1.length(); i++) {
            // 각 위치의 문자가 다른 경우 카운트 증가
            if (word1.charAt(i) != word2.charAt(i)) {
                diffCount++;
            }
            // 두 글자 이상 다른 경우 false 반환
            if (diffCount > 1) {
                return false;
            }
        }
        // 한 글자만 다른 경우 true 반환
        return diffCount == 1;
    }
}

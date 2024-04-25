class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] nephew = new String[] {"aya", "ye", "woo", "ma"};
        for(String s : babbling) {
            for(int i = 0; i < 4; i++) {
                s = s.replaceAll(nephew[i], String.valueOf(i));
            }
            if(s.matches("[0-9]+")) {
                if(!(s.contains("00") || s.contains("11") || s.contains("22") || s.contains("33")))
                    answer++;
            }
        }
        
        return answer;
    }
}
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i = 0; i < babbling.length; i++) {
        String[] baby = new String[] {"aya", "ye", "woo", "ma"};
            for(int j = 0; j < 4; j++) {
                babbling[i] = babbling[i].replaceFirst(baby[j], "0");
                baby[j] = "";
            }
            for(int j = 0; j < 4; j++) {
                babbling[i] = babbling[i].replaceFirst("0", "");
            }
            if(babbling[i].isEmpty()) {
                answer += 1;
            }
        }
        return answer;
    }
}
class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        char[] alphabet = new char[26 - skip.length()];
        int i = 0;
        for(char c = 'a'; c <= 'z'; c++) {
            if(skip.indexOf(c) == -1) {
                alphabet[i++] = c;
            }
        }
        for(char c : s.toCharArray()) {
            for(int j = 0; j < alphabet.length; j++) {
                int k = (j + index) % alphabet.length;
                
                if(c == alphabet[j]) {
                    sb.append(alphabet[k]);
                    break;
                }
            }
        }
        
        return sb.toString();
    }
}
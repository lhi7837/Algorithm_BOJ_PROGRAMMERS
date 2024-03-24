class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] abc = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] letter_split = letter.split(" ");
        for(int i = 0; i < letter_split.length; i++) {
            for(int j = 0; j < mos.length; j++) {
                if(letter_split[i].equals(mos[j])) answer += abc[j]; 
            }
        }
        return answer;
    }
}
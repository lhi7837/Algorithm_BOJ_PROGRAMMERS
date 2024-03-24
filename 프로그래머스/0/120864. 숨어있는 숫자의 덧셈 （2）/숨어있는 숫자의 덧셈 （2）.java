class Solution {
    public int solution(String my_string) {
        int answer = 0;
        // my_string = my_string.replaceAll("[a-z|A-Z]"," ");
        
        String[] new_str = my_string.split("[a-z|A-Z]");
        for(String s : new_str) {
            if(!"".equals(s)) answer += Integer.parseInt(s); 
        }
        return answer;
    }
}
class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" ");
        int x_num = 0;
        int n_num = 0;
        for(String s : arr) {    
            if(s.charAt(s.length() - 1) == 'x') {
                String ss = s.substring(0, s.length()-1);
                if(ss.length() == 0) {
                    x_num += 1;
                }
                else {
                    x_num += Integer.parseInt(s.substring(0, s.length()-1));
                }
            }
            else if("+".equals(s)) {}
            else {
                n_num += Integer.parseInt(s);
            }
        }
        if(x_num > 0 && n_num > 0) {
            if(x_num == 1) answer = "x + " + String.valueOf(n_num); 
            else answer = String.valueOf(x_num) + "x + " + String.valueOf(n_num);
        }
        else if(x_num > 0 && n_num == 0) {
            if(x_num == 1) answer = "x";
            else answer = String.valueOf(x_num) + "x";
        }
        else {
            answer = String.valueOf(n_num);
        }
        return answer;
    }
}
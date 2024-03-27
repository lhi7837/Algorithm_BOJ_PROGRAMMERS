class Solution {
    public int solution(String my_string) {
        String[] my_arr = my_string.split(" ");
        int answer = Integer.parseInt(my_arr[0]);
        boolean operator = true; //true +, false -
        int num = 0;
        for(int i = 1; i < my_arr.length; i++) {
            if(i % 2 == 1) {
                if("+".equals(my_arr[i])) {
                    operator = true;
                }
                else {
                    operator = false;
                }
            }
            else {
                num = Integer.parseInt(my_arr[i]);
                if(operator) {
                    answer += num;
                } else {
                    answer -= num;
                }
            }
        }
        return answer;
    }
}
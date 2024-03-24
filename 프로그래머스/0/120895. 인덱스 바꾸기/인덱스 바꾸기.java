class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] my_arr = my_string.toCharArray();
        char temp = my_arr[num1];
        my_arr[num1] = my_arr[num2];
        my_arr[num2] = temp;
        String answer = String.valueOf(my_arr);
        return answer;
    }
}
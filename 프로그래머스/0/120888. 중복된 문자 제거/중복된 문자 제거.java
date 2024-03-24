class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) arr[j] = '*';
            }
        }
        answer = String.valueOf(arr).replace("*", "");
        return answer;
    }
}
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] = (char)(arr[i] + n);
                if(arr[i] > 'z') arr[i] -= 26;
            }
            if(arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char)(arr[i] + n);
                if(arr[i] > 'Z') arr[i] -= 26;
            }
        }
		answer = String.valueOf(arr);
        return answer;
    }
}
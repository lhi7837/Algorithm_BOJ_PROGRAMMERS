class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] arr1_str = new String[n];
        String[] arr2_str = new String[n];
        int idx = 0;
        for(int i : arr1) {
            arr1_str[idx++] = Integer.toBinaryString(i); 
        }
        idx = 0;
        for(int i : arr2) {
            arr2_str[idx++] = Integer.toBinaryString(i); 
        }
        for(int i = 0; i < n; i++) {
            StringBuffer sb = new StringBuffer();
            int temp = arr1[i] | arr2[i];
            String binary = Integer.toBinaryString(temp);
            for(int j = 0; j < binary.length(); j++) {
                if(binary.charAt(j) == '1') sb.append("#");
                else sb.append(" ");
            }
            answer[i] = sb.toString();
            if(answer[i].length() < n) {
                StringBuffer sb_blank = new StringBuffer();
                for(int j = 0; j < n - answer[i].length(); j++) {
                    sb_blank.append(" ");
                }
                answer[i] = sb_blank.toString() + sb.toString();
            }
        }
        return answer;
    }
}
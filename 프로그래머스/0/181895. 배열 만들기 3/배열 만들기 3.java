import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList <Integer> intervalList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            int a = intervals[i][0];
            int b = intervals[i][1];
            for(int j = a; j <= b; j++) {
                intervalList.add(arr[j]);
            }
        }
        int[] answer = new int[intervalList.size()];
        for (int i = 0; i < intervalList.size(); i++) {
            answer[i] = intervalList.get(i);
        }
        return answer;
    }
}
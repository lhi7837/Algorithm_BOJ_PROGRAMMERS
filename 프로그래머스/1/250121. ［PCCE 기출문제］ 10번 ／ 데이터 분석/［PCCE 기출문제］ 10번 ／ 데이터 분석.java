import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        HashMap<String, Integer> data_type = new HashMap<>();
        data_type.put("code", 0);
        data_type.put("date", 1);
        data_type.put("maximum", 2);
        data_type.put("remain", 3);

        ArrayList<int []> filtered_data = new ArrayList<>();
        for (int [] input: data) {
            if(input[data_type.get(ext)] < val_ext) {
                filtered_data.add(input);
            }
        }
        filtered_data.sort(Comparator.comparingInt(arr -> arr[data_type.get(sort_by)]));
        answer = filtered_data.toArray(new int[0][]);
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        String[] sales = new String[10];
        int idx = 0;
        int[] sales_count = new int[want.length];
        for(int i = 0; i < discount.length - 10 + 1; i++) {
            boolean flag = true;
            sales_count = Arrays.copyOf(number, number.length);
            for(int j = 0; j < 10; j++) {
                sales[j] = discount[i + j];
            }
            for(int j = 0; j < want.length; j++) {
                for(int k = 0; k < sales.length; k++) {
                    if(want[j].equals(sales[k])) {
                        sales_count[j]--;
                    }
                }
            }
            for(Integer j : sales_count) {
                if(j > 0) flag = false;
            }
            if(flag == true) {
                answer++;
            }
        }
        return answer;
    }
}
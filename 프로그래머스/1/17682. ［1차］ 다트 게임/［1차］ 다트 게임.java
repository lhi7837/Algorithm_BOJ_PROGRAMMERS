import java.util.*;

class Solution {
    public static int solution(String dartResult) {
		int answer = 0;
		int pow = 1;
		int[] arr = new int[] { 1, 1, 1 };
		int idx = 0;
		boolean isFirst = true;
		char lastC = ' ';
		for (char c : dartResult.toCharArray()) {
			// System.out.println(c + "일 때");
			if (c == '*') {
				if (idx > 0) {
					arr[idx - 1] *= 2;
				}
				arr[idx] *= 2;
			} else if (c == '#') {
				arr[idx] *= -1;
			} else if (c == 'S') {
				arr[idx] = (int) Math.pow(arr[idx], 1);
			} else if (c == 'D') {
				arr[idx] = (int) Math.pow(arr[idx], 2);
			} else if (c == 'T') {
				arr[idx] = (int) Math.pow(arr[idx], 3);
			} else {
				if (!isFirst) {
					idx++;
				}
				if (c == '0' && lastC == '1') {
					idx--;
					arr[idx] = 10;
				} else {
					arr[idx] = c - '0';
				}
				isFirst = false;
			}
			lastC = c;
			// System.out.println(idx + " : " + arr[idx]);
		}
		for (int i : arr) {
			answer += i;
		}
		return answer;
	}
}
import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    // System.out.println(i + ", " + j + ", " + k);
                    if(isPrime(new int[]{nums[i], nums[j], nums[k]})) answer++;
                }
            }
        }
        return answer;
    }
    
    public boolean isPrime(int[] nums) {
        int n = 0;
        for(int i : nums) {
            n += i;
        }
        if(n == 0 || n == 1) return false;
        int sqrt = (int)Math.sqrt(n);
        for(int i = 2; i <= sqrt; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
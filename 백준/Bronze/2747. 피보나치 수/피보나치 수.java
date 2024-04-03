import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
    public static long solution(int n) {
        long[] d = new long[n+1];
        if(n <= 2) return 1;
        d[1] = 1;
        d[2] = 1;
        for(int i = 3; i <= n; i++) {
            d[i] = (d[i-1] + d[i-2]);
        }
        long answer = d[n];
        return answer;
    }
}
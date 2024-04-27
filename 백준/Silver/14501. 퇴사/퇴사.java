import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int arr[][];
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        solution(0,0);
        System.out.println(max);
    }
    public static void solution(int idx, int fee) {
        if(idx > N) return;
        if(idx == N) {
            max = Math.max(max, fee);
            return;
        }
        solution(idx + arr[idx][0], fee + arr[idx][1]);
        solution(idx + 1, fee);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] output;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        output = new int[M];
        comb(N, M, 1, 0);

    }

    static void comb(int n, int r, int target, int index) {
        if (r == 0) {
            StringBuilder sb = new StringBuilder();
            for (int val : output) {
                sb.append(val).append(' ');
            }
            System.out.println(sb);
        } else if (target == n + 1) {
            return;
        } else {
            output[index] = target;
            comb(n, r - 1, target + 1, index + 1);
            comb(n, r, target + 1, index);
        }
    }
}
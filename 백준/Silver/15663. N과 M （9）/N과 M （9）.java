import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        boolean[] visited = new boolean[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr); // 순열을 오름차순으로 출력하기 위해 배열을 정렬합니다.
        dfs(0, M, arr, visited, new int[M]); // idx의 초기값을 0으로 변경
        System.out.print(sb);
    }

    public static void dfs(int idx, int depth, int[] arr, boolean[] visited, int[] output) {
        if (idx == depth) {
            for (int i = 0; i < depth; i++) {
                sb.append(output[i]).append(' ');
            }
            sb.append('\n');
            return;
        }
        int prev = -1; // 중복된 숫자를 제거하기 위한 변수
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i] && (prev != arr[i])) {
                visited[i] = true;
                output[idx] = arr[i];
                prev = arr[i];
                dfs(idx + 1, depth, arr, visited, output);
                visited[i] = false;
            }
        }
    }
}

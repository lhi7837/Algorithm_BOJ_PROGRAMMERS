import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<String, String> map = new HashMap<>();
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        N = Integer.parseInt(input.split(" ")[0]);
        M = Integer.parseInt(input.split(" ")[1]);
        for(int i = 0; i < N; i++) {
            input = br.readLine();
            String[] arr = input.split(" ");
            map.put(arr[0], arr[1]);
        }
        for(int i = 0; i < M; i++) {
            input = br.readLine();
            sb.append(map.get(input)).append('\n');
        }
        System.out.println(sb.toString());
    }
}
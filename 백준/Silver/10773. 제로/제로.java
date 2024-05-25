import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[K];
        for(int i = 0 ; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Stack<Integer> stack = new Stack<>();
        for(int i : arr) {
            if(i != 0) {
                stack.push(i);
            }
            else {
                stack.pop();
            }
        }
        int sum = 0;
        for(int i : stack) {
            sum+=i;
        }
        System.out.println(sum);
    }
}

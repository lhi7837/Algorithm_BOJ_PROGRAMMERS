import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int answer = 1;
        int cnt = 0;
        while(true) {
            if(cnt >= 3) break;
            cnt = 0;
            for(int i : arr) {
                if (answer % i == 0) cnt++;
            }
            answer++;
        }
        System.out.println(answer-1);
    }

}

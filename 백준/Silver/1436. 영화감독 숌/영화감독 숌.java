import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int number = 666;
        int cnt = 0;
        String str = "";
        while(cnt != N) {
            str = String.valueOf(number);
            if(str.contains("666")) cnt++;
            number++;
        }
        System.out.println(number-1);
    }
    
}

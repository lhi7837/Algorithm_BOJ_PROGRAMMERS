import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int n = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            n = 0;
            sb.append(isPalindrome(br.readLine())).append(' ').append(n).append('\n');
        }
        System.out.println(sb.toString());
    }

    static int recursion(String s, int l, int r) {
        n++;
        if (l >= r) return 1;
        else if (!(s.charAt(l) == s.charAt(r))) return 0;
        else return recursion(s, l + 1, r - 1);
    }

    static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }
}

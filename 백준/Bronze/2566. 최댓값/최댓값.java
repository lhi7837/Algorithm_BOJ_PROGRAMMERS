import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = 9;
		int row = 0;
		int col = 0;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				int number = Integer.parseInt(st.nextToken());
				if (number > max) {
					max = number;
					row = i;
					col = j;
				}
			}
		}
		System.out.println(max);
		System.out.println((row + 1) + " " + (col + 1));
	}

}

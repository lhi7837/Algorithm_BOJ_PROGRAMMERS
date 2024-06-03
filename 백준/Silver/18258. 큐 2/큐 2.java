import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> que = new ArrayDeque<>();
		while (N-- > 0) {
			String input = br.readLine();
			
			if (input.contains("push")) {
				int push = Integer.parseInt(input.substring(5));
				que.offerFirst(push);
			} else {
				if ("pop".equals(input)) {
					if (que.isEmpty()) {
						sb.append("-1").append('\n');
					} else
						sb.append(que.pollLast()).append('\n');
				}
				if ("size".equals(input)) {
					sb.append(que.size()).append('\n');
				}
				if ("empty".equals(input)) {
					if (que.isEmpty()) {
						sb.append("1").append('\n');
					} else {
						sb.append("0").append('\n');
					}
				}
				if ("front".equals(input)) {
					if (que.isEmpty()) {
						sb.append("-1").append('\n');
					} else {
						sb.append(que.peekLast()).append('\n');
					}
				}
				if ("back".equals(input)) {
					if (que.isEmpty()) {
						sb.append("-1").append('\n');
					} else {
						sb.append(que.peekFirst()).append('\n');
					}
				}
			}
		}
		System.out.println(sb.toString());
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String input;
		for(int i = 0; i < N; i++) {
			input = br.readLine();
			if(input.charAt(0) == '1') {
				stack.push(Integer.parseInt(input.substring(2)));
			}
			else if(input.charAt(0) == '2') {
				if(!stack.isEmpty()) {
					sb.append(stack.pop()).append("\n");
				}
				else{
					sb.append("-1").append("\n");
				}
			}
			else if(input.charAt(0) == '3') {
				sb.append(stack.size()).append("\n");
			}
			else if(input.charAt(0) == '4') {
				if(stack.isEmpty()) {
					sb.append("1").append("\n");
				}
				else {
					sb.append("0").append("\n");
				}
			}
			else if(input.charAt(0) == '5') {
				if(stack.isEmpty()) {
					sb.append("-1").append("\n");
				}
				else {
					sb.append(stack.peek()).append("\n");
				}
			}
		}
		System.out.println(sb.toString());
		
	}

}

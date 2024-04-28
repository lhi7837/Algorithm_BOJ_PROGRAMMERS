import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toUpperCase();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        char result = ' ';
        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                result = key;
            }
        }
        for (char key : map.keySet()) {
            if (map.get(key) == max && key != result) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}

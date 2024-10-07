import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args)  throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        Map<Integer, List<Integer>> map = new TreeMap<>();
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int key = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            if(map.containsKey(key)){
                map.get(key).add(value);
            }
            else {
                List<Integer> list = new ArrayList<>();
                list.add(value);
                map.put(key, list);
            }
//            System.out.println("s : "+ Arrays.toString(arr[i]));
        }
        for(int key : map.keySet()){
            List<Integer> list = map.get(key);
            Collections.sort(list);
            for(int i : list) {
                sb.append(key).append(" ").append(i).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}

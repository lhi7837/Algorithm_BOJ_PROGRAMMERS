import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        selection_sort(arr);
        for(int i : arr) {
            sb.append(i).append('\n');
        }
        System.out.print(sb.toString());

    }
    public static void selection_sort(int[] arr) {
        int size = arr.length;
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(arr[i] < arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
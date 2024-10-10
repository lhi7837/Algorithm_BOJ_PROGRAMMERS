import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0; // Current time
        int bridge_sum = 0; // Total weight on the bridge
        Queue<Integer> trucks = new LinkedList<>();
        for(int tw : truck_weights) {
            trucks.offer(tw); // Add all trucks to the queue
        }
        Queue<int[]> bridge = new LinkedList<>(); // Each element is [truck_weight, exit_time]
        
        while(!trucks.isEmpty() || !bridge.isEmpty()) {
            time++;
            // Remove trucks that have finished crossing the bridge
            if(!bridge.isEmpty() && bridge.peek()[1] == time) {
                bridge_sum -= bridge.poll()[0];
            }
            // Add next truck to the bridge if possible
            if(!trucks.isEmpty() && bridge_sum + trucks.peek() <= weight && bridge.size() < bridge_length) {
                int truck = trucks.poll();
                bridge_sum += truck;
                bridge.offer(new int[] {truck, time + bridge_length});
            }
        }
        return time;
    }
}
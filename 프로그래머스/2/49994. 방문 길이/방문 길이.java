import java.util.*;
class Solution {
    public String toStr(int[] org, int[] arr) {
        int x1 = Math.min(org[0], arr[0]);
        int x2 = Math.max(org[0], arr[0]);
        int y1 = Math.min(org[1], arr[1]);
        int y2 = Math.max(org[1], arr[1]);
        String answer = String.valueOf(x1) + "," + String.valueOf(x2) + "/" + String.valueOf(y1) + "," + String.valueOf(y2);
        return answer;
    }
    public int solution(String dirs) {
        int answer = 0;
        //list에 지나갔던 좌표 모두 저장하기
        Set<String> list = new HashSet<>();
        //명령어를 받을때마다 list에 존재하는 지 확인하고 없으면 answer++
        int[] pos = new int[2];
        // L, R, U, D 순서
        int[][] order = {{-1,0},{1,0},{0,1},{0,-1}};
        for(char c : dirs.toCharArray()) {
            int[] temp = {pos[0], pos[1]};
            if(c == 'L' && (pos[0] > -5)) {
                pos[0] += order[0][0];
                pos[1] += order[0][1];
            }
            else if(c == 'R' && (pos[0] < 5)) {
                pos[0] += order[1][0];
                pos[1] += order[1][1];
            }
            else if(c == 'U' && (pos[1] < 5)) {
                pos[0] += order[2][0];
                pos[1] += order[2][1];
            }
            else if(c == 'D' && (pos[1] > -5)) {
                pos[0] += order[3][0];
                pos[1] += order[3][1];
            }
            // System.out.println(temp[0]+","+temp[1]);
            // System.out.println(pos[0]+","+pos[1]);
            if(!(temp[0] == pos[0] && temp[1] == pos[1]))
                list.add(toStr(temp, pos));
            // System.out.println(list.toString());
        }
        answer = list.size();
        return answer;
    }


}
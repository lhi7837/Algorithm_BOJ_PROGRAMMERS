class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int ice_americano = 0;
        for(int i = 5500; money - i >= 0; i += 5500) {
            ice_americano++; 
        }
        answer[0] = ice_americano;
        answer[1] = money - ice_americano * 5500;
        return answer;
    }
}
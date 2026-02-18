import java.util.*;

class Date {
    Integer year;
    Integer month;
    Integer day;
    Date() {
        this.year = 0;
        this.month = 0;
        this.day = 0;
    }
    Date(String date) {
        String[] split = date.split("\\.");
        this.year = Integer.parseInt(split[0]);
        this.month = Integer.parseInt(split[1]);
        this.day = Integer.parseInt(split[2]);
        // System.out.println(year + "-" + month + "-" + day);
    }
    
    int dateDiff(Date date) {
        int result = 0; 
        result += (this.year - date.year) * 12 * 28;
        result += (this.month - date.month) * 28;
        result += (this.day - date.day);
        // System.out.println(result);
        return result;
    }
}
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Date todayDate = new Date(today);
        Map<String, Integer> termMap = new HashMap<>();
        for(int i = 0; i < terms.length; i++) {
            String[] split = terms[i].split(" ");
            termMap.put(split[0], Integer.parseInt(split[1]) * 28);
        }
        List<Integer> resultList = new ArrayList<>();
        for(int i = 0; i < privacies.length; i++) {
            String[] split = privacies[i].split(" ");
            Date diffDate = new Date(split[0]);
            if(termMap.get(split[1]) <= todayDate.dateDiff(diffDate)) {
                //유효기간 < 오늘부터 날짜 차이이면
                resultList.add(i + 1);
            }
        }
        int[] answer = new int[resultList.size()];
        for(int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        return answer;
    }
}
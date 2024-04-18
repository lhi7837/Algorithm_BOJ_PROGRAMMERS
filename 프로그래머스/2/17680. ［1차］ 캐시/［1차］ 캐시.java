import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> cache = new ArrayList<>();
        if(cacheSize == 0) return cities.length * 5;
        for(String s : cities) {
            String city = s.toLowerCase();
            if(!cache.contains(city)) {
                if(cache.size() > 0 && cache.size() >= cacheSize) cache.remove(0);
                cache.add(city);
                answer += 5;
            }
            else {
                if(cache.size() > 0) cache.remove(city);
                cache.add(city);
                answer += 1;
            }
            // for(String ss : cache) {
            //     System.out.print(ss + ", ");
            // }
            // System.out.println("--- 입력: " + s);
        }
        
        return answer;
    }
}
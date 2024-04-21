import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.equals(str2)) return 65536;
        answer = J(str1, str2);
        return answer;
    }
    
    public int J(String str1, String str2) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> union = new ArrayList<>();
        List<String> inter = new ArrayList<>();
        for(int i = 0; i < str1.length() - 1; i++) {
            String sub = str1.substring(i, i+2);
            if(sub.matches("^[a-z]+$")){
                list1.add(sub);
            }
        }
        for(int i = 0; i < str2.length() - 1; i++) {
            String sub = str2.substring(i, i+2);
            if(sub.matches("^[a-z]+$")){
                list2.add(sub);
            }
        }
        if(list1.isEmpty() && list2.isEmpty()) return 65536;
        for(String s : list1) {
            if(list2.remove(s)) {
                inter.add(s);
            }
            union.add(s);
        }
        for(String s : list2) {
            union.add(s);
        }
        // for(String s : union) {
        //     System.out.print(s + " ");
        // }
        // System.out.println();
        // for(String s : inter) {
        //     System.out.print(s + " ");
        // }
        return (int)(((double)inter.size()/union.size()) * 65536);
    }
}
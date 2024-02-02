import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> todo = new ArrayList<>();
        for(int i = 0; i < todo_list.length; i++) {
            if(!finished[i]) todo.add(todo_list[i]);
        }
        
        return todo.toArray(new String[0]);
    }
}
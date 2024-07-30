import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class FileInfo implements Comparable<FileInfo> {
    String filename;
    String head;
    Integer num;
    String tail;

    FileInfo(String filename) {
        this.filename = filename;
        boolean isHead = true;
        boolean isNum = false;
        int num_end = 0;
        int num_start = 0;
        int idx = 0;
        //filename을 돌면서, head/num/tail로 나눔
        for (char c : filename.toCharArray()) {
            if (isNum && idx - num_start >= 5) {
                isNum = false;
                num_end = idx;
            }
            if (isNum && (c < '0' || c > '9')) {
                isNum = false;
                num_end = idx;
            }
            if (isHead && (c >= '0' && c <= '9')) {
                isHead = false;
                isNum = true;
                num_start = idx;
            }
            if (!isNum && !isHead) {
                break;
            }
            idx++;
        }
        if(num_end == 0) num_end = filename.length();
        this.head = filename.substring(0, num_start);
        this.num = Integer.parseInt(filename.substring(num_start, num_end));
        this.tail = filename.substring(num_end);
    }

    @Override
    public int compareTo(FileInfo o) {
        if (this.head.equalsIgnoreCase(o.head)) {
            return this.num - o.num;
        }
        return this.head.compareToIgnoreCase(o.head);
    }
}


class Solution {

    public static String[] solution(String[] files) {
        String[] answer = new String[files.length];
        List<FileInfo> fileInfos = new ArrayList<>();
        for (int i = 0; i < files.length; i++) {
            FileInfo temp = new FileInfo(files[i]);
            fileInfos.add(temp);
        }
        Collections.sort(fileInfos);
        int index = 0;
        for (FileInfo f : fileInfos) {
            answer[index++] = f.filename;
        }
        return answer;
    }
}

import java.util.*;

class Music {
    String genre;
    int play;
    int id;
    Music(String genre, int play, int id) {
        this.genre = genre;
        this.play = play;
        this.id = id;
    }
}

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> map = new TreeMap<>();
        List<Music> songList = new ArrayList<>();

        for(int i = 0; i < genres.length; i++) {
            songList.add(new Music(genres[i], plays[i], i));
            map.put(genres[i], 0);
        }
        for(Music song : songList) {
            map.put(song.genre, map.get(song.genre) + song.play);
        }
        List<String> genreList = new ArrayList<>(map.keySet());
        Collections.sort(songList, (o1, o2) -> {return o2.play - o1.play;});
        Collections.sort(genreList, (o1, o2) -> {return map.get(o2).compareTo(map.get(o1));});
        // System.out.println(songList.toString());
        // System.out.println(genreList.toString());
        List<Integer> result = new ArrayList<>();
        for(String key : genreList) {
            int cnt = 0;
            for(Music song : songList) {
                if(cnt == 2) break;
                if(key.equals(song.genre)) {
                    result.add(song.id);
                    cnt++;
                }
            }
        }
        int[] answer = new int[result.size()];
        int idx = 0;
        for(int i : result) {
            answer[idx++] = i;
        }
        return answer;
    }
}
import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        ArrayList<Integer> playList = new ArrayList<>();
        
        Map<String,Integer> playSums = new HashMap<>();
        
        for(int i=0; i<plays.length; i++){
            if(playSums.get(genres[i]) == null){
                playSums.put(genres[i], plays[i]);
            }else{
                playSums.put(genres[i],  playSums.get(genres[i]) + plays[i]);
            }
        }
        
        List<String> keys = new ArrayList<>(playSums.keySet());
        Collections.sort(keys,(v1,v2)->(playSums.get(v2).compareTo(playSums.get(v1))));
        
        for(String key : keys){
            
            // System.out.println("key = "+key);
            Map<Integer,Integer> playsIndexs = new HashMap<>();
            
            for(int i=0; i<plays.length; i++){
                // System.out.println("i = "+i);
                if(key.equals(genres[i])){
                    // System.out.println("plays = "+plays[i]);
                    playsIndexs.put(i,plays[i]);
                }
            }
            
            ArrayList<Integer> playsIndexsKeys = new ArrayList<>(playsIndexs.keySet());
            Collections.sort(playsIndexsKeys,(v1,v2)->(playsIndexs.get(v2) - playsIndexs.get(v1)));
            int j=0;
            for(Integer playsIndexsKey : playsIndexsKeys){
                if(j==2){
                    break;
                }
                playList.add(playsIndexsKey);
                j++;
            }
            
        }
        
        answer = new int[playList.size()];
        for(int i=0; i<playList.size(); i++){
            answer[i] = playList.get(i);
        }
        
        return answer;
    }
}

// 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시
// 속한 노래가 많이 재생된 장르를 먼저 수록
// 장르 내에서 많이 재생된 노래를 먼저 수록
//  장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록
// genres = 노래의 장르
// plays = 노래별 재생 횟수
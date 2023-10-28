import java.util.*;
class Solution {
    public int solution(int[] nums) {
        
        int answer = 0;
        int half = (int) nums.length/2;
        
        HashMap<Integer, Integer> poketMons = new HashMap<>();
        
        for(int num : nums){
            if(poketMons.get(num) == null){
                poketMons.put(num,1);    
            }
        }
        
        
        if(poketMons.size() > half){
            answer = half;
        }else{
            answer = poketMons.size();
        }
        
                                     
        return answer;
    }
}

// N/2 마리를 가져가도 좋다
// 가장 많은 종류의 포켓몬 선택하기
// 중복 제거 후 사이즈 구하기

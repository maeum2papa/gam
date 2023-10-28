import java.util.*;
class Solution {
    public int solution(int[] nums) {
        
        int answer = 0;
        int half = (int) nums.length/2;
        
        HashSet<Integer> poketMons = new HashSet<>();
        
        for(int num : nums){
            poketMons.add(num);    
        }
        
        return answer = (poketMons.size() > half)?half:poketMons.size();
    }
}

// N/2 마리를 가져가도 좋다
// 가장 많은 종류의 포켓몬 선택하기
// 중복 제거 후 사이즈 구하기

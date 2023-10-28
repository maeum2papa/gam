import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        // System.out.println("Hello Java");
        int i = 0;
        int remember = -1;
        for(int num : arr){
            if(i==0){
                remember = num;
                nums.add(num);
            }else{
                // index: 1, remember: 1, num: 1
                if(remember!=num){
                    remember = num;
                    nums.add(num);
                }
            }
            i++;
        }
        
        // System.out.println(nums.toString());
        
        answer = new int[nums.size()];
        i=0;
        for(Integer num : nums){
            answer[i] = num;
            i++;
        }
        
        return answer;
    }
}

// 2023-10-28 12:22:10
// 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거
// 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지

import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        // commands
        int i = 0;
        for(int[] command : commands){
            
            //배열 카피
            int[] newArray = Arrays.copyOfRange(array, command[0]-1, command[1]);
            
            // 정렬
            Arrays.sort(newArray);
            
            answer[i] = newArray[command[2]-1];
            
        
            i++;
            
        }
            
        
        
        
        return answer;
    }
}
/*
2023-10-29 10:54:19

- i번째 숫자부터 j번째 숫자까지 자르고 
- 정렬

[1, 5, 2, 6, 3, 7, 4]
[5, 2, 6, 3]

*/
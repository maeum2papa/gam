function solution(arr, n) {
    var answer = [];
    var flag = 0; // 0:짝, 1:홀
    
    flag = (arr.length%2==0)?0:1;
    
    arr.map((v,i)=>{
        
        if(flag==0){
            if(i%2!=0){
                arr[i] = arr[i]+n;
            }
        }else{
            if(i%2==0){
                arr[i] = arr[i]+n;
            }    
        }
        
    });
    
    answer = arr;
    
    return answer;
}
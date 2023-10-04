function solution(a, b) {
    var answer = 0;
    var flags = [0,0];
    
    if((a%2)!=0) flags[0] = 1;
    if((b%2)!=0) flags[1] = 1;
    
    if(flags[0] == 1 && flags[1] == 1){
        answer = a*a+b*b;
    }else if(flags[0] == 1 || flags[1] == 1){
        answer = 2*(a+b);
    }else{
        answer = Math.abs(a-b);
    }
    
    return answer;
}
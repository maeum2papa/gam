function solution(my_string, is_suffix) {
    var answer = 0;
    
    for(let i=my_string.length; i>0; i--){
        if(is_suffix === my_string.substr(i*(-1))){
            answer = 1;
            break;
        }
    }
    
    return answer;
}
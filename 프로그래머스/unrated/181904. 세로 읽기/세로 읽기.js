function solution(my_string, m, c) {
    var answer = '';
    var j = 0;
    var matrix = [];
    var element = [];
    
    my_string = my_string.split("");
    
    for(let i=0; i<my_string.length; i++){
        
        element.push(my_string[i]);
        
        if(j==(m-1)){
            matrix.push(element);
            j = 0;
            element = [];
        }else{
            j++;
        }
    }
    
    for(const e of matrix){
        answer += e[c-1];
    }
    
    return answer;
}
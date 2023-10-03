function solution(my_string) {
    var answer = [];
    var alphabet = [];
    
    for(let i=0; i<26; i++){
        alphabet.push(String.fromCharCode(65+i));
    }
    
    for(let i=0; i<26; i++){
        alphabet.push(String.fromCharCode(97+i));
    }
    
    my_string = my_string.split("");
    
    for(let j=0; j<my_string.length; j++){
        
        for(let i=0; i<alphabet.length; i++){
            
            if(!answer[i]) answer[i] = 0;
            
            if(my_string[j] === alphabet[i]){
                answer[i] += 1;
            }
        }
        
    }
    
    
    return answer;
}
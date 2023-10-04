function solution(myString, pat) {
    var answer = 0;
    
    myString = myString.toLowerCase();
    pat = pat.toLowerCase();
    
    answer = (myString.indexOf(pat) === -1)?0:1;
    
    return answer;
}
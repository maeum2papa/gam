function solution(my_string, s, e) {
    var answer = '';
    var a =[];
    
    a.push(my_string.substring(0,s));
    a.push(my_string.substring(s,e+1).split("").reverse().join(""));
    a.push(my_string.substring(e+1));
    
    answer = a.join("");
    
    return answer;
}
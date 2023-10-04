function solution(q, r, code) {
    var answer = '';
    code.split("").map((v,i)=>{ answer += (i%q == r)?v:"";});
    return answer;
}
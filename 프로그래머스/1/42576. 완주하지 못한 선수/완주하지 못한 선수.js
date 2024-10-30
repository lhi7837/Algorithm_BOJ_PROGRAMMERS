function solution(participant, completion) {
    var answer = '';
    var hash = {};
    participant.forEach(e => {
        hash[e] = hash[e] ? hash[e] + 1 : 1;
    })
    completion.forEach(e => { 
        hash[e]--;
    })
    // console.log(hash);
    for(let name in hash) {
        if(hash[name] > 0) return name;
    }
    return answer.toString();
}
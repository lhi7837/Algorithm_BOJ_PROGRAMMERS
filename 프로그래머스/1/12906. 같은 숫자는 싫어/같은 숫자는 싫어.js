function solution(arr)
{
    var answer = [arr[0]];
    var temp = arr[0];
    arr.forEach((e) => {
        if(temp != e) {
            answer.push(e);
            temp = e;
        }
        
    })
    return answer;
}
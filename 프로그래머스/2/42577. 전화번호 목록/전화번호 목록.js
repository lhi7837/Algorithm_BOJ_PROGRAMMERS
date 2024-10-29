function solution(phone_book) {
    var answer = true;
    phone_book.sort();
    for(var i = 0; i < phone_book.length; i++) {
        if(phone_book[i+1] != undefined && phone_book[i+1].startsWith(phone_book[i])) return false;
    }
    return answer;
}
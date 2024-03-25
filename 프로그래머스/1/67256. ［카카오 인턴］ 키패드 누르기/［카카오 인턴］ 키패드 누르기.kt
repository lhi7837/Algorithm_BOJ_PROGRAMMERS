import kotlin.math.*

class Position(x: Int, y: Int) {
    var x: Int = x
    var y: Int = y
    
    fun toGoal(left: Position, right: Position, hand: String): String {
        var x: Int = x
        var y: Int = y
        
        if (x == 0) {
            left.x = x
            left.y = y
            return "L"
        }
        else if ( x == 2) {
            right.x = x
            right.y = y
            return "R"
        }
        else {
            if (minMove(left, right, x, y) == 1) {
                left.x = x
                left.y = y
                return "L"
            }
            else if (minMove(left, right, x, y) == 2) {
                right.x = x
                right.y = y
                return "R"
            }
            else if (minMove(left, right, x, y) == 0) {
                if (hand == "left") {
                    left.x = x
                    left.y = y
                    return "L"
                }
                else if (hand == "right") {
                    right.x = x
                    right.y = y
                    return "R"
                }
            }
        }
        return "X"
    }
    fun minMove(left: Position, right: Position, x: Int, y: Int): Int {
        var result: Int = 0
        var temp_l: Int = abs(x - left.x) + abs(y - left.y)
        var temp_r: Int = abs(x - right.x) + abs(y - right.y) 
        
        if (temp_l < temp_r)
            result = 1
        else if (temp_l > temp_r)
            result = 2
        return result
    }
}

class Solution {
    fun solution(numbers: IntArray, hand: String): String {
        var answer = ""
        var left = Position(0, 0)
        var right = Position(2, 0)
        
        for (i in numbers.indices) {
            if(numbers[i] == 0) {
                var goal = Position(1, 0)
                answer += goal.toGoal(left, right, hand)
            }
            else if(numbers[i] == 1) {
                var goal = Position(0, 3)
                answer += goal.toGoal(left, right, hand)
            }
            else if(numbers[i] == 2) {
                var goal = Position(1, 3)
                answer += goal.toGoal(left, right, hand)
            }
            else if(numbers[i] == 3) {
                var goal = Position(2, 3)
                answer += goal.toGoal(left, right, hand)
            }
            else if(numbers[i] == 4) {
                var goal = Position(0, 2)
                answer += goal.toGoal(left, right, hand)
            }
            else if(numbers[i] == 5) {
                var goal = Position(1, 2)
                answer += goal.toGoal(left, right, hand)
            }
            else if(numbers[i] == 6) {
                var goal = Position(2, 2)
                answer += goal.toGoal(left, right, hand)
            }
            else if(numbers[i] == 7) {
                var goal = Position(0, 1)
                answer += goal.toGoal(left, right, hand)
            }
            else if(numbers[i] == 8) {
                var goal = Position(1, 1)
                answer += goal.toGoal(left, right, hand)
            }
            else if(numbers[i] == 9) {
                var goal = Position(2, 1)
                answer += goal.toGoal(left, right, hand)
            }
        }
        return answer
    }
}
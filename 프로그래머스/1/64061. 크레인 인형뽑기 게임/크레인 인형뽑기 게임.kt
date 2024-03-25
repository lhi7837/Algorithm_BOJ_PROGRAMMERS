import java.util.Stack

class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
        var basket = Stack<Int>()
        for (j in moves.indices) {
            val k = moves[j] - 1
            for (i in board.indices) {
                if (board[i][k] != 0) {
                    basket.push(board[i][k])
                    board[i][k] = 0
                    break
                } else if (i == board.size && board[i][k] == 0)
                    break
            }
            if (basket.size > 1) {
                if (basket[basket.size - 2] == basket[basket.size - 1]) {
                    basket.pop()
                    basket.pop()
                    answer += 2
                }
            }

        }

        return answer
    }

}
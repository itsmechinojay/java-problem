package `Codility Demo`

import java.util.*


class Solution {

    fun solution(A: IntArray): Int {
        Arrays.sort(A)
        var min = 1
        val cap = A.size
        for (i in 0 until cap) {
            if (A[i] == min) {
                min++
            } else if (A[i] > min) {
                return min
            }
        }
        return min
    }
}
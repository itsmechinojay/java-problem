package udemyclass;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args){
        int[] A = {1,2,4,6,7,3,2,5,7,8,3,1,1,2,3,10,9,11,12,13,16,25,14,17,18,19};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8

        Arrays.sort(A);
        int min = 1;
        int cap = A.length;

        for (int i = 0; i < cap; i++){
            if(A[i] == min){
                min++;
            } else if(A[i] > min){
                return min;
            }

        }
        return min;
    }

}

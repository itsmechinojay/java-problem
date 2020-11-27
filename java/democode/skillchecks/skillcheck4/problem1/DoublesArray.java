package com.accenture.democode.skillchecks.skillcheck4.problem1;

public class DoublesArray {

    public static void main(String[] args) {
        double[] numbers = { 1.2, 1.3, 100.2, 300};

        System.out.println("sum: " + computeSum(numbers));
        System.out.println("ave: " + computeAve(numbers));
        System.out.println("max: " + getHighestValue(numbers));
    }

    public static double computeSum(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static double computeAve(double[] numbers) {
        return computeSum(numbers) / numbers.length;
    }

    public static double getHighestValue(double[] numbers) {
        double highestNum = Integer.MIN_VALUE;
        for (double number : numbers) {
            if (number > highestNum) {
                highestNum = number;
            }
        }
        return highestNum;
    }
}

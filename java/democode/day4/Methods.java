package com.accenture.democode.day4;

public class Methods {

    public static void main(String[] args) {

        double sum = add(2, 5);
        System.out.println("sum: " + sum);

        Methods methods = new Methods();
        double diff = methods.subtract(4, 2);
        System.out.println("diff: " + diff);

        int factorial = fact(5);
        System.out.println("5!: " + factorial);
    }

    /*
    Syntax:
    [access-modifier][static?][dataype][method-name]([datatype variableName, ...]) {
        // body of code
    }
     */

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double add(int num1, int num2) {
        return num1 + num2;
    }

    // Method Overloading
    // we create methods with same name as long number of parameters and datatypes are different
    public static double add(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // n! = n(n-1)(n-2)
    public static int fact(int num) {
        // base condition
        if (num == 1 || num == 0) {
            return 1;
        }
        return num * fact(num-1);
    }

    /*
     JVM two types of logical memory
     1) Stack Memory
        - Method/variables declaration
     2) Heap Memory
        - Objects
     */

}

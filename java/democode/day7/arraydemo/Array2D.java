package com.accenture.democode.day7.arraydemo;

public class Array2D {

    public static void main(String[] args) {

//        char[][] ticTacToe = new char[3][3];
        char[][] ticTacToe = {
                { 'x', 'o', 'x' },
                { 'o', 'x', 'x', 'x' },
                { 'x', 'x' }
        };

        for(int row=0; row < ticTacToe.length; row++) {
            for(int col=0; col < ticTacToe[row].length; col++) {
                System.out.print(ticTacToe[row][col] + " ");
            }
            System.out.println();
        }
    }
}

package com.company;



class MatrixCalculation{

    static void displayMatrix(short matrix [][]){
        for (int i = 0; i < (matrix.length); i++) {
            for (int j = 0; j < (matrix[j].length); j++) {
                System.out.print(String.format("%20s", matrix[i][j]));
            }
            System.out.println("");
        }
    }

    static void multiplyMatrix(short[][] matrix, short a) {
        for (int i = 0; i <= (matrix.length - 1); i++) {
            for (int j = 0; j <= (matrix[j].length - 1); j++) {
                matrix[i][j] *= a;
            }
        }
        MatrixCalculation.displayMatrix(matrix);
    }

    static void maxRowElem(short[][] matrix){
        short maxEl;
        short SumMax=0;
        for (int i = 0; i <= (matrix.length - 1); i++) {
            maxEl = matrix[i][0];
            for (int j = 0; j <= (matrix[j].length - 1); j++) {
                if (maxEl < matrix[i][j]) {
                    maxEl = matrix[i][j];
                }
            }
            SumMax += maxEl;
        }
    System.out.println("Sum of Maximum elements in row: "+SumMax);
    }
}

public class Main{
    public static void main(String[] args) {
        System.out.println("Matrix before changes:");
        MatrixCalculation.displayMatrix(new short[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        });
        System.out.println("Matrix after multypling by constant");
        MatrixCalculation.multiplyMatrix(new short[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
                }, (short) 5);
        System.out.println("");
        MatrixCalculation.maxRowElem(new short[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        });
    }

}




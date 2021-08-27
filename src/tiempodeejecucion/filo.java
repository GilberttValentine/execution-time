/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiempodeejecucion;

import java.util.Scanner;

/**
 *
 * @author Felipe Corredor Castro
 */
public class filo {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        
        boolean correctDimension = false;
        int rows, columns;
        
        do {
            System.out.print("Write number of rows: ");
            rows = scanner.nextInt();
            
            System.out.print("Write number of columns: ");
            columns = scanner.nextInt();

            if ((rows % 2 != 0 && columns % 2 != 0) && columns > rows) {
                correctDimension = true;
            } else {
                System.out.println("You must write an not even number for rows and columns");
            }
        } while (!correctDimension);

        char[][] matrix = goFillSomeMatrix(rows, columns);
        printInverseMatrix(matrix);
    }

    public static char[][] goFillSomeMatrix(int rows, int columns) {
        char matrix[][] = new char[rows][columns];
        int middle = matrix[0].length / 2;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0) {
                    matrix[i][j] = '1';
                } else {
                    if ((i + j) > middle && (j - i) < middle) {
                        matrix[i][j] = ' ';
                    } else {
                        matrix[i][j] = '1';
                    }
                }

            }
        }

        return matrix;
    }

    public static void printInverseMatrix(char matrix[][]) {
        char inverseArray[][] = new char[matrix.length][matrix[0].length];

        for (int i = matrix.length - 1, x = 0; i >= 0; i--, x++) {
            for (int j = matrix[0].length - 1, y = 0; j >= 0; j--, y++) {
                inverseArray[x][y] = matrix[i][j];
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

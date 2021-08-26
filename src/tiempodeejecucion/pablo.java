/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiempodeejecucion;

import java.util.ArrayList;

/**
 *
 * @author Pablo Andres Guzman Rios
 */
public class pablo {

    public static void main(String[] args) {
        final int[][] questionThreeOne = fillMatrix(5, 9);
        System.out.println(printMatrix(questionThreeOne));

        final int[][] questionThreeTwo = {{4, 8}, {12, 4}};
        System.out.println(printMatrix(perfectSquares(questionThreeTwo)));

        final String[][] questionThreeThree = {{"Cama", "Acma"}, {"Oso", "Roso"}, {"Tela", "Late"}};
        System.out.println(checkOcurrences(questionThreeThree) + "\n");

        final int[][] questionThreeFour = fillMatrixWithRhombus(9, 7);
        System.out.println(printMatrix(questionThreeFour));
    }

    static int[][] fillMatrix(final int rows, final int columns) {
        final int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0, k = columns - 1; j < columns && j <= i; j++, k--) {
                matrix[i][j] = 1;
                matrix[i][k] = 1;
            }
        }

        return matrix;
    }

    // 100% Manute
    static int[][] perfectSquares(final int[][] matrix) {
        for (final int[] matrixObjects : matrix) {
            for (int i = 0; i < matrixObjects.length; i++) {
                boolean aux = true;

                for (int j = 1; aux; j++) {
                    if (Math.sqrt(matrixObjects[i] * j) % 1 == 0) {
                        matrixObjects[i] = j;
                        aux = false;
                    }
                }
            }
        }

        return matrix;
    }

    static ArrayList<Integer> checkOcurrences(final String[][] matrix) {
        final ArrayList<Integer> ocurrences = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            final String firstWord = matrix[i][0];
            final String secondWord = matrix[i][1];

            if (firstWord.length() == secondWord.length()) {
                boolean isWordEqual = true, isLetterEqual = false;

                for (int j = 0; j < firstWord.length() && isWordEqual; j++) {
                    for (int k = 0; k < secondWord.length() && !isLetterEqual; k++) {
                        final String letterOne = firstWord.substring(j, j + 1);
                        final String letterTwo = secondWord.substring(k, k + 1);

                        if (letterOne.equalsIgnoreCase(letterTwo)) {
                            isLetterEqual = true;
                        }
                    }

                    if (isLetterEqual) {
                        isLetterEqual = false;
                    } else {
                        isWordEqual = false;
                    }
                }

                if (isWordEqual) {
                    ocurrences.add(i);
                }
            }
        }

        return ocurrences;
    }

    static int[][] fillMatrixWithRhombus(final int rows, final int columns) {
        final int[][] matrix = new int[rows][columns];

        for (int i = 0, j = rows - 1; i < rows; i++, j--) {
            matrix[i][0] = 1;
            matrix[i][columns - 1] = 1;
            for (int k = 0, l = columns - 1; i + k < (Math.round(columns / 2.0)); k++, l--) {
                matrix[i][k] = 1;
                matrix[i][l] = 1;
                matrix[j][l] = 1;
                matrix[j][k] = 1;
            }
        }

        return matrix;
    }

    /*
        for (int i = 0, l = rows - 1; i < rows; i++, l--) {
            for (int j = 0, k = columns - 1; (i + j <= (columns / 2)); j++, k--) {
                matrix[i][j] = 1;
                matrix[i][k] = 1;
                matrix[l][j] = 1;
                matrix[l][k] = 1;

            }
        }
     */
    // var prueba2 = (i <= (rows / 2) ? (j <= (columns - (i * 2)) / 2) : (j < ((i * 2) - rows) / 2));
    // var diagonalSuperiorIzquierda = i + j >= (rows / 2);
    // var diagonalSuperiorDerecha = i + (rows / 2) > j + 1;
    // var diagonalInferiorIzquierda = j + (columns / 2) > i - 2;
    // var diagonalInferiorDerecha = i + j < (columns / 2) + rows - 1;
    /*
        i + k <= (columns / 2) && (k <= rows / 2 ? (k <= (rows - (i * 2)) / 2) : i <= (columns / 2));
        && (k <= rows / 2 ? (k <= (rows - (i * 2)) / 2) : i + j <= (columns / 2))

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                var costadoIzquierdo = j > (rows / 2) - 0;
                var costadoDerecho = j < (columns / 2) - 2;
                if (costadoIzquierdo || costadoDerecho) {
                    matrix[i][j] = 1;
                }

            }
        }
     */
    static StringBuffer printMatrix(final int[][] matrix) {
        final StringBuffer toString = new StringBuffer();

        for (final int[] rowObjects : matrix) {
            for (final int columnObject : rowObjects) {
                toString.append(columnObject).append(" ");
            }

            toString.append("\n");
        }

        return toString;
    }
}

package tiempodeejecucion;

import java.util.Scanner;

public class MenuController {
    private final static Matrix matrixClass = new Matrix();

    /**
     * 
     * Set rows values for class Matrix function 'fillMatrix' Print the results
     */
    public static void problemThreeOne() {
        boolean correctDimension = false;

        do {
            try {
                final Scanner scanner = new Scanner(System.in);

                System.out.print("Ingresa un número de filas: ");
                final int rows = scanner.nextInt();

                if (rows % 2 != 0) {
                    System.out.print(matrixClass.toString(matrixClass.fillMatrix(rows)) + "\n");
                    correctDimension = true;
                } else {
                    System.out.println("\nPor favor ingrese números impares.\n");
                }
            } catch (Exception ex) {
                System.out.println("\nPor favor ingrese números impares.\n");
            }

        } while (!correctDimension);
    }

    /**
     * 
     * Set rows and columns values for class Matrix function 'perfectSquares' Print the results
     */
    public static void problemThreeTwo() {
        boolean correctDimension = false;

        do {
            try {
                final Scanner scanner = new Scanner(System.in);

                System.out.print("Ingresa un número de filas: ");
                final int rows = scanner.nextInt();

                System.out.print("Ingresa un número de columnas: ");
                final int columns = scanner.nextInt();

                if (rows < 0 || columns < 0) {
                    throw new Exception("\nPor favor solo ingresa números positivos.\n");
                }

                final int[][] matrix = new int[rows][columns];

                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        System.out.print("Número [" + i + "][" + j + "]: ");
                        matrix[i][j] = scanner.nextInt();
                    }
                }

                System.out.print(matrixClass.toString(matrixClass.perfectSquares(matrix)) + "\n");
                correctDimension = true;
            } catch (Exception ex) {
                System.out.println("\nPor favor solo ingresa números enteros positivos.\n");
            }

        } while (!correctDimension);
    }

    /**
     * 
     * Set rows values for class Matrix function 'checkOcurrences' Print the results
     */
    public static void problemThreeThree() {
        boolean correctDimension = false;

        do {
            try {
                final Scanner scanner = new Scanner(System.in);

                System.out.print("Ingresa un número de filas: ");
                final int rows = scanner.nextInt();

                if (rows < 0) {
                    throw new Exception("\nPor favor solo ingresa números positivos.\n");
                }

                final String[][] matrix = new String[rows][2];

                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print("Palabra [" + i + "][" + j + "]: ");
                        matrix[i][j] = scanner.next();
                    }
                }

                System.out.println("\n" + matrixClass.checkOcurrences(matrix) + "\n");
                correctDimension = true;
            } catch (Exception ex) {
                System.out.println("\nPor favor solo ingresa números enteros positivos.\n");
            }

        } while (!correctDimension);
    }

    /**
     * 
     * Set rows values for class Matrix function 'fillMatrixWithRhombus' Print the results
     */
    public static void problemThreeFour() {
        boolean correctDimension = false;

        do {
            try {
                final Scanner scanner = new Scanner(System.in);

                System.out.print("Ingresa un número de filas: ");
                final int rows = scanner.nextInt();

                System.out.print("Ingresa un número de columnas: ");
                final int columns = scanner.nextInt();

                if (rows < 0 || columns < 0) {
                    throw new Exception("\nPor favor solo ingresa números positivos.\n");
                }

                if (columns % 2 != 0) {
                    System.out.print(matrixClass.toString(matrixClass.fillMatrixWithRhombus(rows, columns)) + "\n");
                    correctDimension = true;
                } else {
                    System.out.println("\nLas columnas deben ser impares.\n");
                }
            } catch (Exception ex) {
                System.out.println("\nLas columnas deben ser impares.\n");
            }

        } while (!correctDimension);
    }
}

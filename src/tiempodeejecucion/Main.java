package tiempodeejecucion;

import java.util.Scanner;

/**
 *
 * @authors Felipe Corredor Castro Pablo Andrés Guzmán Ríos Juan Manuel
 * Villanueva Aristizabal
 *
 */
public final class Main {

    private final static Matrix matrixClass = new Matrix();

    public static void main(String[] args) {
        boolean correctAnswer = true;

        do {
            System.out.println("Menú\n"
                    + "\nPor favor ingresa el número del problema a evaluar:\n"
                    + "1. Problema 3.1\n"
                    + "2. Problema 3.2\n"
                    + "3. Problema 3.3\n"
                    + "4. Problema 3.4\n"
                    + "5. Salir");
            System.out.print("Entrada: ");

            try {
                final Scanner scanner = new Scanner(System.in);

                final int answer = scanner.nextInt();

                System.out.println("");
                switch (answer) {
                    case 1:
                        problemThreeOne();
                        break;
                    case 2:
                        problemThreeTwo();
                        break;
                    case 3:
                        problemThreeThree();
                        break;
                    case 4:
                        problemThreeFour();
                        break;
                    case 5:
                        System.exit(0);
                        correctAnswer = false;
                        break;
                    default:
                        System.out.println("\nEl valor ingresado no tiene un problema asignado. Por favor ingresa otro valor.\n");
                        break;
                }

            } catch (Exception ex) {
                System.out.println("\nEl valor ingresado no tiene un problema asignado. Por favor ingresa otro valor.\n");
            }
        } while (correctAnswer);
    }

    private static void problemThreeOne() {
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

    private static void problemThreeTwo() {
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

    private static void problemThreeThree() {
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

    private static void problemThreeFour() {
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

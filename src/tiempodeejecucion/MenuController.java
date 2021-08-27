package tiempodeejecucion;

import java.util.Scanner;

public class MenuController {
    
    private final static Matrix matrixClass = new Matrix();

    /**
     * 
     * Set rows values for class Matrix function 'fillMatrix' Print the results
     * 
     */
    public void problemThreeOne() {
        boolean correctDimension = false;

        do {
            try {
                final Scanner scanner = new Scanner(System.in);

                System.out.print("Type the rows' number: ");
                final int rows = scanner.nextInt();

                if (rows % 2 != 0) {
                    System.out.print(matrixClass.toString(matrixClass.fillMatrix(rows)) + "\n");
                    correctDimension = true;
                } else {
                    System.out.println("\nPlease, type odd numbers.\n");
                }
            } catch (Exception ex) {
                System.out.println("\nPlease, type only positive numbers greater than zero.\n");
            }

        } while (!correctDimension);
    }

    /**
     * 
     * Set rows and columns values for class Matrix function 'perfectSquares' Print the results
     * 
     */
    public void problemThreeTwo() {
        boolean correctDimension = false;

        do {
            try {
                final Scanner scanner = new Scanner(System.in);

                System.out.print("Type the rows' number: ");
                final int rows = scanner.nextInt();

                System.out.print("Type the columns' number: ");
                final int columns = scanner.nextInt();

                if (rows <= 0 || columns <= 0) {
                    throw new Exception("\nPlease, type only positive numbers greater than zero.\n");
                }

                final int[][] matrix = new int[rows][columns];

                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        System.out.print("Number [" + i + "][" + j + "]: ");
                        matrix[i][j] = scanner.nextInt();
                    }
                }

                System.out.print(matrixClass.toString(matrixClass.perfectSquares(matrix)) + "\n");
                correctDimension = true;
            } catch (Exception ex) {
                System.out.println("\nPlease, type only positive numbers greater than zero.\n");
            }

        } while (!correctDimension);
    }

    /**
     * 
     * Set rows values for class Matrix function 'checkOcurrences' Print the results
     * 
     */
    public void problemThreeThree() {
        boolean correctDimension = false;

        do {
            try {
                final Scanner scanner = new Scanner(System.in);

                System.out.print("Type the rows' number: ");
                final int rows = scanner.nextInt();

                if (rows <= 0) {
                    throw new Exception("\nPlease, type only positive numbers greater than zero.\n");
                }

                final String[][] matrix = new String[rows][2];

                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print("Word [" + i + "][" + j + "]: ");
                        matrix[i][j] = scanner.next();
                    }
                }

                System.out.println("\n" + matrixClass.checkOcurrences(matrix) + "\n");
                correctDimension = true;
            } catch (Exception ex) {
                System.out.println("\nPlease, type only positive numbers greater than zero.\n");
            }

        } while (!correctDimension);
    }

    /**
     * 
     * Set rows values for class Matrix function 'fillMatrixWithRhombus' Print the results
     * 
     */
    public void problemThreeFour() {
        boolean correctDimension = false;

        do {
            try {
                final Scanner scanner = new Scanner(System.in);

                System.out.print("Type the rows' number: ");
                final int rows = scanner.nextInt();

                System.out.print("Type the columns' number: ");
                final int columns = scanner.nextInt();

                if (rows <= 0 || columns <= 0) {
                    throw new Exception("\nPlease, type only positive numbers greater than zero.\n");
                }

                if (columns % 2 != 0) {
                    System.out.print(matrixClass.toString(matrixClass.fillMatrixWithRhombus(rows, columns)) + "\n");
                    correctDimension = true;
                } else {
                    System.out.println("\nThe columns number must be odd.\n");
                }
            } catch (Exception ex) {
                System.out.println("\nPlease, type only positive numbers greater than zero.\n");
            }

        } while (!correctDimension);
    }
}

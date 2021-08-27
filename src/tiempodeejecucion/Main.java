package tiempodeejecucion;

import java.util.Scanner;

/**
 *
 * @authors 
 * Felipe Corredor Castro 
 * Pablo Andrés Guzmán Ríos 
 * Juan Manuel Villanueva Aristizabal
 *
 */
public final class Main {

    /**
     *
     * It set the application menu controller
     *
     * @param args args the command line arguments
     *
     */
    public static void main(String[] args) {
        boolean correctAnswer = true;

        final MenuController menuController = new MenuController();

        do {
            System.out.println("Menu\n"
                    + "\nPlease enter the number of the problem that you want to evaluate:\n"
                    + "1. Problem 3.1\n"
                    + "2. Problem 3.2\n"
                    + "3. Problem 3.3\n"
                    + "4. Problem 3.4\n"
                    + "5. Exit");
            System.out.print("Entry: ");

            try {
                final Scanner scanner = new Scanner(System.in);

                final int answer = scanner.nextInt();

                System.out.println("");
                switch (answer) {
                    case 1:
                        menuController.problemThreeOne();
                        break;
                    case 2:
                        menuController.problemThreeTwo();
                        break;
                    case 3:
                        menuController.problemThreeThree();
                        break;
                    case 4:
                        menuController.problemThreeFour();
                        break;
                    case 5:
                        System.exit(0);
                        correctAnswer = false;
                        break;
                    default:
                        System.out.println("\nThe value typed is not assigned to a problem. Please type another value.\n");
                        break;
                }

            } catch (Exception ex) {
                System.out.println("\nThe value typed is not assigned to a problem. Please type another value.\n");
            }
        } while (correctAnswer);
    }
}

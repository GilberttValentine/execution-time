package tiempodeejecucion;
import java.util.Scanner;
/**
 *
 * @authors 
 * Felipe Corredor Castro Pablo 
 * Andrés Guzmán Ríos Juan Manuel
 * Villanueva Aristizabal
 *
 */
public final class Main {

/**
 *
 *It set the application menu controller
 */
    public static void main(String[] args) {
        boolean correctAnswer = true;
        MenuController menuController = new MenuController();

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
                        System.out.println("\nEl valor ingresado no tiene un problema asignado. Por favor ingresa otro valor.\n");
                        break;
                }

            } catch (Exception ex) {
                System.out.println("\nEl valor ingresado no tiene un problema asignado. Por favor ingresa otro valor.\n");
            }
        } while (correctAnswer);
    }
}

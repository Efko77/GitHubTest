package second;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pasirinkite figura kurios plota skaiciuosite:");
        System.out.println("Staciojo trikampio plotas");
        System.out.println("Staciakampio plotas");
        System.out.println("Kvadrato plotas");
        System.out.println("apskritimo plotas");

       /* int selection =scanner.nextInt();

        System.out.println("Jusu pasirinkimas " + selection);*/
    }

    private static int getCorrectNumb(Scanner scanner) {
        int result = 0;
        while (true) {
            try {
                result = scanner.nextInt();
                if (result <1 || result>4){
                    throw new InputMismatchException( "Blogas diapazonas");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Blogas formatas pakartoti");
                scanner.nextLine();
            }
        }

        return result;

    }
}

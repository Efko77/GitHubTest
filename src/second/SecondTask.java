package second;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Pasirinkite figura kurios plota skaiciuosite:");
        System.out.println("Staciojo trikampio plotas");
        System.out.println("Staciakampio plotas");
        System.out.println("Kvadrato plotas");
        System.out.println("apskritimo plotas");*/

       /* int selection =scanner.nextInt();

        System.out.println("Jusu pasirinkimas " + selection);*/
        SecondTask secondTask = new SecondTask();
        /*int selectedMeniuItem = getCorrectNumb(scanner);

        switch (selectedMeniuItem) {
            case 1:
                secondTask.triangle(scanner);
                //(a * b) / 2;
                break;
            case 2:
                //a * b;
                break;
            case 3:
                //a * 2;
                break;
            case 4:
                //pi * (a * 2);
                break;*/

        while (true)

        {


            System.out.println("Pasirinkite figura, kurios plota skaiciuosite:");
            System.out.println(" 1 Staciojo trikampio plotas");
            System.out.println("2 Staciakampio plotas");
            System.out.println("3 Kvadrato plotas");
            System.out.println("4 apskritimo plotas");
            System.out.println("0 sistema baigs darba");
            int selectedMeniuItem = (int) getCorrectNumb(scanner);

            switch (selectedMeniuItem) {
                case 1:
                    secondTask.triangle(scanner);
                    //(a * b) / 2;
                    break;
                case 2:
                    secondTask.staciakampis(scanner);
                    //a * b;
                    break;
                case 3:
                    secondTask.kvadratas(scanner);
                    //a * 2;
                    break;
                case 4:
                    secondTask.apskritimas(scanner);
                    //pi * (a * 2);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("neradome veiksmo pakartokite");
                    break;
            }

        }

    }

    private void triangle(Scanner scanner) {
        System.out.println("iveskite a statini");
        double a = getCorrectNumb(scanner);
        System.out.println("Iveskite b statini");
        double b = getCorrectNumb(scanner);
        System.out.println("Trikampio plotas " + (a * b) / 2);
    }

    private void staciakampis(Scanner scanner) {
        System.out.println("iveskite a statini");
        double a = getCorrectNumb(scanner);
        System.out.println("Iveskite b statini");
        double b = getCorrectNumb(scanner);
        System.out.println("Staciakampio plotas " + a * b);
    }

    private void kvadratas(Scanner scanner) {
        System.out.println("iveskite a statini");
        double a = getCorrectNumb(scanner);
        System.out.println("kvadrato plotas " + Math.pow(a,2));// pirmas sk. reiksme antras kelintuoju laipsniu keliame
    }
    private void apskritimas (Scanner scanner) {
        System.out.println("iveskite a spindulio ilgi");
        double a = getCorrectNumb(scanner);
        System.out.println("apskritimo plotas " + (Math.pow(a,2) * Math.PI));
    }

    private static double getCorrectNumb(Scanner scanner) {
        double result = 0;
        while (true) {
            try {
                result = scanner.nextDouble();
               /* if (result < 1 || result > 4) {
                    throw new InputMismatchException("Blogas diapazonas");
                }*/
                break;
            } catch (InputMismatchException e) {
                System.out.println("Blogas formatas pakartoti");
                scanner.nextLine();
            }
        }

        return result;

    }
}

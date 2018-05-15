package second;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Onutei sunkei sekasi mokytis matematiką ir ji neturi skaičiuotuvo, padėkite Onutei ir sukurkite skaičiuotuvą kuris atliktu:
 * a.       Sumos
 * b.      Skirtumo
 * c.       Dalybos, nepamirškite, kad dalyba iš nulio negalima!
 * d.      Daugybos
 * e.       Kėlimas laipsniu
 * Skaičiuoto veiksmų skaičiavimai turi būti atskiroje klasėje. Onutei negalima leisti įvesti blogą skaičių
 * ir netinkamą operaciją reikia prašyti pakartoti įvedimą.
 * Onutė įvedinės veiksmus tokiu formatu : „12 + 12“, „50 - 15“ ir t.t.
 */
public class ThirdTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaicius ir veiksma tarp ju pvz : \"12 + 12\"");

        String line = scanner.nextLine();

        String[] items = line.split(" "); //line split sukarpo i tarpus

        Calculator calculator = new Calculator();


        if (items.length == 3) {
            switch (items[1]) {
                case "+":
                    double numb = getCorrectNumber(items[0], scanner, "Iveskite pirma skaiciu"); //paima stringa ir konvertuoja i double, dabar aprasome klaidu
                    double numb2 = getCorrectNumber(items[2], scanner, "Iveskite antra skaiciu");
                    double sum = calculator.sum(numb, numb2); //issikvieciame metoda is kitos klases toliau galima spausdinti
                    System.out.println(" suma yra " + sum);

                    break;
                case "-":
                    //TODO call minus method
                    break;
                default:
                    System.out.println("Nera tokio veiksmo mergyt");
            }
        } else {
            System.out.println("nepasiseke bandykit dar karta");
        }
    }

    private static double getCorrectNumber(String numb, Scanner scanner, String text) {
        double result;
        try {
            result = Double.parseDouble(numb);
        } catch (NumberFormatException e) {
            while (true) {
                System.out.println(text);
                try {
                    result = scanner.nextDouble();
                } catch (InputMismatchException ex) {
                    System.out.println("Juk sakiau vesk skaiciu");
                    scanner.nextLine();
                }
            }
        }

        return result;


    }
}




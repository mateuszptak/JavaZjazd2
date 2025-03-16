import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Liczba jest parzysta \nCya!");
        } else {
            System.out.println("Liczba jest nieparzysta \nCya!");
        }

        scanner.close();
    }

}

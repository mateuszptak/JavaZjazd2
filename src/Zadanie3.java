import java.util.Random;
import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pozycje w ciagu Fibonacciego:");

        // Użycia funkcji z parametrem
        int pozycjaWCiaguFibonacciego = scanner.nextInt();
        int wynik = fibonacci(pozycjaWCiaguFibonacciego);
        System.out.println("Wartość na pozycji " + pozycjaWCiaguFibonacciego + " w ciągu Fibonacciego to: " + wynik);

        // Użycia funkcji bez parametru
        int wynikLosowy = fibonacci();
        System.out.println("Wartość na losowej pozycji w ciągu Fibonacciego to: " + wynikLosowy);
    }

    // Obliczanie wartosci dla danej pozycji
    public static int fibonacci(int danaPozycja) {
        if (danaPozycja <= 1) {
            return danaPozycja;
        }
        return fibonacci(danaPozycja - 1) + fibonacci(danaPozycja - 2);
    }

    // Obliczanie losowej liczby z ciągu z zakresu 1 - 10
    public static int fibonacci() {
        Random random = new Random();
        int losowaPozycja = random.nextInt(10) + 1;
        System.out.println("Randomowa wylosowana pozycja w ciągu to: " + losowaPozycja);
        return fibonacci(losowaPozycja);
    }
}
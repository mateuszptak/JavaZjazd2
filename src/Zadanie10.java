import java.util.Random;
import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Wybór poziomu trudności
        System.out.println("__##__ WITAJ W GRZE ZGADNIJ LICZBĘ! __##__");
        System.out.println("Wybierz poziom trudności:");
        System.out.println("1. Łatwy (1-50) - 10 prób");
        System.out.println("2. Średni (1-100) - 7 prób");
        System.out.println("3. Trudny (1-200) - 5 prób");
        System.out.print("Twój wybór (1-3): ");

        int maxNumber = 100;
        int maxAttempts = 7;

        switch (scanner.nextInt()) {
            case 1:
                maxNumber = 50;
                maxAttempts = 10;
                break;
            case 3:
                maxNumber = 200;
                maxAttempts = 5;
                break;
            default:
                System.out.println("Nieprawidłowy wybór, ustawiam poziom średni");
        }

        // Generowanie liczby i inicjalizacja
        int luckyNumber = random.nextInt(maxNumber) + 1;
        int attempts = 0;
        boolean isGuessed = false;

        System.out.println("\nZaczynamy! Masz " + maxAttempts + " prób.");

        // Peętla gry
        while (attempts < maxAttempts && !isGuessed) {
            System.out.print("\nPróba " + (attempts + 1) + "/" + maxAttempts + ". Podaj liczbę: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == luckyNumber) {
                System.out.println("## BRAWO! Zgadłeś w " + attempts + " próbach! ##");
                isGuessed = true;
            } else {
                // podpowiedzi dla użytkownika
                int difference = Math.abs(guess - luckyNumber);
                String proximity = "";

                if (difference > 20)
                    proximity = "DUŻO ";
                else if (difference > 10)
                    proximity = "TROCHĘ ";
                else
                    proximity = "BLISKO ";

                // Dodatkowe wskazówki
                if (guess < luckyNumber)
                    System.out.println(proximity + "ZA MAŁO!");
                else
                    System.out.println(proximity + "ZA DUŻO!");
            }
        }

        // Infocmacja koncowa dla użytkownika
        if (!isGuessed) {
            System.out.println("\n## KONIEC GRY! Prawidłowa liczba: " + luckyNumber + " ##");
        }

        scanner.close();
    }
}

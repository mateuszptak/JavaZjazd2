import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jaka operacje chcesz wykonac? ('+', '-', '*', '/')");
        String operacja = scanner.nextLine();
        System.out.println("Podaj pierwsza liczbe:");
        double a = scanner.nextDouble();
        System.out.println("Podaj druga liczbe:");
        double b = scanner.nextDouble();
        double wynik = 0;

        switch (operacja) {
            case "+":
                wynik = a + b;
                break;
            case "-":
                wynik = a - b;
                break;
            case "*":
                wynik = a * b;
                break;
            case "/":
                wynik = a / b;
                break;
            default:
                System.out.println("Niepoprawna operacja");
                break;
        }
        scanner.close();
        System.out.println("Wynik: " + wynik);
    }
}

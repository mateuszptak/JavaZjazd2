import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dwie liczby całkowite: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        scanner.close();
        wypiszNieparzyste(a, b);
    }

    // Funkcja wypisujaca liczby nieparzyste od a do b
    public static void wypiszNieparzyste(int a, int b) {
        // wypisuje od najmniejszej do najwiekszej
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                if (i % 2 != 0) {
                    System.out.println("Liczby nieparzyste zaczynając od najmniejszej: " + i);
                }
            }
        } else {
            // wypisuje od najwiekszej do najmniejszej
            for (int i = a; i >= b; i--) {
                if (i % 2 != 0) {
                    System.out.println("Liczby nieparzyste zaczynając od największej: " + i);
                }
            }
        }
    }
}

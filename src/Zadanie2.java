import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę naturalna:");
        int number = scanner.nextInt();

        // outputy
        int silniaPetla = silniaUzywajacPetli(number);
        System.out.println("Silnia używając pętli: " + silniaPetla);

        int silniaRekurencja = silniaUzywajacRekurencji(number);
        System.out.println("Silnia używając rekurencji: " + silniaRekurencja);

        scanner.close();
    }

    // Funkcja do obliczania silni za pomocą pętli
    private static int silniaUzywajacPetli(int ileRazy) {
        int wynik = 1;
        for (int i = 1; i <= ileRazy; i++) {
            wynik *= i;
        }
        return wynik;
    }

    // Funkcja do obliczania silni używając rekurencji
    private static int silniaUzywajacRekurencji(int ileRazy) {
        if (ileRazy == 0) {
            return 1;
        }

        else {
            return ileRazy * silniaUzywajacPetli(ileRazy - 1);
        }
    }
}

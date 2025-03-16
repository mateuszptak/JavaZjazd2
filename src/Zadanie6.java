import java.util.Arrays;

public class Zadanie6 {
    public static void main(String[] args) {
        Number[] liczbyZmiennoprzecinkowe = { 3.5, 2.1, 4.7 };

        wynikWszystkiego(liczbyZmiennoprzecinkowe);
    }

    public static void wynikWszystkiego(Number[] liczby) {
        if (liczby.length == 0) {
            System.out.println("Brak danych do analizy.");
            return;
        }

        double[] wartosci = new double[liczby.length];
        double suma = 0;

        for (int i = 0; i < liczby.length; i++) {
            wartosci[i] = liczby[i].doubleValue();
            suma += wartosci[i];
        }

        Arrays.sort(wartosci);

        double srednia = suma / wartosci.length;
        double mediana;

        if (wartosci.length % 2 == 0) {
            mediana = (wartosci[wartosci.length / 2 - 1] + wartosci[wartosci.length / 2]) / 2.0;
        } else {
            mediana = wartosci[wartosci.length / 2];
        }

        System.out.println("Suma: " + suma);
        System.out.println("Średnia: " + srednia);
        System.out.println("Mediana: " + mediana);
    }
}

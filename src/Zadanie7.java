// Typy obslugiwane w Switch w java:
// byte, short, int, char, String, enum 

// Typy obslugiwane w Switch w C#:
// byte, short, int, char, String, enum, long, ulong, float, double, decimal, bool

// Typy nieoblugiwane w Switch w C#:
// long, ulong, float, double, decimal, bool

// podsumowanie - w javie mozna uzywac String, a w c++ nie

public class Zadanie7 {
    public static void main(String[] args) {
        String imie = "Mati";

        switch (imie) {
            case "Mati":
                System.out.println("Czesc Mati!");
                break;
            case "Kasia":
                System.out.println("Czesc Kasia!");
                break;
            default:
                System.out.println("Cześć CI.");
        }
    }
}

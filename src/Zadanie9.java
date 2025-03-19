/*
 WNioski wypisze tutaj:
- Typy prymitywne (jak int w tym przypadku) są przekazywane przez wartość, więc ich modyfikacja wewnątrz funkcji nie wpływa na oryginalne zmienne
- Obiekty (IntegerWrapper) są przekazywane przez referencję, więc modyfikacja ich wewnątrz funkcji wpływa na oryginalne obiekty, ale tworzenie nowych obiektów wewnątrz funkcji nie zmienia oryginalnych referencji
 */

public class Zadanie9 {
    public static void main(String[] args) {
        // Zmienna num jest prymitywnym typem danych, więc przekazywana jest przez
        // wartość
        int num = 5;

        System.out.println("Wartość zmiennej: " + num);
        changeValue(num); // Nie zmienia wartości num, bo jest przekazywana przez wartość
        System.out.println("Wartość zmiennej po funkcji: " + num);

        // Zmienna number jest obiektem klasy IntgerWrapper, więc przekazywana jest
        // przez referencję?
        IntegerWrapper number = new IntegerWrapper(5);
        System.out.println("Wartość przed funkcją: " + number.getValue());
        changeValue(number); // Zmienia wartość number, bo modyfikuje obiekt przez referencję
        System.out.println("Wartość po funkcji: " + number.getValue());
        change(number); // Nie zmienia wartości number, bo tworzy nowy obiekt i nie modyfikuje
                        // oryginalnej referencji.
        System.out.println("Wartość po funkcji: " + number.getValue());
    }

    // Funkcja zmienia wartość obiektu IntegerWrapper, bo modyfikuje obiekt przez
    // referencję.
    public static void changeValue(IntegerWrapper num) {
        num.setValue(10); // Zmienia wartość oryginalnego obiektu.
    }

    // Funkcja nie zmienia wartości oryginalnnej referencji, bo tworzy nowy obiekt.
    public static void change(IntegerWrapper num) {
        num = new IntegerWrapper(26); // Tworzy nowy obiekt, ale nie zmienia oryginalnej referencji.
    }

    // Funkcja nie zmienia wartości oryginalnej zmiennej, bo jest przekazywana przez
    // wartość.
    public static void changeValue(int num) {
        num = 10; // Zmienia tylko lokalną kopię zmiennej.
        System.out.println("Wartość zmiennej wewnątrz funkcji: " + num);
    }
}

class IntegerWrapper {
    private int value;

    public IntegerWrapper(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

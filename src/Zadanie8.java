import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean kupowanie = true;

        while (kupowanie) {
            System.out.println("Wybierz bilet:");
            System.out.println("1. Normalny");
            System.out.println("2. Ulgowy");
            System.out.println("3. Miesięczny");
            System.out.println("4. Weekendowy");
            System.out.print("Twój wybór: ");

            int wybor = scanner.nextInt();

            switch (wybor) {
                case 1:
                    System.out.println("Zakupiłeś bilet normalny.");
                    break;
                case 2:
                    System.out.println("Zakupiłeś bilet ulgowy.");
                    break;
                case 3:
                    System.out.println("Zakupiłeś bilet miesięczny.");
                    break;
                case 4:
                    System.out.println("Zakupiłeś bilet weekendowy.");
                    break;
                default:
                    System.out.println("Niepoprawny wybór.");
            }

            System.out.print("Czy chcesz kupić kolejny bilet? (tak/nie): ");
            String decyzja = scanner.next();

            if (!decyzja.equalsIgnoreCase("tak")) {
                kupowanie = false;
            }
        }

        System.out.println("Dziękujemy za skorzystanie z naszej kasy biletowej!");
        scanner.close();
    }
}

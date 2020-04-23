
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Prosze podac liczbe (k - koniec): ");
            String znak = sc.nextLine();

            if (znak.equals("k"))
                break;

            try {
                int number = Integer.parseInt(znak);
                System.out.println("Wprowadzona liczba to: " + number);
            } catch(NumberFormatException e) {
                System.err.println("Bład. To nie jest liczba.");
            }
        }
        System.out.println("Koniec");
    }
}
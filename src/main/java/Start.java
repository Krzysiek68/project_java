import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tablica[] = new int[5];

        System.out.println("Podaj 5 elementow tablicy typu int.");
        for (int i = 0; i < 5;) {
            System.out.print("Element " + (i + 1) + ": ");
            String znak = sc.nextLine();

            try {
                int number = Integer.parseInt(znak);
                tablica[i] = number;
                i++;
            } catch (NumberFormatException e) {
                System.err.println("To nie jest liczba. Podaj jeszcze raz.");
                System.out.println();
            }
        }

        System.out.println("Ktory element tablicy wyswietlic? Podaj liczbe: ");
        String wybor = sc.nextLine();

        try {
            int number = Integer.parseInt(wybor);
            System.out.println("Szukany element to: " + tablica[number]);
            System.out.println("Koniec");
        } catch (NumberFormatException e) {
            System.err.println("To nie jest liczba. Przerywam program.");
        } catch (ArrayIndexOutOfBoundsException f) {
            System.err.println("Poza granicami tablicy. Przerywam program.");
        }
    }
}
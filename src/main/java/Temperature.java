import java.util.Scanner;

public class Temperature {
    boolean lessThanHundred(int a, int b) {
        if (a > 100 && b > 100)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dwie temperatury.");
        System.out.print("Temperatura 1: ");
        int temp1 = scan.nextInt();
        System.out.print("Temperatura 2: ");
        int temp2 = scan.nextInt();

        Temperature temp = new Temperature();

        boolean wynik = temp.lessThanHundred(temp1, temp2);

        if (wynik)
            System.out.println("Obie temperatury sa mniejsze niz 100");
        else
            System.out.println("Obie temperatury nie sa mniejsze niz 100");
    }
}

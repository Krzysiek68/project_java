import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] tab = {18, 93, 100, 41, 50, 14, 71, 75, 38, 34, 65, 61, 5, 21, 46, 22, 40, 5, 40, 9, 75, 63, 13, 4, 35, 77, 13,
                44, 34, 59, 75, 59, 88, 23, 81, 50, 50, 3, 0, 2, 93, 17, 31, 61, 1, 4, 33, 1, 91, 71, 49, 65, 64, 45, 12, 54,
                13, 29, 20, 29, 19, 76, 51, 20, 57, 42, 72, 96, 16, 34, 7, 99, 16, 95, 50, 50, 4, 24, 11, 12, 37, 63, 30, 9,
                3, 16, 44, 54, 55, 36, 86, 39, 8, 71, 88, 27, 4, 97, 29, 49, 87, 59, 89, 50, 35, 23, 72, 8, 41, 31, 33, 93, 53,
                91, 29, 9, 6, 29, 43, 67, 5, 27, 79, 34, 99, 72, 42, 10, 90, 28, 23, 18, 67, 35, 9, 85, 72, 89, 76, 5, 9, 65,
                6, 44, 36, 90, 70, 39, 76, 0, 47, 72, 27, 82, 5, 49, 97, 66, 78, 95, 98, 11, 77, 84, 28, 87, 20, 0, 92, 33, 20,
                67, 92, 30, 81, 96, 29, 1, 80, 98, 43, 38, 16, 30, 64, 32, 38, 89, 84, 77, 53, 30, 53, 55, 1, 83, 57, 18, 92, 30};

        System.out.println("Jakiego sortowania uzyc?");
        System.out.println("1 - Babelkowe");
        System.out.println("2 - Kubelkowe");
        int wybor  = scan.nextInt();

        if (wybor == 1){
            Babelkowe babelkowe = new Babelkowe();
            Sortable sortowanie = babelkowe;
            sortowanie.sort(tab);
        }

        if (wybor == 2){
            Kubelkowe kubelkowe = new Kubelkowe();
            Sortable sortowanie = kubelkowe;
            sortowanie.sort(tab);
        }
    }
}

public class Start {
    public static int [] tablicaNaOdwrot(int [] tab) {
        for (int i = 0; i < tab.length/2; i++) {
            int temp = tab[i];
            tab[i] = tab[tab.length - 1 - i];
            tab[tab.length - 1 - i] = temp;
        }
        return tab;
    }

   public static void main(String[] args) {

        int [] tablica = {1, 2, 3, 4, 5, 6};

        System.out.println("Tablica poczatkowo: ");
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
        System.out.println("Tablica odwrocona: ");

        int [] tablica2 = tablicaNaOdwrot(tablica);

        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica2[i] + " ");
        }
        System.out.println();
    }
}
public class Start {

    boolean tablica(int[] t) {
        int j = 0;
        for (int i = 0; i < t.length; i++) {
            j = i;
            if (t[j] == 1)
                if (t[j + 1] == 2)
                    if (t[j + 2] == 3)
                        return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] tab = {5, 4, 1, 2, 3, 6};
        int[] tab2 = {6, 5, 4, 3, 2};

        Start start = new Start();

        boolean wynik = start.tablica(tab);

        boolean wynik2 = start.tablica(tab2);

        if (wynik)
            System.out.println("Tablica zawiera sekwencje liczb 1, 2, 3");
        else
            System.out.println("Tablica nie zawiera sekwencji liczb 1, 2, 3");

        if (wynik2)
            System.out.println("Tablica zawiera sekwencje liczb 1, 2, 3");
        else
            System.out.println("Tablica nie zawiera sekwencji liczb 1, 2, 3");
    }
}

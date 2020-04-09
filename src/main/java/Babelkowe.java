public class Babelkowe implements Sortable {
    public double ilosc = 0;

    @Override
    public double step_counting() {
        ilosc++;
        return ilosc;
    }

    @Override
    public int[] sort(int[] tab) {
        int temp;
        int zmiana = 1;
        while(zmiana > 0){
            zmiana = 0;
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    temp = tab[i + 1];
                    tab[i + 1] = tab[i];
                    tab[i] = temp;
                    zmiana++;
                    step_counting();
                }
            }
        }

        for (int i = 0; i < tab.length; i++)
            System.out.print(tab[i] + " ");
        System.out.println();
        System.out.println("Ilosc krokow: " + ilosc);

        return tab;
    }
}

public class Kubelkowe implements Sortable {
    public double ilosc = 0;

    @Override
    public double step_counting() {
        ilosc++;
        return ilosc;
    }

    @Override
    public int[] sort(int[] tab) {
        int[] bucket = new int[101];

        for (int i= 0; i < tab.length; i++) {
            bucket[tab[i]]++;
            step_counting();
        }

        int pos = 0;
        for (int i = 0; i < bucket.length; i++)
            for (int j = 0; j < bucket[i]; j++) {
                tab[pos++] = i;
                step_counting();
            }

        for (int i = 0; i < tab.length; i++)
            System.out.print(tab[i] + " ");
        System.out.println();
        System.out.println("Ilosc krokow: " + ilosc);

        return tab;
    }
}

package pl.kozak.firstapp;

import java.util.Scanner;

public class Uzytkownik {

    Scanner scan = new Scanner(System.in);

    Uzytkownik(String imie, String nazwisko, int wiek, String adres, String dataZapisu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.adres = adres;
        this.dataZapisu = dataZapisu;
    }

    String imie;
    String nazwisko;
    int wiek;
    String adres;
    String dataZapisu;
    static int czasWypozyczenia = 0;
    static int wypozyczenie = 0;
    static String[] egzemplarze = new String[10];
    static int i = 0;

    public void pokazDane() {
        System.out.println("Imie: " + this.imie);
        System.out.println("Nazwisko: " + this.nazwisko);
        System.out.println("Wiek: " + this.wiek);
        System.out.println("Adres: " + this.adres);
        System.out.println("Data zapisu: " + this.dataZapisu);
    }

    public void pokazMenu() {
        System.out.println("------MENU------");
        System.out.println("1 - Pokaz dane uzytkownika");
        System.out.println("2 - Przejrzyj zbior");
        System.out.println("3 - Wypozycz");
        System.out.println("4 - Historia");
        System.out.println("5 - Zwrot");
        System.out.println("6 - Szczegoly");
        System.out.println("7 - Koniec");
        System.out.println("----------------");
    }

    public void wypozycz() {
        if (this.czasWypozyczenia <= 2) {
            System.out.println("UWAGA Mozesz wypozyczyc lacznie maksymalnie 3 egzemplarze albo jeden na 3 dni");
            System.out.println("Podaj numer indeksu wybranego elementu: ");
            switch (scan.nextInt()) {
                case 1:
                    System.out.println("Wypozyczono: Ksiazka > Wesele");
                    this.egzemplarze[i] = "Wesele";
                    i++;
                    this.wypozyczenie++;
                    break;
                case 2:
                    System.out.println("Wypozyczono: Ksiazka > Hobbit");
                    this.egzemplarze[i] = "Hobbit";
                    i++;
                    this.wypozyczenie++;
                    break;
                case 3:
                    System.out.println("Wypozyczono: Film > Avatar");
                    this.egzemplarze[i] = "Avatar";
                    i++;
                    this.wypozyczenie++;
                    break;
                case 4:
                    System.out.println("Wypozyczono: Film > Obcy");
                    this.egzemplarze[i] = "Obcy";
                    i++;
                    this.wypozyczenie++;
                    break;
                case 5:
                    System.out.println("Wypozyczono: Plyty > Californication");
                    this.egzemplarze[i] = "Californication";
                    i++;
                    this.wypozyczenie++;
                    break;
                case 6:
                    System.out.println("Wypozyczono: Plyty > FooFighters");
                    this.egzemplarze[i] = "FooFighters";
                    i++;
                    this.wypozyczenie++;
                    break;
                case 7:
                    System.out.println("Wypozyczono: Audiobooki > DNA");
                    this.egzemplarze[i] = "DNA";
                    i++;
                    this.wypozyczenie++;
                    break;
                case 8:
                    System.out.println("Wypozyczono: Audiobooki > Holmes");
                    this.egzemplarze[i] = "Holmes";
                    i++;
                    this.wypozyczenie++;
                    break;
                case 9:
                    System.out.println("Wypozyczono: Ebooki > Adventures");
                    this.egzemplarze[i] = "Adventures";
                    i++;
                    this.wypozyczenie++;
                    break;
                case 10:
                    System.out.println("Wypozyczono: Ebooki > Endurance");
                    this.egzemplarze[i] = "Endurance";
                    i++;
                    this.wypozyczenie++;
                    break;
                default:
                    System.out.println("Bledny numer");
            }
        } else
            System.out.println("Nie oddales terminowo egzemplarza, naliczono kare, zwroc egzemplarz i ureguluj oplate aby moc wypozyczyc ponownie");
    }

    public void zwrot() {
        for (int j = 0; j < 10; j++)
            this.egzemplarze[j] = String.valueOf(0);
        System.out.println("Zwrot udany, oplata uregulowana");
        this.i = 0;
        this.wypozyczenie = 0;
        this.czasWypozyczenia = 0;
    }

    public void historia() {
        System.out.println("WYPOZYCZONE AKTUALNIE:");
        for (int j = 0; j < this.i; j++)
            System.out.println(this.egzemplarze[j]);
    }
}

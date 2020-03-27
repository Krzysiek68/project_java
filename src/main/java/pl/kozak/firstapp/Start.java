package pl.kozak.firstapp;

import java.util.Scanner;

public class Start {
    public static void main(String[] args){

        Ksiazki Wesele = new Ksiazki(1, 1901, "Wyspianski", "Atlas", 50, 300);
        Ksiazki Hobbit = new Ksiazki(2, 1998, "Tolkien", "Atlas", 80, 500);
        Filmy Avatar = new Filmy(3, 2009, "Cameron", "Disney", 100, 150);
        Filmy Obcy = new Filmy(4, 2017, "Scott", "Disney", 120, 120);
        Plyty Californication = new Plyty(5, 1999, "RHCP", "WarnerBros", 55, 50);
        Plyty FooFighters = new Plyty(6, 1995, "FooFighters", "WarnerBros", 65, 60);
        Audiobooki DNA = new Audiobooki(7, 2005, "Ford", "Empik", 30, 360);
        Audiobooki Holmes = new Audiobooki(8, 2007, "Snake", "Empik", 40, 480);
        Ebooki Adventures = new Ebooki(9, 2010, "Kindle", "Amazon", 70, 25);
        Ebooki Endurance = new Ebooki(10, 2012, "Kindle", "Amazon", 85, 40);

        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj imie: ");
        String imie = scan.nextLine();
        System.out.print("Podaj nazwisko: ");
        String nazwisko = scan.nextLine();
        System.out.print("Podaj wiek: ");
        String liczba = scan.nextLine();
        int wiek = Integer.parseInt(liczba);
        System.out.print("Podaj adres zamieszkania: ");
        String adres = scan.nextLine();
        System.out.print("Podaj data zapisu: ");
        String dataZapisu = scan.nextLine();

        Uzytkownik osoba = new Uzytkownik(imie, nazwisko, wiek, adres, dataZapisu);

        char wybor;

        do {
            osoba.pokazMenu();
            wybor = scan.next().charAt(0);

            switch (wybor) {
                case '1':
                    osoba.pokazDane();
                    break;
                case '2': {
                    System.out.println("KSIAZKI");
                    System.out.println("Wesele - 1        Hobbit - 2");
                    System.out.println("FILMY");
                    System.out.println("Avatar - 3        Obcy - 4");
                    System.out.println("PLYTY");
                    System.out.println("Californication - 5        FooFighters - 6");
                    System.out.println("AUDIOBOOKI");
                    System.out.println("DNA - 7        Holmes - 8");
                    System.out.println("EBOOKI");
                    System.out.println("Adventures - 9        Endurance - 10");
                    System.out.println("Wcisnij jakikolwiek znak by powrocic do MENU");
                    scan.next();
                    break;
                }
                case '3':
                    osoba.wypozycz();
                    break;
                case '4':
                    osoba.historia();
                    break;
                case '5':
                    osoba.zwrot();
                    break;
                case '6': {
                    System.out.print("Podaj numer indeksu wybranego elementu: ");
                    switch (scan.nextInt()) {
                        case 1:
                            System.out.println("Ksiazka > Wesele");
                            Wesele.informacje();
                            System.out.println("Ilosc stron: " + Wesele.iloscStron);
                            break;
                        case 2:
                            System.out.println("Ksiazka > Hobbit");
                            Hobbit.informacje();
                            System.out.println("Ilosc stron: " + Hobbit.iloscStron);
                            break;
                        case 3:
                            System.out.println("Film > Avatar");
                            Avatar.informacje();
                            System.out.println("Ilosc minut: " + Avatar.iloscMinut);
                            break;
                        case 4:
                            System.out.println("Film > Obcy");
                            Obcy.informacje();
                            System.out.println("Ilosc minut: " + Obcy.iloscMinut);
                            break;
                        case 5:
                            System.out.println("Plyta > Californication");
                            Californication.informacje();
                            System.out.println("Czas trwania: " + Californication.czasTrwania);
                            break;
                        case 6:
                            System.out.println("Plyta > FooFighters");
                            FooFighters.informacje();
                            System.out.println("Czas trwania: " + FooFighters.czasTrwania);
                            break;
                        case 7:
                            System.out.println("Audiobook > DNA");
                            DNA.informacje();
                            System.out.println("Jakosc nagrania: " + DNA.jakoscNagrania);
                            break;
                        case 8:
                            System.out.println("Audiobook > Holmes");
                            Holmes.informacje();
                            System.out.println("Jakosc nagrania: " + Holmes.jakoscNagrania);
                            break;
                        case 9:
                            System.out.println("Ebook > Adventures");
                            Adventures.informacje();
                            System.out.println("Waga pliku: " + Adventures.wagaPliku);
                            break;
                        case 10:
                            System.out.println("Ebook > Endurance");
                            Endurance.informacje();
                            System.out.println("Waga pliku: " + Endurance.wagaPliku);
                            break;
                        default:
                            System.out.println("Nie ma takiego numeru");
                    }
                    break;
                }
                case '7':
                    break;
                default:
                    System.out.println("Podano nieprawidlowe dane, sprobuj ponownie:");
            }

            if (osoba.wypozyczenie > 0)
                osoba.czasWypozyczenia++;

        } while (wybor != '7');

        System.out.println("Dziekujemy za skorzystanie z uslug wypozyczalni");
    }

}

//    ********************* 1 CYKL PETLI DO WHILE = 1 DZIEN WYPOZYCZENIA ************************

package pl.kozak.firstapp;

public class Ogolne {
    int numerID;
    int dataWydania;
    String autor;
    String wydawnictwo;
    double wartosc;

    public void informacje() {
        System.out.println("Numer ID: " + this.numerID);
        System.out.println("Data wydania: " + this.dataWydania);
        System.out.println("Autor: " + this.autor);
        System.out.println("Wydawnictwo: " + this.wydawnictwo);
        System.out.println("Wartosc: " + this.wartosc);
    }
}

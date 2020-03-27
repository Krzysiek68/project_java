package pl.kozak.firstapp;

public class Plyty extends Ogolne {
    Plyty(int numerID, int dataWydania, String autor, String wydawnictwo, double wartosc, int czasTrwania) {
        this.numerID = numerID;
        this.dataWydania = dataWydania;
        this.autor = autor;
        this.wydawnictwo = wydawnictwo;
        this.wartosc = wartosc;
        this.czasTrwania = czasTrwania;
    }
    int czasTrwania;
}

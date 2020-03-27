package pl.kozak.firstapp;

public class Audiobooki extends Ogolne {
    Audiobooki(int numerID, int dataWydania, String autor, String wydawnictwo, double wartosc, int jakoscNagrania) {
        this.numerID = numerID;
        this.dataWydania = dataWydania;
        this.autor = autor;
        this.wydawnictwo = wydawnictwo;
        this.wartosc = wartosc;
        this.jakoscNagrania = jakoscNagrania;
    }
    int jakoscNagrania;
}

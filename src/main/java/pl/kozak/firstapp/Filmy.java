package pl.kozak.firstapp;

public class Filmy extends Ogolne {
    Filmy(int numerID, int dataWydania, String autor, String wydawnictwo, double wartosc, int iloscMinut) {
        this.numerID = numerID;
        this.dataWydania = dataWydania;
        this.autor = autor;
        this.wydawnictwo = wydawnictwo;
        this.wartosc = wartosc;
        this.iloscMinut = iloscMinut;
    }
    int iloscMinut;
}

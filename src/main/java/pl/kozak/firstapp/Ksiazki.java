package pl.kozak.firstapp;

public class Ksiazki extends Ogolne{
    Ksiazki(int numerID, int dataWydania, String autor, String wydawnictwo, double wartosc, int iloscStron) {
        this.numerID = numerID;
        this.dataWydania = dataWydania;
        this.autor = autor;
        this.wydawnictwo = wydawnictwo;
        this.wartosc = wartosc;
        this.iloscStron = iloscStron;
    }
    int iloscStron;
}

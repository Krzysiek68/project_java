package pl.kozak.firstapp;

public class Ebooki extends Ogolne {
    Ebooki(int numerID, int dataWydania, String autor, String wydawnictwo, double wartosc, int wagaPliku) {
        this.numerID = numerID;
        this.dataWydania = dataWydania;
        this.autor = autor;
        this.wydawnictwo = wydawnictwo;
        this.wartosc = wartosc;
        this.wagaPliku = wagaPliku;
    }
    int wagaPliku;
}

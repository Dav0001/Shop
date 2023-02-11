package model;
import model.Prodotti;
public class Dvd extends Prodotti {
    private String titolo;
    private String categoria;
    private int durata;

    public Dvd() {
    }

    public Dvd(double costo, double peso, String nome, String titolo, String categoria, int durata) {
        super(costo, peso, nome);
        this.titolo = titolo;
        this.categoria = categoria;
        this.durata = durata;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getDurata() {
        return durata;
    }

    public String getCategoria(){
        return categoria;
    }

}
//DVD: madre(double Peso, double Costo) String Titolo, String Categoria, , double Durata

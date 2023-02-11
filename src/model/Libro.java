package model;
import model.Prodotti;
public class Libro extends Prodotti {
    private int ISBN;
    private String titolo;
    private String categoria;
    private int numPagine;

    public Libro(){
    }
    public Libro(double costo, double peso, String nome, int isbn, String titolo, String categoria, int numPagine) {//costruttore classe figlia che eredita il costruttore della madre (super) e aggiunge i valori alle variabili proprie della classe figlia
        super(costo,peso,nome);
        this.ISBN = isbn;
        this.titolo = titolo;
        this.categoria = categoria;
        this.numPagine = numPagine;
    }
    //getter di tutte le variabili di model.Libro
    public int getISBN() {
        return ISBN;
    }
    public String getTitolo() {
        return titolo;
    }
    public String getCategoria() {
        return categoria;
    }
    public int getNumPagine() {
        return numPagine;
    }
}
//model.Libro:variabili madre(double Peso, double Costo) variabili model.Libro( String ISBN, String Titolo, String Categoria, , int Pagine)

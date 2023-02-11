package model;
public class Prodotti {
    private double costo;
    private double peso;
    private String nome;
    public Prodotti(){
    }
    public Prodotti(double costo, double peso,String nome) {//Costruttore classe model.Prodotti (crea una reference a un oggetto di classe model.Prodotti che ha un costo e peso, cosa che hanno tutti i prodotti)
        this.costo = costo;
        this.peso = peso;
        this.nome = nome;
    }
    public double getPrezzo() {//getter di costo
        return costo;
    }
    public double getPeso(){//getter di peso
        return peso;
    }

    public String getNome(){
        return nome;
    }
}


package model;
import java.util.ArrayList;
import java.util.Arrays;

import model.Prodotti;
import model.Dvd;
import model.Libro;
import model.Racchetta;
public class Negozio {
    private ArrayList<Prodotti> listaProdotti = new ArrayList<>();
//  private ArrayList<Racchetta> gocciaSuper = new ArrayList<>();

    public Negozio() {

    }


    public void aggiungiProdotto(Prodotti p) {
        listaProdotti.add(p);
    }

//           public ArrayList<Prodotti> getListaProdotti() { MI STAMPA LA REFERENCE degli OGGETTi NELL'ARRAYLIST
//               for (Prodotti p : listaProdotti) {
//                   System.out.println(p);
//               }
//               return listaProdotti;
//           }

    public int numeroProdotti() {
        System.out.print("Il numero di prodotti nel negozio e': ");
        return listaProdotti.size();
    }

    public double pesoTotale() {
        double x = 0;
        for (Prodotti p : listaProdotti) {
            x = x + p.getPeso();
        }
        System.out.print("Il peso totale dei prodotti del negozio e': ");
        return x;
    }

    public double prodCostoso() {
        double x = 0;
        for (Prodotti p : listaProdotti) {
            if (p.getPrezzo() > x) {
                x = p.getPrezzo();
            }
        }
        System.out.print("Il prodotto piu' costoso nel negozio e': ");
        return x;
    }

    public int libriFantasy(){
        int count = 0;
        for (Prodotti p : listaProdotti){
            if( p instanceof Libro && ((Libro) p).getCategoria().equalsIgnoreCase("Fantasy")){
                    count++;
            }
        }
        System.out.print("Il numero di libri fantasy nel negozio e': ");
        return count;
    }
    public ArrayList<Racchetta> RaccParticolare() {
        ArrayList<Racchetta> raccParticolare = new ArrayList<>();
        for (Prodotti p : listaProdotti) {
            if (p instanceof Racchetta && ((Racchetta) p).getTipo().equalsIgnoreCase("Goccia") && p.getPrezzo() > 100){
                raccParticolare.add((Racchetta)p);
            }
        }
        System.out.println("Le racchette di tipo Goccia che costano piu' di 100euro nel negozio sono: ");
        return raccParticolare;
    }
        public void trim(){
        listaProdotti.trimToSize();
        }
    }












































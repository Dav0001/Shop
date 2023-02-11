import model.Dvd;
import model.Libro;
import model.Negozio;
import model.Racchetta;

import java.util.ArrayList;

public class ApplicationStart {
       public static void main(String[] args) {
              Negozio negozio = new Negozio();

              Libro libro1 = new Libro(20.50, 5.5,"Dracula" ,554, "Dracula di bram stocker",
                      "Romanzo", 250);

              Libro libro2 =new Libro(15.50, 1.0, "World of Warcraft",324, "World of Warcraft," +
                      " l'inizio della Guerra", "Fantasy", 150);

              Libro libro3 =new Libro(70.50, 4.5, "Java",666, "Java HeadStart", "Fantasy", 700);

              Dvd dvd1 =new Dvd(5.0, 0.2, "Disney","Hercules", "Cartoni Animati", 90);
              Dvd dvd2 =new Dvd(10.0, 0.2, "Poliziesco","Die Hard", "Poliziesco", 100);

              Racchetta racchetta1 =new Racchetta(100, 15, "Racchetta Padel","Love", "Diamante");
              Racchetta racchetta2 =new Racchetta(90, 15, "Racchetta Padel","Hate", "Goccia");
              Racchetta racchetta3 =new Racchetta(300, 20, "Racchetta Padel","Hope", "Goccia");
              Racchetta racchetta4 =new Racchetta(250, 20, "Racchetta Padel","Winner", "Goccia");

              negozio.aggiungiProdotto(libro1);
              negozio.aggiungiProdotto(libro2);
              negozio.aggiungiProdotto(libro3);

              negozio.aggiungiProdotto(dvd1);
              negozio.aggiungiProdotto(dvd2);

              negozio.aggiungiProdotto(racchetta1);
              negozio.aggiungiProdotto(racchetta2);
              negozio.aggiungiProdotto(racchetta3);
              negozio.aggiungiProdotto(racchetta4);

              negozio.trim();

//             negozio.getListaProdotti();
              System.out.println(negozio.numeroProdotti());
              System.out.println(negozio.pesoTotale());
              System.out.println(negozio.prodCostoso());
              System.out.println(negozio.libriFantasy());
              System.out.println(negozio.RaccParticolare());


       }
}








/*1. Creare una gerarchia di classi che mi permetta di rappresentare dei prodotti
        model.Prodotti:
        - model.Libro: String ISBN, String Titolo, String Categoria, double Peso, double Costo, int Pagine
        - DVD: String Titolo, String Categoria, double Peso, double Costo, double Durata
        - model.Racchetta da padel: String Marca, double Peso, double Costo, Tipo (Rotonda, A Goccia, A Diamante)
        2. Ognuna dovrà avere due Costruttori:
        a. uno di default
    b. uno che inizializza tutte le variabili
            Le variabili andranno incapsulate e ognuna dovrà avere un suo getter
            3. Creare una classe "model.Negozio" che dovrà avere un unico ArrayList che contiene tutti i suoi prodotti e solo quelli;
            lo riempiremo con alcuni prodotti di esempio; creeremo delle funzioni che ritornino:
            3a. il numero di prodotti del model.Negozio
            3b. il peso totale di tutti i prodotti al momento nel model.Negozio
            3c. il prodotto più costoso di tutto il negozio
            3d. Una che aggiunga un nuovo prodotto alla lista
            3e. il numero di libri nella categoria "Fantasy"
            3f. un'ArrayList con dentro tutte le Racchette A Goccia, e che costano più di €100,00*/
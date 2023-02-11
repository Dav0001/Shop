package model;
import model.Prodotti;
public class Racchetta extends Prodotti {
        private String marca;
        private String tipo;

        public Racchetta(){
        }
        public Racchetta(double costo, double peso, String nome, String marca, String tipo) {
                super(costo, peso, nome);
                this.marca = marca;
                // if(tipo.equals("Diamante") || tipo.equals("Rotonda") || tipo.equals("Goccia")){}
                this.tipo = tipo;
        }
        public String getMarca() {
                return marca;
        }
        public String getTipo() {
                return tipo;
        }

        @Override
        public String toString() {
                return "Tipo: " + this.getTipo() +
                        ", Prezzo: " + this.getPrezzo() +
                        ", Marca: " + this.getMarca();
        }
}




        //model.Racchetta da padel: madre(double Peso, double Costo) String Marca, Tipo (Rotonda, A Goccia, A Diamante)
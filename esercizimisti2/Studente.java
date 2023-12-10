package esercizimisti2;

import java.util.ArrayList;

class Studente {
    private String nome;
    private String cognome;
    private int età;
    private double voto;

    public Studente(String nome, String cognome, int età, double voto) {
        this.nome = nome;
        this.cognome = cognome;
        this.età = età;
        this.voto = voto;
    }

    @Override
    public String toString() {
        return nome + " " + cognome + " (età: " + età + ", voto: " + voto + ")";
    }
}

class RegistroStudenti {
    private ArrayList<Studente> studenti = new ArrayList<>();

    public void aggiungiStudente(Studente studente) {
        studenti.add(studente);
    }

    public void rimuoviStudente(Studente studente) {
        studenti.remove(studente);
    }

    public void visualizzaStudenti() {
        for (Studente studente : studenti) {
            System.out.println(studente);
        }
    }
}

public class EsercizioArrayList {
    public static void main(String[] args) {
        RegistroStudenti registro = new RegistroStudenti();

        Studente studente1 = new Studente("Mario", "Rossi", 20, 85.5);
        Studente studente2 = new Studente("Laura", "Bianchi", 22, 92.0);

        registro.aggiungiStudente(studente1);
        registro.aggiungiStudente(studente2);

        System.out.println("Registro Studenti:");
        registro.visualizzaStudenti();
    }
}

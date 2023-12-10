

//Esercizio LinkedList - Registro Attività Giornaliere:

package esercizimisti2;
import java.util.LinkedList;

class Attività {
    private String nome;
    private String data;
    private String ora;

    public Attività(String nome, String data, String ora) {
        this.nome = nome;
        this.data = data;
        this.ora = ora;
    }

    @Override
    public String toString() {
        return nome + " - " + data + " alle " + ora;
    }
}

class Giornaliero {
    private LinkedList<Attività> registroAttività = new LinkedList<>();

    public void aggiungiAttività(Attività attività) {
        registroAttività.add(attività);
    }

    public void rimuoviAttività(Attività attività) {
        registroAttività.remove(attività);
    }

    public void visualizzaAttività() {
        for (Attività attività : registroAttività) {
            System.out.println(attività);
        }
    }
}

public class Attivita {
    public static void main(String[] args) {
        Giornaliero registro = new Giornaliero();

        Attività attività1 = new Attività("Allenamento", "2023-10-20", "08:00");
        Attività attività2 = new Attività("Riunione", "2023-10-20", "14:30");

        registro.aggiungiAttività(attività1);
        registro.aggiungiAttività(attività2);

        System.out.println("Registro Attività Giornaliere:");
        registro.visualizzaAttività();
    }
}

//
/*
Registro Attivit� Giornaliere:
Allenamento - 2023-10-20 alle 08:00
Riunione - 2023-10-20 alle 14:30

 * 
 * 
 */



//

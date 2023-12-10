package gestioneNegozio;

import java.util.HashMap;
import java.util.LinkedList;

class Prodotto {
    private String nome;
    private double prezzo;

    public Prodotto(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return nome + " (prezzo: " + prezzo + ")";
    }
}

class Carrello {
    private LinkedList<Prodotto> prodottiNelCarrello = new LinkedList<>();

    public void aggiungiAlCarrello(Prodotto prodotto) {
        prodottiNelCarrello.add(prodotto);
    }

    public void rimuoviDalCarrello(Prodotto prodotto) {
        prodottiNelCarrello.remove(prodotto);
    }

    public void visualizzaCarrello() {
        for (Prodotto prodotto : prodottiNelCarrello) {
            System.out.println(prodotto);
        }
    }
}

class NegozioOnline {
    private HashMap<String, Prodotto> catalogoProdotti = new HashMap<>();

    public void aggiungiProdotto(String nome, Prodotto prodotto) {
        catalogoProdotti.put(nome, prodotto);
    }

    public void rimuoviProdotto(String nome) {
        catalogoProdotti.remove(nome);
    }

    public void visualizzaProdottiNelCatalogo() {
        for (Prodotto prodotto : catalogoProdotti.values()) {
            System.out.println(prodotto);
        }
    }



    public static void main(String[] args) {
        NegozioOnline negozio = new NegozioOnline();
        Carrello carrello = new Carrello();

        Prodotto prodotto1 = new Prodotto("Scarpe da ginnastica", 59.99);
        Prodotto prodotto2 = new Prodotto("Cuffie Bluetooth", 29.99);

        negozio.aggiungiProdotto("scarpe", prodotto1);
        negozio.aggiungiProdotto("cuffie", prodotto2);

        carrello.aggiungiAlCarrello(prodotto1);
        carrello.aggiungiAlCarrello(prodotto2);

        System.out.println("Catalogo Prodotti:");
        negozio.visualizzaProdottiNelCatalogo();

        System.out.println("\nProdotti nel Carrello:");
        carrello.visualizzaCarrello();
    }
}

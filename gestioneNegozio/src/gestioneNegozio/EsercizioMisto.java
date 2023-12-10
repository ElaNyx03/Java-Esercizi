package gestioneNegozio;

public class EsercizioMisto {
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

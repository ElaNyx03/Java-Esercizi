
public class Esempicompleti {

}
//Esempio con LinkedList (Playlist musicale):
/*
 * 
 * 
 * 
 * 
 * Classe: PlaylistMusicale
Metodi:
aggiungiCanzone(String titolo): Aggiunge una canzone alla playlist.
rimuoviCanzone(String titolo): Rimuove una canzone dalla playlist.
modificaCanzone(String titoloDaModificare, String nuovoTitolo): Modifica il titolo di una canzone nella playlist.
getCanzoni(): Restituisce la lista delle canzoni nella playlist.
getNome(): Restituisce il nome della playlist.
 * 
 * 
 * 
 * 
 * 
 * 
 */

import java.util.LinkedList;

public class PlaylistMusicale {
    private String nome;
    private LinkedList<String> canzoni;

    public PlaylistMusicale(String nome) {
        this.nome = nome;
        this.canzoni = new LinkedList<String>();
    }

    public void aggiungiCanzone(String titolo) {
        canzoni.add(titolo);
    }

    public void rimuoviCanzone(String titolo) {
        canzoni.remove(titolo);
    }

    public void modificaCanzone(String titoloDaModificare, String nuovoTitolo) {
        int indice = canzoni.indexOf(titoloDaModificare);
        if (indice != -1) {
            canzoni.set(indice, nuovoTitolo);
        }
    }

    public LinkedList<String> getCanzoni() {
        return canzoni;
    }

    public String getNome() {
        return nome;
    }

    // Altri metodi per gestire la playlist
}
////////////////////////////////////->altri in aggiunta 
public class PlaylistMusicale {
    // ... (I metodi precedenti rimangono invariati)

    public void riproduciPlaylist() {
        // Implementa la riproduzione delle canzoni nella playlist.
        // Puoi definire la logica per riprodurre le canzoni nell'ordine desiderato.
    }

    public void mischiaPlaylist() {
        Collections.shuffle(canzoni); // Mischia l'ordine delle canzoni nella playlist.
    }

    public void svuotaPlaylist() {
        canzoni.clear(); // Rimuove tutte le canzoni dalla playlist.
    }

    public String getCanzone(int indice) {
        if (indice >= 0 && indice < canzoni.size()) {
            return canzoni.get(indice); // Restituisce il titolo di una canzone in base all'indice.
        } else {
            return null; // Restituisce null se l'indice è fuori dai limiti.
        }
    }
}
/*
 * 
 * Con questi metodi aggiuntivi, puoi implementare la riproduzione della playlist, 
 * mischiare le canzoni, 
 * svuotare la playlist e 
 * ottenere il titolo di una canzone specifica in base all'indice. 
 * Questi metodi ampliano le funzionalità di gestione della tua playlist musicale.




Con questi nuovi metodi, puoi 
rimuovere tutte le canzoni dalla playlist, 
cercare canzoni basate su una parola chiave, 
modificare un titolo di canzone esistente, e 
implementare la riproduzione di una singola canzone
 * 
 * 
 */

public class PlaylistMusicale {
    // ... (I metodi precedenti rimangono invariati)

    public void rimuoviTutteLeCanzoni() {
        canzoni.clear(); // Rimuove tutte le canzoni dalla playlist.
    }

    public void cercaCanzoni(String parolaChiave) {
        for (String canzone : canzoni) {
            if (canzone.contains(parolaChiave)) {
                System.out.println("Risultato: " + canzone);
            }
        }
    }

    public void modificaCanzone(String titoloDaModificare, String nuovoTitolo) {
        int indice = canzoni.indexOf(titoloDaModificare);
        if (indice != -1) {
            canzoni.set(indice, nuovoTitolo);
        }
    }

    public void riproduciCanzone(String titolo) {
        // Implementa la riproduzione di una singola canzone in base al titolo.
    }
}


////////////////////////////////////////////////////////////

//Esempio2 con HashMap (Rubrica telefonica):

/*
 * 
 * 
 * Classe: RubricaTelefonica
Metodi:
aggiungiContatto(String nome, String numero): Aggiunge un contatto alla rubrica.
rimuoviContatto(String nome): Rimuove un contatto dalla rubrica.
modificaNumero(String nome, String nuovoNumero): Modifica il numero di un contatto nella rubrica.
getNumero(String nome): Restituisce il numero di telefono associato a un contatto.
getContatti(): Restituisce la lista dei contatti nella rubrica.
 * 
 * 
 * 
 * 
 */


import java.util.HashMap;

public class RubricaTelefonica {
    private HashMap<String, String> contatti;

    public RubricaTelefonica() {
        this.contatti = new HashMap<String, String>();
    }

    public void aggiungiContatto(String nome, String numero) {
        contatti.put(nome, numero);
    }

    public void rimuoviContatto(String nome) {
        contatti.remove(nome);
    }

    public void modificaNumero(String nome, String nuovoNumero) {
        if (contatti.containsKey(nome)) {
            contatti.put(nome, nuovoNumero);
        }
    }

    public String getNumero(String nome) {
        return contatti.get(nome);
    }

    public HashMap<String, String> getContatti() {
        return contatti;
    }

    // Altri metodi per gestire i contatti nella rubrica
}





/////////////////////////////////////////////////////////

//Esempio3 con ArrayList (Lista della spesa):



/*
 * 
 * 
 * Classe: ListaDellaSpesa
Metodi:
aggiungiArticolo(String articolo): Aggiunge un articolo alla lista della spesa.
rimuoviArticolo(String articolo): Rimuove un articolo dalla lista della spesa.
modificaArticolo(String articoloDaModificare, String nuovoArticolo): Modifica il nome di un articolo nella lista della spesa.
getArticoli(): Restituisce la lista degli articoli nella lista della spesa.
 * 
 */
import java.util.ArrayList;

public class ListaDellaSpesa {
    private ArrayList<String> articoli;

    public ListaDellaSpesa() {
        this.articoli = new ArrayList<String>();
    }

    public void aggiungiArticolo(String articolo) {
        articoli.add(articolo);
    }

    public void rimuoviArticolo(String articolo) {
        articoli.remove(articolo);
    }

    public void modificaArticolo(String articoloDaModificare, String nuovoArticolo) {
        int indice = articoli.indexOf(articoloDaModificare);
        if (indice != -1) {
            articoli.set(indice, nuovoArticolo);
        }
    }

    public ArrayList<String> getArticoli() {
        return articoli;
    }

    // Altri metodi per gestire la lista della spesa
    
    
    /*
     * Con questi metodi aggiuntivi, puoi ora svuotare completamente la lista, verificare se un articolo è presente, ottenere il numero totale di articoli e apportare ulteriori modifiche alla gestione della lista della spesa.
     * 
     */
    
    
    public class ListaDellaSpesa {
        private ArrayList<String> articoli;

        public ListaDellaSpesa() {
            this.articoli = new ArrayList<String>();
        }

        public void aggiungiArticolo(String articolo) {
            articoli.add(articolo);
        }

        public void rimuoviArticolo(String articolo) {
            articoli.remove(articolo);
        }

        public void modificaArticolo(String articoloDaModificare, String nuovoArticolo) {
            int indice = articoli.indexOf(articoloDaModificare);
            if (indice != -1) {
                articoli.set(indice, nuovoArticolo);
            }
        }

        public ArrayList<String> getArticoli() {
            return articoli;
        }

        public void svuotaLista() {
            articoli.clear(); // Rimuove tutti gli articoli dalla lista.
        }

        public boolean contieneArticolo(String articolo) {
            return articoli.contains(articolo); // Verifica se un articolo è presente nella lista.
        }

        public int numeroArticoli() {
            return articoli.size(); // Restituisce il numero di articoli nella lista.
        }

        // Altri metodi per gestire la lista della spesa
        
        /*
         * Con questi metodi aggiuntivi, puoi ottenere un articolo specifico in base all'indice, unire una lista di articoli a quella esistente e ordinare gli articoli in ordine alfabetico. Questi metodi espandono ulteriormente le funzionalità di gestione della lista della spesa.

         */
        public class ListaDellaSpesa {
            // ... (I metodi precedenti rimangono invariati)

            public String getArticolo(int indice) {
                if (indice >= 0 && indice < articoli.size()) {
                    return articoli.get(indice); // Restituisce l'articolo in base all'indice.
                } else {
                    return null; // Restituisce null se l'indice è fuori dai limiti.
                }
            }

            public void unisciLista(ArrayList<String> altraLista) {
                articoli.addAll(altraLista); // Unisce un'altra lista di articoli a quella esistente.
            }

            public void ordinaLista() {
                Collections.sort(articoli); // Ordina gli articoli in ordine alfabetico.
            }
        }

        /*
         * 
         * Questi metodi aggiuntivi consentono di verificare se la lista è vuota, rimuovere un articolo in base all'indice, e copiare gli articoli da un'altra lista alla lista della spesa corrente. Puoi personalizzare questi metodi in base alle specifiche esigenze dell'applicazione.
         * 
         * 
         */
        public class ListaDellaSpesa {
            // ... (I metodi precedenti rimangono invariati)

            public boolean listaVuota() {
                return articoli.isEmpty(); // Verifica se la lista della spesa è vuota.
            }

            public boolean rimuoviArticolo(int indice) {
                if (indice >= 0 && indice < articoli.size()) {
                    articoli.remove(indice); // Rimuove l'articolo in base all'indice.
                    return true; // Restituisce true se la rimozione ha avuto successo.
                } else {
                    return false; // Restituisce false se l'indice è fuori dai limiti.
                }
            }

            public void copiaLista(ArrayList<String> altraLista) {
                articoli.clear(); // Cancella tutti gli articoli attuali.
                articoli.addAll(altraLista); // Copia gli articoli dall'altra lista.
            }
        }       
        
    }

  
    
}
//////////////////////////////////////////////////////////////////////////////////










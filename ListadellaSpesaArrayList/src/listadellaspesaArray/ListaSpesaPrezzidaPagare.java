package listadellaspesaArray;
import java.util.*;

public class ListaSpesaPrezzidaPagare {
	
	   private List<String> lista;
	    private Map<String, Double> prezzi; // Mappa dei prezzi dei prodotti

	
	
	
	public ListaSpesaPrezzidaPagare() {
		   lista = new ArrayList<>();
	        prezzi = new HashMap<>();
	        // Inizializzo i prezzi dei prodotti
	        prezzi.put("Pane", 1.0);
	        prezzi.put("Latte", 2.0);
	        prezzi.put("Uova", 3.0);
	        prezzi.put("Frutta", 5.0);
	        prezzi.put("Pasta", 2.0);
	        prezzi.put("Farina", 1.0);
	        prezzi.put("Olio", 8.0);
	        prezzi.put("Sale", 1.0 );
	        prezzi.put("Carne",6.0);
	        prezzi.put("caffe",4.0);
	    }
	//metodi aggiungi
	 public void aggiungiElemento(String elemento) {
	        lista.add(elemento);
	    }
	 //metodi rimuovi
	  public void rimuoviElemento(String elemento) {
	        lista.remove(elemento);
	    }
	  
	  
	  //metodo per stampare la lista
	  public void stampaLista() {
	        System.out.println("Lista della spesa:");
	        for (String elemento : lista) {
	        	//dico di stampare l'elemento come farina,+prezzo che va a essere trovato con il metodo get 
	            System.out.println(elemento + " - Prezzo: $" + prezzi.get(elemento));
	        }
	    }
//metodo per calcolare il totale prezzi
	  
	/*    public double calcolaTotale() {
	        double totale = 0.0;
	        for (String elemento : lista) {
	            totale += prezzi.get(elemento);
	        }
	        return totale;
	    }

	  	 !!!! genera un errore sul prezzo del caffe come null!!!! 
	  
	  GESTISCO L'ERRORE N°1
In questo modo, il codice controlla se il prezzo è null 
prima di aggiungerlo al totale e, in caso contrario, 
stampa un messaggio di avviso specificando l'elemento 
per il quale il prezzo non è definito.

Questo dovrebbe risolvere il problema del NullPointerException 
e consentirti di calcolare il totale senza errori.
 
		 */  
	  
	  
	  /*
	    public double calcolaTotale() {
	        double totale = 0.0;
	        for (String elemento : lista) {
	            Double prezzo = prezzi.get(elemento);
	            if (prezzo != null) {
	                totale += prezzo;
	            } else {
	                System.out.println("Attenzione: Prezzo non definito per " + elemento);
	            }
	        }
	        return totale;
	    }
 
	    */
	  
	  
	  //GESTISCO L'ERRORE N°2
	//  notare che usare un blocco try-catch per gestire una NullPointerException è una pratica comune, ma dovresti sempre cercare di evitare che venga generata in primo luogo, assicurandoti che le chiavi necessarie esistano nella mappa prima di accedere ai valori.
	  
	  /*
	  public double calcolaTotale() {
		    double totale = 0.0;
		    for (String elemento : lista) {
		        try {
		            Double prezzo = prezzi.get(elemento);
		            if (prezzo != null) {
		                totale += prezzo;
		            } else {
		                System.out.println("Attenzione: Prezzo non definito per " + elemento);
		            }
		        } catch (Exception e) {
		            System.out.println("Errore: " + e.getMessage());
		        }
		    }
		    return totale;
		}
*/
	  //GESTISCO L'ERRORE N°3
	    /*
	     * public class PrezzoNonDefinitoException extends Exception {
    public PrezzoNonDefinitoException(String message) {
        super(message);
    }
}

public double calcolaTotale() {
    double totale = 0.0;
    for (String elemento : lista) {
        try {
            Double prezzo = prezzi.get(elemento);
            if (prezzo != null) {
                totale += prezzo;
            } else {
                throw new PrezzoNonDefinitoException("Attenzione: Prezzo non definito per " + elemento);
            }
        } catch (PrezzoNonDefinitoException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
    return totale;
}
 abbiamo definito una nuova eccezione chiamata PrezzoNonDefinitoException che estende la classe Exception. Quando rileviamo un prezzo non definito, lanciamo questa eccezione specifica con un messaggio di errore. 
 Nel blocco catch, gestiamo l'eccezione personalizzata
	     */
	  
	 // GESTISCO L'ERRORE N°4
	  //NOTA IL CAFFE E' STATO REGISTRATO CON LA LETTERA C 
      //MINUSCOLA ("caffe")e non ("Caffe")QUESTO HA PERMESSO DI creare un errore
	  //in tal caso GESTIRE L'ERRORE IN QUESTO MODO

	  public double calcolaTotale() {
		    double totale = 0.0;
		    for (String elemento : lista) {
		        try {
		            Double prezzo = prezzi.get(elemento);
		            if (prezzo != null) {
		                totale += prezzo;
		            } else {
		                System.out.println("Attenzione: Prezzo non definito per " + elemento + " il suo valore e' di default " );
		                // In alternativa, puoi assegnare un prezzo di default
		          
		                 prezzo = 4.0;
		                // prezzo = 3.0;
		           //se lascio scoperto il prezzo 3.0 su schermo il programma 
		                 //mi scartera' la prima assegnazione passando alla sucessiva.
		                 totale += prezzo;
		                 System.out.println("Il suo valore e' $ " + prezzo);
		            }
		        } catch (NullPointerException e) {
		            System.out.println("Errore: " + e.getMessage());
		            
		        }
		    }
		    return totale;
		}

	  
	  
///////////////////////////////////////////////////////////////

		/**
		 * @return the lista
		 */
		public List<String> getLista() {
			return lista;
		}

		/**
		 * @param lista the lista to set
		 */
		public void setLista(List<String> lista) {
			this.lista = lista;
		}

		/**
		 * @return the prezzi
		 */
		public Map<String, Double> getPrezzi() {
			return prezzi;
		}

		/**
		 * @param prezzi the prezzi to set
		 */
		public void setPrezzi(Map<String, Double> prezzi) {
			this.prezzi = prezzi;
		}

	/////////////////////////////////////////////////////////////////////////7
//////////////////////////////////////////////////////////////////////////
public static void main(String[] args) {
	
	ListaSpesaPrezzidaPagare listaSpesa = new ListaSpesaPrezzidaPagare();

    listaSpesa.aggiungiElemento("Pane");
    listaSpesa.aggiungiElemento("Latte");
    listaSpesa.aggiungiElemento("Uova");
    listaSpesa.aggiungiElemento("Frutta");
    listaSpesa.aggiungiElemento("Pasta");
    listaSpesa.aggiungiElemento("Farina");
    listaSpesa.aggiungiElemento("Olio");
    listaSpesa.aggiungiElemento("Sale");
    listaSpesa.aggiungiElemento("Carne");
    listaSpesa.aggiungiElemento("Caffe");
    listaSpesa.stampaLista();

    listaSpesa.rimuoviElemento("Latte");

    System.out.println("Dopo la rimozione:");
    listaSpesa.stampaLista();

    
    
    
    
    
    
    double totale = listaSpesa.calcolaTotale();
    System.out.println("Totale da pagare: $" + totale);
}
}
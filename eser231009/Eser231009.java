package eser231009;

import java.util.*;



/*

La classe Paziente rappresenta un paziente
 e ha quattro attributi: codiceFiscale, nome, cognome, e diagnosi.
  Questi attributi rappresentano le informazioni del paziente.
*/


public class Eser231009 {
	//classe Paziente
    public static class Paziente {
        private String codiceFiscale;
        private String nome;
        private String cognome;
        private String diagnosi;
        
//costruttore
        public Paziente(String codiceFiscale, 
        				String nome, 
        				String cognome,
        				String diagnosi) {
        	
            this.codiceFiscale = codiceFiscale;
            this.nome = nome;
            this.cognome = cognome;
            this.diagnosi = diagnosi;
        }
//getter e setter
        
        public String getCodiceFiscale() {
            return codiceFiscale;
        }

        public String getNome() {
            return nome;
        }

        public String getCognome() {
            return cognome;
        }

        public String getDiagnosi() {
            return diagnosi;
        }
    }
//seconda classe cartella clinica
    
    
    
    
    
    /*

    	La classe CartellaClinica rappresenta la cartella clinica del paziente.
    	Ha due attributi: un oggetto Paziente
    	 e una HashMap chiamata visite. 
    	La HashMap è utilizzata per memorizzare le visite mediche associate 
    	alle date e ai relativi referti.
    
    */

    
    public static class CartellaClinica {
    	//proteggo la prima classe aggiungendola alla seconda classe
        private Paziente paziente;
        //proteggo e creo un hashmap di tipo stringa e di nome visite
        private HashMap<String, String> visite;

       // Nel costruttore della classe CartellaClinica, 
        //viene passato un oggetto Paziente, e viene inizializzata la mappa visite.
        public CartellaClinica(Paziente paziente) {
            this.paziente = paziente;
            //inizializzo visite
            visite = new HashMap<String, String>();
        }

        
        
        
        /*Il metodo add nella classe CartellaClinica 
         * consente di aggiungere una visita alla cartella clinica. 
         * Si prendono in input la data es:(5 ottobre) e il referto della visita 
         * es:(visita che definisce se e' vivo o morto o guarito o malato). 
         * e vengono inseriti nella mappa visite.
         */
        public void add(String data, String referto) {
        	//inserimento nella mappa
            visite.put(data, referto);
        }
/*
 * Il metodo getReferto permette di ottenere il referto di una visita
 * Restituisce il referto associato a quella data dalla mappa visite.

 * */
        public String getReferto(String data) {
            return visite.get(data);
        }
/*Il metodo totVisite restituisce il numero totale di visite 
 * presenti nella cartella clinica, 
 * che è semplicemente la dimensione della mappa visite.*/
        
        public int totVisite() {
            return visite.size();
        }
/*Il metodo cartella crea una rappresentazione testuale completa della cartella clinica del paziente, inclusi tutti i referti delle visite. Concatena i dati relativi alle visite e li restituisce come una stringa.*/
        public Paziente getPaziente() {
            return paziente;
        }

/*Il metodo cartella crea una rappresentazione testuale 
 * completa della cartella clinica del paziente, 
 * inclusi tutti i referti delle visite. 
 * Concatena i dati relativi alle visite 
 * e li restituisce come una stringa.*/
       //metodo cartella
        public String cartella() {
        	
        	
//////////////////////////////////////////////////////////////////////////////
        	//gestisco un futuro errore
            try {
                String result = "";
                for (Map.Entry<String, String> entry : visite.entrySet()) {
                    String data = entry.getKey();
                    String referto = entry.getValue();
                    result += data + ": " + referto + "\n";
                }
                return paziente.getCognome() + " " + paziente.getNome() + " " + paziente.getCodiceFiscale() + ":\n" + result;
            //} catch (NullPointerException e) {
            } catch (Exception e) {
                // Gestisci l'eccezione
                return "Errore nella creazione della cartella clinica.";
            }
        }
        
        
    //    Una NullPointerException si verifica quando si 
        //tenta di accedere a un oggetto che è nullo (null). 
        //Questa eccezione è specifica per la gestione di problemi relativi
        //a oggetti nulli.
        //alcune gestioni degli errori NullPointerException, ArithmeticException, IOException
        
        
       //(Exception e) e' piu generico e gestisce tutti i tipi di errori senza elencarli
        

        
        
////////////////////////////////////////////////////////////////////////////////////////
       // In questo caso, abbiamo dichiarato una stringa 
        //result inizialmente vuota e poi abbiamo aggiunto i dati 
        //delle visite usando l'operatore di concatenazione +. Alla fine,
        //restituiamo result come il risultato del metodo cartella
    }

    public static void main(String[] args) {
    	
        Paziente p = new Paziente("codFis", "Mario", "Mario", "il paziente è in grave condizioni");
        CartellaClinica cartellaPaziente = new CartellaClinica(p);

        cartellaPaziente.add("17-5-2023", "malato di cancro, ha subito un intervento.");
        cartellaPaziente.add("18-5-2023", "decesso a causa di intervento fallito.");
        
        System.out.println(cartellaPaziente.cartella() + "numero visite: " + cartellaPaziente.totVisite());
        System.out.println("Referto del 17-5-2023: " + cartellaPaziente.getReferto("17-5-2023"));
        System.out.println("Referto del 18-5-2023: " + cartellaPaziente.getReferto("18-5-2023"));
    }
}

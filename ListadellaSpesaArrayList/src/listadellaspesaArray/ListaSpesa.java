package listadellaspesaArray;

import java.util.*;
/**
 * 
 */

public class ListaSpesa {
	private List<String> lista;
	/**
	 * 
	 */
	public ListaSpesa() {
	lista = new ArrayList<>();
	}
	/**
	 * aggiungo 
	 */
	public void aggiungiElemento( String elemento) {
	lista.add(elemento);

	    }
	/**
	 * rimuovo
	 */
	public void rimuoviElemento(String elemento) {
        lista.remove(elemento);
    }
	
	/**
	 *
	 */
	 public void stampaLista() {
	        System.out.println("Lista della spesa:");
	        for (String elemento : lista) {
	            System.out.println(elemento);
	        }
	    }
	/**
	 * @param args
	 */
	 public static void main(String[] args) {
	        ListaSpesa listaSpesa = new ListaSpesa();

	        listaSpesa.aggiungiElemento("Pane");
	        listaSpesa.aggiungiElemento("Latte");
	        listaSpesa.aggiungiElemento("Uova");
	        listaSpesa.aggiungiElemento("Frutta");

	        listaSpesa.stampaLista();

	        listaSpesa.rimuoviElemento("Latte");

	        System.out.println("Dopo la rimozione:");
	        System.out.println("..........................");
	        listaSpesa.stampaLista();
	        
	        //sostituisco il pane con il cioccolato
	        listaSpesa.aggiungiElemento("Cioccolato");
	        listaSpesa.stampaLista();
	    }
	}
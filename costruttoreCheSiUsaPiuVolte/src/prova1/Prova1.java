package prova1;
import java.util.*;


public class Prova1 {

	    public static void main(String[] args) {
	    	
	    	Scanner sc=new Scanner(System.in);
	    	String a,b,c;
	    	a=sc.nextLine();
	        Veicolo veicolo1 = new Veicolo(a, "Toyota", 2020);//uso il costruttore 
	        b=sc.nextLine();
	        Veicolo veicolo2 = new Veicolo(b, "Honda", 2018);//l'ho riuso          // uso lo stesso costruttore piu volte per variabili diverse con parametri diversi
	        c=sc.nextLine();
	        Veicolo veicolo3= new Veicolo(c,"4*4",3000);//usato una terza volta
	        System.out.println(veicolo1);
	        System.out.println(veicolo2);
	        System.out.println(veicolo3.toString());
	    }
	}


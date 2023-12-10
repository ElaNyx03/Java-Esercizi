package scorrere_un_vettore;

public class Scorrere_un_vettore {
	public static void main(String[] args) {
		String[] temp = {"Volvo", "BMW", "Ford", "Mazda"};
		
		
		//scorre il vettore in avanti dall'inizo alla fine
		for(int i=0;i<temp.length;i++)
			System.out.println(temp[i]);
		
		System.out.println("............");
		
		//scorre il vettore all' indietro ( va all'incontrario)
	    for (int i = temp.length-1; i >= 0; i--) {
	      System.out.println(temp[i]);
	    }
	}
}

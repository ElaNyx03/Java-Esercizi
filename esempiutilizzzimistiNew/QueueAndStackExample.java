package esempiutilizzzimistiNew;




//////////////////////////////////////////////////////////////////////7

///////////////////////////////////////////////////////////////



/////////////////////////////////////////////////////////////////////////////////


/////////////////////////////////////////////////////////////////7
//Esempio 12: Utilizzo di code LIFO e FIFO con LinkedList
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueAndStackExample {
public static void main(String[] args) {
// Utilizzo di una coda FIFO (First-In, First-Out)
Queue<String> fifoQueue = new LinkedList<>();
fifoQueue.offer("Elemento 1");
fifoQueue.offer("Elemento 2");
fifoQueue.offer("Elemento 3");
/*Il ciclo while verifica se la coda fifoQueue non è vuota utilizzando !fifoQueue.isEmpty().
All'interno del ciclo, fifoQueue.poll() viene chiamato. Questo metodo rimuove ed estrae l'elemento all'inizio della coda (il primo elemento inserito) e lo restituisce.
Il valore restituito da poll() viene quindi stampato a schermo utilizzando System.out.println().
In breve, il ciclo continua a estrarre e stampare gli elementi dalla coda in ordine di inserimento finché la coda non è vuota, seguendo il principio FIFO.





*/
while (!fifoQueue.isEmpty()) {
System.out.println(fifoQueue.poll());
}

// Utilizzo di uno stack LIFO (Last-In, First-Out)
Stack<String> lifoStack = new Stack<>();
lifoStack.push("Elemento A");
lifoStack.push("Elemento B");
lifoStack.push("Elemento C");

while (!lifoStack.isEmpty()) {
System.out.println(lifoStack.pop());
}
}
}

/*
* 
*  LIFO (Last-In, First-Out) rappresentato da una Stack. L'obiettivo è estrarre e stampare gli elementi dallo stack finché lo stack non è vuoto. Ecco cosa succede:

Il ciclo while verifica se lo stack lifoStack non è vuoto utilizzando !lifoStack.isEmpty().
All'interno del ciclo, lifoStack.pop() viene chiamato. Questo metodo rimuove ed estrae l'elemento in cima allo stack (l'ultimo elemento inserito) e lo restituisce.
Il valore restituito da pop() viene quindi stampato a schermo utilizzando System.out.println().
In breve, il ciclo continua a estrarre e stampare gli elementi dallo stack seguendo il principio LIFO, cioè l'ultimo elemento inserito è il primo a essere estratto (come se fosse un'impilatura di piatti, in cui l'ultimo piatto messo è il primo ad essere rimosso).






* 
* 
* */
///////////////////////////////////////////////////////////////////////////////////












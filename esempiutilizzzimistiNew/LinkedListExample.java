package esempiutilizzzimistiNew;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Elemento 1");
        linkedList.add("Elemento 2");
        linkedList.add("Elemento 3");

        // Aggiunta di un elemento in testa
        linkedList.addFirst("Elemento 0");

        // Rimozione dell'ultimo elemento
        linkedList.removeLast();

        // Stampa degli elementi
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}
package esempiutilizzzimistiNew;

import java.util.HashMap;
import java.util.Map;
public class HashMapExample {

    public static void main(String[] args) {
        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Alice", 95);
        studentGrades.put("Bob", 85);
        studentGrades.put("Charlie", 78);

        // Accesso ai valori
        int aliceGrade = studentGrades.get("Alice");

        // Stampa delle coppie chiave-valore
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        	}
    	}
}

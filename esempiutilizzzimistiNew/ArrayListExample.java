package esempiutilizzzimistiNew;

//cambia il package
import java.util.*;

public class ArrayListExample {
      List<String> colors = new ArrayList<>();
      colors.add("Rosso");
      colors.add("Verde");
      colors.add("Blu");

      // Accesso agli elementi
      String firstColor = colors.get(0);

      // Iterazione e modifica degli elementi
      for (int i = 0; i < colors.size(); i++) {
          String color = colors.get(i);
          colors.set(i, color.toUpperCase());
      }

      // Stampa degli elementi
      for (String color : colors) {
          System.out.println(color);
      }
  }

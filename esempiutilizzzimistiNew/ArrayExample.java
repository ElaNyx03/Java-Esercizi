package esempiutilizzzimistiNew;

public class ArrayExample {
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        // Accesso e modifica degli elementi
        int thirdNumber = numbers[2];
        numbers[1] = 25;

        // Iterazione e stampa degli elementi
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}


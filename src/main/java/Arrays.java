import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public void arrays() {

        // 1.1 Einfache Zahlenfolge ausgeben
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 1.2 Alle Elemente eines Arrays anzeigen
        String[] names = {"Bob", "Alice", "Tom", "Kate"};
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();

        // 1.3 Quadratzahlen berechnen
        int[] numbers = {2, 4, 6, 8};
        for (int number : numbers) {
            System.out.print(Math.pow(number, 2) + " ");
        }
        System.out.println();

        // 2.1 Nur gerade Zahlen ausgeben
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

        // 2.2 Summe berechnen
        int[] array = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        System.out.println(sum);

        // 2.3 Index mit ausgeben
        String[] cities = {"London", "Paris", "Rome", "Berlin"};
        for (int i = 0; i < cities.length; i++) {
            System.out.print(i + ". " + cities[i] + " ");
        }
        System.out.println();

        // 2.4 Minimum und Maximum finden
        int min = array[0];
        int max = array[0];
        for (int number : array) {
            if (number < min) min = number;
            if (number > max) max = number;
        }
        System.out.println("min: " + min + ". max: " + max);

        // 3.1 Array-Werte verdoppeln
        for (int i = 0; i < array.length; i++) {
            System.out.print((array[i] *= 2) + " ");
        }
        System.out.println();

        // 3.2 Zwei Arrays kombinieren
        String[] surnames = {"Miller", "Taylor", "Smith", "Swan"};
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " " + surnames[i] + ". ");
        }
        System.out.println();

        // 3.3 Benutzereingabe verarbeiten
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int userNumber = sc.nextInt();
        sc.close();
        for (int i = 1; i <= userNumber; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 3.4 Einfacher Notenrechner
        int[] examGrades = {85, 90, 76, 57};
        int summer = 0;
        for (int i = 0; i < examGrades.length; i++) {
            summer += examGrades[i];
        }
        int result = summer / examGrades.length;
        if (result >= 70) System.out.println("Bestanden: " + result);
        else System.out.println("Nicht bestanden: " + result);

        // 3.5 Zufallszahlen sortieren
        int[] randomArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(1, 101);
            System.out.print(randomArray[i] + " ");
        }
        System.out.println();

        java.util.Arrays.sort(randomArray);
        for (int number : randomArray) {
            System.out.print(number + " ");
        }
        System.out.println();
        int minArray = randomArray[0];
        int maxArray = randomArray[0];
        for (int i = 1; i < randomArray.length; i++) {

            if (randomArray[i] < randomArray[i - 1]) {
                minArray = randomArray[i - 1];
            }
            if (randomArray[i] > randomArray[i - 1]) {
                maxArray = randomArray[i];
            }
        }
        System.out.println("min: " + minArray);
        System.out.println("max: " + maxArray);
    }
}

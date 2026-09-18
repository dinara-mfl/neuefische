public class UnitTests {

    // 1.1 Testen einer einfachen Methode
    public static boolean isPositive(int number) {
        if (number > 0) return true;
        else return false;
    }

    // 1.2 Einfacher Multiplikationstest
    public static int multiply(int a, int b) {
        return a * b;
    }

    // 2.1 Prüfung von Nullwerten
    public static String getFirstLetter(String text) {
        if (text != null && !text.isEmpty()) {
            return text.substring(0, 1);
        }
        else return null;
    }

    // 2.2 Fehlerfälle testen
    public static double divide(int a, int b) {
        if (b==0) throw new IllegalArgumentException();
        else return a/b;
    }

    // 3.1 Mehrfachtests für eine Methode
    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}

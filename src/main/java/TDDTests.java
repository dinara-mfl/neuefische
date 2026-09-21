public class TDDTests {

    // 1.1 Aufgabe 1 – sum()
    public static int sum(int a, int b) {
        return a + b;
    }

    // 1.2 Aufgabe 2 – isEven()
    public static boolean isEven(int x) {
        if (x % 2 == 0) return true;
        else return false;
    }

    // 1.3 Aufgabe 3 – getFirstCharacter()
    public static String getFirstCharacter(String text) {
        return text.substring(0,1);
    }

    // 2.4 Aufgabe 4 – reverseString()
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // 2.5 Aufgabe 5 – isPalindrome()
    public static boolean isPalindrome(String text) {
        return text.toLowerCase().equals(new StringBuilder(text).reverse().toString().toLowerCase());
    }

    // 2.6 Aufgabe 6 – countVowels()
    public static int countVowels(String text) {
        int countVowels = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u') {
                countVowels++;
            }
        }
        return countVowels;
    }

    // 3.7 Aufgabe 7 – factorial()
    public static int factorial(int x) {
        int res = 1;
        for (int i = 1; i <= x; i ++) {
            res *= i;
        }
        return res;
    }

    // 3.8 Aufgabe 8 – fibonacci()
    public static int fibonacci(int x) {
        if (x <= 0) return 0;
        if (x == 1) return 1;

        return fibonacci(x - 1) + fibonacci(x - 2);
    }

    // 3.9 Aufgabe 9 – mergeArrays()
    public static int[] mergeArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            result[a.length + i] = b[i];
        }
        System.out.println(result);
        return result;
    }
}
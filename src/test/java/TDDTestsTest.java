import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TDDTestsTest {

    // 1.1 Aufgabe 1 – sum()
    @Test
    void sum_ShouldReturnSum_WennGivenNumbers() {
        assertEquals(5, TDDTests.sum(3,2));
    }

    // 1.2 Aufgabe 2 – isEven()
    @Test
    void isEven_ShouldReturnTrue_WennNumberIsGerade() {
        assertTrue(TDDTests.isEven(6));
    }

    // 1.3 Aufgabe 3 – getFirstCharacter()
    @Test
    void getFirstCharacter_ShouldReturnFirstCharakter_WennGivenText() {
        assertEquals("B", TDDTests.getFirstCharacter("Berlin"));
    }

    // 2.4 Aufgabe 4 – reverseString()
    @Test
    void reverseString_ShouldReturnReverseString_WennGivenText() {
        assertEquals("avaJ", TDDTests.reverseString("Java"));
    }

    // 2.5 Aufgabe 5 – isPalindrome()
    @Test
    void isPalindrome_ShouldReturnTrue_WennTExtIsPalindrome() {
        assertTrue(TDDTests.isPalindrome("Otto"));
    }

    // 2.6 Aufgabe 6 – countVowels()
    @Test
    void countVowels_ShouldReturncountVowels_WennGivenText() {
        assertEquals(2, TDDTests.countVowels("Hello"));
    }

    // 3.7 Aufgabe 7 – factorial()
    @Test
    void factorial_ShouldReturnFactorial_WennGiveNumber() {
        assertEquals(120, TDDTests.factorial(5));
    }

    // 3.8 Aufgabe 8 – fibonacci()
    @Test
    void fibonacci_ShouldReturnFibonacci_WennGivenNumber() {
        assertEquals(8, TDDTests.fibonacci(6));
    }

    // 3.9 Aufgabe 9 – mergeArrays()
    @Test
    void mergeArrays_ShouldReturnOneArray_WennGivenTwoArrays() {
        int[] a = {1, 2};
        int[] b = {3, 4};
        int[] expected = {1, 2, 3, 4};

        assertArrayEquals(expected, TDDTests.mergeArrays(a, b));
    }
}
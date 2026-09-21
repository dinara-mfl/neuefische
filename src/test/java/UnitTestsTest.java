import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTestsTest {

    // 1.1 Testen einer einfachen Methode
    @Test
    void isPositive_ShouldReturnTrue_WennNumberIsPositiv() {
        assertTrue(UnitTests.isPositive(10));
    }

    @Test
    void isPositive_ShouldReturnFalse_WennNumberIsNegativ() {
        assertFalse(UnitTests.isPositive(-10));
    }

    // 1.2 Einfacher Multiplikationstest
    @Test
    void multiply_ShouldReturnCorrectProduct_WennGivenTwoNumbers() {
        assertEquals(32, UnitTests.multiply(4, 8));
    }

    // 2.1 Prüfung von Nullwerten
    @Test
    void getFirstLetter_ShouldReturnNull_WennGivenEmpty() {
        assertNull(UnitTests.getFirstLetter(""));
    }

    @Test
    void getFirstLetter_ShouldReturnFirstLetter_WennGivenWord() {
        assertNotNull(UnitTests.getFirstLetter("Berlin"));
    }

    // 2.2 Fehlerfälle testen
    @Test
    void divide_ShouldReturnError_WennGivenNumberIs0() {
        //assertThrows(IllegalArgumentException, UnitTests.divide(4,0));
    }

    // 3.1 Mehrfachtests für eine Methode
    @Test
    void isPrime_ShouldReturnTrue_WennGivenPrimNumber() {
        assertTrue(UnitTests.isPrime(7));
    }

    @Test
    void isPrime_ShouldReturnFalse_WennGivenNotPrimNumber() {
        assertTrue(UnitTests.isPrime(9));
    }
}
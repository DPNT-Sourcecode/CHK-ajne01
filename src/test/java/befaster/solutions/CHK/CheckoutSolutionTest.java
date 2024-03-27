package befaster.solutions.CHK;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckoutSolutionTest {

    CheckoutSolution solution;

    public static String sku100ABC = "ABC";
    public static String sku130AAA = "AAA";
    public static String sku45BB = "BB";
    public static String sku175AAABB = "AAABB";

    public static String smallA = "a";

    public static String numberZero = "0";

    public static String specialChar = "-";
    @BeforeEach
    void setUp() {
        solution = new CheckoutSolution();
    }

    @Test
    void checkout() {
        assertEquals(100, solution.checkout(sku100ABC));
        assertEquals(130, solution.checkout(sku130AAA));
        assertEquals(45, solution.checkout(sku45BB));
        assertEquals(175, solution.checkout(sku175AAABB));
        assertEquals(-1, solution.checkout(smallA));
        assertEquals(-1, solution.checkout(numberZero));
        assertEquals(-1, solution.checkout(specialChar));

    }
}
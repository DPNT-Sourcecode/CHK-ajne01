package befaster.solutions.CHK;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckoutSolutionTest {

    CheckoutSolution solution;

    public static String sku100 = "ABC";
    @BeforeEach
    void setUp() {
        solution = new CheckoutSolution();
    }

    @Test
    void checkout() {
        assertEquals(100, solution.checkout(sku100));

    }
}
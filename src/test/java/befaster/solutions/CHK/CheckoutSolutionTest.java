package befaster.solutions.CHK;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckoutSolutionTest {

    CheckoutSolution solution;

    public static String exampleSKU = """
            | A    | 50    | 3A for 130     |
            | B    | 30    | 2B for 45      |
            | C    | 20    |                |
            | D    | 15    |                |
            """;
    @BeforeEach
    void setUp() {
        solution = new CheckoutSolution();
    }

    @Test
    void checkout() {

    }
}
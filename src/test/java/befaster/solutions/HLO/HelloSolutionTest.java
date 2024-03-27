package befaster.solutions.HLO;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class HelloSolutionTest {

    HelloSolution solution;

    @BeforeEach
    void setUp(){
        solution = new HelloSolution();
    }

    @Test
    void testHello(){
            assertFalse(solution.hello("Me").isEmpty());
    }

}
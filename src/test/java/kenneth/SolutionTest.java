package kenneth;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit Test for verifying App function(s)
 */
class SolutionTest {

    private Solution solution;
    private StringBuilder sbStr1;
    private StringBuilder sbStr2;

    @BeforeEach
    void setUp() {
        // Setting up variables before each unit test
        solution = new Solution();
        sbStr1 = new StringBuilder();
        sbStr2 = new StringBuilder();
    }

    @AfterEach
    void tearDown() {
        solution = null;
        sbStr1.setLength(0);
        sbStr2.setLength(0);
    }

    @Test
    void example1() {
        sbStr1.append("ABCABC");
        sbStr2.append("ABC");

        String expected = "ABC";
        String actual = solution.gcdOfStrings(sbStr1.toString(), sbStr2.toString());

        assertEquals(expected, actual);
    }

    @Test
    void example2() {
        sbStr1.append("ABABAB");
        sbStr2.append("ABAB");

        String expected = "AB";
        String actual = solution.gcdOfStrings(sbStr1.toString(), sbStr2.toString());

        assertEquals(expected, actual);
    }

    @Test
    void example3() {
        sbStr1.append("LEET");
        sbStr2.append("CODE");

        String expected = "";
        String actual = solution.gcdOfStrings(sbStr1.toString(), sbStr2.toString());

        assertEquals(expected, actual);
    }
}
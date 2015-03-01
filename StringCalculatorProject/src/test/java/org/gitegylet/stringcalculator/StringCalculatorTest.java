package org.gitegylet.stringcalculator;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author imate
 */
public class StringCalculatorTest {

    private StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void inputEmptyString() throws NegativeNumberException {
        assertEquals(stringCalculator.add(""), 0);
    }

    @Test
    public void inputOneNumber() throws NegativeNumberException {
        assertEquals(stringCalculator.add("3"), 3);
    }

    @Test
    public void inputMoreNumber() throws NegativeNumberException {
        assertEquals(stringCalculator.add("1,6"), 7);
        assertEquals(stringCalculator.add("1,2,3,4"), 10);
    }

    @Test
    public void inputWithOtherSeparator() throws NegativeNumberException {
        stringCalculator.setSeparator(":");
        assertEquals(stringCalculator.add("10:15:20"), 45);

        assertEquals(stringCalculator.add("2;3;5;8", ";"), 18);

        stringCalculator = new StringCalculator("/");
        assertEquals(stringCalculator.add("1/3/5/7/9", "/"), 25);
    }

    @Test(expected = NegativeNumberException.class)
    public void inputNegativeNumber() throws NegativeNumberException {
        stringCalculator.add("-3,2,3,-1");
    }

    @Test
    public void checkEcxeptionMessage() {
        try {
            stringCalculator.add("1,-2,3,4,-5");
        } catch (NegativeNumberException ex) {
            assertEquals(ex.getMessage(), "Negatives not allowed: -2, -5");
        }
    }
}

package org.gitegylet.stringcalculator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author imate
 */
public class StrCalcTest {

    private StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void inputEmptyString() {
        assertEquals(stringCalculator.add(""), 0);
    }

    @Test
    public void inputOneNumber() {
        assertEquals(stringCalculator.add("3"), 3);
    }

    @Test
    public void inputMoreNumber() {
        assertEquals(stringCalculator.add("1,6"), 7);
        assertEquals(stringCalculator.add("1,2,3,4"), 10);
    }

    @Test
    public void inputWithOtherSeparator() {
        stringCalculator.setDEFAULT_SEPARATOR(":");
        assertEquals(stringCalculator.add("10:15:20"), 45);
        assertEquals(stringCalculator.add("2;3;5;8",";"), 18);
    }
}

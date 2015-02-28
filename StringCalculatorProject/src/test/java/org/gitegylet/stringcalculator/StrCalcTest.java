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
}

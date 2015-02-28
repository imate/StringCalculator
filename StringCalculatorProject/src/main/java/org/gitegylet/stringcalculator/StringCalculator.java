package org.gitegylet.stringcalculator;

/**
 *
 * @author imate
 */
public class StringCalculator {

    public StringCalculator() {
    }

    public int add(String number) {
        int sum;
        if (number.isEmpty()) {
            sum = 0;
        } else {
            sum = Integer.parseInt(number);
        }
        return sum;
    }
}

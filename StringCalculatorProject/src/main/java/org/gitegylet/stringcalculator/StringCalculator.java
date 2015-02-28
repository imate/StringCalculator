package org.gitegylet.stringcalculator;

/**
 *
 * @author imate
 */
public class StringCalculator {

    public StringCalculator() {
    }

    public int add(String numbers) {
        int sum = 0;
        if (!numbers.isEmpty()) {
            String[] splittedStrings = numbers.split(",");
            for (String str : splittedStrings) {
                sum += Integer.parseInt(str);
            }
        }
        return sum;
    }
}

package org.gitegylet.stringcalculator;

/**
 *
 * @author imate
 */
public class StringCalculator {

    private String DEFAULT_SEPARATOR = ",";

    public StringCalculator() {
    }

    public void setDEFAULT_SEPARATOR(String DEFAULT_SEPARATOR) {
        this.DEFAULT_SEPARATOR = DEFAULT_SEPARATOR;
    }
    
    public int add(String numbers, String separator) {
        int sum = 0;
        if (!numbers.isEmpty()) {
            String[] splittedStrings = numbers.split(separator);
            for (String str : splittedStrings) {
                sum += Integer.parseInt(str);
            }
        }
        return sum;
    }

    public int add(String numbers) {
        return add(numbers, DEFAULT_SEPARATOR);
    }
}

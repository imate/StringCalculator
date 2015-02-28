package org.gitegylet.stringcalculator;

/**
 *
 * @author imate
 */
public class StringCalculator {

    private static final String DEFAULT_SEPARATOR = ",";
    private String separator;

    public StringCalculator() {
        separator = DEFAULT_SEPARATOR;
    }

    public StringCalculator(String separator) {
        this.separator = separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    public int add(String numbers, String separator) throws NegativeNumberException {
        int sum = 0;
        if (!numbers.isEmpty()) {
            String[] splittedStrings = numbers.split(separator);
            int actNum;
            for (String str : splittedStrings) {
                actNum = Integer.parseInt(str);
                sum += actNum;
                if (actNum < 0) {
                    throw new NegativeNumberException(makeMessage(splittedStrings));
                }
            }
        }
        return sum;
    }

    public int add(String numbers) throws NegativeNumberException {
        return add(numbers, separator);
    }

    private String makeMessage(String[] splittedStrings) {
        String message = "Negatives not allowed: ";
        String negatives = "";
        for (String str : splittedStrings) {
            if (Integer.parseInt(str) < 0) {
                negatives += str + ", ";
            }
        }
        if (!negatives.isEmpty()) {
            negatives = negatives.substring(0, negatives.length() - 2);
        }
        return message + negatives;
    }
}

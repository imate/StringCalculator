
package org.gitegylet.stringcalculator;

/**
 *
 * @author imate
 */
public class NegativeNumberException extends Exception {

    /**
     * Creates a new instance of <code>NegativeNumberException</code> without
     * detail message.
     */
    public NegativeNumberException() {
    }

    /**
     * Constructs an instance of <code>NegativeNumberException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NegativeNumberException(String msg) {
        super(msg);
    }
}

/**
 * Represents a nibble, which is a four-bit operand.
 */
public class Operand {
    private String nibble;   // the string representation of the operand
    private int nvalue;      // the integer value of the operand, a value from 0 - 15
    
    /**
     * Constructs an Operand object with the specified nibble string.
     *
     * @param op the string representation of the operand
     */
    public Operand(String op) {
        nibble = op;
        nvalue = 0;
        
        for (int i = 0; i < op.length(); i++) {
            if (op.charAt(i) == '1') {
                nvalue += Math.pow(2, op.length() - 1 - i);
            }
        }
    }
    
    /**
     * Gets the string representation of the operand.
     *
     * @return the nibble string
     */
    public String getNibble() {
        return nibble;
    }

    /**
     * Gets the integer value of the operand.
     *
     * @return the integer value of the nibble, a value from 0 - 15
     */
    public int getNibbleValue() {
        return nvalue;
    }

    /**
     * Returns a string representation of the operand.
     *
     * @return a string containing the nibble and its integer value
     */
    @Override
    public String toString() {
    	String output = "";
    	if (nvalue < 10) {
    		output = nibble + " -  " + nvalue;
    	} else {
    		output = nibble + " - " + nvalue;
    	}
        return output; // dumps both values; for example: OPERAND: 0101 = 5
    }
}

/**
 * Performs binary operations on nibbles (four-bit operands).
 */
public class NibbleMath {
    // The length of a nibble (four bits)
    private static final int BINARYLENGTH = 4;

    /**
     * Performs bitwise OR operation between two operands.
     *
     * @param x the first operand
     * @param y the second operand
     * @return the result of the OR operation
     */
    public static Operand or(Operand x, Operand y) {
        String newBinary = "";
        
        for (int i = 0; i < BINARYLENGTH; i++) {
            if (x.getNibble().charAt(i) == '1' || y.getNibble().charAt(i) == '1') {
                newBinary += "1";
            } else {
                newBinary += "0";
            }
        }
        
        Operand output = new Operand(newBinary);
        return output;
    }
    
    /** 
     * Performs bitwise AND operation between two operands.
     *
     * @param x the first operand
     * @param y the second operand
     * @return the result of the AND operation
     */
     public static Operand and(Operand x, Operand y) {
        String newBinary = "";
        
        for (int i = 0; i < BINARYLENGTH; i++) {
            if (x.getNibble().charAt(i) == '1' && y.getNibble().charAt(i) == '1') {
                newBinary += "1";
            } else {
                newBinary += "0";
            }
        }
        
        Operand output = new Operand(newBinary);
        return output;
     }

     /**
      * Performs bitwise XOR operation between two operands.
      *
      * @param x the first operand
      * @param y the second operand
      * @return the result of the XOR operation
      */
     public static Operand xor(Operand x, Operand y) {
        String newBinary = "";
        
        for (int i = 0; i < BINARYLENGTH; i++) {
            if (x.getNibble().charAt(i) != y.getNibble().charAt(i)) {
                newBinary += '1';
            } else {
                newBinary += '0';
            }
        }
        
        Operand output = new Operand(newBinary);
        return output;
     }

     /**
      * Performs circular right shift on an operand.
      *
      * @param x the operand to be shifted
      * @param y the number of positions to shift
      * @return the result of the circular right shift
      */
     public static Operand circRight(Operand x, Operand y) {
         String newBinary = x.getNibble();
         
         String nibble = x.getNibble();
         int shiftAmount = y.getNibbleValue() % nibble.length();
         
         newBinary = newBinary.substring(newBinary.length() - shiftAmount) + newBinary.substring(0, newBinary.length() - shiftAmount);
         
         Operand output = new Operand(newBinary);
         return output;
     }
     
     /**
      * Performs circular left shift on an operand.
      *
      * @param x the operand to be shifted
      * @param y the number of positions to shift
      * @return the result of the circular left shift
      */
     public static Operand circLeft(Operand x, Operand y) {
        String newBinary = "";
        
        String nibble = x.getNibble();
        int shiftAmount = y.getNibbleValue() % nibble.length();
        
        for (int i = 0; i < nibble.length(); i++) {
            int newIndex = (i + shiftAmount) % nibble.length();
            newBinary += nibble.charAt(newIndex);
        }
        
        Operand output = new Operand(newBinary);
        return output;
     }

     /**
      * Performs bitwise negation operation on an operand.
      *
      * @param x the operand to be negated
      * @return the result of the negation operation
      */
     public static Operand negation(Operand x) {
        String newBinary = "";
        
        for (int i = 0; i < BINARYLENGTH; i++) {
            if (x.getNibble().charAt(i) == '0') {
                newBinary += '1';
            } else {
                newBinary += '0';
            }
        }
        
        Operand output = new Operand(newBinary);
        return output;
     }
}

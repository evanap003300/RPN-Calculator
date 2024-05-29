/**
 * Represents a calculator that evaluates expressions using a stack of operands.
 */
public class Calculator implements Stack {

	private static final int SIZE_OF_STACK = 100;
    private Operand[] stack;
    private int TOS;  
    private int size;

    /**
     * Constructs a new Calculator object with an empty stack.
     */
    public Calculator() {
    	stack = new Operand[SIZE_OF_STACK];
    	size = 0;
    	TOS = -1;
    }                
    
    // STACK IMPLEMENTATION HERE!!
    /**
     * Clears the stack by resetting the size and top of stack index.
     */
    @Override
    public void clear() {
        size = 0;
        TOS = -1;
        stack = new Operand[SIZE_OF_STACK];
    }

    /**
     * Pushes an operand onto the stack.
     *
     * @param it the operand to push onto the stack
     * @return true if the operand is successfully pushed, false otherwise
     */
    @Override
    public boolean push(Object it) {
        if (TOS >= SIZE_OF_STACK - 1) {
            System.out.println("Stack is full");
            return false;
        }
        TOS++;
        stack[TOS] = (Operand) it;
        size++;
        return true;
    }

    /**
     * Pops an operand from the top of the stack.
     *
     * @return the operand popped from the stack, or null if the stack is empty
     */
    @Override
    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        Operand poppedItem = stack[TOS];
        TOS--;
        size--;
        return poppedItem;
    }

    /**
     * Retrieves the operand at the top of the stack without removing it.
     *
     * @return the operand at the top of the stack, or null if the stack is empty
     */
    @Override
    public Object topValue() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return stack[TOS];
    }

    /**
     * Returns the current size of the stack.
     *
     * @return the size of the stack
     */
    @Override
    public int length() {
        return size;
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    
    /**
     * Evaluates the expression and returns the result as an operand.
     *
     * @param expression the expression to evaluate
     * @return the result of the evaluation as an operand
     */
    public Operand evalExpression(String expression) {
    	String[] expArr = expression.split(" ", 0);
    	Stack evalStack = new Calculator();
    	String newBinary = "";
    	
    	for (int i = 0; i < expArr.length; i++) {
    		switch (expArr[i]) {
    		case "+":
                Operand operand2 = (Operand) evalStack.pop();
                Operand operand1 = (Operand) evalStack.pop();
                Operand result = NibbleMath.or(operand1, operand2);
                evalStack.push(result);
                break;
            case "*":
                operand2 = (Operand) evalStack.pop();
                operand1 = (Operand) evalStack.pop();
                result = NibbleMath.and(operand1, operand2);
                evalStack.push(result);
                break;
            case "^":
                operand2 = (Operand) evalStack.pop();
                operand1 = (Operand) evalStack.pop();
                result = NibbleMath.xor(operand1, operand2);
                evalStack.push(result);
                break;
            case "!":
                operand1 = (Operand) evalStack.pop();
                result = NibbleMath.negation(operand1);
                evalStack.push(result);
                break;
            case ">":
                operand2 = (Operand) evalStack.pop();
                operand1 = (Operand) evalStack.pop();
                result = NibbleMath.circRight(operand1, operand2);
                evalStack.push(result);
                break;
            case "<":
                operand2 = (Operand) evalStack.pop();
                operand1 = (Operand) evalStack.pop();
                result = NibbleMath.circLeft(operand1, operand2);
                evalStack.push(result);
                break;
            case ".":
                System.out.println(evalStack.topValue());
                break;
            case "-":
            	((Calculator) evalStack).popOp();
                break;
            case "$":
                System.out.println(evalStack.toString());
                break;
            case "@":
            	((Calculator) evalStack).duplicateTOS();
                break;
            default:
                evalStack.push(new Operand(expArr[i]));
                break;
    		}
    	} 
    	Operand answer = new Operand(newBinary);
    	return answer;
    }

    
    /**
     * Duplicates the top operand of the stack.
     *
     * @return true if the duplication is successful, false if the stack is empty
     */
    public boolean duplicateTOS() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return false;
        }
        Operand topItem = (Operand) topValue();
        push(topItem);
        return true;
    }      
    
    /**
     * Pops an operand from the stack.
     *
     * @return the operand popped from the stack, or null if the stack is empty
     */
    public Operand popOp() {
        return (Operand) pop();
    }            
    
    /**
     * Returns a string representation of the stack.
     *
     * @return a string containing the elements of the stack
     */
    public String toString() {
    	String output = "[";
        for (int i = 0; i < size; i++) {
            output += stack[i];
            if (i < size - 1) {
                output += ", ";
            }
        }
        output += "]";
        return output;
    }  
	
}
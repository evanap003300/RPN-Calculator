/**
 * This class tests the Reverse Polish Notation (RPN) calculator for evaluating expressions of 4-bit strings of 1s and 0s.
 * It takes user input for the expression, evaluates it using Operand and NibbleMath classes, and displays the results.
 *
 * @author Evan Phillps
 * @version 1.0
 * @since 2024-03-29
 */

import java.util.Scanner;

public class RPNNibbleTester {
    public static void main(String[] args) {
    	// Get input
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter an expression: ");
        String input = scan.nextLine();
        
        // Save the two binary values
        String binary1 = input.substring(0, 4);
        String binary2 = input.substring(5, 9);
        
        // Create op1
        Operand op1 = new Operand(binary1);
        System.out.println("\nOperator 1!");
        System.out.println(op1);
        
        // Create op2
        Operand op2 = new Operand(binary2);
        System.out.println("\nOperator 2!");
        System.out.println(op2);
        
        System.out.println("\nTesting");
        
        // or
        System.out.println("\nOR!");
        System.out.println(NibbleMath.or(op1, op2));
        
        // and
        System.out.println("\nAND!");
        System.out.println(NibbleMath.and(op1, op2));
        
        // xor
        System.out.println("\nXOR!");
        System.out.println(NibbleMath.xor(op1, op2));
        
        // negation
        System.out.println("\nNegation!");
        
        System.out.println("Operator 1");
        System.out.println(NibbleMath.negation(op1));
        
        System.out.println("\nOperator 2!");
        System.out.println(NibbleMath.negation(op2));
        
        // Right shift
        System.out.println("\nRight Shift!");
        System.out.println(NibbleMath.circRight(op1, op2));
        
        // Left shift
        System.out.println("\nLeft Shift!");
        System.out.println(NibbleMath.circLeft(op1, op2));
        
        //TESTING THE CALCULATOR NOW!!!
        System.out.println("\nTesting Calculator!");
        
        Calculator calc = new Calculator();
        System.out.print("The expression produces: ");
        calc.evalExpression(input);
        
        // Close scanner
        scan.close();
    }
}

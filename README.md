# Reverse Polish Notation (RPN) Calculator

A simple Java-based calculator that evaluates expressions written in **Reverse Polish Notation (RPN)** using binary operators. This project demonstrates the use of fundamental data structures (like stacks) and object-oriented programming principles.

![Java](https://img.shields.io/badge/Java-8%2B-blue.svg)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)

---

## Overview

This project simulates the evaluation of arithmetic expressions using Reverse Polish Notation — a mathematical notation in which operators follow their operands. It avoids the need for parentheses and operator precedence rules.

The calculator:
- Supports binary arithmetic operations.
- Demonstrates stack-based expression parsing.
- Includes test coverage via `RPNNibbleTester.java`.

---

## Files

| File Name            | Description                                |
|----------------------|--------------------------------------------|
| `Calculator.java`     | Main class that performs RPN calculations. |
| `NibbleMath.java`     | Handles nibble (4-bit) arithmetic operations. |
| `Operand.java`        | Represents numerical operands in expressions. |
| `RPNNibbleTester.java`| Contains test cases for the calculator.    |
| `Stack.java`          | Stack data structure implementation.       |

---

## How to Compile and Run

1. Open a terminal and navigate to the project directory.

2. Compile all `.java` files using:
   ```bash
   javac *.java
   ```

3. Once compiled, you can run the tester or the calculator directly:

   Run the test suite:
   ```bash
   java RPNNibbleTester
   ```

   Or run the calculator itself:
   ```bash
   java Calculator
   ```

## Example Usage

For the input expression:
```
3 4 + 2 *
```

The calculator will compute:
```
(3 + 4) * 2 = 14
```

This shows how RPN naturally handles operator precedence using a stack.

## Requirements

* Java JDK 8 or higher.
* Basic knowledge of Java and command-line tools.
* Terminal or IDE to compile and run Java code.

## Contributing

Contributions are welcome!
If you'd like to suggest improvements, add new features, or fix bugs:

1. Fork this repository.
2. Create a feature or bugfix branch.
3. Make your changes and commit them.
4. Open a pull request describing your update.

## License

This project is licensed under the MIT License.

## Author

Created by Evan Phillips.

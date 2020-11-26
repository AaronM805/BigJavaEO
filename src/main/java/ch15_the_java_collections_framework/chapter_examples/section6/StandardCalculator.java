package ch15_the_java_collections_framework.chapter_examples.section6;

import java.util.Stack;
/**
 * This class will use the standard notation to perform basic arithmetic operations.
 *
 * @author Aaron Martinez
 * @version 0.1
 */
public class StandardCalculator {
    private Stack<Integer> numbers;
    private Stack<String> operators;

    /**
     * Constructs an empty standard notation calculator.
     */
    public StandardCalculator() {
        numbers = new Stack<>();
        operators = new Stack<>();
    }

    /**
     * Processes the input according to the algorithm defined.
     *
     * @param input the input to process
     */
    public void process(String input) {
        if (input.equals("(")) {
            operators.push(input);
        }
        else if (isOperator(input)) {
            while(hasHigherPrecedence(input)) {
                evaluateTop();
            }
            operators.push(input);
        }
        else if (input.equals(")")) {
            while(!operators.peek().equals("(")) {
                evaluateTop();
            }
            operators.pop();
        }
        else {
            numbers.push(Integer.valueOf(input));
        }
    }

    /**
     * Calculates and returns the final result.
     *
     * @return final result
     */
    public int result() {
        while (!operators.empty()) {
            evaluateTop();
        }
        return numbers.pop();
    }

    private void evaluateTop() {
        int val1 = numbers.pop();
        int val2 = numbers.pop();
        String op = operators.pop();

        numbers.push(combine(val1, val2, op));
    }

    private int combine(int val1, int val2, String operator) {
        int result = 0;
        if (operator.equals("+")) {
            result = val1 + val2;
        }
        else if (operator.equals("-")) {
            result = val2 - val1;
        }
        else if (operator.equals("*") || operator.equals("x")) {
            result = val1 * val2;
        }
        else if (operator.equals("/")) {
            result = val2 / val1;
        }
        else if(operator.equals("%")) {
            result = val2 % val1;
        }

        return result;
    }

    private boolean hasHigherPrecedence(String input) {
        if(operators.empty()) {
            return false;
        }
        String operator = operators.peek();

        if ((input.equals("+") || input.equals("-"))
         && (operator.equals("*") || operator.equals("x") || operator.equals("/") || operator.equals("%"))) {
            return true;
        }
        return false;
    }

    private boolean isOperator(String input) {
        return input.equals("+") || input.equals("-") || input.equals("*") || input.equals("x") || input.equals("/")
            || input.equals("%");
    }
}
package notacao;

import java.util.Stack;
import java.util.Map;

public class PostfixEvaluator {
    public static int evaluate(String expression, Map<String, Integer> variables) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Integer.parseInt(token));
            } else if (isOperator(token)) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Faltam operandos para o operador " + token);
                }

                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = performOperation(token, operand1, operand2);
                stack.push(result);
            } else if (variables.containsKey(token)) {
                stack.push(variables.get(token));
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("A expressão não está corretamente formatada.");
        }

        return stack.pop();
    }

    private static boolean isNumeric(String token) {
        return token.matches("\\d+");
    }

    private static boolean isOperator(String token) {
        return token.matches("[+\\-*/]");
    }

    private static int performOperation(String operator, int operand1, int operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    throw new ArithmeticException("Divisão por zero.");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Operador inválido: " + operator);
        }
    }

    public static int evaluatePostfixExpression(String postfix) {
        Stack<Integer> stack = new Stack<>();

        for (char token : postfix.toCharArray()) {
            if (Character.isDigit(token)) {
                stack.push(Character.getNumericValue(token));
            } else if (isOperator(String.valueOf(token))) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Faltam operandos para o operador " + token);
                }
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = performOperation(String.valueOf(token), operand1, operand2);
                stack.push(result);
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("A expressão não está corretamente formatada.");
        }

        return stack.pop();
    }
}

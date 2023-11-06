package notacao;

import java.util.Map;
import java.util.HashMap;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Exercício 1: Avaliação de expressão posfixa
        String expression1 = "2 3 * 5 +";
        int result1 = PostfixEvaluator.evaluate(expression1, new HashMap<>());
        System.out.println("Resultado do Exercício 1: " + result1);

        // Exercício 2: Avaliação de expressão posfixa com variáveis
        String expression2 = "A B * C D / -";
        Map<String, Integer> variables = new HashMap<>();
        variables.put("A", 2);
        variables.put("B", 3);
        variables.put("C", 4);
        variables.put("D", 5);
        int result2 = PostfixEvaluator.evaluate(expression2, variables);
        System.out.println("Resultado do Exercício 2: " + result2);

        // Exercício 3: Avaliação de expressão posfixa separada
        String postfixExpression = "23*5+";
        int result3 = PostfixEvaluator.evaluatePostfixExpression(postfixExpression);
        System.out.println("Resultado do Exercício 3: " + result3);
    }
}

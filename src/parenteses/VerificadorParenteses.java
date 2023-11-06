package parenteses;

import java.util.Stack;

public class VerificadorParenteses {
    public static Resultado verificarEquacao(String equacao) {
        Stack<Character> pilha = new Stack<>();
        int abertos = 0;
        int fechados = 0;

        for (char caractere : equacao.toCharArray()) {
            if (caractere == '(') {
                pilha.push(caractere);
                abertos++;
            } else if (caractere == ')') {
                if (!pilha.isEmpty()) {
                    pilha.pop();
                    fechados++;
                }
            }
        }

        return new Resultado(pilha.isEmpty(), abertos, fechados);
    }

    public static class Resultado {
        private boolean equacaoBalanceada;
        private int totalAbertos;
        private int totalFechados;

        public Resultado(boolean equacaoBalanceada, int totalAbertos, int totalFechados) {
            this.equacaoBalanceada = equacaoBalanceada;
            this.totalAbertos = totalAbertos;
            this.totalFechados = totalFechados;
        }

        public boolean isEquacaoBalanceada() {
            return equacaoBalanceada;
        }

        public int getTotalAbertos() {
            return totalAbertos;
        }

        public int getTotalFechados() {
            return totalFechados;
        }
    }
}

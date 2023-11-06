package parenteses;

public class Main {
    public static void main(String[] args) {
        String equacao1 = "((3 + 2) - 5)";
        String equacao2 = "(3 + 2) - 5)";
        String equacao3 = "((3 + 2) - 5";

        VerificadorParenteses.Resultado resultado1 = VerificadorParenteses.verificarEquacao(equacao1);
        VerificadorParenteses.Resultado resultado2 = VerificadorParenteses.verificarEquacao(equacao2);
        VerificadorParenteses.Resultado resultado3 = VerificadorParenteses.verificarEquacao(equacao3);

        System.out.println("Equação 1 é balanceada? " + resultado1.isEquacaoBalanceada());
        System.out.println("Total de parênteses abertos em Equação 1: " + resultado1.getTotalAbertos());
        System.out.println("Total de parênteses fechados em Equação 1: " + resultado1.getTotalFechados());

        System.out.println("\nEquação 2 é balanceada? " + resultado2.isEquacaoBalanceada());
        System.out.println("Total de parênteses abertos em Equação 2: " + resultado2.getTotalAbertos());
        System.out.println("Total de parênteses fechados em Equação 2: " + resultado2.getTotalFechados());

        System.out.println("\nEquação 3 é balanceada? " + resultado3.isEquacaoBalanceada());
        System.out.println("Total de parênteses abertos em Equação 3: " + resultado3.getTotalAbertos());
        System.out.println("Total de parênteses fechados em Equação 3: " + resultado3.getTotalFechados());
    }
}

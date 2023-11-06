package pilhas.operacoes;

public class main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Pilha original:");
        while (!pilha.isEmpty()) {
            System.out.println("Elemento no topo: " + pilha.top());
            pilha.pop();
        }

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        Pilha pilha2 = new Pilha(5);

        pilha2.push(10);
        pilha2.push(20);
        pilha2.push(30);

        Pilha pilha3 = new Pilha(5);
        pilha3.push(10);
        pilha3.push(20);
        pilha3.push(40);
        pilha.inverter();

        System.out.println("Pilha invertida:");
        while (!pilha.isEmpty()) {
            System.out.println("Elemento no topo: " + pilha.top());
            pilha.pop();
        }

        System.out.println("Pilha 1 e Pilha 2 são iguais? " + pilha.saoIguais(pilha2));
        System.out.println("Pilha 1 e Pilha 3 são iguais? " + pilha.saoIguais(pilha3));
    }


}

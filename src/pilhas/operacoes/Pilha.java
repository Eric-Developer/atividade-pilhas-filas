package pilhas.operacoes;

public class Pilha {
    private int tamanhoMaximo;
    private int top;
    private int[] elementos;

    public Pilha(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.top = -1;
        this.elementos = new int[tamanhoMaximo];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == tamanhoMaximo - 1;
    }

    public void push(int valor) {
        if (isFull()) {
            System.out.println("A pilha está cheia. Não é possível adicionar elementos.");
        } else {
            elementos[++top] = valor;
            System.out.println("Elemento " + valor + " adicionado à pilha.");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia. Não é possível remover elementos.");
        } else {
            int valorRemovido = elementos[top--];
            System.out.println("Elemento " + valorRemovido + " removido da pilha.");
        }
        return 0;
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia. Não há elemento no topo.");
            return -1;
        } else {
            return elementos[top];
        }
    }

    public boolean saoIguais(Pilha outraPilha) {
        if (this.top != outraPilha.top) {
            return false;
        }

        for (int i = 0; i <= top; i++) {
            if (this.elementos[i] != outraPilha.elementos[i]) {
                return false;
            }
        }

        return true;
    }

    public void inverter() {
        int[] temp = new int[tamanhoMaximo];
        int index = 0;

        while (!isEmpty()) {
            temp[index++] = pop();
        }

        for (int i = 0; i < index; i++) {
            push(temp[i]);
        }
    }
}

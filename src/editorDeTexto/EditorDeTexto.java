package editorDeTexto;
import java.util.Stack;

public class EditorDeTexto {

    private Stack<Character> pilhaTexto;

    public EditorDeTexto() {
        pilhaTexto = new Stack<>();
    }

    public void inserirCaractere(char caractere) {
        pilhaTexto.push(caractere);
    }

    public void apagarCaractere() {
        if (!pilhaTexto.isEmpty()) {
            pilhaTexto.pop();
        }
    }

    public void backspace() {
        if (!pilhaTexto.isEmpty()) {
            pilhaTexto.pop();
        }
    }

    public void apagarTudo() {
        pilhaTexto.clear();
    }

    public String obterTexto() {
        StringBuilder texto = new StringBuilder();
        for (char caractere : pilhaTexto) {
            texto.append(caractere);
        }
        return texto.toString();
    }

}

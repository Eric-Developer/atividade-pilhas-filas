package editorDeTexto;

public class main {
    public static void main(String[] args) {
        EditorDeTexto editor = new EditorDeTexto();

        editor.inserirCaractere('H');
        editor.inserirCaractere('e');
        editor.inserirCaractere('l');
        editor.inserirCaractere('l');
        editor.inserirCaractere('o');

        System.out.println("Texto atual: " + editor.obterTexto()); 

        editor.backspace();
        System.out.println("Texto após backspace: " + editor.obterTexto());

        editor.inserirCaractere('o');
        System.out.println("Texto após inserção: " + editor.obterTexto());

        editor.apagarTudo();
        System.out.println("Texto após apagar tudo: " + editor.obterTexto());

        editor.inserirCaractere('W');
        System.out.println("Texto após inserção: " + editor.obterTexto());
    }
}


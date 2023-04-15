import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args) {
        // No set nao sabemos a ordem em que esta a lista
        // Assim, nao temos acesso ao Index
        // Garantia de um unico objeto armazenado, nao permite repeticoes, exemplo add(Pedro Braga) 2x, adicionaria 1 so
        // metodos remove e contains sao mais rapidos do que em um arraylist
        Set<String> alunos = new HashSet<>();
        alunos.add("Pedro Braga");
        alunos.add("Brenda Rocha");
        alunos.add("Marco Braga");
    }
}

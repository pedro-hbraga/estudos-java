import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaAula {

    public static void main(String[] args) {
        Aula a1 = new Aula("Revendo ArrayList", 21);
        Aula a2 = new Aula("Lista de Objetos", 15);
        Aula a3 = new Aula("Relacionamentod de Listas", 13);

        ArrayList<Aula> listaAulas = new ArrayList<>();
        listaAulas.add(a1);
        listaAulas.add(a2);
        listaAulas.add(a3);

        System.out.println(listaAulas);

        Collections.sort(listaAulas);

        System.out.println(listaAulas);

        // Comparator
        // comparar utilizando o tempo, getTime informa qual metodo ele deve utilizar para pegar a informacao
        // as duas produzem o mesmo efeito
        Collections.sort(listaAulas, Comparator.comparing(Aula::getTime));
        listaAulas.sort(Comparator.comparing(Aula::getTime));

        System.out.println(listaAulas);
    }
}

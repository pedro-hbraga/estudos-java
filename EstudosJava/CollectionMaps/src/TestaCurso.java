import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando colecoes", "Paulo");
        List<Aula> aulas = javaColecoes.getAulas();
        System.out.println(aulas);

//        aulas.add( new Aula("Revendo ArrayList", 21));
//        aulas.add(new Aula("Lista de Objetos", 15));
//        aulas.add(new Aula("Relacionamentod de Listas", 13));
//        System.out.println(javaColecoes.getAulas());
        //javaColecoes.getAulas().add(new Aula("Revendo ArrayList", 21));
        javaColecoes.adiciona(new Aula("Revendo ArrayList", 21));
        javaColecoes.adiciona(new Aula("Lista de Objetos", 15));
        javaColecoes.adiciona(new Aula("Relacionamento de Listas", 13));
        System.out.println(javaColecoes.getAulas());

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulasMutaveis);
        System.out.println(aulasMutaveis);

        System.out.println(javaColecoes.getTempoTotal());
    }
}

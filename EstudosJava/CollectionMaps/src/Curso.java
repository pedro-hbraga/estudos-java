import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>();

    public Curso(String nome, String instrutor){
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas(){
        return Collections.unmodifiableList(aulas);
    }

    public Set<Aluno> getAlunos(){
        return Collections.unmodifiableSet(alunos);
    }

    public void adiciona(Aula aula){
        aulas.add(aula);
    }

    public int getTempoTotal(){

        return aulas.stream().mapToInt(Aula::getTime).sum();
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
    }
}

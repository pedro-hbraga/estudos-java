public class TestaCursoAluno {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando colecoes", "Paulo");
        javaColecoes.adiciona(new Aula("Revendo ArrayList", 21));
        javaColecoes.adiciona(new Aula("Lista de Objetos", 15));
        javaColecoes.adiciona(new Aula("Relacionamento de Listas", 13));

        Aluno a1 = new Aluno("Pedro Braga", 1234);
        Aluno a2 = new Aluno("Pedro Henrique", 123456);
        Aluno a3 = new Aluno("Brenda R", 12345678);
        Aluno a4 = new Aluno("Marco Braga", 123);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        javaColecoes.matricula(a4);

        System.out.println("Alunos matriculados: ");
        javaColecoes.getAlunos().forEach(aluno -> System.out.println(aluno));

    }
}

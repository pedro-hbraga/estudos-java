public class Aula implements Comparable<Aula>{

    private String name;
    private int time;

    public Aula(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }
    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Aula: " + name + ", duracao: " + time + " minutos.";
    }

    @Override
    public int compareTo(Aula proximaAula) {
        return name.compareTo(proximaAula.getName());
    }
}

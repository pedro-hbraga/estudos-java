import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Teste01");
        stringList.add("Teste02");

        for(var t : stringList) System.out.println(t);
        System.out.println("-------------");

        stringList.forEach(x -> {
            System.out.println(x);
            System.out.println();
        });

    }
}
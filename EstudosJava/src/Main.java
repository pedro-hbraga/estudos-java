import java.io.*;

public class Main {
    public static void main(String[] args) {

        var pathFile = "E:\\Cursos\\Alura\\Java\\IO\\EstudosJava\\Arquivos\\lorem.txt";

        try {
            // Fluxo (Stream) de entrada de um arquivo
            FileInputStream fs = new FileInputStream(pathFile);

            // .read() do fs retorna em bytes, nao desejado
            //InputStreamReader transforma bytes em caracteres
            InputStreamReader inputReader = new InputStreamReader(fs);
            //Input nao consegue agrupar linhas inteiras, lendo byte a byte, sendo necessario um buffer para salvar
            // cada caractere
            BufferedReader bufferedReader = new BufferedReader(inputReader);

            var line = bufferedReader.readLine();
            while(line != null ){

                System.out.println(line);
                line = bufferedReader.readLine();
            }

            bufferedReader.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var pathFile = "E:\\Cursos\\Alura\\Java\\IO\\EstudosJava\\Arquivos\\lorem.txt";

        try {

            // INPUT
            // Fluxo (Stream) de entrada de um arquivo
            FileInputStream fs = new FileInputStream(pathFile);
            // .read() do fs retorna em bytes, nao desejado
            //InputStreamReader transforma bytes em caracteres
            InputStreamReader inputReader = new InputStreamReader(fs);
            //Input nao consegue agrupar linhas inteiras, lendo byte a byte, sendo necessario um buffer para salvar
            // cada caractere
            BufferedReader bufferedReader = new BufferedReader(inputReader);


            //OUTPUT
            FileOutputStream fo = new FileOutputStream("lorem2.txt");
            OutputStreamWriter ow = new OutputStreamWriter(fo);
            BufferedWriter writer = new BufferedWriter(ow);

            var line = bufferedReader.readLine();
            while(line != null ){

                writer.write(line);
                writer.newLine();
                line = bufferedReader.readLine();
            }

            bufferedReader.close();
            writer.close();

            // LENDO .csv usando Scanner
            var csvFile = "E:\\Cursos\\Alura\\Java\\IO\\EstudosJava\\Arquivos\\contas.csv";
            Scanner scanner = new Scanner(new File(csvFile));
            while(scanner.hasNextLine()){
                String linha = scanner.nextLine();
                var valores = linha.split(",");
                System.out.println(Arrays.toString(valores));
               // System.out.println(linha);
            }
            scanner.close();

            Cliente cliente = new Cliente();
            cliente.Nome = "Pedro";
            cliente.Profissao = "Estag";
            cliente.Cpt = "44444";

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
            oos.writeObject(cliente);
            oos.close();

            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("cliente.bin"));
            Cliente c = ((Cliente) inputStream.readObject());
            inputStream.close();
            System.out.println(c.Nome);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
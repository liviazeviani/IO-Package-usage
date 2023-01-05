
import java.io.*;

public class ReadAFile {

    public static void main(String[] args)  {
        BufferedReader keyboard =
                new BufferedReader((new InputStreamReader(System.in)));

        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("Text.txt");
            bufferedReader = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            System.err.println("File was not found");
        }


        String line;
        while (true){
            try {
                if (!((line = bufferedReader.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Read: " + line);

        }

    }
}

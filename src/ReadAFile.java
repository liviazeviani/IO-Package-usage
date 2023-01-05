
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAFile {

    public static void main(String[] args)  {

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

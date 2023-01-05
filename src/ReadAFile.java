
import java.io.BufferedReader;
import java.io.FileReader;

public class ReadAFile {

    public static void main(String[] args) throws Throwable {

        FileReader fileReader = new FileReader("Text.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println("Read: " + line);

        }

    }
}

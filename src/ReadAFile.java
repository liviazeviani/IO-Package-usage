
import java.io.*;

public class ReadAFile {

    public static void main(String[] args)  {
        BufferedReader keyboard =
                new BufferedReader((new InputStreamReader(System.in)));

        boolean success = false;

        FileReader fileReader;
        BufferedReader bufferedReader = null;
        while(!success){
            System.out.println("Enter the filename: ");
            String filename = null;

            try {
                filename = keyboard.readLine();
                fileReader = new FileReader(filename);
                bufferedReader = new BufferedReader(fileReader);
                success = true;
            } catch (FileNotFoundException e) {
                System.err.println("File " + filename + " was not found. Please try again!");
            } catch (IOException e) {
                System.err.println("Failed to read from keyboard!");
            }
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

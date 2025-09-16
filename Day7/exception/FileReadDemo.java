import java.io.*;

public class FileReadDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
        String line = reader.readLine();
        System.out.println("Line: " + line);
        reader.close();
    }
}

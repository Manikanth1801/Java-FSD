import java.io.*;

// This class simulates reading a file
public class ThrowsExample {

    // This method reads a file and DECLARES it may throw IOException
    public static void readFile(String fileName) throws IOException {
        // FileReader and BufferedReader can throw IOException
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = reader.readLine();
        System.out.println("First line: " + line);
        reader.close(); // Always close file readers
    }

    public static void main(String[] args) {
        try {
            // We call readFile() with a file that may or may not exist
            readFile("example.txt");
        } catch (IOException e) {
            // We catch the exception here if file is missing or unreadable
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.println("Program finished.");
    }
}

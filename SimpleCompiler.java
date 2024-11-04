import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleCompiler {
    public static void main(String[] args) {
        List<String> reservedWords = loadReservedWords("reservedWords.txt");
        List<String> identifiers = new ArrayList<>();

        // Read the Java program from file
        String javaProgram = readJavaProgram("TestProgram.java");

        // Tokenize the Java program (for simplicity, split by whitespace)
        String[] tokens = javaProgram.split("\\s+");

        // Check each token
        for (String token : tokens) {
            if (!reservedWords.contains(token) && !identifiers.contains(token)) {
                identifiers.add(token);
            }
        }

        // Display the user-defined identifiers
        System.out.println("User-defined Identifiers:");
        for (String identifier : identifiers) {
            System.out.println(identifier);
        }
    }

    // Load Java reserved words from file
    private static List<String> loadReservedWords(String fileName) {
        List<String> reservedWords = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                reservedWords.addAll(Arrays.asList(line.split("\\s+")));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return reservedWords;
    }

    // Read the Java program from file
    private static String readJavaProgram(String fileName) {
        StringBuilder javaProgram = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                javaProgram.append(line).append(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return javaProgram.toString();
    }
}
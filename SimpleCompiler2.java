import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SimpleCompiler2 {
    public static void main(String[] args) {
        // Read reserved words from file
        List<String> reservedWords = readReservedWords("reservedWords.txt");

        // Read Java program from file
        List<String> identifiers = analyzeIdentifiers("TestProgram.java", reservedWords);

        // Display the list of user-defined identifiers
        System.out.println("User-defined Identifiers:");
        for (String identifier : identifiers) {
            System.out.println(identifier);
        }
    }

    private static List<String> readReservedWords(String filename) {
        List<String> reservedWords = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                reservedWords.add(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return reservedWords;
    }

    private static List<String> analyzeIdentifiers(String filename, List<String> reservedWords) {
        List<String> identifiers = new ArrayList<>();
        Set<String> uniqueIdentifiers = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split("\\s+"); // Split by whitespace

                for (String token : tokens) {
                    // Check if the token is a reserved word
                    if (!reservedWords.contains(token)) {
                        // Check if the token is already in the list of identifiers
                        if (!uniqueIdentifiers.contains(token)) {
                            uniqueIdentifiers.add(token);
                            identifiers.add(token);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return identifiers;
    }
}
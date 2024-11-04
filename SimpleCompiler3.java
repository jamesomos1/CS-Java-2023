import java.util.HashSet;
import java.util.Set;

public class SimpleCompiler3 
{
    public static void main(String[] args) 
    {
        String test = "public class TestProgram { public static void main(String[] args) { int myinteger = 2; double myDouble = 2.5; myinteger++; System.out.println(myinteger); } }";

        Set<String> reservedWords = Set.of("abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue", "default", "do", "double", "else", "enum", "extends", "false",
                "final", "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "null", "package", "private", "protected", "public", "return",
                "short", "static", "strictfp", "super", "switch", "synchronized", "this", "throw", "throws",
                "transient", "true", "try", "var", "void", "volatile", "while");

        Set<String> ids = extractIdentifiers(test, reservedWords);
       
        System.out.println("Here are the Identifiers:");
        for (String id : ids)
        {
            System.out.println(id);
        }
    }

    private static Set<String> extractIdentifiers(String test, Set<String> reservedWords) 
    {
        Set<String> ids = new HashSet<>();

        String[] tokens = test.split("\\s+|\\(|\\)|\\{|\\}|\\[|\\]|\\.|\\;|\\:|\\=|\\+|\\-|\\*|\\/");

        for (String token : tokens) 
        {
            if (!token.isEmpty() && !reservedWords.contains(token) && Character.isJavaIdentifierStart(token.charAt(0)))
            {
                ids.add(token);
            }
        }
        return ids;
    }
}
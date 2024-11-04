import java.util.Stack;
import java.util.Scanner;

public class PalindromeCheck
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This program tests whether a string is a palindrome.");
        System.out.println("A palindrome reads the same from left to right as it does from right to left,");
        System.out.println("ignoring punctuation, spaces, and case.");

        while (true)
        {
            System.out.print("Enter a string that you want to check (or enter ! to exit): ");
            String input = scanner.nextLine().trim();

            if (input.equals("!")) 
            {
                break;
            }
            if (isPalindrome(input)) 
            {
                System.out.println(input + " is a palindrome!");
            } 
            else 
            {
                System.out.println(input + " is not a palindrome!");
            }
        }
        System.out.println("Done!");
    }

    public static boolean isPalindrome(String input)
    {
        String newInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

      
        Stack<Character> stack = new Stack<>();
        for (char c : newInput.toCharArray()) 
        {
            stack.push(c);
        }

        String r = "";
        while (!stack.isEmpty())
        {
            r += stack.pop();
        }
        return newInput.equals(r);
    }
}
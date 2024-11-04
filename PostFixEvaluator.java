import java.util.Stack;
import java.util.Scanner;

class PostfixEvaluator {
    private Stack<Integer> stack;

    public PostfixEvaluator() {
        stack = new Stack<>();
    }

    public void evaluatePostfixExpression(String expression) {
        Scanner scanner = new Scanner(expression);
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                stack.push(value);
                printStack();
            } else {
                String operator = scanner.next();
                if (operator.equals(")")) {
                    break;
                }
                int x = stack.pop();
                int y = stack.pop();
                int result = calculate(y, operator, x);
                stack.push(result);
                printStack();
            }
        }
        scanner.close();
        System.out.println("The value of the expression is: " + stack.pop());
    }

    public int calculate(int op1, String operator, int op2) {
        switch (operator) {
            case "+":
                return op1 + op2;
            case "-":
                return op1 - op2;
            case "*":
                return op1 * op2;
            case "/":
                return op1 / op2;
            case "^":
                return (int) Math.pow(op1, op2);
            default:
                return 0;
        }
    }

    public void printStack() {
        System.out.println(stack);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a postfix expression:");
        String expression = scanner.nextLine();
        scanner.close();

        PostfixEvaluator postfixEvaluator = new PostfixEvaluator();
        System.out.println("\nThe original postfix expression is:\n" + expression);
        System.out.println();
        postfixEvaluator.evaluatePostfixExpression(expression + " )");
    }
}
public class Driver
{
    public static void main(String[] args)
    {
        testStackOperations();
        System.out.println("\n\nDone.");
    }

    public static void testStackOperations()
    {
        System.out.println("Create a stack: ");
        StackInterface<String> myStack = new LinkedStack<>();
        System.out.println("isEmpty() returns " + myStack.isEmpty());

        System.out.println("\nAdd to stack to get\n" + "Joe Jane Jill Jess Jim");
        myStack.push("Jim");
        myStack.push("Jess");
        myStack.push("Jill");
        myStack.push("Jane");
        myStack.push("Joe");

        System.out.println("\nisEmpty() returns " + myStack.isEmpty());

        System.out.println("\n\nTesting peek, peek2, and pop:\n");
        
        while (!myStack.isEmpty())
        {
            String top = myStack.peek();
            System.out.println(top + " is at the top of the stack.");
            String beneathTop = myStack.peek2();
            System.out.println(beneathTop + " is just beneath the top of the stack.");

            top = myStack.pop();
            System.out.println(top + " is removed from the stack.\n");
        } 
        System.out.print("\nThe stack should be empty: ");
        System.out.println("isEmpty() returns " + myStack.isEmpty());

        System.out.println("\nAdd to stack to get\n" +
        "Jim Jess Joe\n");
        myStack.push("Joe");
        myStack.push("Jess");
        myStack.push("Jim");

        System.out.println("\nTesting clear:");
        myStack.clear();

        System.out.println("The stack should be empty: ");
        System.out.println("\nisEmpty() returns " + myStack.isEmpty());

        System.out.println("\n myStack.peek() returns ");
        System.out.println(myStack.peek());
        System.out.println("\n myStack.pop() returns ");
        System.out.println(myStack.pop());
    }
}
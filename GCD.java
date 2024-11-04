import java.util.Scanner;

public class GCD 
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        while (true) 
        {
            System.out.print("Enter first number (-1 to exit): ");
            int x = scan.nextInt();

            if (x == -1) 
            {
                break;
            }

            System.out.print("Enter second number: ");
            int y = scan.nextInt();

            int r = gcd(x, y);
            System.out.println("GCD is: " + r);
        }
        scan.close();
    }

    private static int gcd(int x, int y)
    {
        if (y == 0) 
        {
            return x;
        } 
        else 
        {
            return gcd(y, x % y);
        }
    }
}
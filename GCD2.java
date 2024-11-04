public class GCD2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Enter the value of x:"); // reading x value
		int x = scanner.nextInt();
		System.out.printf("Enter the value of y:"); // reading y value
		int y = scanner.nextInt();
		int gcd = gcd(x, y); // passing x and y to gcd function

		System.out.printf("GCD is %d.", gcd);
		scanner.close();
	}

	public static int gcd(int x, int y) {
		if (y != 0) // if y!=0 we are calling gcd function recursive
			return gcd(y, x % y);
		else // else returning x
			return x;
	}

}
public class GCD1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Enter the value of x:"); // reading x value
		int x = scanner.nextInt();
		System.out.printf("Enter the value of y:"); // reading y value
		int y = scanner.nextInt();
		int gcd = gcd(x, y); // passing x and y to gcd function

		System.out.printf("G.C.D of %d and %d is %d.", x, y, gcd);
		scanner.close();
	}

	public static int gcd(int x, int y) {
		if (y != 0) // if y!=0 we are calling gcd function recursive
			return gcd(y, x % y);
		else // else returning x
			return x;
	}

}
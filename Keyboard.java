import java.lang.*;
import java.util.*;

class Keyboard {
	public static void main(String myArgs[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int a, b, c;
		a = s.nextInt();
		b = s.nextInt();
		c = a + b;
		System.out.println("Sum is " + c);
	}
}
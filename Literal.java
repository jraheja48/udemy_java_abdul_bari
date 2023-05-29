import java.lang.*;

class Literal {
	public static void main(String myArgs[]) {
		byte b1 = 10;
		byte b2 = 0b1010;
		byte b3 = 012;
		byte b4 = 0xA;
		long l = 999999999999L;

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(l);
		

		int sum  = Integer.sum(5, 15);
		System.out.println(sum);		
	}
}
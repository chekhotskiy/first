public class program {

	public static void main(String[] args) {
		hello("world");
		hello("bay");

		double l = 5;
		System.out.println("площадь квадрата со стороной " + l + " = " + area(l));
		double a = 5;
		double b = 5;
		System.out.println("площадь квадрата со стороной " + a + " и " + b + " = " + area(a, b));

	}


	public static void hello(String somebody) {
		System.out.println("hello? " + somebody + "!");
	}

	public static double area(double lem) {
		return lem * lem;
	}

	public static double area(double a, double b) {
		return a * b;
	}
}
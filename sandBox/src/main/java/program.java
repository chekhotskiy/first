public class program {

	public static void main(String[] args) {
		hello("world");
		hello("bay");

		Distance d = new Distance(13, 3, 22,10);
		System.out.println("Дистания между точками p1("+d.x1+":"+d.y1+") и p2("+d.x2+":"+d.y2+"). Равна "+d.area()+".");

		Square s = new Square(5);
		System.out.println("площадь квадрата со стороной " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(5, 6);
		System.out.println("площадь квадрата со стороной " + r.a + " и " + r.b + " = " + r.area());
	}
	public static void hello(String somebody) {
		System.out.println("hello? " + somebody + "!");
	}

	}


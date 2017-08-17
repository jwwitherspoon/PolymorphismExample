
public class Test {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(5,10,"Bob");
		Square s = new Square(7,7,"Red");
		r.printQuad();
		s.printQuad();
		swapLength(r,s);
		swapWidth(r,s);
		System.out.println("");
		r.printQuad();
		s.printQuad();
	}
	
	public static void swapLength(Quad q1, Quad q2) {
		int temp = q1.getLength();
		q1.setLength(q2.getLength());
		q2.setLength(temp);
		System.out.println("Lengths swapped");
	}
	
	public static void swapWidth(Quad q1, Quad q2) {
		int temp = q1.getWidth();
		q1.setWidth(q2.getWidth());
		q2.setWidth(temp);
		System.out.println("Widths swapped");
	}

}


public class Rectangle extends Quad {
	private String name;
	
	public Rectangle(int width, int length, String name) {
		super(width, length);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printQuad() {
		super.printQuad();
		System.out.println("Name: " + name);
		System.out.println("");
	}
}

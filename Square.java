
public class Square extends Quad {
	private String color;
	
	public Square(int width, int length, String color) {
		super(width, length);
		if (this.getWidth()!=this.getLength())
			this.setWidth(this.getLength());
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void printQuad() {
		super.printQuad();
		System.out.println("Color: " + color);
		System.out.println("");
	}
}

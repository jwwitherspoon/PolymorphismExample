
public class Quad {
	private int width, length;
	
	public Quad(int width, int length) {
		this.width = width;
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public void printQuad() {
		System.out.println("Width: " + width);
		System.out.println("Length: " + length);
	}
}

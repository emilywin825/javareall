package shape;

public class Rectangle extends Shape implements Resize{
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int width, int height, String colors) {
		super(width, height, colors);
	}
	public double getArea() {
		return super.getArea();
	}
	public void setResize(int size) {
		setWidth(getWidth()+size);
		//가로(width)의 값에 size 값을 더한다
	}
}

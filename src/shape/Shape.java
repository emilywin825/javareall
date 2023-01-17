package shape;

public abstract class Shape  { //추상 클래스 : 이 클래스를 상속받는 클래스는
	                          // 추상 메소드를 꼭 구현해야 함
	private int width;
	private int height;
	private String colors;
	
	public Shape() {
		// TODO Auto-generated constructor stub
	}

	public Shape(int width, int height, String colors) {
		super();
		this.width = width;
		this.height = height;
		this.colors = colors;
	}
	public double getArea() { //도형의 넓이를 리턴
		return width*height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}
	
}

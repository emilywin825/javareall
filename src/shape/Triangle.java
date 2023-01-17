package shape;

public class Triangle extends Shape implements Resize{
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	public Triangle(int width, int height, String colors) {
		super(width, height, colors);
	}
	public double getArea() { //shape 클래스의 메소드 오버라이딩
		return super.getArea()/2;
	}
	@Override
	public void setResize(int size) { //도형의 사이즈 변경
		//세로(height)의 값에 size 값을 더한다
		setHeight(getHeight()+size);
	}
	
}

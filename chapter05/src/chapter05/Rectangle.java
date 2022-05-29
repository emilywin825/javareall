package chapter05;

public class Rectangle {
	private int x,y;
	private int width,height;
	
	Rectangle()
	{
		this(0,0,1,1);
	}
	
	Rectangle(int width,height)
	{
		this(0,0,width,height);
	}
	
	Rectangle(int x,int y,int width,height)
	{
		this(0,0,width,height);
	}
}

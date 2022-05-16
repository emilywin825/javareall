package chapter05;

public class Box {
int width;//가로
int length;//세로
int height;//높이
	public static void main(String args[])
	{
		Box box1=new Box();
		box1.width=20;
		box1.length=20;
		box1.height=30;
		
		System.out.println("상자의 가로, 세로, 높이는 "+box1.width+", "+box1.length+", "+box1.height+"입니다.");
	}
}

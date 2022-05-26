package chapter05;

public class Box {
	int width;//가로
	int length;//세로
	int height;//높이
	int volume;
	
	Box(int w,int l,int h)
	{
		width=w;
		length=l;
		height=h;
		volume=width*length*height;
	}
	
	int getVolume()
	{
		return volume;
	}
	void print()
	{
	System.out.println("상자의 가로, 세로, 높이는 "+width+", "+length+", "+height+"입니다."
	+"상자의 부피는"+getVolume()+"입니다");}
}

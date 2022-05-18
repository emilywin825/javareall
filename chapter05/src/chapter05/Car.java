package chapter05;

public class Car {
	String color;
	int gear;
	int speed;
	@Override
	public String toString() {//source->generate toString()에서 만들 수 있음, 필드의 값을 하나의ㅏ 문자열로 만들어서 반환
		return "Car [color=" + color + ", gear=" + gear + ", speed=" + speed + "]";
	}
	void changeGear(int g)
	{
		gear=g;
	}
	void speedUp(int s) {
		speed=s+10;
	}
	void speedDown() {
		speed-=10;
	}
	
}

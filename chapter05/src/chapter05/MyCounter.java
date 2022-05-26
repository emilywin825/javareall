package chapter05;

public class MyCounter {
	int counter;
	
	MyCounter(int value) //생성자
	{
		counter=value;
	}
	void print()
	{
		System.out.println("MyCounter의 값은"+counter+"입니다.");
	}
}

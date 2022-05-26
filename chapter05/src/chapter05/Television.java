package chapter05;

public class Television {
	
	int channel;
	int volume;
	boolean onOff;
	int n; //필드(멤버변수)
	
	Television(int c,int v,boolean o)
	{
		channel=c;
		volume=v;
		onOff=o;
	}
	
	int getChannel() //메소드(멤버함수)
	{
		return channel; //channel값을 반환
	}
	void setChannel(int ch)
	{
		channel=ch;
	}
	
	void print1()
	{
		System.out.println("텔레비전"+n+"의 채널은"+channel+"이고 볼륨은"+volume+"입니다"); //클래스 안에서 사용될때는 멤버 연산자 필요 X
		//System.out.println("텔레비전"+n+"의 반환된 채널은"+getchannel()+"입니다"); 	
	}

}

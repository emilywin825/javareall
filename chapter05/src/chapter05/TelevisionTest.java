package chapter05;

public class TelevisionTest {
	int channel;
	int volume;
	boolean onOff;
	public static void main(String args[])
	{
		Television tv=new Television(); // 객체 생성 방법(new 사용) 
		tv.channel=7; //객체에 접근하는 방법('.' 사용)
		tv.volume=0;
		tv.onOff=true;
		tv.n=1;
		tv.setChannel(8);
		tv.getChannel();
		tv.print1();
		
		
		Television yourtv=new Television(); //한 클래스에 여러개 생성 가능
		//TelevisionTest yourtv=tv; //객체 복사 가능
		yourtv.channel=10; //객체에 접근하는 방법('.' 사용)
		yourtv.volume=3;
		yourtv.onOff=true;
		yourtv.n=2;
		yourtv.getChannel();
		yourtv.print1();
		/*System.out.println("텔레비전1의 채널은"+tv.channel+"이고 볼륨은"+tv.volume+"입니다");
		System.out.println("텔레비전2의 채널은"+yourtv.channel+"이고 볼륨은"+yourtv.volume+"입니다"); 
		Television 클래스의 값을 TelevisionTest에서 접근해서 쓰는건 바람직하지 않음->Television 클래스로 옮겼음*/
	}
}
